package model;

import java.util.Date;

public class EspecialidadeMedica extends GenericModel {
    private String observacao;
    private Date dtConclusao;
    private Integer idEspecialidade;
    private Integer idMedico;

    public EspecialidadeMedica(Integer id, String observacao, Date dtConclusao, Integer idEspecialidade, Integer idMedico) {
        super.setId(id);
        this.observacao = observacao;
        this.dtConclusao = dtConclusao;
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDtConclusao() {
        return dtConclusao;
    }
    public void setDtConclusao(Date dtConclusao) {
        this.dtConclusao = dtConclusao;
    }

    public Integer getIdEspecialidade() {
        return idEspecialidade;
    }
    public void setIdEspecialidade(Integer idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public Integer getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "Especialidade Médica{" +
                "id=" + getId() +
                ", Observação='" + observacao + '\'' +
                ", Dt Conclusão=" + dtConclusao +
                ", Id Especialidade=" + idEspecialidade +
                ", Id Medico=" + idMedico +
                '}';
    }
}