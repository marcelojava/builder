import builder.FishBurguerBuilder;
import builder.HamburguerBuilder;
import modelo.Ingrediente;
import modelo.Sanduiche;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CozinhaTest {

    @Test
    public void cozinhaDeveFazerUmHamburguer() {
        Cozinha cozinha = new Cozinha();
        Sanduiche sanduiche = cozinha.fazerSaunduiche(new HamburguerBuilder(), new Ingrediente("pao simples", 2),
                new Ingrediente("maionese", 1), new Ingrediente("tomate", 1),
                new Ingrediente("alface", 1), new Ingrediente("molho especial", 1),
                new Ingrediente("Hamburguer simples", 1));

        Assert.assertEquals(sanduiche.getValorTotal().setScale(2), new BigDecimal("9.60"));
    }

    @Test
    public void cozinhaDeveFazerUmFishHamburguer() {
        Cozinha cozinha = new Cozinha();
        Sanduiche sanduiche = cozinha.fazerSaunduiche(new HamburguerBuilder(), new Ingrediente("pao simples", 2),
                new Ingrediente("maionese", 1), new Ingrediente("tomate", 1),
                new Ingrediente("alface", 1), new Ingrediente("molho especial", 1),
                new Ingrediente("Hamburguer peixe", 1));

        Assert.assertEquals(sanduiche.getValorTotal().setScale(2), new BigDecimal("10.60"));
    }
}
