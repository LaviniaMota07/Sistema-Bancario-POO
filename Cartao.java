public class Cartao {
    private String numeroCartao;
    private String validade;
    private String CVV;
    private String bandeira;
    private String tipo; // Crédito, Débito, etc.
    Cliente cliente;
    private double limite;

    // Construtor
    public Cartao(String numeroCartao, String validade, String CVV, String bandeira, String tipo, Cliente cliente, double limite) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.CVV = CVV;
        this.bandeira = bandeira;
        this.tipo = tipo;
        this.cliente = cliente;
        this.limite = limite;
    }

    // Getters e Setters
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getValidade() {
        return validade;
    }

    public String getCVV() {
        return CVV;
    }

    public String getBandeira() {
        return bandeira;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método para exibir informações do cartão
    public void exibirInformacoes() {
        System.out.println("Cartão: " + numeroCartao);
        System.out.println("Validade: " + validade);
        System.out.println("CVV: " + CVV);
        System.out.println("Bandeira: " + bandeira);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cliente: " + cliente.getNome()); // Assumindo que Cliente tem getNome()
        System.out.println("Limite: R$ " + limite);
    }

    // Método para aumentar o limite
    public void aumentarLimite(double valor) {
        if (valor > 0) {
            this.limite += valor;
            System.out.println("Limite aumentado em R$ " + valor);
        } else {
            System.out.println("Valor inválido para aumento de limite.");
        }
    }

    // Método para reduzir o limite
    public void reduzirLimite(double valor) {
        if (valor > 0 && this.limite >= valor) {
            this.limite -= valor;
            System.out.println("Limite reduzido em R$ " + valor);
        } else {
            System.out.println("Valor inválido para redução de limite.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Cartao{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", validade='" + validade + '\'' +
                ", CVV='" + CVV + '\'' +
                ", bandeira='" + bandeira + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cliente=" + cliente.getNome() +  // Assumindo que Cliente tem getNome()
                ", limite=" + limite +
                '}';
    }
}
