public class parametrosIniciais {
    public static void parametrosInicializacao() {

        Diretor diretor = new Diretor("Leonardo Vieira", 5700.00, 2);
        DadosDiretores dadosDiretores = new DadosDiretores();
        DadosDiretores.listaDiretores.add(diretor);

        Professor professor = new Professor("Vinicius Alves", 3, 28);
        DadosProfessores dadosDiretor = new DadosProfessores();
        DadosProfessores.listaProfessores.add(professor);

        DadosCursos dadosCursos = new DadosCursos();

//        Curso abc1 = new Curso("Introdução à Python", professor);
//        Curso abc2 = new Curso("Introdução à Java", professor);
//        Curso abc3 = new Curso("Introdução à Javascript", professor);

        //DadosTurmas dadosTurmas = new DadosTurmas();

        Turma turmaAbc1 = new Turma(2024, DadosCursos.listaCurso.get(0));
        DadosTurmas.listaTurmas.add(turmaAbc1);
        Turma turmaAbc2 = new Turma(2024, dadosCursos.listaCurso.get(1));
        DadosTurmas.listaTurmas.add(turmaAbc2);
        Turma turmaAbc3 = new Turma(2024, dadosCursos.listaCurso.get(2));
        DadosTurmas.listaTurmas.add(turmaAbc3);



        Aluno aluno1 = new Aluno("Ana Claudia", 38);
        turmaAbc1.adicionarAluno(aluno1);
        DadosAlunos.listaAlunos.add(aluno1);
        Aluno aluno2 = new Aluno("Bruna Mainardes (PROCURA-SE)", 27);
        turmaAbc1.adicionarAluno(aluno2);
        DadosAlunos.listaAlunos.add(aluno2);
//        turmaAbc1.getCurso().adicionarAlunoInicial(aluno2, turmaAbc1);
//        aluno2.trancarMatricula();
//        DadosAlunos.listaAlunos.add(aluno2);
//        Aluno aluno3 = new Aluno("João Batista", 20);
//        turmaAbc2.getCurso().adicionarAlunoInicial(aluno3, turmaAbc2);
//        DadosAlunos.listaAlunos.add(aluno3);
//        Aluno aluno4 = new Aluno("André Nascimento", 34);
//        turmaAbc2.getCurso().adicionarAlunoInicial(aluno4, turmaAbc2);
//        DadosAlunos.listaAlunos.add(aluno4);
//        Aluno aluno5 = new Aluno("Leandro Dias", 19);
//        turmaAbc3.getCurso().adicionarAlunoInicial(aluno5, turmaAbc2);
//        DadosAlunos.listaAlunos.add(aluno5);
//        Aluno aluno6 = new Aluno("Roberto Marinho", 22);
//        turmaAbc3.getCurso().adicionarAlunoInicial(aluno6, turmaAbc2);
//        DadosAlunos.listaAlunos.add(aluno6);
    }
}
