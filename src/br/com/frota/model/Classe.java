package br.com.frota.model;

public class Classe extends GenericModel {
    private String descricao;
    private Integer idTipoFase;

    public Classe(Integer id, String descricao, Integer idTipoFase) {
        super.SetId(id);
        this.descricao = descricao;
        this.idTipoFase = idTipoFase;
    }


    public String getDescricao() {
        return descricao;
    }
    public Integer getIdTipoFase() {
        return idTipoFase;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Classe{" +
                "id='" + super.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                ", idTipoFase=" + idTipoFase +
                '}';
    }
}

