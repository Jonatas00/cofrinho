import Model.Cofrinho;
import Model.Moeda;
import Model.Moedas.Dolar;
import Model.Moedas.Real;

public class CofrinhoMain {
  public static void main(String[] args) {

    Cofrinho cofre = new Cofrinho();

    Moeda moedinhaReal = new Real(1.7);
    Moeda moedinhaDolar = new Dolar(5);

    cofre.adicionar(moedinhaReal);
    cofre.adicionar(moedinhaDolar);
    cofre.adicionar(moedinhaDolar);

    cofre.listagemMoedas();

    cofre.totalConvertido();
  }
}
