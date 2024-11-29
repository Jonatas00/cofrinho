import Model.Cofrinho;

import Model.Moeda;
import Model.Moedas.Dolar;
import Model.Moedas.Euro;
import Model.Moedas.Real;

public class CofrinhoMain {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();

        Moeda dolar = new Dolar(10);
        Moeda euro = new Euro(5);
        Moeda real = new Real(20);

        cofrinho.adicionar(dolar);
        cofrinho.adicionar(euro);
        cofrinho.adicionar(real);

        cofrinho.listagemMoedas();

        System.out.println("Total convertido em reais: " + cofrinho.totalConvertido());

        cofrinho.remover(euro);

        cofrinho.listagemMoedas();
        System.out.println("Total atualizado em reais: " + cofrinho.totalConvertido());
    }
}
