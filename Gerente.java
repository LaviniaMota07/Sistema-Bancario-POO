public class Gerente {
    String nome;
    String matricula;
    String email;
    String telefone;
    String agencia;
    String cargo;
    double salario;

    public Gerente(String nome, String matricula, String email, String telefone, String agencia, String cargo, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
        this.agencia = agencia;
        this.cargo = cargo;
        this.salario = salario;
    }

     // Método para transferir para outra agência
    public void transferirAgencia(String novaAgencia) {
        this.agencia = novaAgencia;
        System.out.println(this.nome + " foi transferido para a agência: " + novaAgencia);
    }

    // Método para alterar o cargo
    public void alterarCargo(String novoCargo) {
        this.cargo = novoCargo;
        System.out.println(this.nome + " agora ocupa o cargo: " + novoCargo);
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Agência: " + agencia);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
