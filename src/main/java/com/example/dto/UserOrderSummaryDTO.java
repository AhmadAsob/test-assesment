package com.example.dto;

import java.math.BigDecimal;

public class UserOrderSummaryDTO {
    private String userName;
    private int totalOrder;
    private BigDecimal totalAmount;

    public UserOrderSummaryDTO(String userName, int totalOrder, BigDecimal totalAmount) {
        this.userName = userName;
        this.totalOrder = totalOrder;
        this.totalAmount = totalAmount;
    }

    public String getUserName() {
        return userName;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
