import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        int controle=0;

        while(controle<=num){
            if(controle==num){
                System.out.println("Chegou no final, o número é: "+num);
            }else{
                System.out.printf("%d Valor zero!", controle);
                System.out.println();
            }++controle;
        }

    }
}
