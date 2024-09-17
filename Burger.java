public class Burger extends Produto {
    private int gramas;

    public Burger(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + gramas + "g";
    }
}
