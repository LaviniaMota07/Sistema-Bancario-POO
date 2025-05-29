public class ChavePix {
    private String chave;
    private String tipo;
    private Cliente cliente;
    private String dataCriacao;
    private String status;
    private String banco;
    private String agencia;

    public ChavePix(String chave, String tipo, Cliente cliente, String dataCriacao, String status, String banco, String agencia) {
        this.chave = chave;
        this.tipo = tipo;
        this.cliente = cliente;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.banco = banco;
        this.agencia = agencia;
    }

    // Getters e Setters
    public String getChave() {
        return chave;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getStatus() {
        return status;
    }

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Método toString
    public String toString() {
        return "ChavePix{" +
                "chave='" + chave + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cliente=" + cliente.getNome() +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", status='" + status + '\'' +
                ", banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                '}';
    }
}
