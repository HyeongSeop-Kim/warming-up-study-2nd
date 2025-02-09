package sample.cafekiosk.spring.api.controller.order.orderProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.cafekiosk.spring.domain.orderProduct.OrderProduct;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
