import DAO.EspecialidadeDAO;
import model.Especialidade;

public class Main {

    public static void main(String[] args) {
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();

        // Cria uma especialidade para inserção
        Especialidade especialidade = new Especialidade(null, "Oftalmologia", "CRM12345");

        try {
            // Insere a especialidade no banco de dados
            especialidadeDAO.insertEspecialidade(especialidade);
            System.out.println("Especialidade inserida com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao inserir especialidade: " + e.getMessage());
        }

        // Busca a especialidade no banco de dados
        try {
            especialidadeDAO.selectEspecialidadeById(1);
            System.out.println("Especialidade encontrada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao encontrar especialidade: " + e.getMessage());
        }
    }
    
}