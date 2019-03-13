import builder.FishBurguerBuilder;
import builder.HamburguerBuilder;
import org.junit.Test;

public class CozinhaTest {

    @Test
    public void cozinhaDeveFazerUmHamburguer() {
        Cozinha cozinha = new Cozinha();
        cozinha.fazerSaunduiche(new HamburguerBuilder());
    }

    @Test
    public void cozinhaDeveFazerUmFishHamburguer() {
        Cozinha cozinha = new Cozinha();
        cozinha.fazerSaunduiche(new FishBurguerBuilder());
    }
}
