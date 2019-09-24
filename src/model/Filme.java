
package model;

import java.util.List;

/**
 *
 * @author Quemuel
 */
public class Filme {
    
    private int id;
    private String nome;
    private double valor;
    private String classificacao;

    public Filme() {
    }

    public Filme(int id, String nome, double valor, String classificacao) {
        
        this.id = id;
        this.setNome(nome);
        this.setValor(valor);
        this.setClassificacao(classificacao);
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        if(!classificacao.isEmpty()){
            this.classificacao = classificacao;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor != 0.0){
            this.valor = valor;
        }
    }
    
}
