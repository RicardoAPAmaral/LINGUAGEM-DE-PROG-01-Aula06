package app;

public class QuestaoUm {
    public static void main(String[] args) {
        int soma=0,num;

        for(int control=1;control<100;control++){
            num=control%2;
            if(num!=0){
                soma=soma+control;
            }
        }
        System.out.println("A soma total foi o valor de soma "+soma);

    }

}
