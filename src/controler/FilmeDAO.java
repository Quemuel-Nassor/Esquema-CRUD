
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Filme;

/**
 *
 * @author Quemuel
 * 
 * Alguns métodos e partes relacionados à conexão com o banco de dados foram adaptadas 
 * ou reaproveitadas a partir de atividades desenvolvidas em sala de aula
 */
public class FilmeDAO {
    
    private Connection con; 
    private PreparedStatement cmd;
    
    public FilmeDAO() {
        this.con = Conexao_banco.logar();
    }
    
    public int inserir(Filme novo){
        try{
            String SQL = "INSERT INTO tb_Filme (nome,valor,classificacao) VALUES (?,?,?)";
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, novo.getNome());
            cmd.setDouble(2, novo.getValor());
            cmd.setString(3, novo.getClassificacao());
            
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
            System.out.println("Falha ao adicionar filme ao banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public int atualizar(Filme editar){
        try{
            String SQL = "UPDATE tb_filme SET id = ?,nome = ?,valor = ?,classificacao = ? WHERE id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, editar.getId());
            cmd.setString(2, editar.getNome());
            cmd.setDouble(3, editar.getValor());
            cmd.setString(4, editar.getClassificacao());
            cmd.setInt(5, editar.getId());
            
            //executa os comandos no banco de dados
            if(cmd.executeUpdate() > 0){
                return editar.getId();
            }else{
                return -1;
            }
            
        }catch(Exception e){
            System.out.println("Falha ao adicionar filme ao banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public int remover(Filme remover){
        try{
            String SQL = "DELETE FROM tb_cliente WHERE id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, remover.getId());
            
            //executa os comandos no banco de dados
            if(cmd.executeUpdate() > 0){
                return remover.getId();
            }else{
                return -1;
            }
            
        }catch(Exception e){
            System.out.println("Falha ao deletar filme do banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public List<Filme> listar(){
        try{
            String SQL = "SELECT * FROM tb_filme ORDER BY id";
            cmd = con.prepareStatement(SQL);
            
            ResultSet rs = cmd.executeQuery();
            
            List<Filme> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                    new Filme (
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("valor"),
                        rs.getString("classificacao")
                   )
                );
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha ao buscar filme do banco de dados, erro: "+e.getMessage());
            return null;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public List<Filme> buscarFilme(String nome){
        try{
            
            String SQL = "SELECT * FROM tb_filme WHERE nome ILIKE ? ORDER BY nome";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%"+nome+"%");
            
            ResultSet rs = cmd.executeQuery();
            
            List<Filme> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                    new Filme (
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("valor"),
                        rs.getString("classificacao")
                   )
                );
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha ao buscar filme do banco de dados, erro: "+e.getMessage());
            return null;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
}
