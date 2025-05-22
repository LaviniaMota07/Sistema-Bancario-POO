public class Conta {
    private String numeroConta;
    private String saldo;
    private String agencia;
    private String status;
    private String dataAbertura;
    private String Cliente;
    private String tipoConta;

    public Conta (String numeroConta, String saldo, String agencia, String status, String dataAbertura, String Cliente, String tipoConta){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.status = status;
        this.dataAbertura = dataAbertura;
        this.Cliente = Cliente;
        this.tipoConta = tipoConta;
    }
}
