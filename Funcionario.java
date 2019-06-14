public class Funcionario extends Pessoa {
    private double salario;
    CadastroProjeto projeto = new CadastroProjeto();
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Nome: " + this.getNome() + " | Projeto Alocado: " + this.projeto.getDescricao() + " | Telefone: " + this.getTelefone() + " | Endereço: " + this.getEndereco() + " | Salário: " + this.getSalario());
    }
    
    public Funcionario() {}
    public Funcionario(int codigo, String nome, CadastroProjeto projeto, String telefone, String endereco, double salario) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.projeto = projeto;
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        this.setSalario(salario);
    }
}