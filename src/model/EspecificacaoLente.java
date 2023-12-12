package model;

public class EspecificacaoLente extends GenericModel {
    private float valor;
    private Integer idEstruturaLente;
    private Integer idAtributoEstruturaLente;
    //Construtor
    public EspecificacaoLente(Integer id, float valor, Integer idEstruturaLente, Integer idAtributoEstruturaLente) {
        super.setId(id);
        this.valor = valor;
        this.idEstruturaLente = idEstruturaLente;
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
    }
    //Getters e Setters
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public Integer getIdEstruturaLente() {
        return idEstruturaLente;
    }
    public void setIdEstruturaLente(Integer idEstruturaLente) {
        this.idEstruturaLente = idEstruturaLente;
    }

    public Integer getIdAtributoEstruturaLente() {
        return idAtributoEstruturaLente;
    }
    public void setIdAtributoEstruturaLente(Integer idAtributoEstruturaLente) {
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
    }

    @Override
    public String toString() {
        return "Especificação Lente{" +
                "id=" + getId() +
                ", Valor=" + valor +
                ", Id Estrutura Lente=" + idEstruturaLente +
                ", Id Atributo Estrutura Lente=" + idAtributoEstruturaLente +
                '}';
    }
}
