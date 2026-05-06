package Classes;

public class TipoPedidoEntrada implements TipoPedido {
    private static TipoPedidoEntrada tipoPedidoEntrada;

    private TipoPedidoEntrada() {}

    public static TipoPedidoEntrada getTipoPedidoEntrada() {
        if (tipoPedidoEntrada == null)
            tipoPedidoEntrada = new TipoPedidoEntrada();
        return tipoPedidoEntrada;
    }
}