package main;

public class StockGuildeMarchande {
    Produit[] produits;

    public StockGuildeMarchande(Produit[] produits) {
        this.produits = produits;
    }

    public static void incrementerPrix(Produit produit) {
        if (produit.prix < 500) {
            produit.prix++;
        }
    }

    public static void decrementPrx(Produit produit) {
        if (produit.prix > 0) {
            produit.prix--;
        }
    }

    public void update() {
        for (Produit produit : produits) {
            updateProduit(produit);
        }
    }

    private void updateProduit(Produit produit) {
        if (produit.getNom().equals("Ordinateur Quantique"))
            return;

        UsureNormal(produit);

        produit.nbJoursRestants -= 1;
        if (produit.nbJoursRestants < 0) {
            UsureObselescence(produit);

        }
    }

    private static void UsureObselescence(Produit produit) {
        if (!produit.estCollector()) {
            if (!produit.getNom().equals("Licence Copilot")) {
                decrementPrx(produit);
            } else {
                produit.prix = 0;
            }
        } else {
            incrementerPrix(produit);
        }
    }

    private static void UsureNormal(Produit produit) {
        if (!produit.estCollector() && !produit.getNom().equals("Licence Copilot")) {
            decrementPrx(produit);
        } else {
            incrementerPrix(produit);
            if (produit.getNom().equals("Licence Copilot")) {
                if (produit.nbJoursRestants < 11) {
                    incrementerPrix(produit);
                }
                if (produit.nbJoursRestants < 6) {
                    incrementerPrix(produit);
                }
            }

        }
    }
}
