public class Conta {
    private String numeroConta;
    private double saldo;
    private String agencia;
    private String status;
    private String dataAbertura;
    private String Cliente;
    private String tipoConta;

    public Conta (String numeroConta, double saldo, String agencia, String status, String dataAbertura, String Cliente, String tipoConta){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.status = status;
        this.dataAbertura = dataAbertura;
        this.Cliente = Cliente;
        this.tipoConta = tipoConta;
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getStatus() {
        return status;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    // Setters
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    //Métodos
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void consultarSaldo() { // Método para ser usado no submenu A
        System.out.println("Saldo atual: R$ " + this.saldo);
    }

    // Método toString
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo='" + saldo + '\'' +
                ", agencia='" + agencia + '\'' +
                ", status='" + status + '\'' +
                ", dataAbertura='" + dataAbertura + '\'' +
                ", cliente='" + Cliente + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }
}
