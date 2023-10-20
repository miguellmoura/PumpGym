import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Plano {
    private String nomePlano;
    private float valorPlano;
    private boolean statusPagamento;

    public Plano(String nomePlano, float valorPlano, boolean statusPagamento) {
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
        this.statusPagamento = statusPagamento;
    }
}
