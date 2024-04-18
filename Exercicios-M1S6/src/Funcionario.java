public class Funcionario implements IFuncionario{
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void promover() {
        this.salario *= 1.10; // 10% de aumento
        System.out.println(nome + " foi promovido. Novo salário: " + salario);
    }
}
