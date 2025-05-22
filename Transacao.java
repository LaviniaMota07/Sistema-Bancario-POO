public class Transacao {
    String numeroTransacao;
    double valor;
    String data;
    String tipo;
    String contaOrigem;
    String contaDestino;
    String status;

    public Transacao(String numeroTransacao, double valor, String data, String tipo, String contaOrigem, String contaDestino, String status) {
        this.numeroTransacao = numeroTransacao;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.status = status;
    }
}
