package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Especialidade;

public class EspecialidadeDAO extends ConnectDAO {
    // Declaração de String SQL
    private static final String INSERT_ESPECIALIDADE_SQL = "INSERT INTO especialidades (descricao, conselho) VALUES (?, ?)";

    // Método para inserir uma nova especialidade no banco de dados
    public void insertEspecialidade(Especialidade especialidade) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ESPECIALIDADE_SQL)) {
            preparedStatement.setString(1, especialidade.getDescricao());
            preparedStatement.setString(2, especialidade.getConselho());

            preparedStatement.executeUpdate();
        }
    }

    // Outros métodos CRUD (update, delete, select) podem ser adicionados conforme necessário
}