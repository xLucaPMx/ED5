public class Pedido {

    private Cliente cliente;  // Relación con el Cliente

    // Constructor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter y Setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método unificado para procesar el pedido
    public void procesarPedido(double total) {
        double descuento = 0;

        // Aplicamos un descuento diferente dependiendo de si el cliente es VIP o no
        if (cliente.isEsVip()) {
            descuento = total * 0.15;  // 15% de descuento para clientes VIP
            System.out.println("Pedido VIP aprobado.");
        } else {
            if (total > 100) {
                descuento = total * 0.10;  // 10% de descuento para clientes no VIP si el total es mayor a 100
                System.out.println("Pedido aprobado con descuento.");
            } else {
                System.out.println("Pedido aprobado.");
            }
        }

        double precioFinal = total - descuento;
        System.out.println("Total: " + precioFinal + " (descuento aplicado: " + descuento + ")");
    }
}

