public class Pessoa {
    public String nome;
    public String sobrenome;
    public int dataNascimento;
    public String email;
    public String telefone;

    public static final String CPF = "123.456.789-00";
    public static final String NACIONALIDADE = "Brasil";

    public Pessoa(String nome, String sobrenome, int dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public void andar() {
        
    }

    public void comer() {
        
    }

    public void correr() {
        
    }

    public void dormir() {
        
    }

    public void exibirInformacoes() {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Email: " + email + " - Data de nascimento: " + dataNascimento + " - Telefone: " + telefone);
        System.out.println("País da nacionalidade: " + NACIONALIDADE);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", "Barros", 13042005, "pedro.barros@gmail.com", "(81)1234-5678");
        pessoa.exibirInformacoes();
    }
}
