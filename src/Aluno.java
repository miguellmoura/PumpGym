import java.beans.PersistenceDelegate;
import java.util.Date;

public class Aluno extends Pessoa{
    protected Treino treino;
    protected Professor teacher;
    protected Plano plano;

    public Aluno(String nome, String cpf, int dataNascimento, String sexo, String estadoCivil, String endereco, Unidade unidade, Treino treino, Professor teacher, Plano plano) {
        super(nome, cpf, dataNascimento, sexo, estadoCivil, endereco, unidade);
        this.treino = treino;
        this.teacher = teacher;
        this.plano = plano;
    }
  public void realizouTreino(){
      System.out.println("o aluno "+ nome + " realivou o treino "+ treino.nomeTreino());
  }
  public void pagarMensalidade () {
        System.out.println("O aluno " +  this.nome + " realizou o pagamento da mensalidade");
        plano.statusPagamento = true;
      System.out.println(plano.statusPagamento);
    }
    public void cancelarPlano(){

    }
    public void trocarPlano(Plano plano){

    }

}
