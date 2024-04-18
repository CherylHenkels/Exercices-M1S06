public class Funcionario implements IFuncionario{
    private String nome;
    private Double salario;
    private CargoFuncionario cargoFuncionario;

    //Construtores
    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public Funcionario(String nome, Double salario, CargoFuncionario cargoFuncionario) {
        this.nome = nome;
        this.salario = salario;
        this.cargoFuncionario = cargoFuncionario;
    }

    //Getters and Setters
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

    //Métodos
    @Override
    public void promover() {
        this.salario *= 1.10; // 10% de aumento
        System.out.println(nome + " foi promovido. Novo salário: " + salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
}
