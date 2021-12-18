package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
    public String IdVenta;
    public String dni;
    public String fecha;
    public double subTotal;
    public double igv;
    public double ImporteTotal;
    public String usuario;
}