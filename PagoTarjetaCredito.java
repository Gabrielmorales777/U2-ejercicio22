
public class PagoTarjetaCredito implements ProcesadorPago {

    @Override
    public boolean procesarPago(double monto) {

        if (monto > 0 && monto <= 500000) {
            System.out.println("Pago aprobado con tarjeta de credito.");
            return true;
        } else {
            System.out.println("Pago rechazado: monto invalido o excedido.");
            return false;
        }
    }
}
