// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Inicial tela1= new Inicial();
        tela1.setVisible(true);

        AddAlunos novoaluon = new AddAlunos();
        novoaluon.setVisible(true);


        Treino costa = new Treino("Superiores", "Costas");
        System.out.println(costa.tipo());
        // Academia smartfit = new Academia()15'x

    }
}