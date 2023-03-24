import entities.ContaLogin;

public class QuestaoSete {
    public static void main(String[] args) {
        ContaLogin cl = new ContaLogin("mrafel","@#123");
        System.out.println("Login: "+cl.getLogin());
        System.out.println("Senha: "+ cl.getSenha());
        cl.setNome("Messi Batista");
        System.out.println("--Novo Nome--");
        System.out.println("Nome: "+cl.getNome());
        cl.setSenha("qqq1","mrafael");
        System.out.println("Senha: "+ cl.getSenha());
        cl.autenticarlogin(cl);
        ContaLogin cl2 =new ContaLogin("mrafel","qqq1");
        cl.autenticarlogin(cl2);
    }
}
