public class pagoConCheque implements Pago{

    String nombre;
    String numeroDeCeque;

    public pagoConCheque(String nombre, String numeroDeCheque){
        this.nombre = nombre;
        this.numeroDeCeque = numeroDeCheque;
    }

    @Override
    public void realizarPago(double cantidad){
        if(cantidad >= 1) System.out.println(nombre+" ,Pago realizado con cheque "+numeroDeCeque+", monto: "+cantidad);
        else System.out.println("Monto invalido");
    }

}
