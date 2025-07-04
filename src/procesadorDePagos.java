import java.util.ArrayList;

public class procesadorDePagos{

    public void pagarTodos(ArrayList<transaccionPago> pagos){
        double total = 0;
        for(int i = 0; i < pagos.size(); i++){
            pagos.get(i).procesarPagos();
            total = total + pagos.get(i).getMonto() ;
        }
        System.out.println("Pagos realizados: "+pagos.size()+", total pagado: "+total);
    }

}
