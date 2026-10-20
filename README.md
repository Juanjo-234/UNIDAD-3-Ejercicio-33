Este programa está diseñado para modelar un sistema jerárquico de medios de pago y procesamiento de transacciones aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, clases y métodos abstractos (polimorfismo estricto mediante @Override), y la reutilización de código a través de constructores parametrizados en la clase padre.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base abstracta MedioPago: Establece los atributos comunes a cualquier método de pago (titular y moneda), junto con un constructor centralizado y un método abstracto obligatorio procesarCobro(double monto), garantizando que toda subclase implemente su propia regla de procesamiento financiero.

Desarrolla las clases hijas (PagoTarjetaDebito, PagoCriptomoneda y PagoBilleteraVirtual): Extienden de MedioPago incorporando sus atributos particulares y especializados (número de tarjeta y clave interbancaria; dirección de wallet y red blockchain; alias y límite diario de transacciones).

Utiliza super(...): Garantiza la correcta inicialización de los atributos heredados invocando al constructor parametrizado de la clase superior desde cada subclase.

Ejecuta la prueba en el main: Crea una colección mixta y polimórfica (List<MedioPago>), recorre los diferentes medios de pago ejecutando transacciones de cobro especializadas y muestra los comprobantes detallados por consola.
