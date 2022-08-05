package com.food.ordering.system.order.service.domain.valueobject;


import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class StreetAddress {
    private final UUID id;
    private final String street;
    private final String postalCode;
    private final String city;

    public StreetAddress(UUID id, String street, String postalCode, String city) {
        this.id = id;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StreetAddress)) return false;
        StreetAddress that = (StreetAddress) o;
        return Objects.equals(id, that.id) && Objects.equals(street, that.street) && Objects.equals(postalCode, that.postalCode) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, street, postalCode, city);
    }





}
