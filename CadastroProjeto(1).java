import java.util.Date;
import java.text.DateFormat;

public class CadastroProjeto {
    private int codigo;
    private String descricao;
    private double valorTotal;
    Date data = new Date();
    private String dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT).format(data);
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
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public double getValorTotal() {
        return this.valorTotal;
    }
    
    public String toString() {
        return String.format("Código: " + this.getCodigo() + " | Cliente: "
                + this.cliente.getNome() + " | Data de Início: " + this.dataFormatada
                + " | Descrição: " + this.getDescricao() + " | Valor Total: " + this.getValorTotal());
    }
    
    public CadastroProjeto() {}
    public CadastroProjeto(int codigo, Cliente cliente, String descricao, double valorTotal) {
        this.setCodigo(codigo);
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValorTotal(valorTotal);
    }
}