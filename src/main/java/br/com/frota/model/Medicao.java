package br.com.frota.model;

import br.com.frota.DAO.MedidorDAO;
import br.com.frota.DAO.TimeRotaDAO;

import java.sql.Timestamp;

public class Medicao extends GenericModel{
    private String mes;
    private String ano;
    private Timestamp dataMedicao;
    private String consumo;
    private Integer medidorId;
    private Integer timeRotaId;
    static private MedidorDAO medidorDao = new MedidorDAO();
    static private TimeRotaDAO timeRotaDao = new TimeRotaDAO();

    public Medicao(Integer id, String mes, String ano, Timestamp dataMedicao, String consumo, Integer medidorId, Integer timeRotaId) {
        super.setId(id);
        this.mes = mes;
        this.ano = ano;
        this.dataMedicao = dataMedicao;
        this.consumo = consumo;
        this.medidorId = medidorId;
        this.timeRotaId = timeRotaId;
    }

    public Medicao(String mes, String ano, Timestamp dataMedicao, String consumo, Integer medidorId, Integer timeRotaId) {
        this.mes = mes;
        this.ano = ano;
        this.dataMedicao = dataMedicao;
        this.consumo = consumo;
        this.medidorId = medidorId;
        this.timeRotaId = timeRotaId;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    public Timestamp getDataMedicao() {
        return dataMedicao;
    }

    public String getConsumo() {
        return consumo;
    }

    public Integer getMedidorId() {
        return medidorId;
    }

    public Integer getTimeRotaId() {
        return timeRotaId;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setDataMedicao(Timestamp dataMedicao) {
        this.dataMedicao = dataMedicao;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setMedidorId(Integer medidorId) {
        this.medidorId = medidorId;
    }

    public void setTimeRotaId(Integer timeRotaId) {
        this.timeRotaId = timeRotaId;
    }

    @Override
    public String toString() {
        return "Medicao{" +
                "id='" + this.getId() + '\'' +
                "mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", dataMedicao='" + dataMedicao + '\'' +
                ", consumo='" + consumo + '\'' +
                ", medidorId=" + medidorDao.selectMedidorById(medidorId) +
                ", timeRotaId=" + timeRotaDao.selectTimeRotaById(timeRotaId) +
                '}';
    }
}