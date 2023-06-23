package br.com.frota.model;
public class Tarifa extends GenericModel{
    private String taxa;
    private Classe classeId;
    private String lei;
    private String dataInicio;
    private String dataFinal;

    public Tarifa(Integer id, String taxa, Classe classeId, String lei, String dataInicio, String dataFinal) {
        super.setId(id);
        this.taxa = taxa;
        this.classeId = classeId;
        this.lei = lei;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public String getTaxa() {
        return taxa;
    }

    public Integer getClasse() {
        return classeId.getId();
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

    @Override
    public java.lang.String toString() {
        return "Tarifa{" +
                "id='" + this.getId() + '\'' +
                "taxa='" + taxa + '\'' +
                ", classe=" + classeId +
                ", lei='" + lei + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                '}';
    }
}