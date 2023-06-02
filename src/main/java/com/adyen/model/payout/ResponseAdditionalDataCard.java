/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.payout.JSON;

/**
 * ResponseAdditionalDataCard
 */

public class ResponseAdditionalDataCard {
  public static final String SERIALIZED_NAME_CARD_BIN = "cardBin";
  @SerializedName(SERIALIZED_NAME_CARD_BIN)
  private String cardBin;

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "cardHolderName";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_CARD_ISSUING_BANK = "cardIssuingBank";
  @SerializedName(SERIALIZED_NAME_CARD_ISSUING_BANK)
  private String cardIssuingBank;

  public static final String SERIALIZED_NAME_CARD_ISSUING_COUNTRY = "cardIssuingCountry";
  @SerializedName(SERIALIZED_NAME_CARD_ISSUING_COUNTRY)
  private String cardIssuingCountry;

  public static final String SERIALIZED_NAME_CARD_ISSUING_CURRENCY = "cardIssuingCurrency";
  @SerializedName(SERIALIZED_NAME_CARD_ISSUING_CURRENCY)
  private String cardIssuingCurrency;

  public static final String SERIALIZED_NAME_CARD_PAYMENT_METHOD = "cardPaymentMethod";
  @SerializedName(SERIALIZED_NAME_CARD_PAYMENT_METHOD)
  private String cardPaymentMethod;

  public static final String SERIALIZED_NAME_CARD_SUMMARY = "cardSummary";
  @SerializedName(SERIALIZED_NAME_CARD_SUMMARY)
  private String cardSummary;

  public static final String SERIALIZED_NAME_ISSUER_BIN = "issuerBin";
  @SerializedName(SERIALIZED_NAME_ISSUER_BIN)
  private String issuerBin;

  public ResponseAdditionalDataCard() { 
  }

  public ResponseAdditionalDataCard cardBin(String cardBin) {
    
    this.cardBin = cardBin;
    return this;
  }

   /**
   * The first six digits of the card number.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with a six-digit BIN.  Example: 521234
   * @return cardBin
  **/
  @ApiModelProperty(value = "The first six digits of the card number.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with a six-digit BIN.  Example: 521234")

  public String getCardBin() {
    return cardBin;
  }


  public void setCardBin(String cardBin) {
    this.cardBin = cardBin;
  }


