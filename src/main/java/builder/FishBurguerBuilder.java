package builder;

import modelo.FishBurguer;
import modelo.Sanduiche;

public class FishBurguerBuilder extends SanduicheBuilder {

    private Sanduiche fishBurguer = new FishBurguer();


    @Override
    public void abrePao() {
        System.out.println("Abre pao de fishBurguer");
    }

    @Override
    public void inserirIngredientes() {
        System.out.println("Inserir ingredientes no fishBurguer");
    }

    @Override
    public void fecharPao() {
        System.out.println("fechar pao de fishBurguer");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("fishBurguer esta pronto");
        return fishBurguer;
    }
}
