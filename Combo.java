public class Combo {
    private Burger burger;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                this.burger = new Burger("Burger Master", 15.00, 200);
                this.sobremesa = new Sobremesa("Torta de Limão", 8.00, "Média");
                this.bebida = new Bebida("Refrigerante", 5.00, 500);
                break;
            case 2:
                this.burger = new Burger("Burger Super", 20.00, 250);
                this.sobremesa = new Sobremesa("Brownie", 7.00, "Pequena");
                this.bebida = new Bebida("Suco Natural", 6.00, 300);
                break;
            default:
                throw new IllegalArgumentException("Tipo de combo inválido");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Combo:\n");
        if (burger != null) sb.append(burger).append("\n");
        if (sobremesa != null) sb.append(sobremesa).append("\n");
        if (bebida != null) sb.append(bebida).append("\n");
        return sb.toString();
    }
}

