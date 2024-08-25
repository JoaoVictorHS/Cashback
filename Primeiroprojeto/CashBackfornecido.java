import java.util.Scanner;

public class CashBackfornecido {

    public static void main(String[] args) {

         Scanner Cliente = new Scanner(System.in);


         double Cashback;


        System.out.print("Digite seu nome: ");
        String Nome = Cliente.nextLine();


        System.out.print("Digite sua idade:");
        int Idade = Cliente.nextInt();
        

        System.out.print("Digite o valor da compra:");
        double ValorDaCompraRealizada = Cliente.nextDouble();

        if ( Idade >= 21 && ValorDaCompraRealizada <1000 ){

            Cashback = 0.05;

        } else if (Idade <21 && ValorDaCompraRealizada <1000) {

            Cashback = 0.07;

        } else if (Idade >=21 && ValorDaCompraRealizada >1000) {

            Cashback = 0.07;
            
        }else {
            Cashback = 0.1;

        }

        double Descontorecebido = ValorDaCompraRealizada * Cashback;

        System.out.printf("Obrigado pela preferência! " + Nome + " o seu desconto foi no valor de =" + "%.2f" , Descontorecebido);

    }
}
