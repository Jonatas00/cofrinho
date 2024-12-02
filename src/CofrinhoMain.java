import java.util.Scanner;

import Model.Cofrinho;
import Model.Menu;

public class CofrinhoMain {
  public static void main(String[] args) {
    Menu menu = new Menu();

    Cofrinho cofre = new Cofrinho();

    Scanner sc = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    menu.opcoes();

    boolean sair = false;
    while (!sair) {
      String input = sc.nextLine();
      switch (input) {
        case "1":
          menu.adicionarMoeda();
          break;
        case "2":
          // todo
        case "3":
          // todo
        case "4":
          // todo
        case "0":
          sair = true;
          break;
        default:
          System.out.println("Digite uma opção válida!");
      }
    }
    sc.close();
    System.out.println("Fechando o cofrinho...");
  }
}
