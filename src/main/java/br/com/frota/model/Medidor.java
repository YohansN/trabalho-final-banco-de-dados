package br.com.frota.model;
public class Medidor extends GenericModel{
    private String descricao;
    private Rota rotaId;
    private Poste posteId;

    public Medidor(Integer id, String descricao, Rota rotaId, Poste posteId) {
        super.setId(id);
        this.descricao = descricao;
        this.rotaId = rotaId;
        this.posteId = posteId;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getRotaId() {
        return rotaId.getId();
    }

    public Integer getPosteId() {
        return posteId.getId();
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