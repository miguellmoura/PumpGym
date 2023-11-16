package Model;

import javax.swing.*;

public abstract class Pessoa{
    protected String nome;
    protected String cpf;
    protected int dataNascimento;
    protected String sexo;
    protected String estadoCivil;
    protected Endereco endereco;

    protected Unidade unidade;

    public Pessoa(JTextField textNomeAluno, JTextField textCpfAluno, JTextField textCpfAluno1, JTextField textDataNacimentoAluno, JComboBox<String> comboBoxSexoAluno, JTextField textEstadocivilAluno, Endereco endereco, JComboBox<String> comboBoxPlanoAluno) {
    }

   public Pessoa(String nome){
       this.nome =nome;
    }

    public void entrouNaAcademia () {
        System.out.println(this.nome + "entrou na academia!");
    }

    public Pessoa(String nome, String cpf, int dataNascimento, String sexo, String estadoCivil, Endereco endereco, Unidade unidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.unidade = unidade;
    }
}
