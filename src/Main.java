//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<MedioPago> pasarelaPagos = new ArrayList<>();

    pasarelaPagos.add(new PagoTarjetaDebito("Lucía Martínez", "ARS", "4532-8800-1234-9988", "CLV-998877"));
    pasarelaPagos.add(new PagoCriptomoneda("Marcos Pérez", "USDT", "0x71C...35A9", "Ethereum (ERC-20)"));
    pasarelaPagos.add(new PagoBilleteraVirtual("Sofía Benítez", "ARS", "sofia.mp.benitez", 150000.0));

    System.out.println("=== PASARELA DE PAGOS - TRANSACCIONES POLIMÓRFICAS ===\n");
    for (MedioPago pago : pasarelaPagos) {
        pago.procesarCobro(75000.0);
    }
}

