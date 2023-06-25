package br.com.frota.model;

import br.com.frota.DAO.PosteDAO;
import br.com.frota.DAO.RotaDAO;

public class Medidor extends GenericModel{
    private String descricao;
    private Integer rotaId;
    private Integer posteId;
    static private RotaDAO rotaDao = new RotaDAO();
    static private PosteDAO posteDao = new PosteDAO();

    public Medidor(Integer id, String descricao, Integer rotaId, Integer posteId) {
        super.setId(id);
        this.descricao = descricao;
        this.rotaId = rotaId;
        this.posteId = posteId;
    }

    public Medidor(String descricao, Integer rotaId, Integer posteId) {
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRotaId(Integer rotaId) {
        this.rotaId = rotaId;
    }

    public void setPosteId(Integer posteId) {
        this.posteId = posteId;
    }

    @Override
    public String toString() {
        return "Medidor{" +
                "id='" + this.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                ", rotaId=" + rotaDao.selectRotaById(rotaId) +
                ", posteId=" + posteDao.selectPosteById(posteId) +
                '}';
    }
}