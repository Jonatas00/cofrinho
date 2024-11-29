import java.util.Scanner;

import Model.Cofrinho;
import Model.Menu;

public class CofrinhoMain {
  public static void main(String[] args) {
    Menu menu = new Menu();

    Cofrinho cofre = new Cofrinho();

    Scanner sc = new Scanner(System.in);

    menu.opcoes();

    sc.close();
  }
}
