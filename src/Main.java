// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Endereco uniBatel = new Endereco("av. batel",456,"5andar","batel","2345334");

        Treino a_b_ciniciante = new Treino("treino completo", "a_b_ciniciante");

        Unidade pumpGymBatel = new Unidade("unidade batel",uniBatel);

        Professor robertoCarlos = new Professor("roberto carlos","123453",1234421,"hc","solteiro","rua carloa geremias",pumpGymBatel,"manha",1200f);

        Plano famila = new Plano("plano famila",120,true);

       Aluno enrique = new Aluno("enrique", "164.545.535-54" ,10031999,"masculino", "solteiro","rua luiz fernandes ,65", pumpGymBatel, a_b_ciniciante,robertoCarlos,famila);

       enrique.realizouTreino();
       robertoCarlos.criarTreino("reino de peito","ABC_intermediario");
       robertoCarlos.alterarTreinoDoAluno(enrique,a_b_ciniciante);
       enrique.pagarMensalidade();



        Treino costa = new Treino("Superiores", "Costas");
        System.out.println(costa.tipo());
        // Academia smartfit = new Academia()15'x

    }
}