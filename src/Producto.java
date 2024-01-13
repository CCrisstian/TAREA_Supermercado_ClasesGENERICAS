public class Producto{

    /*-------------------ATRIBUTOS-----------------------*/
    protected String nombre;
    protected Double precio;
    /*-------------------ATRIBUTOS-----------------------*/


    /*-------------------CONSTRUCTOR-----------------------*/
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /*-------------------CONSTRUCTOR-----------------------*/

    /*-------------------MÉTODO-----------------------*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + this.nombre);
        sb.append("\nPrecio: " + this.precio);
        return sb.toString();
    }
    /*-------------------MÉTODO-----------------------*/


}
