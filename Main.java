/*
3. Criar uma classe chamada Conta que terá os atributos Titular, Número de conta e Quantidade.
Comparar duas contas a ver qual tem mais dinheiro.
*/
import java.util.Scanner;
public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        Conta c1 = new Conta();
        Conta2 c2 = new Conta2();

        c2.conta2();
        //c1.conta();

        boolean titulares = c1.getTitular() == c2.getTitular();
        var contas_Comparadas = c2.getNumerodaconta();

        //System.out.println("as titulares da conta são iguais!? " + titulares);
        System.out.println(c2.getNumerodaconta());

        if (c2.getQuantidade() > c1.getQuantidade()){
            System.out.println(c2.getTitular() + " Possui maior quantidade de $$: " + c2.getQuantidade());

        }else{
            System.out.println(c1.getTitular() + "Possui maior quantidade de $$: " + c1.getQuantidade());
        }
    }
}
