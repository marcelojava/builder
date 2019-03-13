package builder;

import modelo.Hamburguer;
import modelo.Sanduiche;

public class HamburguerBuilder extends SanduicheBuilder {

    private Sanduiche hamburger = new Hamburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre pao de hamburguer");
    }

    @Override
    public void inserirIngredientes() {
        System.out.println("Inserir ingredientes no hamburguer");
    }

    @Override
    public void fecharPao() {
        System.out.println("fechar pao de hamburguer");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Hamburguer esta pronto");
        return hamburger;
    }
}
