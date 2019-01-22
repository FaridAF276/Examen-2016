public class CreditCard implements Payement {
    double plafondCredit;

    public CreditCard(double plafondCredit) {
        this.plafondCredit = plafondCredit;
    }

    @Override
    public void pay(double prix) {
        if (prix>plafondCredit){
            System.out.println("Paiement refusé limite paiement dépassée");
        }else{
            System.out.println("Paiement accepté");
        }
    }
}
