
public class Main {

    public static void main(String[] args) {

       
        ModuloCompras compra = new ModuloCompras(
                new PagoTarjetaCredito()
        );

        compra.realizarCompra(150000);


        compra.cambiarProcesador(
                new PagoCriptomoneda()
        );

        compra.realizarCompra(50000);


        compra.cambiarProcesador(
                new PagoBilleteraVirtual()
        );

        compra.realizarCompra(80000);
    }
}
