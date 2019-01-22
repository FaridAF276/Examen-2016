import java.util.ArrayList;

public class Client {
    Payement payingmethod;
    ArrayList<Produit> panier = new ArrayList<Produit>();
    public Client(Payement payingmethod) {
        this.payingmethod = payingmethod;
    }
    public void ajouterPanier(Produit article, Inventaire stock){
//        Produit articlePanier = stock.prendreArticle(article);
//        if(articlePanier!=null){
//            System.out.println("Article ajouté au panier");
//        }else{
//            System.out.println("Stock indisponible");
//        }
        //On essaie de retirer l'article

        try{
            Produit articlePanier = stock.prendreArticle(article);
            panier.add(articlePanier);
        }catch(ProductNotAvailable e){
            System.out.println(e.getMessage());
        }
    }
}
