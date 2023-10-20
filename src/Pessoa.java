import java.util.Date;

public abstract class Pessoa{
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    protected String sexo;
    protected String estadoCivil;
    protected String endereco;
    protected Unidade unidade;

    public void entrouNaAcademia () {
        System.out.println(this.nome + "entrou na academia!");
    }

    public Pessoa(String nome, String cpf, Date dataNascimento, String sexo, String estadoCivil, String endereco, Unidade unidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.unidade = unidade;
    }
}
