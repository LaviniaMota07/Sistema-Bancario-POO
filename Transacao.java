public class Transacao {
    String numeroTransacao;
    double valor;
    String data;
    String tipo;
    String contaOrigem;
    String contaDestino;
    String status;

    public Transacao(String numeroTransacao, double valor, String data, String tipo, String contaOrigem, String contaDestino, String status) {
        this.numeroTransacao = numeroTransacao;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.status = status;
    }

    // Método para exibir os detalhes da transação
    public void exibirTransacao() {
        System.out.println("Número da Transação: " + numeroTransacao);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Tipo: " + tipo);
        System.out.println("Conta Origem: " + contaOrigem);
        System.out.println("Conta Destino: " + contaDestino);
        System.out.println("Status: " + status);
    }

    // Método para atualizar o status da transação
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    // Método para verificar se a transação foi concluída
    public boolean estaConcluida() {
        return this.status.equalsIgnoreCase("Concluída");
    }
}
