import Model.Cofrinho;
import Model.Menu;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Cofrinho cofrinho = new Cofrinho();
    Menu menu = new Menu();

    Scanner sc = new Scanner(System.in);
    String opcao = "";
    menu.opcoes();
    while (!opcao.equals("0")) {
      opcao = sc.nextLine();

      switch (opcao) {
        case "1":
          menu.adicionarMoeda();

          break;

        case "2":
          break;

        case "3":
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
