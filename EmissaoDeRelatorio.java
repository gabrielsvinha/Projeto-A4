public class EmissaoDeRelatorio {
    public void emitirRelatorio(Cliente cliente) {
        System.out.println(cliente.toString());
    }
    
    public void emitirRelatorio(CadastroProjeto projeto) {
        System.out.println(projeto.toString());
    }
    
    public void emitirRelatorio(Funcionario funcionario) {
        System.out.println(funcionario.toString());
    }
    
    public void emitirRelatorio(PrestadorDeServico prestadorDeServico) {
        System.out.println(prestadorDeServico.toString());
    }
    
    public void emitirRelatorio(CadastroMateriais material) {
        System.out.println(material.toString());
    }
    
    public EmissaoDeRelatorio() {}
}