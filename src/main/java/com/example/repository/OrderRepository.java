package com.example.repository;

import com.example.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = """
        SELECT u.name, COUNT(o.id) AS total_order, SUM(o.total) AS total_amount
        FROM users u
        JOIN orders o ON u.id = o.user_id
        WHERE u.status = 'ACTIVE'
        GROUP BY u.name
        HAVING SUM(o.total) > :minAmount
        """, nativeQuery = true)
    List<Object[]> findActiveUserOrderSummary(@Param("minAmount") BigDecimal minAmount);
}