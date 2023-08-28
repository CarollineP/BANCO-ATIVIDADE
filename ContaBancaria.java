class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    
    public ContaBancaria(double saldoInicial, double limiteChequeEspecial) {
        saldo = saldoInicial;
        this.limiteChequeEspecial = limiteChequeEspecial; 
    }
    
    public void realizarSaque(double valorSaque) {
        // método explicado na questão A
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    
    // outros exemplos de métodos
}


