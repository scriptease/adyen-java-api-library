/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Amount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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

import com.adyen.model.checkout.JSON;

/**
 * MerchantRiskIndicator
 */

public class MerchantRiskIndicator {
  public static final String SERIALIZED_NAME_ADDRESS_MATCH = "addressMatch";
  @SerializedName(SERIALIZED_NAME_ADDRESS_MATCH)
  private Boolean addressMatch;

  /**
   * Indicator regarding the delivery address. Allowed values: * &#x60;shipToBillingAddress&#x60; * &#x60;shipToVerifiedAddress&#x60; * &#x60;shipToNewAddress&#x60; * &#x60;shipToStore&#x60; * &#x60;digitalGoods&#x60; * &#x60;goodsNotShipped&#x60; * &#x60;other&#x60;
   */
  @JsonAdapter(DeliveryAddressIndicatorEnum.Adapter.class)
  public enum DeliveryAddressIndicatorEnum {
    SHIPTOBILLINGADDRESS("shipToBillingAddress"),
    
    SHIPTOVERIFIEDADDRESS("shipToVerifiedAddress"),
    
    SHIPTONEWADDRESS("shipToNewAddress"),
    
    SHIPTOSTORE("shipToStore"),
    
    DIGITALGOODS("digitalGoods"),
    
    GOODSNOTSHIPPED("goodsNotShipped"),
    
    OTHER("other");

    private String value;

    DeliveryAddressIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryAddressIndicatorEnum fromValue(String value) {
      for (DeliveryAddressIndicatorEnum b : DeliveryAddressIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryAddressIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryAddressIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryAddressIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryAddressIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS_INDICATOR = "deliveryAddressIndicator";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS_INDICATOR)
  private DeliveryAddressIndicatorEnum deliveryAddressIndicator;

  public static final String SERIALIZED_NAME_DELIVERY_EMAIL = "deliveryEmail";
  @SerializedName(SERIALIZED_NAME_DELIVERY_EMAIL)
  private String deliveryEmail;

  public static final String SERIALIZED_NAME_DELIVERY_EMAIL_ADDRESS = "deliveryEmailAddress";
  @SerializedName(SERIALIZED_NAME_DELIVERY_EMAIL_ADDRESS)
  private String deliveryEmailAddress;

  /**
   * The estimated delivery time for the shopper to receive the goods. Allowed values: * &#x60;electronicDelivery&#x60; * &#x60;sameDayShipping&#x60; * &#x60;overnightShipping&#x60; * &#x60;twoOrMoreDaysShipping&#x60;
   */
  @JsonAdapter(DeliveryTimeframeEnum.Adapter.class)
  public enum DeliveryTimeframeEnum {
    ELECTRONICDELIVERY("electronicDelivery"),
    
    SAMEDAYSHIPPING("sameDayShipping"),
    
    OVERNIGHTSHIPPING("overnightShipping"),
    
    TWOORMOREDAYSSHIPPING("twoOrMoreDaysShipping");

    private String value;

    DeliveryTimeframeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryTimeframeEnum fromValue(String value) {
      for (DeliveryTimeframeEnum b : DeliveryTimeframeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryTimeframeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryTimeframeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryTimeframeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryTimeframeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_TIMEFRAME = "deliveryTimeframe";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIMEFRAME)
  private DeliveryTimeframeEnum deliveryTimeframe;

  public static final String SERIALIZED_NAME_GIFT_CARD_AMOUNT = "giftCardAmount";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_AMOUNT)
  private Amount giftCardAmount;

  public static final String SERIALIZED_NAME_GIFT_CARD_COUNT = "giftCardCount";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_COUNT)
  private Integer giftCardCount;

  public static final String SERIALIZED_NAME_GIFT_CARD_CURR = "giftCardCurr";
  @SerializedName(SERIALIZED_NAME_GIFT_CARD_CURR)
  private String giftCardCurr;

  public static final String SERIALIZED_NAME_PRE_ORDER_DATE = "preOrderDate";
  @SerializedName(SERIALIZED_NAME_PRE_ORDER_DATE)
  private OffsetDateTime preOrderDate;

  public static final String SERIALIZED_NAME_PRE_ORDER_PURCHASE = "preOrderPurchase";
  @SerializedName(SERIALIZED_NAME_PRE_ORDER_PURCHASE)
  private Boolean preOrderPurchase;

  public static final String SERIALIZED_NAME_PRE_ORDER_PURCHASE_IND = "preOrderPurchaseInd";
  @SerializedName(SERIALIZED_NAME_PRE_ORDER_PURCHASE_IND)
  private String preOrderPurchaseInd;

  public static final String SERIALIZED_NAME_REORDER_ITEMS = "reorderItems";
  @SerializedName(SERIALIZED_NAME_REORDER_ITEMS)
  private Boolean reorderItems;

  public static final String SERIALIZED_NAME_REORDER_ITEMS_IND = "reorderItemsInd";
  @SerializedName(SERIALIZED_NAME_REORDER_ITEMS_IND)
  private String reorderItemsInd;

  public static final String SERIALIZED_NAME_SHIP_INDICATOR = "shipIndicator";
  @SerializedName(SERIALIZED_NAME_SHIP_INDICATOR)
  private String shipIndicator;

  public MerchantRiskIndicator() { 
  }

  public MerchantRiskIndicator addressMatch(Boolean addressMatch) {
    
    this.addressMatch = addressMatch;
    return this;
  }

   /**
   * Whether the chosen delivery address is identical to the billing address.
   * @return addressMatch
  **/
  @ApiModelProperty(value = "Whether the chosen delivery address is identical to the billing address.")

  public Boolean getAddressMatch() {
    return addressMatch;
  }


  public void setAddressMatch(Boolean addressMatch) {
    this.addressMatch = addressMatch;
  }


  public MerchantRiskIndicator deliveryAddressIndicator(DeliveryAddressIndicatorEnum deliveryAddressIndicator) {
    
    this.deliveryAddressIndicator = deliveryAddressIndicator;
    return this;
  }

   /**
   * Indicator regarding the delivery address. Allowed values: * &#x60;shipToBillingAddress&#x60; * &#x60;shipToVerifiedAddress&#x60; * &#x60;shipToNewAddress&#x60; * &#x60;shipToStore&#x60; * &#x60;digitalGoods&#x60; * &#x60;goodsNotShipped&#x60; * &#x60;other&#x60;
   * @return deliveryAddressIndicator
  **/
  @ApiModelProperty(value = "Indicator regarding the delivery address. Allowed values: * `shipToBillingAddress` * `shipToVerifiedAddress` * `shipToNewAddress` * `shipToStore` * `digitalGoods` * `goodsNotShipped` * `other`")

  public DeliveryAddressIndicatorEnum getDeliveryAddressIndicator() {
    return deliveryAddressIndicator;
  }


  public void setDeliveryAddressIndicator(DeliveryAddressIndicatorEnum deliveryAddressIndicator) {
    this.deliveryAddressIndicator = deliveryAddressIndicator;
  }


  public MerchantRiskIndicator deliveryEmail(String deliveryEmail) {
    
    this.deliveryEmail = deliveryEmail;
    return this;
  }

   /**
   * The delivery email address (for digital goods).
   * @return deliveryEmail
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The delivery email address (for digital goods).")

  public String getDeliveryEmail() {
    return deliveryEmail;
  }


  public void setDeliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }


  public MerchantRiskIndicator deliveryEmailAddress(String deliveryEmailAddress) {
    
    this.deliveryEmailAddress = deliveryEmailAddress;
    return this;
  }

   /**
   * For Electronic delivery, the email address to which the merchandise was delivered. Maximum length: 254 characters.
   * @return deliveryEmailAddress
  **/
  @ApiModelProperty(value = "For Electronic delivery, the email address to which the merchandise was delivered. Maximum length: 254 characters.")

  public String getDeliveryEmailAddress() {
    return deliveryEmailAddress;
  }


  public void setDeliveryEmailAddress(String deliveryEmailAddress) {
    this.deliveryEmailAddress = deliveryEmailAddress;
  }


  public MerchantRiskIndicator deliveryTimeframe(DeliveryTimeframeEnum deliveryTimeframe) {
    
    this.deliveryTimeframe = deliveryTimeframe;
    return this;
  }

   /**
   * The estimated delivery time for the shopper to receive the goods. Allowed values: * &#x60;electronicDelivery&#x60; * &#x60;sameDayShipping&#x60; * &#x60;overnightShipping&#x60; * &#x60;twoOrMoreDaysShipping&#x60;
   * @return deliveryTimeframe
  **/
  @ApiModelProperty(value = "The estimated delivery time for the shopper to receive the goods. Allowed values: * `electronicDelivery` * `sameDayShipping` * `overnightShipping` * `twoOrMoreDaysShipping`")

  public DeliveryTimeframeEnum getDeliveryTimeframe() {
    return deliveryTimeframe;
  }


  public void setDeliveryTimeframe(DeliveryTimeframeEnum deliveryTimeframe) {
    this.deliveryTimeframe = deliveryTimeframe;
  }


  public MerchantRiskIndicator giftCardAmount(Amount giftCardAmount) {
    
    this.giftCardAmount = giftCardAmount;
    return this;
  }

   /**
   * Get giftCardAmount
   * @return giftCardAmount
  **/
  @ApiModelProperty(value = "")

  public Amount getGiftCardAmount() {
    return giftCardAmount;
  }


  public void setGiftCardAmount(Amount giftCardAmount) {
    this.giftCardAmount = giftCardAmount;
  }


  public MerchantRiskIndicator giftCardCount(Integer giftCardCount) {
    
    this.giftCardCount = giftCardCount;
    return this;
  }

   /**
   * For prepaid or gift card purchase, total count of individual prepaid or gift cards/codes purchased.
   * @return giftCardCount
  **/
  @ApiModelProperty(value = "For prepaid or gift card purchase, total count of individual prepaid or gift cards/codes purchased.")

  public Integer getGiftCardCount() {
    return giftCardCount;
  }


  public void setGiftCardCount(Integer giftCardCount) {
    this.giftCardCount = giftCardCount;
  }


  public MerchantRiskIndicator giftCardCurr(String giftCardCurr) {
    
    this.giftCardCurr = giftCardCurr;
    return this;
  }

   /**
   * For prepaid or gift card purchase, [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html) three-digit currency code of the gift card, other than those listed in Table A.5 of the EMVCo 3D Secure Protocol and Core Functions Specification.
   * @return giftCardCurr
  **/
  @ApiModelProperty(value = "For prepaid or gift card purchase, [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html) three-digit currency code of the gift card, other than those listed in Table A.5 of the EMVCo 3D Secure Protocol and Core Functions Specification.")

  public String getGiftCardCurr() {
    return giftCardCurr;
  }


  public void setGiftCardCurr(String giftCardCurr) {
    this.giftCardCurr = giftCardCurr;
  }


  public MerchantRiskIndicator preOrderDate(OffsetDateTime preOrderDate) {
    
    this.preOrderDate = preOrderDate;
    return this;
  }

   /**
   * For pre-order purchases, the expected date this product will be available to the shopper.
   * @return preOrderDate
  **/
  @ApiModelProperty(value = "For pre-order purchases, the expected date this product will be available to the shopper.")

  public OffsetDateTime getPreOrderDate() {
    return preOrderDate;
  }


  public void setPreOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
  }


