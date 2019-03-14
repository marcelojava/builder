package builder;

import modelo.Ingrediente;
import modelo.Sanduiche;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class SanduicheBuilder {


    public static final HashMap<String, BigDecimal> mapaValoresIngredientes =
            new HashMap<>();

    static  {
        mapaValoresIngredientes.put("Hamburguer picanha", new BigDecimal("5.50"));
        mapaValoresIngredientes.put("Hamburguer simples", new BigDecimal("3.50"));
        mapaValoresIngredientes.put("Hamburguer peixe", new BigDecimal("4.50"));
        mapaValoresIngredientes.put("alface", new BigDecimal("0.50"));
        mapaValoresIngredientes.put("tomate", new BigDecimal("0.40"));
        mapaValoresIngredientes.put("maionese", new BigDecimal("1.10"));
        mapaValoresIngredientes.put("pao simples", new BigDecimal("1.50"));
        mapaValoresIngredientes.put("pao gergilin", new BigDecimal("2.10"));
        mapaValoresIngredientes.put("pao australiano", new BigDecimal("3.10"));
        mapaValoresIngredientes.put("molho especial", new BigDecimal("1.10"));
    }

    public abstract void abrePao();
    public  abstract  void inserirIngredientes(Ingrediente... ingrediente);
    public abstract void fecharPao();
    public abstract void calcularValorTotal();
    public  abstract Sanduiche getSanduiche();
}
