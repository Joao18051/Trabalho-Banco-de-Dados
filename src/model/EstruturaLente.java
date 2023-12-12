package model;

public class EstruturaLente extends GenericModel {
    private String tipoCorrecao;
    private int distanciaPupilar;
    private Integer idReceitaOculos;
    //Construtor
    public EstruturaLente(Integer id, String tipoCorrecao, int distanciaPupilar, Integer idReceitaOculos) {
        super.setId(id);
        this.tipoCorrecao = tipoCorrecao;
        this.distanciaPupilar = distanciaPupilar;
        this.idReceitaOculos = idReceitaOculos;
    }

    public String getTipoCorrecao() {
        return tipoCorrecao;
    }
    public void setTipoCorrecao(String tipoCorrecao) {
        this.tipoCorrecao = tipoCorrecao;
    }

    public int getDistanciaPupilar() {
        return distanciaPupilar;
    }
    public void setDistanciaPupilar(int distanciaPupilar) {
        this.distanciaPupilar = distanciaPupilar;
    }

    public Integer getIdReceitaOculos() {
        return idReceitaOculos;
    }
    public void setIdReceitaOculos(Integer idReceitaOculos) {
        this.idReceitaOculos = idReceitaOculos;
    }

    @Override
    public String toString() {
        return "Estrutura Lente{" +
                "id=" + getId() +
                ", Tipo Correção='" + tipoCorrecao + '\'' +
                ", Distancia Pupilar=" + distanciaPupilar +
                ", Id Receita Óculos=" + idReceitaOculos +
                '}';
    }
}
