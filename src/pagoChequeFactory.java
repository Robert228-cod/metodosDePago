public class pagoChequeFactory implements PagoFactory {
    @Override
    public Pago crearPago(String nombre, String datoExtra){
        return new pagoConCheque(nombre, datoExtra);
    }
}
