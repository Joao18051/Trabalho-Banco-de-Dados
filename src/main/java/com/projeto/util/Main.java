package  com.projeto.util;

import  com.projeto.DAO.especialidadesDAO;
import com.projeto.DAO.medicosDAO;
import  com.projeto.model.especialidades;
import com.projeto.model.medicos;

import java.sql.SQLException;
import java.util.List;

public class Main {
    static especialidadesDAO especialidadesDAO = new especialidadesDAO();
    static medicosDAO medicosDAO = new medicosDAO();

    public static void main(String[] args) throws SQLException {
        //--Insere um elemento no banco
        especialidades especialidade = new especialidades(null,"Ginecologia","SBG");
        //especialidadesDAO.insertEspecialidade(especialidade);
        medicos medico = new medicos(null, "Dr C", "043524");
        //medicosDAO.insertMedico(medico);

        //--Busca um elemento na tabela por Id
        System.out.println("");
        System.out.print("Elemento buscado: ");
        especialidade = especialidadesDAO.selectEspecialidade(5);
        System.out.println(especialidade);

        System.out.print("Elemento buscado: ");
        medico = medicosDAO.selectMedico(6);
        System.out.println(medico);
        System.out.println("");

        //--Deleta um elemento da tabela
        //especialidadesDAO.deleteEspecialidade(7);
        //medicosDAO.deleteMedico(1);

        //--Seleciona todos os elementos da tabela e os imprime
        List<medicos> medicos = medicosDAO.selectAllMedicos();
        medicos.forEach(System.out::println);

        System.out.println("");
        List<especialidades> especialidades = especialidadesDAO.selectAllEspecialidades();
        especialidades.forEach(System.out::println);

        //--Atualiza um elemento do banco
        especialidade = especialidadesDAO.selectEspecialidade(12);
        especialidade.setConselho("CBO");
        especialidadesDAO.updateEspecialidade(especialidade);
        System.out.println("");
        System.out.print("Atualização: ");
        especialidade = especialidadesDAO.selectEspecialidade(12);
        System.out.println(especialidade);

        medico = medicosDAO.selectMedico(4);
        medico.setCrm("7654324");
        medicosDAO.updateMedico(medico);
        System.out.print("Atualização: ");
        medico = medicosDAO.selectMedico(4);
        System.out.println(medico);

        //--Imprime a quantidade de registros
        System.out.println("");
        System.out.print("Registros - Especialidades: ");
        System.out.println(especialidadesDAO.count());

        System.out.println("");
        System.out.print("Registros - Médicos: ");
        System.out.println(medicosDAO.count());
    }
}
