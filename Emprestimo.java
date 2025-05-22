public class Emprestimo {
    String numeroEmprestimo;
    double valor;
    int parcelas;
    double taxaJuros;
    String dataContratacao;
    Cliente cliente;
    String status;

    public Emprestimo(String numeroEmprestimo, double valor, int parcelas, double taxaJuros, String dataContratacao, Cliente cliente, String status) {
        this.numeroEmprestimo = numeroEmprestimo;
        this.valor = valor;
        this.parcelas = parcelas;
        this.taxaJuros = taxaJuros;
        this.dataContratacao = dataContratacao;
        this.cliente = cliente;
        this.status = status;
    }
}
