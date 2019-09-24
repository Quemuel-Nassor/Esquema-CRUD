
package model;

import java.util.List;

/**
 *
 * @author Quemuel
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String email, String telefone) {
        
        this.id = id;
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(!cpf.isEmpty()){
            this.cpf = cpf;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(!telefone.isEmpty()){
            this.telefone = telefone;
        }
    }
    
}
