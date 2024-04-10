package com.softek.Persistencia;

import com.softek.modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProducto extends Conexion {
    public void actualizarPorId(Integer id, String nombre, Integer precio, Integer stock ) throws ClassNotFoundException, SQLException {
        String sqlUpdate = "INSERT INTO products (product_id, product_name, unit_price, units_in_stock, discontinued) VALUES (" +
               id + ", '" + nombre + "', " + precio + ", " +  ")";


            abrirConexion();

            PreparedStatement statement = miConexion.prepareStatement(sqlUpdate);
            statement.setString(1, productoActualizado.getNombreProducto());
            statement.setDouble(2, productoActualizado.getPrecioUnitario());
            statement.setInt(3, productoActualizado.getUnidadesStock());
            statement.setInt(4, idBuscar);


        
    }
}
