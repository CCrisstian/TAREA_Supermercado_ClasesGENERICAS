public class Limpieza extends Producto{

/*-------------------ATRIBUTOS-----------------------*/
    private String componentes;
    private double litros;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------GETTER-----------------------*/
    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }
/*-------------------GETTER-----------------------*/


/*-------------------MÉTODO-----------------------*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nComponentes: " + this.componentes);
        sb.append("\nLitros: " + this.litros + " litros");
        sb.append("\n--------------------------------------------------------------");
        return sb.toString();
    }
/*-------------------MÉTODO-----------------------*/

}
