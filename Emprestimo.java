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

    // Getters e Setters
    public String getNumeroEmprestimo() {
        return numeroEmprestimo;
    }

    public void setNumeroEmprestimo(String numeroEmprestimo) {
        this.numeroEmprestimo = numeroEmprestimo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método: calcular valor total a pagar com juros compostos
    public double calcularValorTotal() {
        return valor * Math.pow(1 + taxaJuros, parcelas);
    }

    // Método: calcular valor da parcela
    public double calcularValorParcela() {
        return calcularValorTotal() / parcelas;
    }

    // Método: resumo do empréstimo
    public String toString() {
        return "Emprestimo{" +
                "numeroEmprestimo='" + numeroEmprestimo + '\'' +
                ", valor=" + valor +
                ", parcelas=" + parcelas +
                ", taxaJuros=" + taxaJuros +
                ", dataContratacao='" + dataContratacao + '\'' +
                ", cliente=" + cliente.getNome() + 
                ", status='" + status + '\'' +
                ", valorTotal=" + String.format("%.2f", calcularValorTotal()) +
                '}';
    }
}