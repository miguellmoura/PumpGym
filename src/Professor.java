public class Professor extends Pessoa{
    protected String turno;
    protected Float salario;

    public Professor(String nome, String cpf, int dataNascimento, String sexo, String estadoCivil, String endereco, Unidade unidade, String turno, Float salario) {
        super(nome, cpf, dataNascimento, sexo, estadoCivil, endereco, unidade);
        this.turno = turno;
        this.salario = salario;
    }

    public void alterarTreinoDoAluno (Aluno aluno, Treino treino ){
        System.out.println("auterando terino do aluno " + aluno.nome+ ".\no antigo trino do aluno era "+ aluno.treino.nomeTreino());
    }

    public Treino criarTreino (String tipo, String nomeTreino){
        Treino Treino = new Treino(tipo, nomeTreino );
        return Treino;
    }
  
}

