package com.softek.Persistencia;

import com.softek.modelo.Producto;
import com.softek.Persistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteProducto extends Conexion{
    public Producto BorrarPorId(Integer idBuscar) throws ClassNotFoundException, SQLException {
        String sqlID = "DELETE * FROM products WHERE product_id = ?";
        Producto producto = null;

        try (PreparedStatement statement = miConexion.prepareStatement(sqlID)) {
            statement.setInt(1, idBuscar);
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Elemento Eliminado...");
            }
        }

        return producto;
    }
}
