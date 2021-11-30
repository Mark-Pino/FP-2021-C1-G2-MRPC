package pe.edu.upeu.modelo;
import lombok.Data;

@Data
public class ProductoTO {
    public String idProducto;
    public String nombre;
    public int talla;
    public String genero;
    public String tipo;
    public String idMarca;
    public double preciounit;
    public int stock;
    public String unidmed;
    public double utilidad;
}