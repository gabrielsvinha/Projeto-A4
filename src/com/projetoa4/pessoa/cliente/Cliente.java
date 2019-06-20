package com.projetoa4.pessoa.cliente;

import com.projetoa4.pessoa.Pessoa;

public class Cliente extends Pessoa {
    //public String emitirRelatorio() {
        
    //}
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Cliente: " + this.getNome()
                + " | Telefone: " + this.getTelefone() + " | Endereço: " + this.getEndereco());
    }
    
    public Cliente() {}
    public Cliente(int codigo, String nome, String telefone, String endereco) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
    }
}