package Enumeracoes.enitites;

import Enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private int id;
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(int id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", moment=" + moment + ", status=" + status + '}';
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
}
