package Classes;

public class FuncionarioGarcom extends Funcionario {

    public FuncionarioGarcom() {
        listaPedidos.add(TipoPedidoBebida.getTipoPedidoBebida());
    }

    @Override
    public String getDescricaoCargo() { return "Garçom"; }
}