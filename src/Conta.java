public class Conta {
    
    private float limite_de_saque = 1000;
    private float saldo = 25000;

    Cliente cliente = new Cliente();

    public float getLimite_de_saque() {
        return limite_de_saque;
    }
    public void setLimite_de_saque(float limite_de_saque) {
        this.limite_de_saque = limite_de_saque;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
}
