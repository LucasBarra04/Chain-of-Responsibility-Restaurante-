package Classes;

public class TipoPedidoPratoPrincipal implements TipoPedido {
    private static TipoPedidoPratoPrincipal tipoPedidoPratoPrincipal;

    private TipoPedidoPratoPrincipal() {}

    public static TipoPedidoPratoPrincipal getTipoPedidoPratoPrincipal() {
        if (tipoPedidoPratoPrincipal == null)
            tipoPedidoPratoPrincipal = new TipoPedidoPratoPrincipal();
        return tipoPedidoPratoPrincipal;
    }
}