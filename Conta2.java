import java.util.Scanner;
public class Conta2 {
    String numerodaconta;
    String titular;
    int quantidade;

    String name;
    String conta;
    int valor;

    public void conta2() {
        Scanner s = new Scanner(System.in);
        Conta2 account2 = new Conta2();

        //System.out.println("Qual o nome do titular da conta: ");
        //name = s.nextLine();
        System.out.println("Número da conta: ");
        conta = s.nextLine();
        //System.out.println("Quanto deseja depositar: ");
        //valor = s.nextInt();

        account2.setTitular(name);
        account2.setNumerodaconta(conta);
        account2.setQuantidade(valor);

        System.out.println(account2.getTitular());
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumerodaconta(String numerodaconta){
        this.numerodaconta = numerodaconta;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String getTitular(){
        return this.titular;
    }
    public String getNumerodaconta(){
        return this.numerodaconta;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
}
