public class PrestadorDeServico extends Pessoa {
    private String descricao;
    private double desconto;
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return this.desconto;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Nome: " + this.getNome() + " | Telefone: " + this.getTelefone() + " | Endereço: " + this.getEndereco() + " | Descrição: " + this.getDescricao() + " | Desconto: " + this.getDesconto());
    }
    
    public PrestadorDeServico() {}
    public PrestadorDeServico(int codigo, String nome, String telefone, String endereco, String descricao, double desconto) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setDescricao(descricao);
        this.setDesconto(desconto);
    }
}