package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
    public String IdVentaDetalle;
    public String IdVenta;
    public String IdProducto;
    public String precioUnit;
    //public double monto;
    public double descuento;
    public double totalPago;
}