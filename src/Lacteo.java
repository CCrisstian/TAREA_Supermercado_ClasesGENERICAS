public class Lacteo extends Producto{

/*-------------------ATRIBUTOS-----------------------*/
    private int cantidad;
    private int proteinas;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------GETTER-----------------------*/
    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
/*-------------------GETTER-----------------------*/


/*-------------------MÉTODO-----------------------*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nCantidad: "+this.cantidad +" unidades");
        sb.append("\nProteínas :"+this.proteinas +" gramos");
        sb.append("\n--------------------------------------------------------------");
        return sb.toString();
    }
/*-------------------MÉTODO-----------------------*/
}
