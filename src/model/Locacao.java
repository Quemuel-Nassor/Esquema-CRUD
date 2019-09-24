
package model;

import java.util.List;

/**
 *
 * @author Quemuel
 */
public class Locacao {
    
    private int id;
    private String cliente;
    private double valor_total;
    private String data;
    private String filme;

    public Locacao() {
    }

    public Locacao(int id, String cliente, double valor_total, String data, String filme) {
        
        this.id = id;
        this.setCliente(cliente);
        this.setValor_total(valor_total);
        this.setData(data);
        this.setFilme(filme);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if(!cliente.isEmpty()){
            this.cliente = cliente;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.isEmpty()){
            this.data = data;
        }
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor) {
        if(valor != 0.0){
            this.valor_total = valor;
        }
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
    
}
