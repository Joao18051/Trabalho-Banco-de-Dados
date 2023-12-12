package com.projeto.DAO;

import com.projeto.model.atributos_estrutura_lente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class atributos_estrutura_lenteDAO extends ConexaoDB {

    private static final String INSERT_ATRIBUTOS_SQL = "INSERT INTO atributos_estrutura_lente (descricao, lado_olho) VALUES (?, ?);";
    private static final String SELECT_ATRIBUTOS_BY_ID = "SELECT id, descricao, lado_olho FROM atributos_estrutura_lente WHERE id = ?";
    private static final String SELECT_ALL_ATRIBUTOS = "SELECT * FROM atributos_estrutura_lente;";
    private static final String DELETE_ATRIBUTOS_SQL = "DELETE FROM atributos_estrutura_lente WHERE id = ?;";
    private static final String UPDATE_ATRIBUTOS_SQL = "UPDATE atributos_estrutura_lente SET descricao = ?, lado_olho = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM atributos_estrutura_lente;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertAtributo(atributos_estrutura_lente entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_ATRIBUTOS_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setString(2, entidade.getLado_olho());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public atributos_estrutura_lente selectAtributo(int id) {
        atributos_estrutura_lente entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ATRIBUTOS_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                String lado_olho = rs.getString("lado_olho");
                entidade = new atributos_estrutura_lente(id, descricao, lado_olho);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<atributos_estrutura_lente> selectAllAtributos() {
        List<atributos_estrutura_lente> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_ATRIBUTOS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                String lado_olho = rs.getString("lado_olho");
                entidades.add(new atributos_estrutura_lente(id, descricao, lado_olho));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteAtributo(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_ATRIBUTOS_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateAtributo(atributos_estrutura_lente entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_ATRIBUTOS_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setString(2, entidade.getLado_olho());
            statement.setInt(3, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

