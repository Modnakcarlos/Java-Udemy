package enumeracoesComposicao.exemplo.application;

import java.util.Date;

import enumeracoesComposicao.exemplo.entities.Order;
import enumeracoesComposicao.exemplo.entitiesEnums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
