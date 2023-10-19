import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Pessoa> lista;

    public Academia(List<Pessoa> lista) {
        this.lista = lista;
    }


    public Aluno cadastrarAluno(Aluno aluno) {
        return aluno;
    }

    public Professor cadastrarProfessor (Professor professor){
        return professor;
    }


}
