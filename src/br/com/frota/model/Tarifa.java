package br.com.frota.model;
public class Tarifa extends GenericModel{
    private String taxa;
    private Integer classe;
    private String lei;
    private String dataInicio;
    private String dataFinal;

    public Tarifa(Integer id, String taxa, Integer classe, String lei, String dataInicio, String dataFinal) {
        super.setId(id);
        this.taxa = taxa;
        this.classe = classe;
        this.lei = lei;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String getTaxa() {
        return taxa;
    }

    public Integer getClasse() {
        return classe;
    }

    public String getLei() {
        return lei;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tarifa{" +
                "id='" + super.getId() + '\'' +
                "taxa='" + taxa + '\'' +
                ", classe=" + classe +
                ", lei='" + lei + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                '}';
    }
}