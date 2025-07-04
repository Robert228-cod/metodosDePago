public class transaccionPago {
    private final Pago metodoDePago; // inyeccion de depedencia (final)
    private final double cantidad;

    public transaccionPago(Pago metodoDePago, double cantidad){
        this.metodoDePago = metodoDePago;
        this.cantidad = cantidad;
    }

    public double getMonto(){
        return cantidad;
    }

    public void procesarPagos(){
        metodoDePago.realizarPago(cantidad);
    }
}
