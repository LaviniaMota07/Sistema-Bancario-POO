//A ContaPoupança é herança da Conta

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
    
}
