package br.com.frota.model;

import br.com.frota.DAO.MedicaoDAO;
import br.com.frota.DAO.TarifaDAO;

public class Cobranca extends GenericModel{
    private String mesReferencia;
    private String anoReferencia;
    private Integer tarifaId;
    private Integer medicaoId;
    static private TarifaDAO tarifaDao = new TarifaDAO();
    static private MedicaoDAO medicaoDao = new MedicaoDAO();

    public Cobranca(Integer id, String mesReferencia, String anoReferencia, Integer tarifaId, Integer medicaoId) {
        super.setId(id);
        this.mesReferencia = mesReferencia;
        this.anoReferencia = anoReferencia;
        this.tarifaId = tarifaId;
        this.medicaoId = medicaoId;
    }

    public Cobranca(String mesReferencia, String anoReferencia, Integer tarifaId, Integer medicaoId) {
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
        return tarifaId;
    }

    public Integer getMedicaoId() {
        return medicaoId;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public void setAnoReferencia(String anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public void setTarifaId(Integer tarifaId) {
        this.tarifaId = tarifaId;
    }

    public void setMedicaoId(Integer medicaoId) {
        this.medicaoId = medicaoId;
    }

    @Override
    public String toString() {
        return "Cobranca{" +
                "id='" + this.getId() + '\'' +
                "mesReferencia='" + mesReferencia + '\'' +
                ", anoReferencia='" + anoReferencia + '\'' +
                ", tarifaId=" + tarifaDao.selectTarifaById(tarifaId) +
                ", medicaoId=" + medicaoDao.selectMedicaoById(medicaoId) +
                '}';
    }
}