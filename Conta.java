import java.util.Scanner;
public class Conta{
    String titular;
    String numero_da_conta;
    int quantidade;
    String name;
    String conta;
    int valor;
    public void conta(){
        Scanner s = new Scanner(System.in);

        Conta account1 = new Conta();

        System.out.println("Qual o nome do titular da conta: ");
        name = s.nextLine();
        System.out.println("Número da conta: ");
        conta = s.nextLine();
        System.out.println("Quanto deseja depositar: ");
        valor = s.nextInt();

        account1.setTitular(name);
        account1.setNumerodaconta(conta);
        account1.setQuantidade(valor);

    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setNumerodaconta(String numero_da_conta){
        this.numero_da_conta = numero_da_conta;
    }
    public String getTitular(){
        return this.titular;
    }
    public String getNumerodaconta(){
        return this.numero_da_conta;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
}
