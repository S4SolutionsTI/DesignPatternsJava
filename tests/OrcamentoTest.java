import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrcamentoTest {

    @Test
    void testGetValor() {
	double valor = 3.14;
	Orcamento orc = new Orcamento(valor);
	assertEquals(valor, orc.getValor());
    }

}
