import java.util.Date;

public class Professor extends Pessoa{
    public String turno;
    public Float salario;

    public Professor(String nome, String cpf, Date dataNascimento, String sexo, String estadoCivil, String endereco, String turno, Float salario) {
        super(nome, cpf, dataNascimento, sexo, estadoCivil, endereco);
        this.turno = turno;
        this.salario = salario;
    }

    public Treino criarTreino (){
        Treino costas = new Treino("Superior", "Costas");
        return costas;
    }
}
