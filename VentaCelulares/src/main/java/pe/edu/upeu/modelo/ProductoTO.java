package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class ProductoTO {
    public String IdProducto;
    public String nombre;
    /*
    talla
    genero
    tipo 
     */
    public String IdMarca;
    public double precioUnit;
    /*
    stock
    */
    public String unidadMed;
    public double utilidad;
    public String CodigoIMEI;
}