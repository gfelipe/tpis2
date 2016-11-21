import dao.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BootStrap {

    private Connection connection;

    public BootStrap() {
        this.connection = DataSource.getConnection();
    }

    public void createTables() {
        String sql = null;
        try {
            sql = "CREATE TABLE FOTO( " +
                    "id integer not null GENERATED ALWAYS AS " +
                    "IDENTITY (START WITH 1, INCREMENT BY 1) " +
                    "CONSTRAINT PK_FOTO PRIMARY KEY, " +
                    "imagem blob(16M) not null, " +
                    "autor integer null" +
                    "local integer null" +
                    "legenda integer null" +
                    ")";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela FOTO criada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
