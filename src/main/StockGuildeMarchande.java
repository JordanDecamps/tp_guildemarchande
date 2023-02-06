package main;

public class StockGuildeMarchande {
    Produit[] produits;

    public StockGuildeMarchande(Produit[] produits) {
        this.produits = produits;
    }

    public void update() {
        for (Produit produit : produits) {
            produit.update();
        }
    }

}
