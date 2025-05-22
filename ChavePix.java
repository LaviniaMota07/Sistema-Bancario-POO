public class ChavePix {
    String chave;
    String tipo;
    Cliente cliente;
    String dataCriacao;
    String status;
    String banco;
    String agencia;

    public ChavePix(String chave, String tipo, Cliente cliente, String dataCriacao, String status, String banco, String agencia) {
        this.chave = chave;
        this.tipo = tipo;
        this.cliente = cliente;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.banco = banco;
        this.agencia = agencia;
    }
}
