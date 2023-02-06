package main;

public class ProduitNormal extends Produit{

    public ProduitNormal(String nom, int prix, int nbJoursRestants) {
        super(nom, false, prix, nbJoursRestants);
    }

    @Override
    public void update() {
        UsureNormal();
        this.nbJoursRestants --;
        if (this.nbJoursRestants < 0) UsureObselescence();
    }

    public void UsureNormal() {
        decrementerPrix();
    }

    public void UsureObselescence() {
        decrementerPrix();
    }

    public void incrementerPrix(){
        if(this.prix < 500){
            this.prix ++;
        }
    }

    public void decrementerPrix(){
        if(this.prix > 0){
            this.prix --;
        }
    }
}
