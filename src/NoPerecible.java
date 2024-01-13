public class NoPerecible extends Producto{

/*-------------------ATRIBUTOS-----------------------*/
    private int contenido;
    private int calorias;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------GETTER-----------------------*/
    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
/*-------------------GETTER-----------------------*/


/*-------------------MÉTODO-----------------------*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nContenido: " + this.contenido + " gramos");
        sb.append("\nCalorías: " + this.calorias + " calorías");
        sb.append("\n--------------------------------------------------------------");
        return sb.toString();
    }
/*-------------------MÉTODO-----------------------*/
}
