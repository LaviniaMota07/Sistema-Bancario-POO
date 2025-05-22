public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String numeroConta;

    public Cliente(String nome, String cpf, String endereco, String telefone, String email, String dataNascimento, String numeroConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.numeroConta = numeroConta;
    }
}
