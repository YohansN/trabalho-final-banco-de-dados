package br.com.frota.servico;

import br.com.frota.DAO.BoletoEnergiaDAO;
import br.com.frota.model.BoletoEnergia;

public class ServicoBoletoEnergia extends BoletoEnergiaDAO {

    public static void main(String[] args) {
        BuscarDadosPessoais(2);
    }
    public static void BuscarDadosPessoais(int id){
        BoletoEnergiaDAO boletoEnergiaDAO = new BoletoEnergiaDAO();
        BoletoEnergia boleto = boletoEnergiaDAO.selectClienteDataById(id);
        System.out.println(boleto);
    }
}