  public MerchantRiskIndicator preOrderPurchase(Boolean preOrderPurchase) {
    
    this.preOrderPurchase = preOrderPurchase;
    return this;
  }

   /**
   * Indicator for whether this transaction is for pre-ordering a product.
   * @return preOrderPurchase
  **/
  @ApiModelProperty(value = "Indicator for whether this transaction is for pre-ordering a product.")

  public Boolean getPreOrderPurchase() {
    return preOrderPurchase;
  }


  public void setPreOrderPurchase(Boolean preOrderPurchase) {
    this.preOrderPurchase = preOrderPurchase;
  }


  public MerchantRiskIndicator preOrderPurchaseInd(String preOrderPurchaseInd) {
    
    this.preOrderPurchaseInd = preOrderPurchaseInd;
    return this;
  }

   /**
   * Indicates whether Cardholder is placing an order for merchandise with a future availability or release date.
   * @return preOrderPurchaseInd
  **/
  @ApiModelProperty(value = "Indicates whether Cardholder is placing an order for merchandise with a future availability or release date.")

  public String getPreOrderPurchaseInd() {
    return preOrderPurchaseInd;
  }


  public void setPreOrderPurchaseInd(String preOrderPurchaseInd) {
    this.preOrderPurchaseInd = preOrderPurchaseInd;
  }


