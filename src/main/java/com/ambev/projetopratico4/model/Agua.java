package com.ambev.projetopratico4.model;

public class Agua extends Produto{

    private boolean comGas;

    public Agua(){
    }

    public Agua(String id, String nome, String descricao, double preco, boolean comGas){
        super(id, nome, descricao, preco);
        this.comGas = comGas;
    }

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(boolean comGas) {
        this.comGas = comGas;
    }
}
