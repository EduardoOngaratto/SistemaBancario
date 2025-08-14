public class ContaBancaria {

    private String nome;
    private String cpf;
    private Double saldo = 0.0;

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
        }
        this.saldo -= valor;
        System.out.println("Valor sacado: " + valor + " | Saldo atual: " + this.saldo);
    }

    public void trasnferir(Double valor, ContaBancaria conta){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente para transferir");
        }
        this.saldo -= valor;
        conta.depositar(valor);
        System.out.println("Valor Transferido para " + conta.getNome() + " | Saldo atual: " + this.saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