  public MerchantRiskIndicator reorderItems(Boolean reorderItems) {
    
    this.reorderItems = reorderItems;
    return this;
  }

   /**
   * Indicator for whether the shopper has already purchased the same items in the past.
   * @return reorderItems
  **/
  @ApiModelProperty(value = "Indicator for whether the shopper has already purchased the same items in the past.")

  public Boolean getReorderItems() {
    return reorderItems;
  }


  public void setReorderItems(Boolean reorderItems) {
    this.reorderItems = reorderItems;
  }


  public MerchantRiskIndicator reorderItemsInd(String reorderItemsInd) {
    
    this.reorderItemsInd = reorderItemsInd;
    return this;
  }

   /**
   * Indicates whether the cardholder is reordering previously purchased merchandise.
   * @return reorderItemsInd
  **/
  @ApiModelProperty(value = "Indicates whether the cardholder is reordering previously purchased merchandise.")

  public String getReorderItemsInd() {
    return reorderItemsInd;
  }


  public void setReorderItemsInd(String reorderItemsInd) {
    this.reorderItemsInd = reorderItemsInd;
  }


  public MerchantRiskIndicator shipIndicator(String shipIndicator) {
    
    this.shipIndicator = shipIndicator;
    return this;
  }

   /**
   * Indicates shipping method chosen for the transaction.
   * @return shipIndicator
  **/
  @ApiModelProperty(value = "Indicates shipping method chosen for the transaction.")

  public String getShipIndicator() {
    return shipIndicator;
  }


