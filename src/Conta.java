public class Conta {
    
    private float limite_de_saque;
    private float saldo;
    private float limite_de_credito;

    Cliente cliente = new Cliente();
    
    public Conta() {
        limite_de_saque = 500;
        saldo = 2000;
        limite_de_credito = 2000;
   }
    
   public Conta(float limite_de_saque, float saldo) {
        this.limite_de_saque = limite_de_saque;
        this.saldo = saldo;
    }
    
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

    public float getLimite_de_credito() {
        return limite_de_credito;
    }

    public void setLimite_de_credito(float limite_de_credito) {
        this.limite_de_credito = limite_de_credito;
    }

    

    
}
