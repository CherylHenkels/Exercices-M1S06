public class Curso {

    private String nomeCurso;
    private String professorCurso;

    //Construtor
    public Curso(String nomeCurso, String professorCurso) {
        this.nomeCurso = nomeCurso;
        this.professorCurso = professorCurso;
    }

    //Getters and Setters
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getProfessorCurso() {
        return professorCurso;
    }

    public void setProfessorCurso(String professorCurso) {
        this.professorCurso = professorCurso;
    }

    //Metodos
    @Override
    public String toString() {
        return "Curso{" + "nome=" + nomeCurso + "professor=" + professorCurso + '}';
    }
}


