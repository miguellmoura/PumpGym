import java.beans.PersistenceDelegate;
import java.util.Date;

public class Aluno extends Pessoa{
    private Treino treino;
    private Professor teacher;
    private Plano plano;

    public Aluno(String nome, String cpf, Date dataNascimento, String sexo, String estadoCivil, String endereco, Unidade unidade, Treino treino, Professor teacher, Plano plano) {
        super(nome, cpf, dataNascimento, sexo, estadoCivil, endereco, unidade);
        this.treino = treino;
        this.teacher = teacher;
        this.plano = plano;
    }


}
