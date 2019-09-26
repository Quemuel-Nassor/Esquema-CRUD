
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Locacao;

/**
 *
 * @author Quemuel
 * 
 * Alguns métodos e partes relacionados à conexão com o banco de dados foram adaptadas 
 * ou reaproveitadas a partir de atividades desenvolvidas em sala de aula
 */
public class LocacaoDAO {
    
    private Connection con; 
    private PreparedStatement cmd;
    
    public LocacaoDAO() {
        this.con = Conexao_banco.logar();
    }
    
    public int inserir(Locacao novo){
        try{
            String SQL = "INSERT INTO tb_locacao (cliente,valor,data,filme1,filme2,filme3) VALUES (?,?,?,?,?,?)";
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, novo.getCliente());
            cmd.setDouble(2, novo.getValor_total());
            cmd.setString(3, novo.getData());
            cmd.setString(4, novo.getFilme1());
            cmd.setString(5, novo.getFilme2());
            cmd.setString(6, novo.getFilme3());
            
            //executa os comandos no banco de dados
            if(cmd.executeUpdate() > 0){
                //descobrir o ID que foi gerado
                ResultSet rs = cmd.getGeneratedKeys();
                if(rs.next()){
                    return rs.getInt(1); //retornar o ID
                }else{
                    return -1; //ID não foi gerado
                }
            }else{
                return -1;
            }
            
        }catch(Exception e){
            System.out.println("Falha ao adicionar locação ao banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public int atualizar(Locacao editar){
        try{
            String SQL = "UPDATE tb_locacao SET id = ?,cliente = ?,valor = ?,data = ?,filme1 = ?,filme2 = ?,filme3 = ? WHERE id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, editar.getId());
            cmd.setString(2, editar.getCliente());
            cmd.setDouble(3, editar.getValor_total());
            cmd.setString(4, editar.getData());
            cmd.setString(5, editar.getFilme1());
            cmd.setString(6, editar.getFilme2());
            cmd.setString(7, editar.getFilme3());
            cmd.setInt(8, editar.getId());
            
            //executa os comandos no banco de dados
            if(cmd.executeUpdate() > 0){
                return editar.getId();
            }else{
                return -1;
            }
            
        }catch(Exception e){
            System.out.println("Falha ao atualizar locação do banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public int remover(Locacao remover){
        try{
            String SQL = "DELETE FROM tb_locacao WHERE id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, remover.getId());
            
            //executa os comandos no banco de dados
            if(cmd.executeUpdate() > 0){
                return remover.getId();
            }else{
                return -1;
            }
            
        }catch(Exception e){
            System.out.println("Falha ao deletar locação do banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public List<Locacao> listar(){
        try{
            
            String SQL = "SELECT * FROM tb_locacao ORDER BY id";
            cmd = con.prepareStatement(SQL);
            
            ResultSet rs = cmd.executeQuery();
            
            List<Locacao> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                    new Locacao (
                        rs.getInt("id"),
                        rs.getString("cliente"),
                        rs.getDouble("valor"),
                        rs.getString("data"),
                        rs.getString("filme1"),
                        rs.getString("filme2"),
                        rs.getString("filme3")
                   )
                );
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha ao buscar locações do banco de dados, erro: "+e.getMessage());
            return null;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public List<Locacao> buscarLocacao(String nome){
        try{
            
            String SQL = "SELECT * FROM tb_locacao WHERE cliente ILIKE ? ORDER BY cliente";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%"+nome+"%");
            
            ResultSet rs = cmd.executeQuery();
            
            List<Locacao> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                    new Locacao (
                        rs.getInt("id"),
                        rs.getString("cliente"),
                        rs.getDouble("valor"),
                        rs.getString("data"),
                        rs.getString("filme1"),
                        rs.getString("filme2"),
                        rs.getString("filme3")
                   )
                );
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha ao buscar locações do banco de dados, erro: "+e.getMessage());
            return null;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
}
