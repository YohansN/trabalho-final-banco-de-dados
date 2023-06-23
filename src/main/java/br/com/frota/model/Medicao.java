package br.com.frota.model;

public class Medicao extends GenericModel{
    private String mes;
    private String ano;
    private String dataMedicao;
    private String consumo;
    private Integer medidorId;
    private Integer timeRotaId;

    public Medicao(Integer id, String mes, String ano, String dataMedicao, String consumo, Integer medidorId, Integer timeRotaId) {
        super.setId(id);
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

    public String getDataMedicao() {
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

    @Override
    public String toString() {
        return "Medicao{" +
                "id='" + this.getId() + '\'' +
                "mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", dataMedicao='" + dataMedicao + '\'' +
                ", consumo='" + consumo + '\'' +
                ", medidorId=" + medidorId +
                ", timeRotaId=" + timeRotaId +
                '}';
    }
}