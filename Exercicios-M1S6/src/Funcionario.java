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

    public CargoFuncionario getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(CargoFuncionario cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    //Métodos
    @Override
    public void promover() {
        if (cargoFuncionario.equals(cargoFuncionario.INICIANTE)) {
            cargoFuncionario = cargoFuncionario.EXPERIENTE;
        } else if (cargoFuncionario.equals(cargoFuncionario.EXPERIENTE)) {
            cargoFuncionario = cargoFuncionario.AVANCADO;
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
}
