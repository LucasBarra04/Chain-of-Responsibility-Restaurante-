package Classes;

import java.util.ArrayList;

public abstract class Funcionario {
    protected ArrayList<TipoPedido> listaPedidos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior()              { return funcionarioSuperior; }
    public void setFuncionarioSuperior(Funcionario f)        { this.funcionarioSuperior = f; }

    public abstract String getDescricaoCargo();

    public String processarPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getTipoPedido())) {
            return getDescricaoCargo() + " processou o pedido: "
                    + pedido.getTipoPedido().getClass().getSimpleName();
        }
        if (funcionarioSuperior != null) {
            return funcionarioSuperior.processarPedido(pedido);
        }
        return "Nenhum funcionário pôde processar o pedido: "
                + pedido.getTipoPedido().getClass().getSimpleName();
    }
}