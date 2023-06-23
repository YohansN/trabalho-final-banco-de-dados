package br.com.frota.model;

public class Classe extends GenericModel {
    private String descricao;
    private Integer idTipoFase;

    public Classe(Integer id, String descricao, Integer idTipoFase) {
        super.setId(id);
        this.descricao = descricao;
        this.idTipoFase = idTipoFase;
    }


    public String getDescricao() {
        return descricao;
    }
    public Integer getIdTipoFase() {
        return idTipoFase;
    }
    @Override
    public java.lang.String toString() {
        return "Classe{" +
                "id='" + this.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                ", idTipoFase=" + idTipoFase +
                '}';
    }
}

