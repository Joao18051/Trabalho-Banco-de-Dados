package model;

import java.util.Date;

public class ReceitaOculos extends GenericModel {
    private String detalhamento;
    private Date dtConsulta;
    private Integer idConsultaMedica;
    //Construtor
    public ReceitaOculos(Integer id, String detalhamento, Date dtConsulta, Integer idConsultaMedica) {
        super.setId(id);
        this.detalhamento = detalhamento;
        this.dtConsulta = dtConsulta;
        this.idConsultaMedica = idConsultaMedica;
    }
    //Getters e Setters
    public String getDetalhamento() {
        return detalhamento;
    }
    public void setDetalhamento(String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }
    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Integer getIdConsultaMedica() {
        return idConsultaMedica;
    }
    public void setIdConsultaMedica(Integer idConsultaMedica) {
        this.idConsultaMedica = idConsultaMedica;
    }

    @Override
    public String toString() {
        return "Receita Óculos{" +
                "id=" + getId() +
                ", Detalhamento='" + detalhamento + '\'' +
                ", Dt Consulta=" + dtConsulta +
                ", Id Consulta Médica=" + idConsultaMedica +
                '}';
    }
}
