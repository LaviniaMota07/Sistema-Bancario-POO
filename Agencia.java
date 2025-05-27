public class Agencia { // Abaixo se encontram os atributos da classe
    private String numero;
    private String nome;
    private String endereco;
    private String telefone;
    private String gerente;
    private String cidade;
    private String estado;

        //Abaixo se econtra o construtor
        public Agencia (String numero, String nome, String endereco, String telefone, String gerente, String cidade, String estado){
        this.numero = numero;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerente = gerente;
        this.cidade = cidade;
        this.estado = estado;
    }

    //Getters e Setters para alterar ou identificar
      public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Adicionando um Método toString abaixo
    public String toString() {
        return "Agencia{" +
                "numero='" + numero + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", gerente='" + gerente + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}


