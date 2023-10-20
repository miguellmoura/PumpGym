import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }
}
