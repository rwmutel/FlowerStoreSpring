package ua.edu.ucu.flowerstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.flowerstore.order.payments.CreditCardPayment;
import ua.edu.ucu.flowerstore.order.payments.PayPalPayment;
import ua.edu.ucu.flowerstore.order.payments.Payment;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/payments")
public class PaymentController {
    @GetMapping
    public List<String> demoPayments() {
        return List.of(new PayPalPayment().getDetails().get(0),
                new CreditCardPayment().getDetails().get(0));
    }
}
