package Model;

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

//    public static class Plano {
//        protected String nomePlano;
//        protected float valorPlano;
//        protected boolean statusPagamento;
//
//        public Plano(String nomePlano, float valorPlano, boolean statusPagamento) {
//            this.nomePlano = nomePlano;
//            this.valorPlano = valorPlano;
//            this.statusPagamento = statusPagamento;
//        }
//    }
}
