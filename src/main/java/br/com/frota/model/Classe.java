package br.com.frota.model;

public class Classe extends GenericModel {
    private String descricao;
    private Integer tipoFaseId;

    public Classe(Integer id, String descricao, Integer tipoFaseId) {
        super.setId(id);
        this.descricao = descricao;
        this.tipoFaseId = tipoFaseId;
    }


    public String getDescricao() {
        return descricao;
    }
    public Integer getTipoFaseId() {
        return tipoFaseId;
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

