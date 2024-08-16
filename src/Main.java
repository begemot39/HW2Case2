public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int amountDeposit = 1200;
        int totalBalance = startBalance + amountDeposit;

        if ( amountDeposit > 1000 ) {
            totalBalance = ( ( amountDeposit / 100 ) + startBalance +  amountDeposit );
        }

        System.out.println( "Итоговая сумма на счету абонента: " + totalBalance );
    }
}