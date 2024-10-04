public class Main {
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Felipe","Diaz Bertero","44900185");
        Cuenta cuenta1 = new Cuenta(cliente1);
        Movimientos lista1 = new Movimientos();
        cuenta1.agregarMovimiento("RECIBO",500);
        cuenta1.agregarMovimiento("TRANSFERENCIA",850);



        Cliente cliente2 = new Cliente("Juan","Perez","45901186");
        Cuenta cuenta2 = new Cuenta(cliente2);
        Movimientos lista2 = new Movimientos();
        cuenta2.agregarMovimiento("RECIBO",250);
        cuenta2.agregarMovimiento("TRANSFERENCIA",130);
        cuenta2.agregarMovimiento("TRANSFERENCIA",1300);

        


        System.out.println(cuenta1);
        System.out.println("USTED POSEE: " + cuenta1.obtenerSaldo());
        System.out.println("\n\n\n");
        System.out.println(cuenta2);
        System.out.println("USTED POSEE: " + cuenta2.obtenerSaldo());



    }
}
