package Classes;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente() {
        listaPedidos.add(TipoPedidoBebida.getTipoPedidoBebida());
        listaPedidos.add(TipoPedidoEntrada.getTipoPedidoEntrada());
        listaPedidos.add(TipoPedidoPratoPrincipal.getTipoPedidoPratoPrincipal());
        listaPedidos.add(TipoPedidoMenuEspecial.getTipoPedidoMenuEspecial());
    }

    @Override
    public String getDescricaoCargo() { return "Gerente"; }
}