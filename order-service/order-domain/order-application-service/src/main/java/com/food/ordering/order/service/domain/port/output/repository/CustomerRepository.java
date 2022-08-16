package com.food.ordering.order.service.domain.port.output.repository;

import com.food.ordering.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);

}
