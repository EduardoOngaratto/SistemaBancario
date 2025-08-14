public class Main {
    public static void main(String[] args) {

    ContaBancaria eduardo = new ContaBancaria();
    eduardo.setNome("Eduardo");
    eduardo.depositar(250.0);
    eduardo.sacar(200.0);

    ContaBancaria joao = new ContaBancaria();
    joao.depositar(2500.0);

    joao.trasnferir(1000.0, eduardo);


    System.out.println(eduardo.getSaldo());

    }
}