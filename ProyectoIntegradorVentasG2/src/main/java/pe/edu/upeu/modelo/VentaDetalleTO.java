package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
    public String idVentaDetalle;
    public String idVenta;
    public String idProducto;
    public int cantidad;
    public double precioUnit;
    public double descuento;
    public double totalPago;
}