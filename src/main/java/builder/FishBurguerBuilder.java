package builder;

import modelo.FishBurguer;
import modelo.Ingrediente;
import modelo.Sanduiche;

import java.math.BigDecimal;

public class FishBurguerBuilder extends SanduicheBuilder {

    private Sanduiche fishBurguer = new FishBurguer();

    @Override
    public void abrePao() {
        System.out.println("Abre pao de fishBurguer");
    }

    @Override
    public void inserirIngredientes(Ingrediente... ingredientes) {
        for (Ingrediente ingrediente : ingredientes) {
            fishBurguer.addIngrediente(ingrediente);
        }
        System.out.println("Inserir ingredientes no hamburguer");
    }

    @Override
    public void fecharPao() {
        System.out.println("fechar pao de fishBurguer");
    }

    @Override
    public void calcularValorTotal() {
        fishBurguer.getIngredientes().forEach(ingrediente -> {
            BigDecimal valorIngrediente =
                    mapaValoresIngredientes.get(ingrediente.getNome());

            fishBurguer.setValorTotal(fishBurguer.getValorTotal()
                    .add(valorIngrediente
                            .multiply(BigDecimal.valueOf(ingrediente.getQuantidade()))));
        });
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println(fishBurguer);
        return fishBurguer;
    }
}
