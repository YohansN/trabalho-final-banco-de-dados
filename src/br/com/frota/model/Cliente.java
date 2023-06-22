package br.com.frota.model;

public class Cliente extends GenericModel{
    private String numDocumento;
    private String numCliente;
    private Integer pessoaId;

    public Cliente(Integer id, String numDocumento, String numCliente, Integer pessoaId) {
        super.setId(id);
        this.numDocumento = numDocumento;
        this.numCliente = numCliente;
        this.pessoaId = pessoaId;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public Integer getPessoaId() {
        return pessoaId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "id='" + this.getId() + '\'' +
                "numDocumento='" + numDocumento + '\'' +
                ", numCliente='" + numCliente + '\'' +
                ", pessoaId=" + pessoaId +
                '}';
    }
}