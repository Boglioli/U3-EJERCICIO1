public class CuentaBancaria {
    private String titular;
    private int NumeroCuenta;
    private int Saldo;


public CuentaBancaria(String titular, int NumeroCuenta, int Saldo) {
    this.titular = titular;
    this.NumeroCuenta = NumeroCuenta;
    if (Saldo >= 0) {
        this.Saldo = Saldo;
    } else {
        this.Saldo = 0;
    }
}

public String getTitular() {
    return titular;
}
public int getNumeroCuenta() {
    return NumeroCuenta;
    }
    public double getSaldo() {
    return Saldo;
    }
    public void depositar(int monto) {

    if (monto > 0) {
        Saldo = Saldo + monto;
        System.out.println("desposito realizado: $ " + monto);
    } else {

        System.out.println("error el numero debe ser mayor a cero");
    }
    }
    public void extraer(int monto) {
    if (monto <= 0) {
        System.out.println("error el numero debe ser cero");
    } else if (monto > Saldo) {
        System.out.println("error el numero debe ser cero");
    } else {
        Saldo = Saldo - monto;
        System.out.println("retiro exitoso: $" + monto);
    }
    }
    public void MostrarInformacion() {
    System.out.println("titular: " + titular);
    System.out.println("numero de cuenta: " + NumeroCuenta);
    System.out.println(" saldo actual: " + Saldo);
    }


}

