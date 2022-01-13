public class contacorrente extends conta03{

    public contacorrente( int agencia , int conta ){
        super( agencia , conta );// Contrutor padrão da classe mãe
    }

    @Override // Reescrevendo o método gerado na classe mãe
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
     //   super.getSaldo() += valor;
    }
}
