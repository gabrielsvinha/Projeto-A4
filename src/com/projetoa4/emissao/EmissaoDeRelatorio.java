package com.projetoa4.emissao;

import com.projetoa4.cadastro.CadastroMateriais;
import com.projetoa4.cadastro.CadastroProjeto;
import com.projetoa4.pessoa.cliente.Cliente;
import com.projetoa4.pessoa.funcionario.Funcionario;
import com.projetoa4.pessoa.prestador.PrestadorDeServico;

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