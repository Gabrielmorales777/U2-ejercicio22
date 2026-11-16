
public class ModuloCompras {

    private ProcesadorPago procesador;

    public ModuloCompras(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void cambiarProcesador(ProcesadorPago procesador) {
        this.procesador = procesador;
    }

    public void realizarCompra(double monto) {

        System.out.println("\nProcesando compra de $" + monto);

        boolean resultado = procesador.procesarPago(monto);

        if (resultado) {
            System.out.println("Comprobante: compra realizada correctamente.");
        } else {
            System.out.println("Comprobante: compra rechazada.");
        }
    }
}
