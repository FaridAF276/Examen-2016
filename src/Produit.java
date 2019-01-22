public class Produit implements CompoProduit {
    private double price;
    private int quantite;

    public Produit(double price, int quantite) {
        this.price = price;
        this.quantite = quantite;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantite() {
        return quantite;
    }

    public void retirerarticle(){
        quantite--;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "price=" + price +
                ", quantite=" + quantite +
                '}';
    }
}
