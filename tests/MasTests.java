import br.com.liscandeia.App;
import br.com.liscandeia.Pessoa;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MasTests {
    @Test
    public void testGetMas() {
        Pessoa p1 = new Pessoa("LEO", "M", 21);
        Pessoa p2 = new Pessoa("LIS", "f", 24);
        Pessoa p3 = new Pessoa("LAURA", "F", 58);
        List<Pessoa> pessoas = List.of(p1, p2, p3);
        List<Pessoa> pessoasMas = List.of(p1);
        List<Pessoa> homens = App.getMas(pessoas);
        assertEquals(pessoasMas.size(), homens.size());
    }

}