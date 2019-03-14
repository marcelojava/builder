package builder;

import modelo.Hamburguer;
import modelo.Ingrediente;
import modelo.Sanduiche;

import java.math.BigDecimal;

public class HamburguerBuilder extends SanduicheBuilder {

    private Sanduiche hamburger = new Hamburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre pao de hamburguer");
    }

    @Override
    public void inserirIngredientes(Ingrediente... ingredientes) {
        for (Ingrediente ingrediente : ingredientes) {
            hamburger.addIngrediente(ingrediente);
        }
        System.out.println("Inserir ingredientes no hamburguer");
    }

    @Override
    public void fecharPao() {
        System.out.println("fechar pao de hamburguer");
    }

    @Override
    public void calcularValorTotal() {
        hamburger.getIngredientes().forEach(ingrediente -> {
            BigDecimal valorIngrediente =
                    mapaValoresIngredientes.get(ingrediente.getNome());

            hamburger.setValorTotal(hamburger.getValorTotal()
                    .add(valorIngrediente
                            .multiply(BigDecimal.valueOf(ingrediente.getQuantidade()))));
        });
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println(hamburger);
        return hamburger;
    }
}
