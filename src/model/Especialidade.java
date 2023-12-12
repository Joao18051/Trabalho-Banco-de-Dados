package model;

public class Especialidade extends GenericModel{
    private String descricao;
    private String conselho;
    //Construtor
    public Especialidade(Integer id, String descricao, String conselho) {
        super.setId(id);
        this.descricao = descricao;
        this.conselho = conselho;
    }
    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getConselho() {
        return conselho;
    }
    public void setConselho(String conselho) {
        this.conselho = conselho;
    }

    @Override
    public String toString() {
        return "Especialidade{" +
                "id=" + getId() +
                ", descricao='" + descricao + '\'' +
                ", conselho='" + conselho + '\'' +
                '}';
    }
}
