public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000, 500);
        
        conta.realizarSaque(800);
        System.out.println("Saldo: $" + conta.getSaldo() + ", Limite Cheque Especial: $" + conta.getLimiteChequeEspecial());
        
        conta.realizarSaque(400);
        System.out.println("Saldo: $" + conta.getSaldo() + ", Limite Cheque Especial: $" + conta.getLimiteChequeEspecial());
        
        conta.realizarSaque(800);
        System.out.println("Saldo: $" + conta.getSaldo() + ", Limite Cheque Especial: $" + conta.getLimiteChequeEspecial());
    }
}
