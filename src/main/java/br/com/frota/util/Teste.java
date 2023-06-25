package br.com.frota.util;

import br.com.frota.DAO.MarcaDAO;
import br.com.frota.DAO.PessoaDAO;
import br.com.frota.DAO.TipoPessoaDAO;
import br.com.frota.model.Marca;
import br.com.frota.model.Pessoa;
import br.com.frota.model.TipoPessoa;
import com.google.gson.Gson;

import java.sql.SQLException;
import java.util.List;

public class Teste {
    static MarcaDAO marcaDAO = new MarcaDAO();
    static TipoPessoaDAO tipoPessoaDAO = new TipoPessoaDAO();
    static PessoaDAO pessoaDAO = new PessoaDAO();

    public static void main(String[] args) throws SQLException {

        //count
        /*System.out.println(tipoPessoaDAO.count());
        System.out.println(pessoaDAO.count());

        //salvar
        Pessoa pessoa = new Pessoa("");
        pessoaDAO.insertPessoa(pessoa);

        //buscar por ID
        pessoa = pessoaDAO.selectPessoaById(2);
        System.out.println(pessoa);

        //Update
        pessoa.setId();
        pessoa.setNome("");
        pessoa.setCpf("");
        pessoa.setCnpj("");
        pessoa.setTipoPessoaId();
        pessoaDAO.updatePessoa(pessoa);
        pessoa = pessoaDAO.selectPessoaById(2);
        System.out.println(pessoa);

        //Select all
        List<Pessoa> pessoas = pessoaDAO.selectAllPessoa();
        pessoas.forEach(System.out::println);

        //Delete
        pessoaDAO.deletePessoa(2);
        pessoaDAO.selectAllPessoa().forEach(System.out::println);

        System.out.println(new Gson().toJson(pessoa));*/
    }
}
