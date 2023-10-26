import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Endereco {
    protected String rua;
    protected int numero;
    protected String complemento;
    protected String bairro;
    protected String cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }
}
