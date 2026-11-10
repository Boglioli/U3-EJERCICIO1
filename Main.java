public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("juan perez",12334566 , 50000);
        cuenta.MostrarInformacion();
        System.out.println();
        cuenta.depositar(20000);
        cuenta.extraer(10000);
        cuenta.extraer(100000);
        cuenta.depositar(-5000);
        System.out.println();
        cuenta.MostrarInformacion();

    }
}
