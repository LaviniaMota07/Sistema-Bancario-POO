/// A contaCorrente é herança de Conta

public class ContaCorrente {
    private String numeroConta;
    private double limiteChequeEspecial;
    private String titular;
    private double saldo;
    private String dataAbertura;
    private String ativa;
    private String agenda;

    public ContaCorrente(String numeroConta, double limiteChuqueEspecial, String itular, double saldo, String dataAbertura, String ativa, String agenda){
        this.numeroConta = numeroConta;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.ativa = ativa;
        this.agenda = agenda;
    }
}
