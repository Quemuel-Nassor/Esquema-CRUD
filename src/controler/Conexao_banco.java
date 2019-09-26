
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 * classe adaptada a partir de arquivos desenvolvidos em sala de aula
 */
public class Conexao_banco {
    
    private static final String URL = "127.0.0.1";
    private static final String PORTA = "5432";
    private static final String USR = "postgres";
    private static final String PSW = "password";
    private static final String BD = "bd_locadora";
    
    public static Connection logar(){
        try{
           return DriverManager.getConnection("jdbc:postgresql://" + URL + ":" + PORTA + "/" + BD, USR, PSW);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Falha ao conectar à base de dados, erro "+e.getMessage());
            return null;
        }
    }
    
    public static void deslogar(Connection con){
        try{
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Falha ao desconectar da base de dados, erro "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        if(logar() != null){
            JOptionPane.showMessageDialog(null,"Conexão realizada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null,"Banco de dados inacessível!");
        };
    }
}
