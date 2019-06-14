public class Orcamento {
    private int codigo;
    private String descricao;
    CadastroProjeto projeto = new CadastroProjeto();
    Cliente cliente = new Cliente();
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Projeto: "
                + this.projeto.getDescricao() + " | Cliente: " + this.cliente.getNome()
                + " | Valor do Projeto: " + this.projeto.getValorTotal() + " | Descricao: "
                + this.getDescricao());
    }
    
    public Orcamento() {}
    public Orcamento(int codigo, CadastroProjeto projeto, Cliente cliente, String descricao) {
        this.setCodigo(codigo);
        this.projeto = projeto;
        this.cliente = cliente;
        this.setDescricao(descricao);
    }
}