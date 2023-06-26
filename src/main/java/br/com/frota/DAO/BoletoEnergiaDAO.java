package br.com.frota.DAO;

public class BoletoEnergiaDAO extends ConexaoDB{
    private static final String JOIN_CLIENTE_DATA = "INSERT INTO cliente (num_documento, num_cliente, pessoa_id) VALUES (?, ?, ?);";
}
