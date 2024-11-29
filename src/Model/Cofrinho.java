package Model;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
  private List<Moeda> listaMoedas;

  public Cofrinho() {
    listaMoedas = new ArrayList<>();
  }

  public void adicionar(Moeda moeda) {
    listaMoedas.add(moeda);
    System.out.println("Você adicionou " + moeda + "ao cofrinho");
  }

  public void remover(Moeda moeda) {
    listaMoedas.remove(moeda);
    System.out.println("Você removeu " + moeda + "ao cofrinho");
  }

  public void listagemMoedas() {
    for (Moeda m : listaMoedas) {
      System.out.println(m);
    }
  }

  public void totalConvertido() {
  }
}
