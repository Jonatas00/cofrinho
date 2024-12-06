package Model;

public class Menu {

  private void limparTerminal() {
    // Limpa a tela do console usando sequência de escape ANSI
    System.out.print("\033\143");
  }

  public void opcoes() {
    System.out.println("==========");
    System.out.println("COFRINHO BANKS:");
    System.out.println("1 - Adicionar moeda");
    System.out.println("2 - Remover moeda");
    System.out.println("3 - Listar moedas");
    System.out.println("4 - Calcular total convertido para Real");
    System.out.println("0 - Encerrar");
    System.out.println("==========");
  }

  public void moedas() {
    limparTerminal();
    System.out.println("==========");
    System.out.println("Escolha a moeda:");
    System.out.println("1 - Real");
    System.out.println("2 - Dolar");
    System.out.println("3 - Euro");
    System.out.println("==========");
  }

  public void encerrar() throws InterruptedException {
    System.out.println("Encerrando sessão...");
    Thread.sleep(1000);
    System.out.println("Sessão encerrada!");
  }
}
