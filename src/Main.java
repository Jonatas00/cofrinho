import Model.Cofrinho;
import Model.Menu;
import Model.Moedas.Dolar;
import Model.Moedas.Euro;
import Model.Moedas.Real;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {

    Cofrinho cofrinho = new Cofrinho();
    Menu menu = new Menu();

    Scanner sc = new Scanner(System.in);
    String opcao = "";

    System.out.println("Aluno: Jonatas Rodrigues Damasceno - RU: 4589297");
    while (!opcao.equals("0")) {
      menu.opcoes();
      opcao = sc.nextLine();

      switch (opcao) {
        case "1":
          menu.moedas();
          String escolha = sc.nextLine();
          System.out.println("Digit a quantidade de moedas: ");
          int quantidade = sc.nextInt();

          switch (escolha) {
            case "1" -> cofrinho.adicionar(new Real(quantidade));
            case "2" -> cofrinho.adicionar(new Dolar(quantidade));
            case "3" -> cofrinho.adicionar(new Euro(quantidade));
          }
          break;

        case "2":
          menu.moedas();
          escolha = sc.nextLine();
          System.out.println("Digite a quantidade de moedas que será removida: ");
          quantidade = sc.nextInt();

          switch (escolha) {
            case "1" -> cofrinho.remover(new Real(quantidade));
            case "2" -> cofrinho.remover(new Dolar(quantidade));
            case "3" -> cofrinho.remover(new Euro(quantidade));
          }
          break;

        case "3":
          System.out.println("Suas moedas: ");
          cofrinho.listagemMoedas();
          break;

        case "4":
          break;

        case "0":
          menu.encerrar();
          continue;

        default:
          System.out.println("Digite um valor válido!");
          break;
      }
    }

    sc.close();
  }
}
