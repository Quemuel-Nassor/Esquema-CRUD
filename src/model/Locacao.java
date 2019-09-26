
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
    private String filme1;
    private String filme2;
    private String filme3;

    public Locacao() {
    }

    public Locacao(int id, String cliente, double valor_total, String data, String filme1, String filme2, String filme3) {
        
        this.id = id;
        this.setCliente(cliente);
        this.setValor_total(valor_total);
        this.setData(data);
        this.setFilme1(filme1);
        this.setFilme2(filme2);
        this.setFilme3(filme3);
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

    public String getFilme1() {
        return filme1;
    }

    public void setFilme1(String filme) {
        this.filme1 = filme;
    }
    public String getFilme2() {
        return filme2;
    }

    public void setFilme2(String filme) {
        this.filme2 = filme;
    }
    public String getFilme3() {
        return filme2;
    }

    public void setFilme3(String filme) {
        this.filme3 = filme;
    }
    
}
