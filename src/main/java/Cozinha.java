import builder.SanduicheBuilder;

public class Cozinha {

    public void fazerSaunduiche(SanduicheBuilder builder) {
        builder.abrePao();
        builder.inserirIngredientes();
        builder.fecharPao();
        builder.getSanduiche();
    }
}
