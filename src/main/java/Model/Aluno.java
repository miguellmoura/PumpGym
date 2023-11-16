package Model;

import javax.swing.*;

public class Aluno extends Pessoa {
    protected Treino treino;
    protected Professor teacher;
    protected Plano plano;

    public Aluno(String nome, String cpf, int dataNascimento, String sexo, String estadoCivil, Endereco endereco, Unidade unidade, Treino treino, Professor teacher, Plano plano) {
        super(nome, cpf, dataNascimento, sexo, estadoCivil, endereco, unidade);
        this.treino = treino;
        this.teacher = teacher;
        this.plano = plano;
    }

    public Aluno(JTextField textNomeAluno, JTextField textCpfAluno, JTextField textDataNacimentoAluno, JComboBox<String> comboBoxSexoAluno, JTextField textEstadocivilAluno, Endereco endereco, JComboBox<String> comboBoxPlanoAluno) {
        super(textNomeAluno,textCpfAluno,textCpfAluno,textDataNacimentoAluno,comboBoxSexoAluno,textEstadocivilAluno,endereco,comboBoxPlanoAluno);
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
