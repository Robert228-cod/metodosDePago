public class pagoEfectivoFactory implements PagoFactory{

    @Override
    public Pago crearPago(String nombreCLiente, String datoExtra){
        return new pagoEfectivo(nombreCLiente);
    }

}
