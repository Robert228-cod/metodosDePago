public class transaccionPago {
    Pago metodoDePago;
    double cantidad;

    public transaccionPago(Pago metodoDePago, double cantidad){
        this.cantidad = cantidad;
        this.metodoDePago = metodoDePago;
    }

    public double getMonto(){
        return cantidad;
    }

    public void procesarPagos(){
        metodoDePago.realizarPago(cantidad);
    }
}
