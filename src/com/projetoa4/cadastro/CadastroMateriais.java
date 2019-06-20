package com.projetoa4.cadastro;


import com.projetoa4.fabricante.Fabricante;

public class CadastroMateriais {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;
    Fabricante fabricante = new Fabricante();
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Nome: " + this.getNome()
                + " | Fabricante: " + this.fabricante.getNome() + " | Descrição: "
                + this.getDescricao() + " | Valor: " + this.getValor());
    }
    
    public CadastroMateriais() {}
    public CadastroMateriais(int codigo, String nome, Fabricante fabricante, String descricao, double valor) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.fabricante = fabricante;
        this.setDescricao(descricao);
        this.setValor(valor);
    }
}