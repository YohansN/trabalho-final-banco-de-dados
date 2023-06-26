package br.com.frota.util;

import br.com.frota.DAO.BoletoEnergiaDAO;
import br.com.frota.DAO.MarcaDAO;
import br.com.frota.DAO.PessoaDAO;
import br.com.frota.DAO.TipoPessoaDAO;
import br.com.frota.model.BoletoEnergia;
import br.com.frota.model.Pessoa;
import com.google.gson.Gson;

import java.sql.SQLException;
import java.util.List;

public class Teste {
    static MarcaDAO marcaDAO = new MarcaDAO();
    static TipoPessoaDAO tipoPessoaDAO = new TipoPessoaDAO();
    static PessoaDAO pessoaDAO = new PessoaDAO();
    static BoletoEnergiaDAO boletoEnergiaDAO = new BoletoEnergiaDAO();

    public static void main(String[] args) throws SQLException {

        /*//count
        System.out.println(tipoPessoaDAO.count());
        System.out.println(pessoaDAO.count());

        //salvar
        Pessoa pessoa = new Pessoa("Teste da Silva", "11122233344", 1);
        pessoaDAO.insertPessoa(pessoa);

        //buscar por ID
        pessoa = pessoaDAO.selectPessoaById(8);
        System.out.println(pessoa);

        //Update
        pessoa.setNome("Daniel Ribeiro da Silva");
        pessoa.setCpf("01212002112");
        pessoa.setCnpj("");
        pessoa.setTipoPessoaId(2);
        pessoaDAO.updatePessoa(pessoa);
        pessoa = pessoaDAO.selectPessoaById(8);
        System.out.println(pessoa);

        //Select all
        List<Pessoa> pessoas = pessoaDAO.selectAllPessoa();
        pessoas.forEach(System.out::println);

        //Delete
        pessoaDAO.deletePessoa(2);
        pessoaDAO.selectAllPessoa().forEach(System.out::println);*/

        BoletoEnergia boleto = boletoEnergiaDAO.selectClienteDataById(1);
        System.out.println(boleto);


        System.out.println(new Gson().toJson(boleto));
    }
}
