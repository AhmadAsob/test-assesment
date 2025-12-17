package com.example.service;

import com.example.dto.UserOrderSummaryDTO;
import com.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderAnalyticsService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderAnalyticsService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<UserOrderSummaryDTO> getSummary(BigDecimal minAmount) {
        return orderRepository.findActiveUserOrderSummary(minAmount)
                .stream()
                .map(row -> {
                    String userName = (String) row[0];
                    int totalOrder = row[1] != null ? ((Number) row[1]).intValue() : 0;
                    BigDecimal totalAmount = row[2] != null ? (BigDecimal) row[2] : BigDecimal.ZERO;

                    return new UserOrderSummaryDTO(userName, totalOrder, totalAmount);
                })
                .sorted(Comparator.comparing(UserOrderSummaryDTO::getTotalAmount, Comparator.nullsFirst(BigDecimal::compareTo)).reversed())
                .collect(Collectors.toList());
    }
}

