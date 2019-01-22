public class Cash implements Payement{

    double cashInPocket;

    public Cash(double cashInPocket) {
        this.cashInPocket = cashInPocket;
    }

    @Override
    public void pay(double prix) {
        if(prix > cashInPocket){
            System.out.println("Pas assez d'argent pour payer");
        }else{
            System.out.println("Article acheté avec succès");
        }
    }
}
