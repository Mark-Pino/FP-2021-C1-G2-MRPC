package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class DescuentoTO {
    public String idProducto;
    public int cantidad;
    public double descuento;
}