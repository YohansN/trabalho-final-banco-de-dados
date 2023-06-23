package br.com.frota.model;

public class Classe extends GenericModel {
    private String descricao;
    private TipoFase tipoFaseId;

    public Classe(Integer id, String descricao, TipoFase tipoFaseId) {
        super.setId(id);
        this.descricao = descricao;
        this.tipoFaseId = tipoFaseId;
    }


    public String getDescricao() {
        return descricao;
    }
    public Integer getTipoFaseId() {
        return tipoFaseId.getId();
    }
    @Override
    public java.lang.String toString() {
        return "Classe{" +
                "id='" + this.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                ", idTipoFase=" + tipoFaseId +
                '}';
    }
}

