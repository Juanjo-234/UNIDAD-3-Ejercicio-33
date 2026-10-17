public class PagoTarjetaDebito extends MedioPago{
    private String numeroTarjeta;
    private String claveInterbancaria;
    private String moneda;

    public PagoTarjetaDebito(String titular, String moneda, String numeroTarjeta, String claveInterbancaria){
        super(titular, moneda);
        this.numeroTarjeta = numeroTarjeta;
        this.claveInterbancaria = claveInterbancaria;
    }

    @Override
    public void procesarCobro(double monto) {
        System.out.println("--- COMPROBANTE: TARJETA DE DÉBITO ---");
        mostrarInfoBase();
        System.out.println("Tarjeta terminada en: ..." + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.println("Monto debitado: " + moneda + " " + monto);
        System.out.println("Estado: Transacción aprobada vía red bancaria.\n----------------------------------------");
    }


}
