package com.projetoa4;

import com.projetoa4.cadastro.CadastroProjeto;
import com.projetoa4.emissao.EmissaoDeRelatorio;
import com.projetoa4.pessoa.cliente.Cliente;

public class Main {
    public static void main(String args[]) {
        Cliente cliente1 = new Cliente(562, "renan", "97201091", "rua sla");
        CadastroProjeto projeto1 = new CadastroProjeto(153, cliente1, "sei la", 100.0);
        System.out.println(projeto1.toString());
        EmissaoDeRelatorio emissaoDeRelatorio = new EmissaoDeRelatorio();
        emissaoDeRelatorio.emitirRelatorio(cliente1);
    }
}   