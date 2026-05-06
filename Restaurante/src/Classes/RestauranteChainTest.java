package Classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestauranteChainTest {

    private FuncionarioGarcom garcom;

    @BeforeEach
    void setUp() {
        garcom = new FuncionarioGarcom();
        FuncionarioCozinheiro  cozinheiro = new FuncionarioCozinheiro();
        FuncionarioChefeCozinha chef      = new FuncionarioChefeCozinha();
        FuncionarioGerente     gerente    = new FuncionarioGerente();

        garcom.setFuncionarioSuperior(cozinheiro);
        cozinheiro.setFuncionarioSuperior(chef);
        chef.setFuncionarioSuperior(gerente);
    }

    @Test
    void bebidaDeveSerProcessadaPeloGarcom() {
        Pedido p = new Pedido();
        p.setTipoPedido(TipoPedidoBebida.getTipoPedidoBebida());
        String resultado = garcom.processarPedido(p);
        assertTrue(resultado.contains("Garçom"));
    }

    @Test
    void entradaDeveSerProcessadaPeloCozinheiro() {
        Pedido p = new Pedido();
        p.setTipoPedido(TipoPedidoEntrada.getTipoPedidoEntrada());
        String resultado = garcom.processarPedido(p);
        assertTrue(resultado.contains("Cozinheiro"));
    }

    @Test
    void pratoPrincipalDeveSerProcessadoPeloChef() {
        Pedido p = new Pedido();
        p.setTipoPedido(TipoPedidoPratoPrincipal.getTipoPedidoPratoPrincipal());
        String resultado = garcom.processarPedido(p);
        assertTrue(resultado.contains("Chef de Cozinha"));
    }

    @Test
    void menuEspecialDeveSerProcessadoPeloGerente() {
        Pedido p = new Pedido();
        p.setTipoPedido(TipoPedidoMenuEspecial.getTipoPedidoMenuEspecial());
        String resultado = garcom.processarPedido(p);
        assertTrue(resultado.contains("Gerente"));
    }

    @Test
    void semSuperiorDeveRetornarMensagemDeErro() {
        FuncionarioGarcom garcomSolo = new FuncionarioGarcom();
        Pedido p = new Pedido();
        p.setTipoPedido(TipoPedidoMenuEspecial.getTipoPedidoMenuEspecial());
        String resultado = garcomSolo.processarPedido(p);
        assertTrue(resultado.contains("Nenhum funcionário"));
    }

    @Test
    void tipoPedidoBebidaDeveSerSingleton() {
        assertSame(
                TipoPedidoBebida.getTipoPedidoBebida(),
                TipoPedidoBebida.getTipoPedidoBebida()
        );
    }

    @Test
    void tipoPedidoEntradaDeveSerSingleton() {
        assertSame(
                TipoPedidoEntrada.getTipoPedidoEntrada(),
                TipoPedidoEntrada.getTipoPedidoEntrada()
        );
    }

    @Test
    void tipoPedidoPratoPrincipalDeveSerSingleton() {
        assertSame(
                TipoPedidoPratoPrincipal.getTipoPedidoPratoPrincipal(),
                TipoPedidoPratoPrincipal.getTipoPedidoPratoPrincipal()
        );
    }

    @Test
    void tipoPedidoMenuEspecialDeveSerSingleton() {
        assertSame(
                TipoPedidoMenuEspecial.getTipoPedidoMenuEspecial(),
                TipoPedidoMenuEspecial.getTipoPedidoMenuEspecial()
        );
    }
}