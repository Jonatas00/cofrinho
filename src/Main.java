import Model.Cofrinho;
import Model.Menu;
import Model.Moeda;
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
      opcao = sc.next();

      switch (opcao) {
        case "1":
          menu.moedas();
          String escolha = sc.next();
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
          String moeda = sc.next();
          System.out.println("Digite a quantidade de moedas que será removida: ");
          double valor = sc.nextDouble();
          Moeda moedaEscolhida = null;
          switch (moeda) {
            case "1" -> moedaEscolhida = new Real(valor);
            case "2" -> moedaEscolhida = new Dolar(valor);
            case "3" -> moedaEscolhida = new Euro(valor);
          }
          if (moedaEscolhida != null) {
            cofrinho.remover(moedaEscolhida);
          }
          break;

        case "3":
          System.out.println("Suas moedas: ");
          cofrinho.listagemMoedas();
          break;

        case "4":
          cofrinho.totalConvertido();
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
