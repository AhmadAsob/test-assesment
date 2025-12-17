package com.example.controller;

import com.example.dto.UserOrderSummaryDTO;
import com.example.service.OrderAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderAnalyticsService analyticsService;

    @GetMapping("/summary")
    public List<UserOrderSummaryDTO> summary(
            @RequestParam BigDecimal minAmount) {
        return analyticsService.getSummary(minAmount);
    }
}
