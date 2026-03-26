
public class casa {
    private String nombreCliente;
    private String[] productos;
    private double[] precios;
    private int cantidad;

    public casa(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.productos = new String[10];
        this.precios = new double[10];
        this.cantidad = 0;


        
    }
     public void agregarProducto(String nombre, double precio) {
        if (cantidad < 10) {
            productos[cantidad] = nombre;
            precios[cantidad] = precio;
            cantidad++;
            System.out.println("Producto agregado: " + nombre + " ($" + precio + ")");
        } else {
            System.out.println("El carrito está lleno.");
        }
    }
}