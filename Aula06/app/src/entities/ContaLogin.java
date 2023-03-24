package entities;

public class ContaLogin {

    //Atributos da classe

    private String nome, login, senha;

    //Método construtor


    public ContaLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String login) {
        if (login == "mrafael") {
            this.senha = senha;
        } else {
            System.out.println("Acesso negado!");
        }
    }

        public void autenticarlogin(ContaLogin contalogin){
            if (contalogin.getSenha() == this.senha && contalogin.getLogin() == this.login) {
                System.out.println("Usuário autenticado!" + this.getLogin());

            } else {
                System.out.println("Acesso negado!");
            }
        }
    }

