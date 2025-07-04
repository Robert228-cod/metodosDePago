public class pagoTarjetaFactory implements PagoFactory{

    @Override
    public Pago crearPago(String nombreCliente, String datoExtra){
        return new pagoConTarjeta(datoExtra ,nombreCliente);
    }

}
