package main;

public class ProduitEphemere extends ProduitNormal{

    public ProduitEphemere(String nom, int prix, int nbJoursRestants) {
        super(nom, prix, nbJoursRestants);
    }

    @Override
    public void UsureNormal() {
        incrementerPrix();
        if ( this.nbJoursRestants < 11 ) incrementerPrix();
        if ( this.nbJoursRestants < 6 ) incrementerPrix();
    }

    @Override
    public void UsureObselescence() {
        this.prix = 0;
    }
}
