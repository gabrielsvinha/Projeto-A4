public class Fabricante {
    private int codigo;
    private String nome;
    private String telefone;
    private String endereco;
    
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
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Nome: " + this.getNome() + " | Telefone: " + this.getTelefone() + " | Endereço: " + this.getEndereco());
    }
    
    public Fabricante() {}
    public Fabricante(int codigo, String nome, String telefone, String endereco) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
    }
}