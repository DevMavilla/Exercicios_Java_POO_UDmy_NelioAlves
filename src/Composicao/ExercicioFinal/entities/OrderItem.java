package Composicao.ExercicioFinal.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product name;

    public OrderItem(Integer quantity, Double price, Product name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderItem() {
    }

    public void subTotal(Double price, Integer quantity){
        Double subTotal = price * quantity;
    }
}
