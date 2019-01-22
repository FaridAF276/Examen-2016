public class Application {
    public static void main(String[] args) {
        Client David = new Client(new Cash(200.00));
        Client Farid = new Client (new CreditCard(200.00));
        Produit ordi = new Produit(1399.99,58);
        PackProduit packelectro = new PackProduit(0.3);
        packelectro.add(ordi);
        System.out.printf(packelectro.toString());
        Produit testeur = new Produit(2.10,2);
        packelectro.add(testeur);
        Inventaire stock = new Inventaire();
//        stock.prendreArticle(testeur);
//        stock.prendreArticle(testeur);
//        stock.prendreArticle(testeur);
        David.ajouterPanier(testeur,stock);
        David.ajouterPanier(testeur,stock);
        David.ajouterPanier(testeur,stock);



    }
}

