public class PagoCriptomoneda extends MedioPago {
    private String redBlockchain;
    private String direccionWallet;
    private String moneda;

    public PagoCriptomoneda(String titular, String moneda, String direccionWallet, String redBlockchain) {
        super(titular, moneda);
        this.direccionWallet = direccionWallet;
        this.redBlockchain = redBlockchain;
    }

    @Override
    public void procesarCobro(double monto) {
        System.out.println("--- COMPROBANTE: CRIPTOMONEDA ---");
        mostrarInfoBase();
        System.out.println("Wallet destino: " + direccionWallet.substring(0, 6) + "..." + " | Red: " + redBlockchain);
        System.out.println("Monto transferido: " + moneda + " " + monto);
        System.out.println("Estado: Confirmado en la blockchain con éxito.\n----------------------------------------");
    }

}
