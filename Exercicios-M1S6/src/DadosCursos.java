import java.util.ArrayList;
import java.util.List;

public class DadosCursos {

    public static List<Curso> listaCurso = new ArrayList<>();

    //Construtor
    public DadosCursos() {
    }

    //Métodos
    public static Curso buscaCurso(String nomeCurso) {
        for (Curso c : listaCurso) {
            if(nomeCurso.equals(c.getNomeCurso())) {
                return c;
            }
        }
        return null;
    }

}
