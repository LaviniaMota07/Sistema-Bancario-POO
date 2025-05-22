public class Cartao {
    String numeroCartao;
    String validade;
    String CVV;
    String bandeira;
    String tipo;
    Cliente cliente;
    double limite;

    public Cartao(String numeroCartao, String validade, String CVV, String bandeira, String tipo, Cliente cliente, double limite) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.CVV = CVV;
        this.bandeira = bandeira;
        this.tipo = tipo;
        this.cliente = cliente;
        this.limite = limite;
    }
}
