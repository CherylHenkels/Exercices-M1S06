public class Aluno {

    private String nome;
    private int idade;
    private StatusMatricula statusMatricula;


    // Contrutor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, StatusMatricula statusMatricula) {
        this.nome = nome;
        this.idade = idade;
        this.statusMatricula = statusMatricula;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    //Métodos

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + '}';
    }
}
