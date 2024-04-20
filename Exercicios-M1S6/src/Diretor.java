public class Diretor extends Funcionario{

    private int tempoCargo;

    //Construtor
    public Diretor(String nome, Double salario, int tempoCargo) {
        super(nome, salario);
        this.tempoCargo = tempoCargo;
    }

    public Diretor() {
    }

    //Getters and Setters
    public int getTempoCargo() {
        return tempoCargo;
    }

    public void setTempoCargo(int tempoCargo) {
        this.tempoCargo = tempoCargo;
    }

    //Metodos
    @Override
    public String toString() {
        return  "Diretor{" + "tempoCargo=" + tempoCargo + '}';
    }
}
