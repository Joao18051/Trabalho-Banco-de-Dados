package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Especialidade;

public class EspecialidadeDAO extends ConnectDAO {
    // Declaração de String SQL
    private static final String INSERT_ESPECIALIDADE_SQL = "INSERT INTO especialidades (descricao, conselho) VALUES (?, ?)";
    private static final String SELECT_ESPECIALIDADE_BY_ID_SQL = "SELECT id, descricao, conselho FROM especialidades WHERE id = ?";

    // Método para inserir uma nova especialidade no banco de dados
    public void insertEspecialidade(Especialidade especialidade) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ESPECIALIDADE_SQL)) {
            preparedStatement.setString(1, especialidade.getDescricao());
            preparedStatement.setString(2, especialidade.getConselho());

            preparedStatement.executeUpdate();
        }
    }

    public Especialidade selectEspecialidadeById(int especialidadeId) throws SQLException {
        Especialidade especialidade = null;

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ESPECIALIDADE_BY_ID_SQL)) {

            preparedStatement.setInt(1, especialidadeId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String descricao = resultSet.getString("descricao");
                    String conselho = resultSet.getString("conselho");

                    especialidade = new Especialidade(id, descricao, conselho);
                }
            }
        }

        return especialidade;
    }
    // Outros métodos CRUD (update, delete, select) podem ser adicionados conforme necessário
}