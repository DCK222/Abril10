package com.softek.modelo;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioUnitario;
    private int unidadesStock;

    public Producto(int product_id, String product_name, double unit_price, int units_in_stock) {
        this.idProducto = product_id;
        this.nombreProducto = product_name;
        this.precioUnitario = unit_price;
        this.unidadesStock = units_in_stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                '}';
    }
}
