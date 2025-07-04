import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static <ArraysList> void main(String[] args) {

        /*
        // hacer varios pagos pero con un monto similar(trabajar con procesadorDePagos implementes PagarVarios (recibe la lista de Pagos y la cantidad))
        Pago pago1 = new pagoConTarjeta("1545-5254-4558", "Mirco");
        Pago pago2 = new pagoEfectivo("Jose");
        Pago pago3 = new pagoPayPal("Trebor58", "Robert");

        ArrayList<Pago> pagos = new ArrayList<Pago>(Arrays.asList(pago3, pago1, pago2))
        */

        //hacer varios pagos pero con montos distintos
        transaccionPago transaccion1 = new transaccionPago(new pagoConTarjeta("2548-9865-9951", "Jose"), 256.30);
        transaccionPago transaccion2 = new transaccionPago(new pagoEfectivo("Robert"),240.00);
        transaccionPago transaccion3 = new transaccionPago(new pagoPayPal("874", "Mirco"),280.00);

        ArrayList<transaccionPago> transacciones = new ArrayList<transaccionPago>(Arrays.asList(transaccion1, transaccion2, transaccion3));

        procesadorDePagos nuevoPagarTodo = new procesadorDePagos();
        nuevoPagarTodo.pagarTodos(transacciones);
    }
}