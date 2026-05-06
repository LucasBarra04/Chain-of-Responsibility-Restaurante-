package Classes;

public class FuncionarioChefeCozinha extends Funcionario {

    public FuncionarioChefeCozinha() {
        listaPedidos.add(TipoPedidoBebida.getTipoPedidoBebida());
        listaPedidos.add(TipoPedidoEntrada.getTipoPedidoEntrada());
        listaPedidos.add(TipoPedidoPratoPrincipal.getTipoPedidoPratoPrincipal());
    }

    @Override
    public String getDescricaoCargo() { return "Chef de Cozinha"; }
}