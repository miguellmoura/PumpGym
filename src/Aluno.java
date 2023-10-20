import java.beans.PersistenceDelegate;
import java.util.Date;

public class Aluno extends Pessoa{
    public Treino treino;
    public Professor teacher;

    public Aluno(String nome, String cpf, Date dataNascimento, String sexo, String estadoCivil, String endereco, Treino treino, Professor teacher) {
        super(nome, cpf, dataNascimento, sexo, estadoCivil, endereco);
        this.treino = treino;
        this.teacher = teacher;
    }

    public void pagarMensalidade () {
        System.out.println("O aluno" +  this.nome + "realizou o pagamento da mensalidade");
    }

}
