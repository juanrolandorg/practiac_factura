public class App {
    public static void main(String[] args) throws Exception {

        //esto es para practicar para el examen 1.
        // tengo que hacer una factura que incluya el IVA

        //se van a comprar ratones, ordenadores y momnitores
        //primero pido que se va a necesitar de cada cosa

        //para ratones
        System.out.println("Por favor, cuantos ratones va a comprar");
        int numRat = Integer.parseInt(System.console().readLine());

        //para teclados
        System.out.println("Por favor, cuantos teclados va a comprar");
        int numTec = Integer.parseInt(System.console().readLine());

        //para monitores
        System.out.println("Por favor, cuantos monitores va a comprar");
        int numMon = Integer.parseInt(System.console().readLine());

    //ya tenemos almacenado cuanto se va a llevar de cada cosa así que miramos a ver para aplicar los precios
    //ratón  3.15
    //teclado 5.50
    //monitor 15.20
    
    double precioRat = numRat *3.15;
    double precioTec = numTec *5.50;
    double precioMon = numMon * 15.20;
    double total = precioMon + precioRat + precioTec;
    double IVA = total *0.21;
    //ya tengo todos los precios almacenados, paso a hacer el ticket

    //ticket
    //explicacion
    //el s para Strings, el d para los número entero
    //el 10.2 f para que le de un tamaño de 10 al float y el .2 para que solo muestre dos decimales, al final cambiado pero bno
    // \u20AC --> unicode para euro pero en mi portatil no lo tengo configurado para que salga
    System.out.printf( "%-15s\n", " \u001B[44m TecnoSeta \u001B[0m");
    System.out.printf( "%-10s %-10s %-10s\n", "Producto", "Cantidad", "Precio");
    System.out.printf( "%-14s %-7d %.2f\u20AC\n", "Ratones", numRat, 3.15);
    System.out.printf( "%-14s %-7d %.2f\u20AC\n", "Teclados", numTec, 5.50);
    System.out.printf( "%-14s %-7d %.2f\u20AC\n", "Monitores", numMon, 15.20);
    System.out.printf( "%-22s %.2f\u20AC\n", "Total sin IVA", total);
    System.out.printf( "%-22s %.2f\u20AC\n", "IVA", IVA);
    System.out.printf( "%-22s %.2f\u20AC\n", "Total a pagar", (IVA+total));



    }
}
