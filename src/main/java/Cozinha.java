import builder.SanduicheBuilder;
import modelo.Ingrediente;
import modelo.Sanduiche;

public class Cozinha {

    public Sanduiche fazerSaunduiche(SanduicheBuilder builder, Ingrediente... ingredientes) {
        builder.abrePao();
        builder.inserirIngredientes(ingredientes);
        builder.fecharPao();
        builder.calcularValorTotal();
        return builder.getSanduiche();
    }
}
