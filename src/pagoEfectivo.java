public class pagoEfectivo implements Pago{
    String nombre;

    public pagoEfectivo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void realizarPago(double cantidad){
        if(cantidad <= 0) System.out.println("Cantidad invalida");
        else System.out.println(nombre+" Pago realizado en efectivo, cantidad: " +cantidad+" Bs.");
    }

}
