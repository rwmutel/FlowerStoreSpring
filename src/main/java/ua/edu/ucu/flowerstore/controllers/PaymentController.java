package ua.edu.ucu.flowerstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.flowerstore.order.payments.CreditCardPayment;
import ua.edu.ucu.flowerstore.order.payments.PayPalPayment;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="api/v1/payments")
public class PaymentController {
    @GetMapping
    public List<Map> getPaymentDetails() {
        return List.of(new PayPalPayment().getDetails(),
                new CreditCardPayment().getDetails());
    }
}
