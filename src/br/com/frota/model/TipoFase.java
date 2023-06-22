package br.com.frota.model;

public class TipoFase extends GenericModel {
    private String descricao;

    public TipoFase(Integer id, string descricao) {
        super.setId(id);
        this.descricao = descricao;
    }
    public string getDescricao() {
        return descricao;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TipoFase{" +
                "id='" + super.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
}