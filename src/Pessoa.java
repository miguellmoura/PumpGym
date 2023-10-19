import java.util.Date;

public abstract class Pessoa{
    public String nome;
    public String cpf;
    public Date dataNascimento;
    public String sexo;
    public String estadoCivil;
    public String endereco;

    public void entrouNaAcademia () {

        System.out.println(this.nome + "entrou na academia!");

    }

    public Pessoa(String nome, String cpf, Date dataNascimento, String sexo, String estadoCivil, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }
}
