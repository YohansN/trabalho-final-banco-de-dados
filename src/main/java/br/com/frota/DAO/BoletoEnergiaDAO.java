package br.com.frota.DAO;

import br.com.frota.model.BoletoEnergia;
import br.com.frota.model.Classe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoletoEnergiaDAO extends ConexaoDB{
    private static final String JOIN_CLIENTE_DATA = "SELECT C.id, P.nome, P.cpf, P.cnpj, P.tipo_pessoa_id, C.num_cliente, C.num_documento, R.descricao, M.descricao, P.id FROM rota AS R\n" +
            "INNER JOIN medidor M ON (M.rota_id = R.id)\n" +
            "INNER JOIN poste AS PO ON (M.poste_id = PO.id)\n" +
            "INNER JOIN contrato AS CO ON (CO.medidor_id = M.id)\n" +
            "INNER JOIN cliente C ON (CO.cliente_id = C.id)\n" +
            "INNER JOIN pessoa P ON (C.pessoa_id = P.ID)\n" +
            "INNER JOIN tipo_pessoa AS TP ON (P.tipo_pessoa_id = TP.id)\n" +
            "WHERE C.id = ?;";

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
