public class Diretor extends Funcionario{
    private int tempoCargo;

    public Diretor(String nome, Double salario, int tempoCargo) {
        super(nome, salario);
        this.tempoCargo = tempoCargo;
    }

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
