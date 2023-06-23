package br.com.frota.model;
public class Medidor extends GenericModel{
    private String descricao;
    private Integer rotaId;
    private Integer posteId;

    public Medidor(Integer id, String descricao, Integer rotaId, Integer posteId) {
        super.setId(id);
        this.descricao = descricao;
        this.rotaId = rotaId;
        this.posteId = posteId;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getRotaId() {
        return rotaId;
    }

    public Integer getPosteId() {
        return posteId;
    }

    @Override
    public String toString() {
        return "Medidor{" +
                "id='" + this.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                ", rotaId=" + rotaId +
                ", posteId=" + posteId +
                '}';
    }
}