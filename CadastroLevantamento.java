import java.util.Date;
import java.text.DateFormat;

public class CadastroLevantamento {
    private int codigoLevantamento;
    private int codigoVisita;
    private double valorCobrado;
    Date data = new Date();
    private String dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT).format(data);
    Cliente cliente = new Cliente();
    CadastroProjeto projeto = new CadastroProjeto();
    
    public void setCodigoLevantamento(int codigoLevantamento) {
        this.codigoLevantamento = codigoLevantamento;
    }
    
    public int getCodigoLevantamento() {
        return this.codigoLevantamento;
    }
    
    public void setCodigoVisita(int codigoVisita) {
        this.codigoVisita = codigoVisita;
    }
    
    public int getCodigoVisita() {
        return this.codigoVisita;
    }
    
    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }
    
    public double getValorCobrado() {
        return this.valorCobrado;
    }
    
    public String toString() {
        return String.format("Código do Levantamento: " + this.getCodigoLevantamento()
                + " | Código da Visita: " + this.getCodigoVisita() + " | Cliente: "
                + this.cliente.getNome() + " | Projeto: " + this.projeto.getDescricao()
                + " | Data de Início: " + this.dataFormatada + " | Valor Cobrado: " + this.getValorCobrado());
    }
    
    public CadastroLevantamento() {}
    public CadastroLevantamento(int codigoLevantamento, int codigoVisita, Cliente cliente,
            CadastroProjeto projeto, double valorCobrado) {
        this.setCodigoLevantamento(codigoLevantamento);
        this.setCodigoVisita(codigoVisita);
        this.cliente = cliente;
        this.projeto = projeto;
        this.setValorCobrado(valorCobrado);
    }
}