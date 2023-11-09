import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Pessoa> lista;

    private Academia(List<Pessoa> lista) {
        this.lista = lista;
    }

    private Aluno cadastrarAluno(Aluno aluno) {return aluno;
    }

    private Professor cadastrarProfessor (Professor professor){
        return professor;
    }

}
