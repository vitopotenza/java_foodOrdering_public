package com.food.ordering.order.service.domain.port.output.repository;

import com.food.ordering.order.service.domain.valueobject.TrackingId;
import com.food.ordering.order.service.domain.entity.Order;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);



}
