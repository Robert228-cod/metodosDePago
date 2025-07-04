import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static <ArraysList> void main(String[] args){

        /*
        // hacer varios pagos pero con un monto similar(trabajar con procesadorDePagos implementes PagarVarios (recibe la lista de Pagos y la cantidad))
        Pago pago1 = new pagoConTarjeta("1545-5254-4558", "Mirco");
        Pago pago2 = new pagoEfectivo("Jose");
        Pago pago3 = new pagoPayPal("Trebor58", "Robert");

        ArrayList<Pago> pagos = new ArrayList<Pago>(Arrays.asList(pago3, pago1, pago2))
        */

        /*
        //hacer varios pagos pero con montos distintos
        transaccionPago transaccion1 = new transaccionPago(new pagoConTarjeta("2548-9865-9951", "Jose"), 256.30);
        transaccionPago transaccion2 = new transaccionPago(new pagoEfectivo("Carlos"),240.00);
        transaccionPago transaccion3 = new transaccionPago(new pagoPayPal("Anonimo", "AAA"),280.00);

        ArrayList<transaccionPago> transacciones = new ArrayList<transaccionPago>(Arrays.asList(transaccion1, transaccion2, transaccion3));

        procesadorDePagos nuevoPagarTodo = new procesadorDePagos();
        nuevoPagarTodo.pagarTodos(transacciones);
        */

        //usando la fabrica de tipos de pagos:
        PagoFactory pagoEfectivo = fabricaGeneralPagos.obtenerFactory(tipoPaga.EFECTIVO);
        PagoFactory pagoTarjeta = fabricaGeneralPagos.obtenerFactory(tipoPaga.TARJETA);
        PagoFactory pagoPayPal = fabricaGeneralPagos.obtenerFactory(tipoPaga.PAYPAL);
        PagoFactory pagoCheque = fabricaGeneralPagos.obtenerFactory(tipoPaga.CHEQUE);

        transaccionPago pago1 = new transaccionPago(pagoEfectivo.crearPago("Luis",""),1500.0);
        transaccionPago pago2 = new transaccionPago(pagoTarjeta.crearPago("Mario", "5485-6910-0250"),2205.0);
        transaccionPago pago3 = new transaccionPago(pagoPayPal.crearPago("Esteban225x2", "Estaban"), 1580.0);
        transaccionPago pago4 = new transaccionPago(pagoCheque.crearPago("Carla","009"), 1600.60);

        ArrayList<transaccionPago> listaTransaciones = new ArrayList<transaccionPago>(Arrays.asList(pago1, pago2, pago3, pago4));

        procesadorDePagos pagarTodo = new procesadorDePagos();
        pagarTodo.pagarTodos(listaTransaciones);

    }
}