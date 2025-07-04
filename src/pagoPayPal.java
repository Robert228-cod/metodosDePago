public class pagoPayPal implements Pago{
    private String usuario;
    String nombre;

    public pagoPayPal(String usuario, String nombre){
        this.usuario = usuario;
        this.nombre = nombre;
    }

    @Override
    public void realizarPago(double cantidad){
        if(cantidad <= 0) System.out.println("Cantidad invalida");
        else System.out.println(nombre+" Pago realizado con PayPal, cantidad: " +cantidad+" Bs."+" del usuario: "+usuario);
    }
}
