package model;

import java.util.Date;

public class Paciente extends GenericModel{
    private String nome;
    private String cpf;
    private Date dt_nascimento;
    //Construtor
    public Paciente(Integer id, String nome, String cpf, Date dt_nascimento) {
        super.setId(id);
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
    }
    //Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dt_nascimento;
    }
    public void setDtNascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String toString() {
        return "Paciente{" +
                "id=" + getId() +
                ", Nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data de nascimentp='" + dt_nascimento + '\'' +
                '}';
    }
}
