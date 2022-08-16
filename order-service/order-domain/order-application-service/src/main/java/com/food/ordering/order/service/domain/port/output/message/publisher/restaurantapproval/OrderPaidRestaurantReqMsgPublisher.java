package com.food.ordering.order.service.domain.port.output.message.publisher.restaurantapproval;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantReqMsgPublisher extends DomainEventPublisher<OrderPaidEvent> {
}
