package Classes;

public class FuncionarioCozinheiro extends Funcionario {

    public FuncionarioCozinheiro() {
        listaPedidos.add(TipoPedidoBebida.getTipoPedidoBebida());
        listaPedidos.add(TipoPedidoEntrada.getTipoPedidoEntrada());
    }

    @Override
    public String getDescricaoCargo() { return "Cozinheiro"; }
}