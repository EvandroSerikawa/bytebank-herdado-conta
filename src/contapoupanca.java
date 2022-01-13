public class contapoupanca extends conta03{


    public contapoupanca(int agencia , int conta ) {

        super(agencia, conta);// Contrutor padrão da classe mãe
    }

    @Override
    public void deposita(double valor) {
    //    super.getSaldo() += valor;
    }
}
