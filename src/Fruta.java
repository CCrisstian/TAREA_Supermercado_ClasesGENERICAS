public class Fruta extends Producto{

/*-------------------ATRIBUTOS-----------------------*/
    private double peso;
    private String color;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------GETTER-----------------------*/
    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
/*-------------------GETTER-----------------------*/


/*-------------------MÉTODO-----------------------*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nPeso: "+this.peso +" gramos");
        sb.append("\nColor: "+this.color);
        sb.append("\n--------------------------------------------------------------");
        return sb.toString();
    }
/*-------------------MÉTODO-----------------------*/
}
