import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Endereco {
    protected String rua;
    protected String numero;
    protected String complemento;
    protected String bairro;
    protected String cep;

    public Endereco(String rua, String numero, String complemento, String bairro, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }
}
