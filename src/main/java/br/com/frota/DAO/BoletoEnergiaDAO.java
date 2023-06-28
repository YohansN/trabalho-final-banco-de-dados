package br.com.frota.DAO;

import br.com.frota.model.BoletoEnergia;
import br.com.frota.model.Classe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoletoEnergiaDAO extends ConexaoDB{
    private static final String JOIN_CLIENTE_DATA = "SELECT pessoa.id, pessoa.nome, pessoa.cpf, pessoa.cnpj, pessoa.tipo_pessoa_id, cliente.num_cliente, cliente.num_documento, rota.descricao, medidor.descricao\n" +
            "FROM rota\n" +
            "INNER JOIN medidor ON (medidor.rota_id = rota.id)\n" +
            "INNER JOIN poste ON (medidor.poste_id = poste.id)\n" +
            "INNER JOIN contrato ON (contrato.medidor_id = medidor.id)\n" +
            "INNER JOIN cliente ON (contrato.cliente_id = cliente.id)\n" +
            "INNER JOIN pessoa ON (cliente.pessoa_id = pessoa.ID)\n" +
            "INNER JOIN tipo_pessoa ON (pessoa.tipo_pessoa_id = tipo_pessoa.id)\n" +
            "WHERE cliente.id = ?;";

    public BoletoEnergia selectClienteDataById(int id) {
        BoletoEnergia entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(JOIN_CLIENTE_DATA)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer Id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String cnpj = rs.getString("cnpj");
                Integer tipoPessoaId = rs.getInt("tipo_pessoa_id");
                String numCliente = rs.getString("num_cliente");
                String numDocumento = rs.getString("num_documento");
                String descricaoRota = rs.getString("descricao");
                String descricaoMedidor = rs.getString("descricao");

                System.out.println("DADOS PESSOAIS:");
                entidade = new BoletoEnergia(Id, nome, cpf, cnpj, tipoPessoaId, numCliente, numDocumento, descricaoRota, descricaoMedidor);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }
}
