package com.food.ordering.order.service.domain.port.input.message.listener.payment;

import com.food.ordering.order.service.domain.dto.message.PaymentResponse;

import javax.validation.Valid;

public interface PaymentResponseMessageListener {

    void paymentCompleted(@Valid PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);
}
