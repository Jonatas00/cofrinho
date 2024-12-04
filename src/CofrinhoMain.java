import java.util.Scanner;

import Model.Cofrinho;
import Model.Menu;

public class CofrinhoMain {
  public static void main(String[] args) {

    Cofrinho cofre = new Cofrinho();
    Menu menu = new Menu();

    Scanner sc = new Scanner(System.in);
    String opcao = "";
    while (!opcao.equals("0")) {

      menu.opcoes();
      opcao = sc.nextLine();

    }

    sc.close();
  }
}
