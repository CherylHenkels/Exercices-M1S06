import java.util.ArrayList;
import java.util.List;

public class DadosCursos {


    Curso curso1 = new Curso("Física", "Albert Einstein");
    Curso curso2 = new Curso("Química", "Marie Curie");
    Curso curso3 = new Curso("Matemática", "Leonardo Fibonacci");

    public static List<Curso> listaCurso = new ArrayList<>();
    public DadosCursos() {
        listaCurso.add(curso1);
        listaCurso.add(curso2);
        listaCurso.add(curso3);

    }

    public static Curso buscaCurso(String nomeCurso) {
        for (Curso c : listaCurso) {
            if(nomeCurso.equals(c.getNomeCurso())) {
                return c;
            }
        }
        return null;
    }

}
