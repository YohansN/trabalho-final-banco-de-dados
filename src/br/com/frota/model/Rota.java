package br.com.frota.model;

public class Rota extends GenericModel{
    private String descricao;

    public Rota(Integer id, string descricao) {
        super.setId(id);
        this.descricao = descricao;
    }

    public string getDescricao() {
        return descricao;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rota{" +
                "id='" + this.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                '}';
    }
}