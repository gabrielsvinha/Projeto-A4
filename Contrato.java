import java.util.Date;
import java.text.DateFormat;

public class Contrato {
    private int codigo;
    private String dataDeTermino;
    Date data = new Date();
    private String dataDeInicio = DateFormat.getDateInstance(DateFormat.SHORT).format(data);
    CadastroProjeto projeto = new CadastroProjeto();
    Orcamento orcamento = new Orcamento();
    CadastroMateriais material = new CadastroMateriais();
    Funcionario funcionario = new Funcionario();
    CadastroLevantamento levantamento = new CadastroLevantamento();
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setDataDeTermino(String dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }
    
    public String getDataDeTermino() {
        return this.dataDeTermino;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Projeto: "
                + this.projeto.getDescricao() + " | Orçamento: " + this.orcamento.getDescricao()
                + " | Data de Início: " + this.dataDeInicio + " | Data de Término: "
                + this.getDataDeTermino() + " | Custo de Material: " + this.material.getValor()
                + " | Valor do Projeto: " + this.projeto.getValorTotal() + " | Funcionário: "
                + this.funcionario.getNome() + " | Visitas Cobradas: " + this.levantamento.getValorCobrado());
    }
    
    public Contrato() {}
    public Contrato(int codigo, CadastroProjeto projeto, Orcamento orcamento,
            String dataDeTermino, CadastroMateriais material, Funcionario funcionario,
            CadastroLevantamento levantamento) {
        this.setCodigo(codigo);
        this.projeto = projeto;
        this.orcamento = orcamento;
        this.setDataDeTermino(dataDeTermino);
        this.material = material;
        this.funcionario = funcionario;
        this.levantamento = levantamento;
    }
}