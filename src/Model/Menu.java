package Model;

public class Menu {

  private void limparTerminal() {
    // Limpa a tela do console usando sequência de escape ANSI
    System.out.print("\033\143");
  }

  public void opcoes() {
    System.out.println("Aluno: Jonatas Rodrigues Damasceno - RU: 4589297");
    System.out.println("COFRINHO BANKS:");
    System.out.println("1 - Adicionar moeda");
    System.out.println("2 - Remover moeda");
    System.out.println("3 - Listar moedas");
    System.out.println("4 - Calcular total convertido para Real");
    System.out.println("0 - Encerrar");
  }

  public void adicionarMoeda() {
    limparTerminal();
    System.out.println("Escolha a moeda:");
    System.out.println("1 - Real");
    System.out.println("2 - Dolar");
    System.out.println("3 - Euro");
  }

  public void encerrar() throws InterruptedException {
    System.out.println("Encerrando sessão...");
    Thread.sleep(1000);
    System.out.println("Sessão encerrada!");
  }
}
