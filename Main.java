/*O Sr. Manoel Joaquim acaba de 
adquirir uma panificadora e pretende 
implantar a metodologia da tabelinha, 
que já é um sucesso na sua loja de 
1,99. Você foi contratado para 
desenvolver o programa que monta a 
tabela de preços de pães, de 1 até 50 
pães, a partir do preço do pão 
informado pelo usuário, conforme o 
exemplo abaixo:*/
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    DecimalFormat formatador = new DecimalFormat("0.00");
    Scanner scan = new Scanner(System.in);
    System.out.print("\nPreço do pão: ");
    float valorProduto = scan.nextFloat();
    
    System.out.println("\nPanificadora Pão de Ontem - Tabela de preços\n");
    for(int i = 1; i < 51; i++){
      System.out.println(i + " - R$ " + formatador.format(valorProduto * i));
    }
 }
}