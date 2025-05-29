public class ContaPoupanca {
    private String numeroConta;
    private double taxaJuros;
    private String titular;
    private double saldo;
    private String dataAbertura;
    private String ativa;
    private String agenda;

    public ContaPoupanca(String numeroConta, double taxaJuros, String titular, double saldo, String dataAbertura, String ativa, String agenda){
        this.numeroConta = numeroConta;
        this.taxaJuros = taxaJuros;
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.ativa = ativa;
        this.agenda = agenda;
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public String getAtiva() {
        return ativa;
    }

    public String getAgenda() {
        return agenda;
    }

    // Setters
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    // Métodos adicionais
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros / 100;
        System.out.println("Juros aplicados com sucesso!");
    }
}
