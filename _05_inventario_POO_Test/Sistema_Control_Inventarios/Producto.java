public class Producto {
    private int id;
    private String nombre;
    private double precio;

    //Constructor
    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Get & Set

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
