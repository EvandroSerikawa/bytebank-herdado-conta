public abstract  class conta03 {

    private double saldo;
    private int agencia;
    private int conta;
    private cliente03 titular;
    private static int total = 0;

    public conta03(){
        // Construtor padrão para não dar erro nos proximos objetos instanciados com herança dessa classe mãe.
    }

    public conta03( int agencia , int conta ){
        conta03.total ++;
        System.out.println("O total de contas abertas é: " + conta03.total);
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 100;
        System.out.println("Seguem os dados da conta criada" + this.agencia + this.conta);
    }

    public abstract void deposita( double valor );//{
//        this.saldo = this.saldo + valor; - Método abstrato não tem implementação
//    }

    public boolean saca ( double valor ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

        public boolean transfere(double valor, conta03 destino){
            if( this.saca(valor)){
                destino.deposita(valor);
                return true;
            }else{
                return false;
            }
        }


    public double getSaldo() {
        return saldo ;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public cliente03 getTitular() {
        return titular;
    }

    public void setTitular(cliente03 titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        conta03.total = total;
    }


}
