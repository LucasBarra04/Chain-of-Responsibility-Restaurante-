package Classes;

public class TipoPedidoBebida implements TipoPedido {
    private static TipoPedidoBebida tipoPedidoBebida;

    private TipoPedidoBebida() {}

    public static TipoPedidoBebida getTipoPedidoBebida() {
        if (tipoPedidoBebida == null)
            tipoPedidoBebida = new TipoPedidoBebida();
        return tipoPedidoBebida;
    }
}