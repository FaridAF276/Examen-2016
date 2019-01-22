import java.util.ArrayList;

public class Inventaire{
    private ArrayList<Produit> stock = new ArrayList<Produit>();
    public void addProduit(Produit articleStocker){
        stock.add(articleStocker);
    }
    public void outOfStock(Produit articleRemove){
        stock.remove(articleRemove);
    }
    public Produit prendreArticle(Produit articlePrendre) throws ProductNotAvailable {
//        if (articlePrendre.getQuantite() > 1){
//            articlePrendre.retirerarticle();
//            System.out.println("\nArticle retiré. \n");
//            return articlePrendre;
//        }else{
//            if (articlePrendre.getQuantite() == 1){
//                articlePrendre.retirerarticle();
//                outOfStock(articlePrendre);
//                System.out.printf("\nArticle retiré plus rien dans l'inventaire. \n");
//                return articlePrendre;
//            }else{
//                if(articlePrendre.getQuantite() < 1){
//                    System.out.println("\nPlus de stock désolé ! \n");
//                    return null;
//                }
//            }
//        }
//        return articlePrendre;
//    }
        if (articlePrendre.getQuantite() < 1) {
            throw new ProductNotAvailable("\n Produit non disponible en stock");
        } else {

                articlePrendre.retirerarticle();
                System.out.println("\n Produit retiré du stock");
                return articlePrendre;
        }
    }
}
