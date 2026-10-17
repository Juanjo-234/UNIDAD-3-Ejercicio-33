public class PagoBilleteraVirtual extends  MedioPago{
    private String alias;
    private double limiteDiario;
    private String moneda;

    public PagoBilleteraVirtual(String titular, String moneda, String alias, double limiteDiario) {
        super(titular, moneda);
        this.alias = alias;
        this.limiteDiario = limiteDiario;
    }

    @Override
    public void procesarCobro(double monto) {
        System.out.println("--- COMPROBANTE: BILLETERA VIRTUAL ---");
        mostrarInfoBase();
        System.out.println("Alias de cobro: " + alias);
        if (monto <= limiteDiario) {
            System.out.println("Monto pagado: " + moneda + " " + monto);
            System.out.println("Estado: Pago instantáneo procesado correctamente.\n----------------------------------------");
        } else {
            System.out.println("Monto solicitado: " + moneda + " " + monto);
            System.out.println("Estado: Rechazado. Supera el límite diario configurado.\n----------------------------------------");
        }
    }
}
