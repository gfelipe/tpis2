package service;

import dao.DataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageService {

    private Connection conn;

    public ImageService() {
        Connection conn = DataSource.getConnection();
    }

    public void save(InputStream file, String author, String caption, String location) {

        try {

            PreparedStatement statement = conn.prepareStatement("insert into FOTO(imagem, autor, local, legenda) VALUES (?, ?, ?, ?)");

            statement.setBlob(1, file);
            statement.setString(2, author);
            statement.setString(3, caption);
            statement.setString(4, location);

            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
