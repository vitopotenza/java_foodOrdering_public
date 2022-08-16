package com.food.ordering.order.service.domain.port.input.message.listener.restaurantapproval;

import com.food.ordering.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMsgListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);


}
