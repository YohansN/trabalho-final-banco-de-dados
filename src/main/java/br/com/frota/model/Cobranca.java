package br.com.frota.model;

public class Cobranca extends GenericModel{
    private String mesReferencia;
    private String anoReferencia;
    private Tarifa tarifaId;
    private Medicao medicaoId;

    public Cobranca(Integer id, String mesReferencia, String anoReferencia, Tarifa tarifaId, Medicao medicaoId) {
        super.setId(id);
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.tarifaId = tarifaId;
        this.medicaoId = medicaoId;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public String getAnoReferencia() {
        return anoReferencia;
    }

    public Integer getTarifaId() {
        return tarifaId.getId();
    }

    public Integer getMedicaoId() {
        return medicaoId.getId();
    }

    @Override
    public String toString() {
        return "Cobranca{" +
                "id='" + this.getId() + '\'' +
                "mesReferencia='" + mesReferencia + '\'' +
                ", anoReferencia='" + anoReferencia + '\'' +
                ", tarifaId=" + tarifaId +
                ", medicaoId=" + medicaoId+
                '}';
    }
}