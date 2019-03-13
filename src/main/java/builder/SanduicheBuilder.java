package builder;

import modelo.Sanduiche;

public abstract class SanduicheBuilder {

    public abstract void abrePao();
    public  abstract  void inserirIngredientes();
    public abstract void fecharPao();
    public  abstract Sanduiche getSanduiche();
}
