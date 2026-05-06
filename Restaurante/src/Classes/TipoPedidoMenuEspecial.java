package Classes;

public class TipoPedidoMenuEspecial implements TipoPedido {
    private static TipoPedidoMenuEspecial tipoPedidoMenuEspecial;

    private TipoPedidoMenuEspecial() {}

    public static TipoPedidoMenuEspecial getTipoPedidoMenuEspecial() {
        if (tipoPedidoMenuEspecial == null)
            tipoPedidoMenuEspecial = new TipoPedidoMenuEspecial();
        return tipoPedidoMenuEspecial;
    }
}