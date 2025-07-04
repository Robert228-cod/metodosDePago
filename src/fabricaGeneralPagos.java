public class fabricaGeneralPagos {
    public static PagoFactory obtenerFactory(tipoPaga tipoDePago) {
        switch (tipoDePago){
            case EFECTIVO:
                return new pagoEfectivoFactory();
            case TARJETA:
                return new pagoTarjetaFactory();
            case PAYPAL:
                return new pagoPayPalFactory();
            case CHEQUE:
                return new pagoChequeFactory();
            default:
                throw new IllegalArgumentException("Tipo de pago no valido");
        }
    }
}
