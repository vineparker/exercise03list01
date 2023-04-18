import java.util.Scanner;

class Main {
  // Faça um Programa que peça dois números e imprima a soma.
  public static void main(String[] args) {

    // declaração das variáveis 
    Scanner input = new Scanner(System.in);int resultado; 
    int numero1;
    int numero2;

    // primeira mensagem
    String textoUm = "Digite um número inteiro: ";
    System.out.print(textoUm);
    numero1 = input.nextInt();

    // segunda mensagem
    String textoDois = "Digite OUTRO número inteiro: ";
    System.out.print(textoDois);
    numero2 = input.nextInt();
    
    // calcular a soma entre os dois numeros inputados
    
    resultado = (numero1 + numero2);

    // mostrar o resultado da soma
    System.out.println("Os dois numeros somados e igual a: " + resultado);

    input.close();
  }
}





