public class ConfiguracaoInicial {
    public static void dataStart() {

        //Diretor
        Diretor diretor = new Diretor("Charles Xavier", 8000.00, 5);
        DadosDiretores dadosDiretores = new DadosDiretores();
        DadosDiretores.listaDiretores.add(diretor);

        //Professor
        Professor professor = new Professor("Logan Howlett", 191, 4);
        DadosProfessores dadosDiretor = new DadosProfessores();
        DadosProfessores.listaProfessores.add(professor);

        //Curso
        DadosCursos dadosCursos = new DadosCursos();
        Curso curso1 = new Curso("Física", "Albert Einstein");
        DadosCursos.listaCurso.add(curso1);
        Curso curso2 = new Curso("Química", "Marie Curie");
        DadosCursos.listaCurso.add(curso2);
        Curso curso3 = new Curso("Matemática", "Leonardo Fibonacci");
        DadosCursos.listaCurso.add(curso3);

        //Turma
        Turma turma1 = new Turma(2024, DadosCursos.listaCurso.get(0));
        DadosTurmas.listaTurmas.add(turma1);
        Turma turma2 = new Turma(2024, dadosCursos.listaCurso.get(1));
        DadosTurmas.listaTurmas.add(turma2);
        Turma turma3 = new Turma(2024, dadosCursos.listaCurso.get(2));
        DadosTurmas.listaTurmas.add(turma3);

        //Aluno
        Aluno aluno1 = new Aluno("Jean Grey", 19);
        turma1.adicionarAluno(aluno1);
        DadosAlunos.listaAlunos.add(aluno1);
        Aluno aluno2 = new Aluno("Scott Summers", 20);
        turma1.adicionarAluno(aluno2);
        DadosAlunos.listaAlunos.add(aluno2);

    }
}
