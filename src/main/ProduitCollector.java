package main;

public class ProduitCollector extends ProduitNormal{


    public ProduitCollector(String nom, int prix, int nbJoursRestants) {
        super(nom, prix, nbJoursRestants);
    }

    @Override
    public boolean estCollector() {
        return true;
    }

    @Override
    public void UsureNormal() {
        incrementerPrix();
    }

    @Override
    public void UsureObselescence() {
        incrementerPrix();
    }
}
