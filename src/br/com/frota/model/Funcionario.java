package br.com.frota.model;

public class Funcionario extends GenericModel{
    private String codigoFuncional;
    private Integer pessoaId;


    public Funcionario(Integer id, String codigoFuncional, Integer pessoaId) {
        super.setId(id);
        this.codigoFuncional = codigoFuncional;
        this.pessoaId = pessoaId;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public Integer getPessoaId() {
        return pessoaId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Funcionario{" +
                "id='" + this.getId() + '\'' +
                "codigoFuncional='" + codigoFuncional + '\'' +
                ", pessoaId=" + pessoaId +
                '}';
    }
}

