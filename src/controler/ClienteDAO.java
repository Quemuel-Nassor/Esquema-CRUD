
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Quemuel
 * 
 * Alguns métodos e partes relacionados à conexão com o banco de dados foram adaptadas 
 * ou reaproveitadas a partir de atividades desenvolvidas em sala de aula
 */
public class ClienteDAO {
    
    private Connection con; 
    private PreparedStatement cmd;
    
    public ClienteDAO() {
        this.con = Conexao_banco.logar();
    }
    
    public int inserir(Cliente novo){
        try{
            String SQL = "INSERT INTO tb_cliente (nome,cpf,email,telefone) VALUES (?,?,?,?)";
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, novo.getNome());
            cmd.setString(2, novo.getCpf());
            cmd.setString(3, novo.getEmail());
            cmd.setString(4, novo.getTelefone());
            
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
            System.out.println("Falha ao adicionar cliente ao banco de dados, erro: "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public int atualizar(Cliente editar){
        
        try{
            String SQL = "UPDATE tb_cliente SET id = ?,nome = ?,cpf = ?,email = ?,telefone = ? WHERE id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, editar.getId());
            cmd.setString(2, editar.getNome());
            cmd.setString(3, editar.getCpf());
            cmd.setString(4, editar.getEmail());
            cmd.setString(5, editar.getTelefone());
            cmd.setInt(6, editar.getId());
            
            //executa os comandos no banco de dados
            if(cmd.executeUpdate() > 0){
                return editar.getId();
            }else{
                return -1;
            }
            
        }catch(Exception e){
            System.out.println("Falha ao atualizar cliente no banco de dados, erro: "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public int remover(Cliente remover){
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
            System.out.println("Falha ao deletar cliente do banco de dados, erro "+e.getMessage());
            return -1;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public List<Cliente> listar(){
        try{
            
            String SQL = "SELECT * FROM tb_cliente ORDER BY id";
            cmd = con.prepareStatement(SQL);
            
            ResultSet rs = cmd.executeQuery();
            
            List<Cliente> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                    new Cliente (
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("telefone")
                   )
                );
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha ao buscar clientes do banco de dados, erro: "+e.getMessage());
            return null;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
    
    public List<Cliente> buscarNome(String nome){
        try{
            
            String SQL = "SELECT * FROM tb_cliente WHERE nome ILIKE ? ORDER BY nome";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%"+nome+"%");
            
            ResultSet rs = cmd.executeQuery();
            
            List<Cliente> lista = new ArrayList<>();
            while(rs.next()){
                lista.add(
                    new Cliente (
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("telefone")
                   )
                );
            }
            return lista;
        }catch(Exception e){
            System.out.println("Falha ao buscar clientes do banco de dados, erro: "+e.getMessage());
            return null;
        }finally{
            Conexao_banco.deslogar(con);
        }
    }
}
