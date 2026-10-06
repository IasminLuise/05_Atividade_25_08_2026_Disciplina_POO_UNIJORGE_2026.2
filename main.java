import java.util.Scanner;

final class Main {
    void main() {
        Scanner input = new Scanner(System.in);
        int ingressos = 0;
        float valor = 0.0F;
        double total = (double)0.0F;

        try {
            System.out.printf("Digite a quantidade de ingressos que deseja comprar: ");
            ingressos = input.nextInt();
            System.out.printf("Digite o valor unitário de ingressos que deseja comprar: R$ ");
            valor = input.nextFloat();
            total = (double)(valor * (float)ingressos);
            System.out.printf("O valor total é R$ " + total);
        } catch (Exception var10) {
            System.out.printf("ERRO! \n Favor voltar ao menu e digitar apenas números.");
        } finally {
            System.out.println("Processo finalizado!");
        }

    }
}