  public void setShipIndicator(String shipIndicator) {
    this.shipIndicator = shipIndicator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantRiskIndicator merchantRiskIndicator = (MerchantRiskIndicator) o;
    return Objects.equals(this.addressMatch, merchantRiskIndicator.addressMatch) &&
        Objects.equals(this.deliveryAddressIndicator, merchantRiskIndicator.deliveryAddressIndicator) &&
        Objects.equals(this.deliveryEmail, merchantRiskIndicator.deliveryEmail) &&
        Objects.equals(this.deliveryEmailAddress, merchantRiskIndicator.deliveryEmailAddress) &&
        Objects.equals(this.deliveryTimeframe, merchantRiskIndicator.deliveryTimeframe) &&
        Objects.equals(this.giftCardAmount, merchantRiskIndicator.giftCardAmount) &&
        Objects.equals(this.giftCardCount, merchantRiskIndicator.giftCardCount) &&
        Objects.equals(this.giftCardCurr, merchantRiskIndicator.giftCardCurr) &&
        Objects.equals(this.preOrderDate, merchantRiskIndicator.preOrderDate) &&
        Objects.equals(this.preOrderPurchase, merchantRiskIndicator.preOrderPurchase) &&
        Objects.equals(this.preOrderPurchaseInd, merchantRiskIndicator.preOrderPurchaseInd) &&
        Objects.equals(this.reorderItems, merchantRiskIndicator.reorderItems) &&
        Objects.equals(this.reorderItemsInd, merchantRiskIndicator.reorderItemsInd) &&
        Objects.equals(this.shipIndicator, merchantRiskIndicator.shipIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressMatch, deliveryAddressIndicator, deliveryEmail, deliveryEmailAddress, deliveryTimeframe, giftCardAmount, giftCardCount, giftCardCurr, preOrderDate, preOrderPurchase, preOrderPurchaseInd, reorderItems, reorderItemsInd, shipIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantRiskIndicator {\n");
    sb.append("    addressMatch: ").append(toIndentedString(addressMatch)).append("\n");
    sb.append("    deliveryAddressIndicator: ").append(toIndentedString(deliveryAddressIndicator)).append("\n");
    sb.append("    deliveryEmail: ").append(toIndentedString(deliveryEmail)).append("\n");
    sb.append("    deliveryEmailAddress: ").append(toIndentedString(deliveryEmailAddress)).append("\n");
    sb.append("    deliveryTimeframe: ").append(toIndentedString(deliveryTimeframe)).append("\n");
    sb.append("    giftCardAmount: ").append(toIndentedString(giftCardAmount)).append("\n");
    sb.append("    giftCardCount: ").append(toIndentedString(giftCardCount)).append("\n");
    sb.append("    giftCardCurr: ").append(toIndentedString(giftCardCurr)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    preOrderPurchase: ").append(toIndentedString(preOrderPurchase)).append("\n");
    sb.append("    preOrderPurchaseInd: ").append(toIndentedString(preOrderPurchaseInd)).append("\n");
    sb.append("    reorderItems: ").append(toIndentedString(reorderItems)).append("\n");
    sb.append("    reorderItemsInd: ").append(toIndentedString(reorderItemsInd)).append("\n");
    sb.append("    shipIndicator: ").append(toIndentedString(shipIndicator)).append("\n");
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
    openapiFields.add("addressMatch");
    openapiFields.add("deliveryAddressIndicator");
    openapiFields.add("deliveryEmail");
    openapiFields.add("deliveryEmailAddress");
    openapiFields.add("deliveryTimeframe");
    openapiFields.add("giftCardAmount");
    openapiFields.add("giftCardCount");
    openapiFields.add("giftCardCurr");
    openapiFields.add("preOrderDate");
    openapiFields.add("preOrderPurchase");
    openapiFields.add("preOrderPurchaseInd");
    openapiFields.add("reorderItems");
    openapiFields.add("reorderItemsInd");
    openapiFields.add("shipIndicator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantRiskIndicator
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantRiskIndicator.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantRiskIndicator is not found in the empty JSON string", MerchantRiskIndicator.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantRiskIndicator.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantRiskIndicator` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the field deliveryAddressIndicator can be parsed to an enum value
      if (jsonObj.get("deliveryAddressIndicator") != null) {
        if(!jsonObj.get("deliveryAddressIndicator").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `deliveryAddressIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryAddressIndicator").toString()));
        }
        DeliveryAddressIndicatorEnum.fromValue(jsonObj.get("deliveryAddressIndicator").getAsString());
      }
      // validate the optional field deliveryEmail
      if (jsonObj.get("deliveryEmail") != null && !jsonObj.get("deliveryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryEmail").toString()));
      }
      // validate the optional field deliveryEmailAddress
      if (jsonObj.get("deliveryEmailAddress") != null && !jsonObj.get("deliveryEmailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryEmailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryEmailAddress").toString()));
      }
      // ensure the field deliveryTimeframe can be parsed to an enum value
      if (jsonObj.get("deliveryTimeframe") != null) {
        if(!jsonObj.get("deliveryTimeframe").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `deliveryTimeframe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryTimeframe").toString()));
        }
        DeliveryTimeframeEnum.fromValue(jsonObj.get("deliveryTimeframe").getAsString());
      }
      // validate the optional field `giftCardAmount`
      if (jsonObj.getAsJsonObject("giftCardAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("giftCardAmount"));
      }
      // validate the optional field giftCardCurr
      if (jsonObj.get("giftCardCurr") != null && !jsonObj.get("giftCardCurr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `giftCardCurr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("giftCardCurr").toString()));
      }
      // validate the optional field preOrderPurchaseInd
      if (jsonObj.get("preOrderPurchaseInd") != null && !jsonObj.get("preOrderPurchaseInd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preOrderPurchaseInd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preOrderPurchaseInd").toString()));
      }
      // validate the optional field reorderItemsInd
      if (jsonObj.get("reorderItemsInd") != null && !jsonObj.get("reorderItemsInd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reorderItemsInd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reorderItemsInd").toString()));
      }
      // validate the optional field shipIndicator
      if (jsonObj.get("shipIndicator") != null && !jsonObj.get("shipIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipIndicator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantRiskIndicator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantRiskIndicator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantRiskIndicator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantRiskIndicator.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantRiskIndicator>() {
           @Override
           public void write(JsonWriter out, MerchantRiskIndicator value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantRiskIndicator read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantRiskIndicator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantRiskIndicator
  * @throws IOException if the JSON string is invalid with respect to MerchantRiskIndicator
  */
  public static MerchantRiskIndicator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantRiskIndicator.class);
  }

 /**
  * Convert an instance of MerchantRiskIndicator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

