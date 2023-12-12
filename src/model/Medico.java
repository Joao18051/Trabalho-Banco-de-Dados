package model;

public class Medico extends GenericModel {
    private String nome;
    private String crm;
    //Construtor
    public Medico(Integer id, String nome, String crm) {
        super.setId(id);
        this.nome = nome;
        this.crm = crm;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Médico{" +
                "id=" + getId() +
                ", Nome='" + nome + '\'' +
                ", CRM='" + crm + '\'' +
                '}';
    }
}