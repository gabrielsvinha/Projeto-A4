public class CadastroMateriais {
    private int codigo;
    private String nome;
    private String descricao;
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
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Nome: " + this.getNome() + " | Fabricante: " + this.fabricante.getNome() + " | Descrição: " + this.getDescricao());
    }
    
    public CadastroMateriais() {}
    public CadastroMateriais(int codigo, String nome, Fabricante fabricante, String descricao) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.fabricante = fabricante;
        this.setDescricao(descricao);
    }
}