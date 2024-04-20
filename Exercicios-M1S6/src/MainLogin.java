import java.util.Scanner;

public class MainLogin {

    public static void main(String[] args) {

        ConfiguracaoInicial.dataStart();
        login();

    }


    // ---------------------------- LOGIN ----------------------------

        public static void login() {
            System.out.println("***********************");
            System.out.println("*      BEM VINDO      *");
            System.out.println("***********************");

            Scanner scanner = new Scanner(System.in);

            try {
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
                        login();
                        return;
                    default:
                        System.out.println("Insira uma opção válida.");
                        break;
                }
                //} while (true);
            } catch (Exception e) {
                System.out.println("Opção inválida");
            }

            espacoVertical();
        }

    // ---------------------------- ALUNO ----------------------------
    public static void opcaoAluno() {

        espacoVertical();
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
                    DadosAlunos.listarAlunos();
                    Aluno alunoEscolhido = DadosAlunos.buscarAluno(entrada);
                    System.out.println("Bem-vindo(a) de volta, " + alunoEscolhido.getNome());
                    opcoesAluno(alunoEscolhido);
                    break;
                case 2: //Criar
                    DadosAlunos.adicionarAluno(entrada);
                    opcaoAluno();
                    break;
                case 0:
                    login();
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
        }

        opcaoAluno();
    }

    public static void opcoesAluno(Aluno alunoEscolhido) {

        espacoVertical();
        try {

            Scanner entrada = new Scanner(System.in);

            System.out.println("|----------------------------|");
            System.out.println("|O que você deseja fazer?    |");
            System.out.println("|----------------------------|");
            System.out.println("| 1- Listar meus cursos      |");
            System.out.println("| 2- Adicionar curso         |");
            System.out.println("| 3- Remover curso           |");
            System.out.println("| 4- Trancar minha matrícula |");
            System.out.println("| 5- Ativar minha matrícula  |");
            System.out.println("|----------------------------|");
            System.out.println("| 0- Sair                    |");
            System.out.println("|----------------------------|");
            System.out.println("Selecione uma opção:");

            Turma turmaEscolhida;

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    DadosTurmas.listarTurmasAluno(alunoEscolhido); // lista turmas do aluno
                    break;
                case 2:
                    DadosTurmas.listarTurmas(); // lista todas as turmas
                    turmaEscolhida = DadosTurmas.buscarTurma(entrada); // encontra turma solicitada
                    turmaEscolhida.adicionarAluno(alunoEscolhido);
                    System.out.println("Curso " + turmaEscolhida.getCurso().getNomeCurso() + " adicionado com sucesso!");
                    break;
                case 3:
                    DadosTurmas.deletarTurmaAluno(entrada, alunoEscolhido);
                    System.out.println("Curso removido com sucesso!");
                    break;
                case 4:
                    alunoEscolhido.trancarMatricula();
                    break;
                case 5:
                    alunoEscolhido.ativarMatricula();
                    break;
                case 0:
                    login();
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Selecione uma opção:");
        }

        opcoesAluno(alunoEscolhido);
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
                    login();
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
            System.out.println();
        }

        espacoVertical();
        opcaoFuncionario();
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
                    DadosProfessores.listarProfessores();
                    Professor professorEscolhido = DadosProfessores.buscarProfessor(entrada);
                    System.out.println("Bem-vindo(a) de volta, " + professorEscolhido.getNome());
                    break;
                case 2: //Criar
                    DadosProfessores.adicionarProfessor(entrada);
                    opcaoProfessor();
                    break;
                case 0:
                    login();
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
            System.out.println();
        }

        espacoVertical();
        opcaoProfessor();
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
                    DadosDiretores.listarDiretores();
                    Diretor diretorEscolhido = DadosDiretores.buscarDiretor(entrada);
                    System.out.println("Bem-vindo(a) de volta, " + diretorEscolhido.getNome());
                    break;
                case 2: //Criar
                    DadosDiretores.adicionarDiretor(entrada);
                    opcaoDiretor();
                    break;
                case 0:
                    login();
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Opção inválida");
            System.out.println();
        }

        espacoVertical();
        opcaoDiretor();
    }



    //-------------------Methods--------------
    private static void espacoVertical() {
        System.out.println("\n\n\n");
    }
}
