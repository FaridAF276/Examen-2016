import java.util.ArrayList;

public class PackProduit implements CompoProduit{
    double price=0.00;
    int quantite=0;
    double remise;
    ArrayList<Produit> article = new ArrayList<Produit>();
    public PackProduit(double remise) {
        this.remise = remise;
    }

    public void add(Produit articleAjout){
        article.add(articleAjout);
        price += articleAjout.getPrice();
        quantite++;
    }
    public void remove(Produit articleRemove){
        article.remove(articleRemove);
        price = price - articleRemove.getPrice();
        quantite--;
    }
    @Override
    public double getPrice() {
        return price*(1.00-remise);
    }

    @Override
    public int getQuantite() {
        return quantite;
    }
    public Produit getProduit(int index){
        return article.get(index);
    }

    @Override
    public String toString() {
        return "PackProduit{" +
                "price=" + price +
                ", quantite=" + quantite +
                ", remise=" + remise +
                '}';
    }
}
