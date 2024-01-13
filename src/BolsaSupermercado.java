import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T> {

/*-------------------ATRIBUTOS-----------------------*/
    private List<T> dataSource;
    private int max = 4;
/*-------------------ATRIBUTOS-----------------------*/


/*-------------------CONSTRUCTOR-----------------------*/
    public BolsaSupermercado() {
        this.dataSource = new ArrayList<>();
    }
/*-------------------CONSTRUCTOR-----------------------*/


/*-------------------MÉTODOS-----------------------*/
    public void addProducto(T objeto){
        if (this.dataSource.size() <= max){
            this.dataSource.add(objeto);
        } else {
            throw new RuntimeException("NO HAY más espacio en la bolsa!! >:(");
        }
    }

    public List<T> getProductos() {
        return dataSource;
    }

    @Override
    public Iterator<T> iterator() {
        return this.dataSource.iterator();
    }
/*-------------------MÉTODOS-----------------------*/
}
