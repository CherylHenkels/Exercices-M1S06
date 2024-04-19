import java.util.Scanner;

public class MainLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("*      BEM VINDO      *");
        System.out.println("***********************");

        try{
            //do {
            System.out.println("|---------------------|");
            System.out.println("| 1- Aluno            |");
            System.out.println("| 2- Funcionario      |");
            System.out.println("|---------------------|");
            System.out.println("| 0- Sair             |");
            System.out.println("|---------------------|");
            System.out.println("Selecione uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consome enter depois do número

            // Menu
            switch (opcao) {
                case 1: // Aluno
                    opcaoAluno();
                    break;
                case 2: // Funcionario
                    opcaoFuncionario();
                    break;
                case 0: // sair
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
            }

            espacoVertical();
        //} while (true);
        }
        catch (Exception e) {
            System.out.println("Opção inválida");
        }




    }


    // ---------------------------- ALUNO ----------------------------
    public static void opcaoAluno() {

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("|---------------------|");
            System.out.println("|ALUNO SELECIONADO    |");
            System.out.println("|---------------------|");
            System.out.println("| 1- Login            |");
            System.out.println("| 2- Criar usuário    |");
            System.out.println("|---------------------|");
            System.out.println("| 0- Sair             |");
            System.out.println("|---------------------|");
            System.out.println("Selecione uma opção:");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1: //Login
                    Aluno alunoEscolhido = DadosAlunos.buscarAluno(entrada);
                    System.out.println("Bem-vindo(a) de volta, " + alunoEscolhido.getNome());
                    //opcoesAluno(alunoEscolhido);
                    break;
                case 2: //Criar
//                    Aluno novoAluno = new Aluno();
                    DadosAlunos.adicionarAluno(entrada);
                    opcaoAluno();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
        }
//        menuAluno();
    }


    // ---------------------------- FUNCIONARIO ----------------------------
    public static void opcaoFuncionario() {

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("|-----------------------|");
            System.out.println("|FUNCIONARIO SELECIONADO|");
            System.out.println("|-----------------------|");
            System.out.println("| 1- Professor          |");
            System.out.println("| 2- Diretor            |");
            System.out.println("|-----------------------|");
            System.out.println("| 0- Sair               |");
            System.out.println("|-----------------------|");
            System.out.println("Selecione uma opção:");

            int opcao= entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    opcaoProfessor();
                    break;
                case 2:
                    opcaoDiretor();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
            System.out.println();
        }
//        menuFuncionario();
    }

    // ---------------------------- PROFESSOR ----------------------------

    public static void opcaoProfessor() {

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("|---------------------|");
            System.out.println("|PROFESSOR SELECIONADO|");
            System.out.println("|---------------------|");
            System.out.println("| 1- Login            |");
            System.out.println("| 2- Criar usuário    |");
            System.out.println("|---------------------|");
            System.out.println("| 0- Sair             |");
            System.out.println("|---------------------|");
            System.out.println("Selecione uma opção:");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1: //Login
                    Professor professorEscolhido = DadosProfessores.buscarProfessor(entrada);
                    System.out.println("Bem-vindo(a) de volta, " + professorEscolhido.getNome());
                    //opcoesAluno(alunoEscolhido);
                    break;
                case 2: //Criar
                    DadosProfessores.adicionarProfessor(entrada);
                    opcaoProfessor();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
            System.out.println();
        }
//        menuProfessor();
    }

    // ---------------------------- DIRETOR ----------------------------

    public static void opcaoDiretor() {

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("|---------------------|");
            System.out.println("|DIRETOR SELECIONADO  |");
            System.out.println("|---------------------|");
            System.out.println("| 1- Login            |");
            System.out.println("| 2- Criar usuário    |");
            System.out.println("|---------------------|");
            System.out.println("| 0- Sair             |");
            System.out.println("|---------------------|");
            System.out.println("Selecione uma opção:");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1: //Login
                    Diretor diretorEscolhido = DadosDiretores.buscarDiretor(entrada);
                    System.out.println("Bem-vindo(a) de volta, " + diretorEscolhido.getNome());
                    //opcoesAluno(alunoEscolhido);
                    break;
                case 2: //Criar
                    DadosDiretores.adicionarDiretor(entrada);
                    opcaoDiretor();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
            System.out.println();
        }
//        menuProfessor();
    }



    //-------------------Methods--------------
    private static void espacoVertical() {
        System.out.println("\n\n\n");
    }
}
