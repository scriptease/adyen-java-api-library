/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.checkout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.checkout.CreatePaymentAmountUpdateRequest;
import com.adyen.model.checkout.CreatePaymentCancelRequest;
import com.adyen.model.checkout.CreatePaymentCaptureRequest;
import com.adyen.model.checkout.CreatePaymentRefundRequest;
import com.adyen.model.checkout.CreatePaymentReversalRequest;
import com.adyen.model.checkout.CreateStandalonePaymentCancelRequest;
import com.adyen.model.checkout.PaymentAmountUpdateResource;
import com.adyen.model.checkout.PaymentCancelResource;
import com.adyen.model.checkout.PaymentCaptureResource;
import com.adyen.model.checkout.PaymentRefundResource;
import com.adyen.model.checkout.PaymentReversalResource;
import com.adyen.model.checkout.ServiceError;
import com.adyen.model.checkout.StandalonePaymentCancelResource;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ModificationsApi extends Service {
    private final String baseURL;

    public ModificationsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://checkout-test.adyen.com/v70");
    }

    /**
    * Cancel an authorised payment
    *
    * @param createStandalonePaymentCancelRequest {@link CreateStandalonePaymentCancelRequest }  (required)
    * @return {@link StandalonePaymentCancelResource }
    * @throws ApiException if fails to make API call
    */
    public StandalonePaymentCancelResource cancelAuthorisedPayment(CreateStandalonePaymentCancelRequest createStandalonePaymentCancelRequest) throws ApiException, IOException {
        return cancelAuthorisedPayment(createStandalonePaymentCancelRequest, null);
    }

    /**
    * Cancel an authorised payment
    *
    * @param createStandalonePaymentCancelRequest {@link CreateStandalonePaymentCancelRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link StandalonePaymentCancelResource }
    * @throws ApiException if fails to make API call
    */
    public StandalonePaymentCancelResource cancelAuthorisedPayment(CreateStandalonePaymentCancelRequest createStandalonePaymentCancelRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = createStandalonePaymentCancelRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/cancels", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return StandalonePaymentCancelResource.fromJson(jsonResult);
    }

    /**
    * Update an authorised amount
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment. (required)
    * @param createPaymentAmountUpdateRequest {@link CreatePaymentAmountUpdateRequest }  (required)
    * @return {@link PaymentAmountUpdateResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentAmountUpdateResource updateAuthorisedAmount(String paymentPspReference, CreatePaymentAmountUpdateRequest createPaymentAmountUpdateRequest) throws ApiException, IOException {
        return updateAuthorisedAmount(paymentPspReference, createPaymentAmountUpdateRequest, null);
    }

    /**
    * Update an authorised amount
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment. (required)
    * @param createPaymentAmountUpdateRequest {@link CreatePaymentAmountUpdateRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentAmountUpdateResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentAmountUpdateResource updateAuthorisedAmount(String paymentPspReference, CreatePaymentAmountUpdateRequest createPaymentAmountUpdateRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = createPaymentAmountUpdateRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/amountUpdates", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentAmountUpdateResource.fromJson(jsonResult);
    }

    /**
    * Cancel an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to cancel.  (required)
    * @param createPaymentCancelRequest {@link CreatePaymentCancelRequest }  (required)
    * @return {@link PaymentCancelResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentCancelResource cancelAuthorisedPaymentByPspReference(String paymentPspReference, CreatePaymentCancelRequest createPaymentCancelRequest) throws ApiException, IOException {
        return cancelAuthorisedPaymentByPspReference(paymentPspReference, createPaymentCancelRequest, null);
    }

    /**
    * Cancel an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to cancel.  (required)
    * @param createPaymentCancelRequest {@link CreatePaymentCancelRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentCancelResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentCancelResource cancelAuthorisedPaymentByPspReference(String paymentPspReference, CreatePaymentCancelRequest createPaymentCancelRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = createPaymentCancelRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/cancels", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentCancelResource.fromJson(jsonResult);
    }

    /**
    * Capture an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to capture. (required)
    * @param createPaymentCaptureRequest {@link CreatePaymentCaptureRequest }  (required)
    * @return {@link PaymentCaptureResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentCaptureResource captureAuthorisedPayment(String paymentPspReference, CreatePaymentCaptureRequest createPaymentCaptureRequest) throws ApiException, IOException {
        return captureAuthorisedPayment(paymentPspReference, createPaymentCaptureRequest, null);
    }

    /**
    * Capture an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to capture. (required)
    * @param createPaymentCaptureRequest {@link CreatePaymentCaptureRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentCaptureResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentCaptureResource captureAuthorisedPayment(String paymentPspReference, CreatePaymentCaptureRequest createPaymentCaptureRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = createPaymentCaptureRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/captures", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentCaptureResource.fromJson(jsonResult);
    }

    /**
    * Refund a captured payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to refund. (required)
    * @param createPaymentRefundRequest {@link CreatePaymentRefundRequest }  (required)
    * @return {@link PaymentRefundResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentRefundResource refundCapturedPayment(String paymentPspReference, CreatePaymentRefundRequest createPaymentRefundRequest) throws ApiException, IOException {
        return refundCapturedPayment(paymentPspReference, createPaymentRefundRequest, null);
    }

    /**
    * Refund a captured payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to refund. (required)
    * @param createPaymentRefundRequest {@link CreatePaymentRefundRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentRefundResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentRefundResource refundCapturedPayment(String paymentPspReference, CreatePaymentRefundRequest createPaymentRefundRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = createPaymentRefundRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/refunds", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentRefundResource.fromJson(jsonResult);
    }

    /**
    * Refund or cancel a payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to reverse.  (required)
    * @param createPaymentReversalRequest {@link CreatePaymentReversalRequest }  (required)
    * @return {@link PaymentReversalResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentReversalResource refundOrCancelPayment(String paymentPspReference, CreatePaymentReversalRequest createPaymentReversalRequest) throws ApiException, IOException {
        return refundOrCancelPayment(paymentPspReference, createPaymentReversalRequest, null);
    }

    /**
    * Refund or cancel a payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to reverse.  (required)
    * @param createPaymentReversalRequest {@link CreatePaymentReversalRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentReversalResource }
    * @throws ApiException if fails to make API call
    */
    public PaymentReversalResource refundOrCancelPayment(String paymentPspReference, CreatePaymentReversalRequest createPaymentReversalRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = createPaymentReversalRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/reversals", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentReversalResource.fromJson(jsonResult);
    }
}