
public class PagoBilleteraVirtual implements ProcesadorPago {

    @Override
    public boolean procesarPago(double monto) {

        if (monto > 0 && monto <= 200000) {
            System.out.println("Pago aprobado con billetera virtual.");
            return true;
        } else {
            System.out.println("Pago rechazado: saldo insuficiente.");
            return false;
        }
    }
}
