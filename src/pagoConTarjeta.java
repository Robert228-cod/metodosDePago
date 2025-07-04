public class pagoConTarjeta implements Pago{
    private String numeroTarjeta;
    String nombre;

    public pagoConTarjeta(String numeroTarjeta, String nombre){
        this.numeroTarjeta = numeroTarjeta;
        this.nombre = nombre;
    }

    @Override
    public void realizarPago(double cantidad){
        if(cantidad <= 0) System.out.println("Cantidad invalida");
        else System.out.println(nombre+" Pago realizado con tarjeta, cantidad: " +cantidad+" Bs.");
    }
}
