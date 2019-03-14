package modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Sanduiche {

    private List<Ingrediente> ingredientes;
    private BigDecimal valorTotal = BigDecimal.ZERO;

    public void addIngrediente(Ingrediente ingrediente) {
        if (this.ingredientes == null) {
            ingredientes = new ArrayList<>();
        }
        this.ingredientes.add(ingrediente);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "ingredientes=" + ingredientes +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
