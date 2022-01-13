public class testecontas {
    public static void main(String[] args) {

        contacorrente novaContaCorrente = new contacorrente(15234 , 26362);
        novaContaCorrente.deposita(100);

        contapoupanca novaContapoupanca = new contapoupanca( 15958 , 29879);
        novaContapoupanca.deposita(100);

        novaContaCorrente.transfere(10 , novaContapoupanca );
        System.out.println("\nTransferência executada com sucesso.");
        System.out.println("Saldo da conta destino: " + novaContapoupanca.getSaldo());

        System.out.println("\nSaldo da conta origem:" + novaContaCorrente.getSaldo());

    }
}
