public class Main {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsa_LACTEO = new BolsaSupermercado<>(); /*Cant. MAX 5 elementos*/
        bolsa_LACTEO.addProducto(new Lacteo("Leche",500D,2,240)); /*1*/
        bolsa_LACTEO.addProducto(new Lacteo("Queso",750D,1,200)); /*2*/
        bolsa_LACTEO.addProducto(new Lacteo("Yogur",1500D,3,350)); /*3*/
        bolsa_LACTEO.addProducto(new Lacteo("Mantequilla",850D,1,10)); /*4*/
        bolsa_LACTEO.addProducto(new Lacteo("Helado",1500D,1,20)); /*5*/
        System.out.println("===========================Bolsa-LÁCTEOS====================================");
        bolsa_LACTEO.getProductos().forEach(System.out::println);


        BolsaSupermercado<Fruta> bolsa_FRUTA = new BolsaSupermercado<>();
        bolsa_FRUTA.addProducto(new Fruta("Manzana",500D,200,"Rojo")); /*1*/
        bolsa_FRUTA.addProducto(new Fruta("Plátano",250D,150,"Amarillo")); /*2*/
        bolsa_FRUTA.addProducto(new Fruta("Naranja",200D,170,"Naranja brillante")); /*3*/
        bolsa_FRUTA.addProducto(new Fruta("Fresa",1000D,10,"Rojo brillante")); /*4*/
        bolsa_FRUTA.addProducto(new Fruta("Uva",800D,160,"Morada")); /*5*/
        System.out.println("\n===========================Bolsa-FRUTAS====================================");
        bolsa_FRUTA.getProductos().forEach(System.out::println);


        BolsaSupermercado<Limpieza> bolsa_LIMPIEZA = new BolsaSupermercado<>();
        bolsa_LIMPIEZA.addProducto(new Limpieza("Detergente para lavavajillas",160D,"Agua, surfactantes, enzimas, fragancias.",1));                 /*1*/
        bolsa_LIMPIEZA.addProducto(new Limpieza("Limpiador multiusos",180D,"Agua, tensoactivos, solventes, fragancias.",5));                        /*2*/
        bolsa_LIMPIEZA.addProducto(new Limpieza("Desinfectante para superficies",150D,"Alcohol isopropílico, agua, agentes desinfectantes.",1));    /*3*/
        bolsa_LIMPIEZA.addProducto(new Limpieza("Limpiavidrios",140D,"Agua, tensoactivos, alcohol, fragancias.",0.750));                            /*4*/
        bolsa_LIMPIEZA.addProducto(new Limpieza("Desodorante ambiental",100D,"Agua, fragancias, propelentes.",0.500));                              /*5*/
        System.out.println("\n===========================Bolsa-LIMPIEZA====================================");
        bolsa_LIMPIEZA.getProductos().forEach(System.out::println);


        BolsaSupermercado<NoPerecible> bolsa_NOPERECIBLE = new BolsaSupermercado<>();
        bolsa_NOPERECIBLE.addProducto(new NoPerecible("Arroz blacno",20D,45,160));                  /*1*/
        bolsa_NOPERECIBLE.addProducto(new NoPerecible("Frijoles enlatados (negros)",10D,20,100));   /*2*/
        bolsa_NOPERECIBLE.addProducto(new NoPerecible("Atún enlatado al natural",100D,20,90));      /*3*/
        bolsa_NOPERECIBLE.addProducto(new NoPerecible("Pasta (espaguetis)",20D,40,100));            /*4*/
        bolsa_NOPERECIBLE.addProducto(new NoPerecible("Aceite de oliva",150D,14,120));               /*5*/
        System.out.println("\n===========================Bolsa-NO_PERECIBLES====================================");
        bolsa_NOPERECIBLE.getProductos().forEach(System.out::println);
    }
}