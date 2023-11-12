package com.segurostupapa.app;
import com.segurostupapa.app.StripePayment.application.CreatePayment;
import com.segurostupapa.app.StripePayment.application.CreatePaymentResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @PostMapping("/create-payment-intent")
    public CreatePaymentResponse createPayment(@RequestBody CreatePayment createPayment) throws StripeException {
        PaymentIntentCreateParams params =
                    PaymentIntentCreateParams.builder()
                            .setAmount(15*100L) // createPayment... what product does user want to boy... how much does
                            // product cost ($15,00)
                            .setCurrency("usd")
                            // In the latest version of the API, specifying the `automatic_payment_methods` parameter is
                            // optional because Stripe enables its functionality by default.
                            .setAutomaticPaymentMethods(
                                    PaymentIntentCreateParams.AutomaticPaymentMethods
                                            .builder()
                                            .setEnabled(true)
                                            .build()
                            )
                            .build();

            // Create a PaymentIntent with the order amount and currency
            PaymentIntent paymentIntent = PaymentIntent.create(params);

            return new CreatePaymentResponse(paymentIntent.getClientSecret());
    }
}
