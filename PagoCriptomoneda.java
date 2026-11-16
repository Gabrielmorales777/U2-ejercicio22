
public class PagoCriptomoneda implements ProcesadorPago {

    @Override
    public boolean procesarPago(double monto) {

        if (monto >= 1000) {
            System.out.println("Pago aprobado con criptomonedas.");
            return true;
        } else {
            System.out.println("Pago rechazado: monto minimo de $1000.");
            return false;
        }
    }
}
