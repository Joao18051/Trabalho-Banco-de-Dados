package model;

public class AtributoEstruturaLente extends GenericModel {
    private String descricao;
    private String ladoOlho;
    //Construtor
    public AtributoEstruturaLente(Integer id, String descricao, String ladoOlho) {
        super.setId(id);
        this.descricao = descricao;
        this.ladoOlho = ladoOlho;
    }
    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLadoOlho() {
        return ladoOlho;
    }
    public void setLadoOlho(String ladoOlho) {
        this.ladoOlho = ladoOlho;
    }

    @Override
    public String toString() {
        return "Atributo Estrutura Lente{" +
                "id=" + getId() +
                ", Descrição='" + descricao + '\'' +
                ", Lado Olho='" + ladoOlho + '\'' +
                '}';
    }
}
