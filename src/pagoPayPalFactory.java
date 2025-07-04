public class pagoPayPalFactory implements PagoFactory{

    @Override
    public Pago crearPago(String nombreCliente, String datoExtra){
        return new pagoPayPal(nombreCliente, datoExtra);
    }

}