  public ResponseAdditionalDataCard cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The cardholder name passed in the payment request.
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "The cardholder name passed in the payment request.")

  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public ResponseAdditionalDataCard cardIssuingBank(String cardIssuingBank) {
    
    this.cardIssuingBank = cardIssuingBank;
    return this;
  }

   /**
   * The bank or the financial institution granting lines of credit through card association branded payment cards. This information can be included when available.
   * @return cardIssuingBank
  **/
  @ApiModelProperty(value = "The bank or the financial institution granting lines of credit through card association branded payment cards. This information can be included when available.")

  public String getCardIssuingBank() {
    return cardIssuingBank;
  }


  public void setCardIssuingBank(String cardIssuingBank) {
    this.cardIssuingBank = cardIssuingBank;
  }


  public ResponseAdditionalDataCard cardIssuingCountry(String cardIssuingCountry) {
    
    this.cardIssuingCountry = cardIssuingCountry;
    return this;
  }

   /**
   * The country where the card was issued.  Example: US
   * @return cardIssuingCountry
  **/
  @ApiModelProperty(value = "The country where the card was issued.  Example: US")

  public String getCardIssuingCountry() {
    return cardIssuingCountry;
  }


  public void setCardIssuingCountry(String cardIssuingCountry) {
    this.cardIssuingCountry = cardIssuingCountry;
  }


  public ResponseAdditionalDataCard cardIssuingCurrency(String cardIssuingCurrency) {
    
    this.cardIssuingCurrency = cardIssuingCurrency;
    return this;
  }

   /**
   * The currency in which the card is issued, if this information is available. Provided as the currency code or currency number from the ISO-4217 standard.   Example: USD
   * @return cardIssuingCurrency
  **/
  @ApiModelProperty(value = "The currency in which the card is issued, if this information is available. Provided as the currency code or currency number from the ISO-4217 standard.   Example: USD")

  public String getCardIssuingCurrency() {
    return cardIssuingCurrency;
  }


  public void setCardIssuingCurrency(String cardIssuingCurrency) {
    this.cardIssuingCurrency = cardIssuingCurrency;
  }


  public ResponseAdditionalDataCard cardPaymentMethod(String cardPaymentMethod) {
    
    this.cardPaymentMethod = cardPaymentMethod;
    return this;
  }

   /**
   * The card payment method used for the transaction.  Example: amex
   * @return cardPaymentMethod
  **/
  @ApiModelProperty(value = "The card payment method used for the transaction.  Example: amex")

  public String getCardPaymentMethod() {
    return cardPaymentMethod;
  }


  public void setCardPaymentMethod(String cardPaymentMethod) {
    this.cardPaymentMethod = cardPaymentMethod;
  }


  public ResponseAdditionalDataCard cardSummary(String cardSummary) {
    
    this.cardSummary = cardSummary;
    return this;
  }

   /**
   * The last four digits of a card number.  &gt; Returned only in case of a card payment.
   * @return cardSummary
  **/
  @ApiModelProperty(value = "The last four digits of a card number.  > Returned only in case of a card payment.")

  public String getCardSummary() {
    return cardSummary;
  }


  public void setCardSummary(String cardSummary) {
    this.cardSummary = cardSummary;
  }


  public ResponseAdditionalDataCard issuerBin(String issuerBin) {
    
    this.issuerBin = issuerBin;
    return this;
  }

   /**
   * The first eight digits of the card number. Only returned if the card number is 16 digits or more.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with an eight-digit BIN.  Example: 52123423
   * @return issuerBin
  **/
  @ApiModelProperty(value = "The first eight digits of the card number. Only returned if the card number is 16 digits or more.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with an eight-digit BIN.  Example: 52123423")

  public String getIssuerBin() {
    return issuerBin;
  }


  public void setIssuerBin(String issuerBin) {
    this.issuerBin = issuerBin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataCard responseAdditionalDataCard = (ResponseAdditionalDataCard) o;
    return Objects.equals(this.cardBin, responseAdditionalDataCard.cardBin) &&
        Objects.equals(this.cardHolderName, responseAdditionalDataCard.cardHolderName) &&
        Objects.equals(this.cardIssuingBank, responseAdditionalDataCard.cardIssuingBank) &&
        Objects.equals(this.cardIssuingCountry, responseAdditionalDataCard.cardIssuingCountry) &&
        Objects.equals(this.cardIssuingCurrency, responseAdditionalDataCard.cardIssuingCurrency) &&
        Objects.equals(this.cardPaymentMethod, responseAdditionalDataCard.cardPaymentMethod) &&
        Objects.equals(this.cardSummary, responseAdditionalDataCard.cardSummary) &&
        Objects.equals(this.issuerBin, responseAdditionalDataCard.issuerBin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardBin, cardHolderName, cardIssuingBank, cardIssuingCountry, cardIssuingCurrency, cardPaymentMethod, cardSummary, issuerBin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataCard {\n");
    sb.append("    cardBin: ").append(toIndentedString(cardBin)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardIssuingBank: ").append(toIndentedString(cardIssuingBank)).append("\n");
    sb.append("    cardIssuingCountry: ").append(toIndentedString(cardIssuingCountry)).append("\n");
    sb.append("    cardIssuingCurrency: ").append(toIndentedString(cardIssuingCurrency)).append("\n");
    sb.append("    cardPaymentMethod: ").append(toIndentedString(cardPaymentMethod)).append("\n");
    sb.append("    cardSummary: ").append(toIndentedString(cardSummary)).append("\n");
    sb.append("    issuerBin: ").append(toIndentedString(issuerBin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cardBin");
    openapiFields.add("cardHolderName");
    openapiFields.add("cardIssuingBank");
    openapiFields.add("cardIssuingCountry");
    openapiFields.add("cardIssuingCurrency");
    openapiFields.add("cardPaymentMethod");
    openapiFields.add("cardSummary");
    openapiFields.add("issuerBin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(ResponseAdditionalDataCard.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseAdditionalDataCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseAdditionalDataCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseAdditionalDataCard is not found in the empty JSON string", ResponseAdditionalDataCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseAdditionalDataCard.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `ResponseAdditionalDataCard` properties.", entry.getKey()));
        }
      }
      // validate the optional field cardBin
      if (jsonObj.get("cardBin") != null && !jsonObj.get("cardBin").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardBin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardBin").toString()));
      }
      // validate the optional field cardHolderName
      if (jsonObj.get("cardHolderName") != null && !jsonObj.get("cardHolderName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardHolderName").toString()));
      }
      // validate the optional field cardIssuingBank
      if (jsonObj.get("cardIssuingBank") != null && !jsonObj.get("cardIssuingBank").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardIssuingBank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardIssuingBank").toString()));
      }
      // validate the optional field cardIssuingCountry
      if (jsonObj.get("cardIssuingCountry") != null && !jsonObj.get("cardIssuingCountry").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardIssuingCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardIssuingCountry").toString()));
      }
      // validate the optional field cardIssuingCurrency
      if (jsonObj.get("cardIssuingCurrency") != null && !jsonObj.get("cardIssuingCurrency").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardIssuingCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardIssuingCurrency").toString()));
      }
      // validate the optional field cardPaymentMethod
      if (jsonObj.get("cardPaymentMethod") != null && !jsonObj.get("cardPaymentMethod").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardPaymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardPaymentMethod").toString()));
      }
      // validate the optional field cardSummary
      if (jsonObj.get("cardSummary") != null && !jsonObj.get("cardSummary").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cardSummary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardSummary").toString()));
      }
      // validate the optional field issuerBin
      if (jsonObj.get("issuerBin") != null && !jsonObj.get("issuerBin").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `issuerBin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerBin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseAdditionalDataCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseAdditionalDataCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseAdditionalDataCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseAdditionalDataCard.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseAdditionalDataCard>() {
           @Override
           public void write(JsonWriter out, ResponseAdditionalDataCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseAdditionalDataCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseAdditionalDataCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseAdditionalDataCard
  * @throws IOException if the JSON string is invalid with respect to ResponseAdditionalDataCard
  */
  public static ResponseAdditionalDataCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseAdditionalDataCard.class);
  }

 /**
  * Convert an instance of ResponseAdditionalDataCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
