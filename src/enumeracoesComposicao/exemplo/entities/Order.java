package enumeracoesComposicao.exemplo.entities;

import java.util.Date;

import enumeracoesComposicao.exemplo.entitiesEnums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(){
    }

    public Order(Integer id, Date date, OrderStatus status) {

        this.id = id;
        this.moment = date;
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String toString() {
        return "Order: \n" + "id = " + id + ", moment: " + moment + ", status = " + status;
    }
}


