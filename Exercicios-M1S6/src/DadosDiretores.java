import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosDiretores {
    private List<Diretor> listaDiretores;

    public DadosDiretores() {
        listaDiretores = new ArrayList<>();
    }

    public List<Diretor> getListaDiretores() {
        return listaDiretores;
    }

    public void setListaDiretores(List<Diretor> listaDiretores) {
        this.listaDiretores = listaDiretores;
    }

    //Metodos
    public  void adicionarDiretor(Scanner scanner) {
        Diretor diretor = new Diretor();
        System.out.println("Digite as informações do diretor: ");
        System.out.println("Nome:");
        diretor.setNome(scanner.nextLine());
        System.out.println("Tempo de Cargo:");
        diretor.setTempoCargo(nextInt(scanner));
        System.out.println("Salário:");
        diretor.setSalario(scanner.nextDouble());
        scanner.nextLine();
//        System.out.println("Escolha o cargo:");
//        for (CargoFuncionario cargoFuncionario: CargoFuncionario.values()) {
//            System.out.println(cargoFuncionario);
//        }
//        diretor.setCargoFuncionario(CargoFuncionario.valueOf(scanner.nextLine()));

        listaDiretores.add(diretor);
        System.out.println("Diretor " + diretor.getNome() + " adicionado!");
    }

    public void removerDiretor(Scanner scanner) {
        listarDiretores();
        Diretor diretor = buscarDiretor(scanner);
        listaDiretores.remove(diretor);
        System.out.println("Diretor " + diretor.getNome() + " removido!");
    }

    public Diretor buscarDiretor(Scanner scanner) {
        System.out.println("Digite o id do diretor:");
        int id = nextInt(scanner);
        Diretor diretorBuscado = null;
        for(int i = 0; i < listaDiretores.size(); i++) {
            int listItem = i + 1 ;
            if(listItem == id){
                diretorBuscado =  listaDiretores.get(i);
                break;
            }
        }
        return diretorBuscado;
    }

    public void listarDiretores(){
        System.out.println("A lista de diretores é:");
        int i = 1;
        for(Diretor diretor : listaDiretores){
            System.out.println(i + " - " + diretor.getNome());
            i++;
        }
    }

    private static int nextInt(Scanner scn){
        int i = scn.nextInt();
        //consumindo "ENTER" para futuros "nextLine()"
        scn.nextLine();
        return i;
    }

}
