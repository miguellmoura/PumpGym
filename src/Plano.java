import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Plano {
    protected String nomePlano;
    protected float valorPlano;
    protected boolean statusPagamento;

    public Plano(String nomePlano, float valorPlano, boolean statusPagamento) {
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
        this.statusPagamento = statusPagamento;
    }
}
