package model;

public class ObservacoesLaudos extends GenericModel {
    private String descricao;
    private Integer idReceitaOculos;
    //Construtor
    public ObservacoesLaudos(Integer id, String descricao, Integer idReceitaOculos) {
        super.setId(id);
        this.descricao = descricao;
        this.idReceitaOculos = idReceitaOculos;
    }
    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdReceitaOculos() {
        return idReceitaOculos;
    }
    public void setIdReceitaOculos(Integer idReceitaOculos) {
        this.idReceitaOculos = idReceitaOculos;
    }

    @Override
    public String toString() {
        return "Observação Laudo{" +
                "id=" + getId() +
                ", Descrição='" + descricao + '\'' +
                ", Id Receita Óculos=" + idReceitaOculos +
                '}';
    }
}