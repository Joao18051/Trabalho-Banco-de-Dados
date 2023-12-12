package model;

import java.util.Date;

public class ConsultasMedicas extends GenericModel {
    private String assinatura;
    private Date dtConsulta;
    private Integer idPaciente;
    private Integer idMedico;
    //Construtor
    public ConsultasMedicas(Integer id, String assinatura, Date dtConsulta, Integer idPaciente, Integer idMedico) {
        super.setId(id);
        this.assinatura = assinatura;
        this.dtConsulta = dtConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }
    //Getters e Setters
    public String getAssinatura() {
        return assinatura;
    }
    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }
    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "Consulta Médica{" +
                "id=" + getId() +
                ", Assinatura='" + assinatura + '\'' +
                ", Dt Consulta=" + dtConsulta +
                ", Id Paciente=" + idPaciente +
                ", Id Médico=" + idMedico +
                '}';
    }
}

