package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaDetalleTO {
    public String IdVentaDetalle;
    public String IdVenta;
    public String IdProducto;
    public double precioUnit;
    public String CodigoIMEI;
}