public abstract class MedioPago {
    private String titular;
    private String moneda;


    public MedioPago(String titular, String moneda) {
    this.titular = titular;
    this.moneda = moneda;
    }


    public abstract void procesarCobro(double monto);

    public void mostrarInfoBase() {
        System.out.println("Titular: " + titular + " | Moneda: " + moneda);
    }

}
