import Model.Cofrinho;
import Model.Menu;
import Model.Moeda;
import Model.Moedas.Dolar;
import Model.Moedas.Euro;
import Model.Moedas.Real;

import java.util.Scanner;

public class Main {
  // A exception lançada é devido ao Thread.sleep que usei nos outputs na classe menu
  public static void main(String[] args) throws InterruptedException {

    Cofrinho cofrinho = new Cofrinho();
    Menu menu = new Menu();

    Scanner sc = new Scanner(System.in);
    String opcao = "";

    System.out.println("Aluno: Jonatas Rodrigues Damasceno - RU: 4589297");

    while (!opcao.equals("0")) {
      // Menu para selecionar as funcionalidades do cofrinho
      menu.opcoes();
      opcao = sc.next();
      switch (opcao) {
        // Adicionar moeda
        case "1":
          menu.moedas();
          String escolha = sc.next();
          System.out.println("Digit a quantidade de moedas: ");
          int quantidade = sc.nextInt();

          // Switch que cria uma nova instância de uma moeda e adiciona ao cofrinho de acordo com
          // a opção escolhida pelo usuário
          switch (escolha) {
            case "1" -> cofrinho.adicionar(new Real(quantidade));
            case "2" -> cofrinho.adicionar(new Dolar(quantidade));
            case "3" -> cofrinho.adicionar(new Euro(quantidade));
          }
          break;

        // Remover moeda
        case "2":
          menu.moedas();
          String moeda = sc.next();
          System.out.println("Digite a quantidade de moedas que será removida: ");
          double valor = sc.nextDouble();
          Moeda moedaEscolhida = null;

          // Cria uma instância da moeda, verifica se existe alguma igual no cofrinho e a remove
          switch (moeda) {
            case "1" -> moedaEscolhida = new Real(valor);
            case "2" -> moedaEscolhida = new Dolar(valor);
            case "3" -> moedaEscolhida = new Euro(valor);
          }
          if (moedaEscolhida != null) {
            cofrinho.remover(moedaEscolhida);
          }
          break;

        // Listar moedas
        case "3":
          System.out.println("Suas moedas: ");
          cofrinho.listagemMoedas();
          break;

        // Converter moedas
        case "4":
          cofrinho.totalConvertido();
          break;

        // Encerrar cofrinho
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
