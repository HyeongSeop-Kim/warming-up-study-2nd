package sample.cafekiosk.spring.api.controller.order.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@NoArgsConstructor
public class OrderCreateServiceRequest {

    @NotEmpty(message = "상품 번호 리스트는 필수입니다.")
    private List<String> productNumbers;

    @Builder
    public OrderCreateServiceRequest(List<String> productNumbers) {
        this.productNumbers = productNumbers;
    }

    public sample.cafekiosk.spring.api.service.order.request.OrderCreateServiceRequest toServiceRequest() {
        return sample.cafekiosk.spring.api.service.order.request.OrderCreateServiceRequest.builder()
                .productNumbers(productNumbers)
                .build();
    }
}
