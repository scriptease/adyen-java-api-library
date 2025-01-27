/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.Card;
import com.adyen.model.balanceplatform.PaymentInstrumentBankAccount;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * UpdatePaymentInstrument
 */

public class UpdatePaymentInstrument {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bankAccount";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private PaymentInstrumentBankAccount bankAccount;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY_CODE = "issuingCountryCode";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY_CODE)
  private String issuingCountryCode;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_GROUP_ID = "paymentInstrumentGroupId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_GROUP_ID)
  private String paymentInstrumentGroupId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_COMMENT = "statusComment";
  @SerializedName(SERIALIZED_NAME_STATUS_COMMENT)
  private String statusComment;

  /**
   * The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   */
  @JsonAdapter(StatusReasonEnum.Adapter.class)
  public enum StatusReasonEnum {
    ACCOUNTCLOSURE("accountClosure"),
    
    DAMAGED("damaged"),
    
    ENDOFLIFE("endOfLife"),
    
    EXPIRED("expired"),
    
    LOST("lost"),
    
    OTHER("other"),
    
    STOLEN("stolen"),
    
    SUSPECTEDFRAUD("suspectedFraud");

    private String value;

    StatusReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusReasonEnum fromValue(String value) {
      for (StatusReasonEnum b : StatusReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_REASON = "statusReason";
  @SerializedName(SERIALIZED_NAME_STATUS_REASON)
  private StatusReasonEnum statusReason;

  /**
   * Type of payment instrument.  Possible value: **card**, **bankAccount**. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANKACCOUNT("bankAccount"),
    
    CARD("card");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public UpdatePaymentInstrument() { 
  }

  public UpdatePaymentInstrument balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.
   * @return balanceAccountId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/balanceAccounts__resParam_id) associated with the payment instrument.")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public UpdatePaymentInstrument bankAccount(PaymentInstrumentBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")

  public PaymentInstrumentBankAccount getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(PaymentInstrumentBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  public UpdatePaymentInstrument card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  public Card getCard() {
    return card;
  }


  public void setCard(Card card) {
    this.card = card;
  }


  public UpdatePaymentInstrument description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the payment instrument, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the payment instrument, maximum 300 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdatePaymentInstrument id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the payment instrument.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the payment instrument.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UpdatePaymentInstrument issuingCountryCode(String issuingCountryCode) {
    
    this.issuingCountryCode = issuingCountryCode;
    return this;
  }

   /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.
   * @return issuingCountryCode
  **/
  @ApiModelProperty(required = true, value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the payment instrument is issued. For example, **NL** or **US**.")

  public String getIssuingCountryCode() {
    return issuingCountryCode;
  }


  public void setIssuingCountryCode(String issuingCountryCode) {
    this.issuingCountryCode = issuingCountryCode;
  }


  public UpdatePaymentInstrument paymentInstrumentGroupId(String paymentInstrumentGroupId) {
    
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
    return this;
  }

   /**
   * The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.
   * @return paymentInstrumentGroupId
  **/
  @ApiModelProperty(value = "The unique identifier of the [payment instrument group](https://docs.adyen.com/api-explorer/#/balanceplatform/v1/post/paymentInstrumentGroups__resParam_id) to which the payment instrument belongs.")

  public String getPaymentInstrumentGroupId() {
    return paymentInstrumentGroupId;
  }


  public void setPaymentInstrumentGroupId(String paymentInstrumentGroupId) {
    this.paymentInstrumentGroupId = paymentInstrumentGroupId;
  }


  public UpdatePaymentInstrument reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment instrument, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment instrument, maximum 150 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public UpdatePaymentInstrument status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the &#x60;card.formFactor&#x60; and the &#x60;issuingCountryCode&#x60;. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   
   * @return status
  **/
  @ApiModelProperty(value = "The status of the payment instrument. If a status is not specified when creating a payment instrument, it is set to **active** by default. However, there can be exceptions for cards based on the `card.formFactor` and the `issuingCountryCode`. For example, when issuing physical cards in the US, the default status is **inactive**.  Possible values:    * **active**:  The payment instrument is active and can be used to make payments.    * **inactive**: The payment instrument is inactive and cannot be used to make payments.    * **suspended**: The payment instrument is suspended, either because it was stolen or lost.    * **closed**: The payment instrument is permanently closed. This action cannot be undone.   ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public UpdatePaymentInstrument statusComment(String statusComment) {
    
    this.statusComment = statusComment;
    return this;
  }

   /**
   * Comment for the status of the payment instrument.  Required if &#x60;statusReason&#x60; is **other**.
   * @return statusComment
  **/
  @ApiModelProperty(value = "Comment for the status of the payment instrument.  Required if `statusReason` is **other**.")

  public String getStatusComment() {
    return statusComment;
  }


  public void setStatusComment(String statusComment) {
    this.statusComment = statusComment;
  }


  public UpdatePaymentInstrument statusReason(StatusReasonEnum statusReason) {
    
    this.statusReason = statusReason;
    return this;
  }

   /**
   * The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the &#x60;statusComment&#x60; parameter describing the status change.
   * @return statusReason
  **/
  @ApiModelProperty(value = "The reason for updating the status of the payment instrument.  Possible values: **lost**, **stolen**, **damaged**, **suspectedFraud**, **expired**, **endOfLife**, **accountClosure**, **other**. If the reason is **other**, you must also send the `statusComment` parameter describing the status change.")

  public StatusReasonEnum getStatusReason() {
    return statusReason;
  }


  public void setStatusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
  }


  public UpdatePaymentInstrument type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of payment instrument.  Possible value: **card**, **bankAccount**. 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of payment instrument.  Possible value: **card**, **bankAccount**. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentInstrument updatePaymentInstrument = (UpdatePaymentInstrument) o;
    return Objects.equals(this.balanceAccountId, updatePaymentInstrument.balanceAccountId) &&
        Objects.equals(this.bankAccount, updatePaymentInstrument.bankAccount) &&
        Objects.equals(this.card, updatePaymentInstrument.card) &&
        Objects.equals(this.description, updatePaymentInstrument.description) &&
        Objects.equals(this.id, updatePaymentInstrument.id) &&
        Objects.equals(this.issuingCountryCode, updatePaymentInstrument.issuingCountryCode) &&
        Objects.equals(this.paymentInstrumentGroupId, updatePaymentInstrument.paymentInstrumentGroupId) &&
        Objects.equals(this.reference, updatePaymentInstrument.reference) &&
        Objects.equals(this.status, updatePaymentInstrument.status) &&
        Objects.equals(this.statusComment, updatePaymentInstrument.statusComment) &&
        Objects.equals(this.statusReason, updatePaymentInstrument.statusReason) &&
        Objects.equals(this.type, updatePaymentInstrument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, bankAccount, card, description, id, issuingCountryCode, paymentInstrumentGroupId, reference, status, statusComment, statusReason, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentInstrument {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuingCountryCode: ").append(toIndentedString(issuingCountryCode)).append("\n");
    sb.append("    paymentInstrumentGroupId: ").append(toIndentedString(paymentInstrumentGroupId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusComment: ").append(toIndentedString(statusComment)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("balanceAccountId");
    openapiFields.add("bankAccount");
    openapiFields.add("card");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("issuingCountryCode");
    openapiFields.add("paymentInstrumentGroupId");
    openapiFields.add("reference");
    openapiFields.add("status");
    openapiFields.add("statusComment");
    openapiFields.add("statusReason");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("balanceAccountId");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issuingCountryCode");
    openapiRequiredFields.add("type");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(UpdatePaymentInstrument.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePaymentInstrument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePaymentInstrument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePaymentInstrument is not found in the empty JSON string", UpdatePaymentInstrument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePaymentInstrument.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `UpdatePaymentInstrument` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePaymentInstrument.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // validate the optional field `bankAccount`
      if (jsonObj.getAsJsonObject("bankAccount") != null) {
        PaymentInstrumentBankAccount.validateJsonObject(jsonObj.getAsJsonObject("bankAccount"));
      }
      // validate the optional field `card`
      if (jsonObj.getAsJsonObject("card") != null) {
        Card.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field issuingCountryCode
      if (jsonObj.get("issuingCountryCode") != null && !jsonObj.get("issuingCountryCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `issuingCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuingCountryCode").toString()));
      }
      // validate the optional field paymentInstrumentGroupId
      if (jsonObj.get("paymentInstrumentGroupId") != null && !jsonObj.get("paymentInstrumentGroupId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `paymentInstrumentGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentInstrumentGroupId").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
      // validate the optional field statusComment
      if (jsonObj.get("statusComment") != null && !jsonObj.get("statusComment").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `statusComment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusComment").toString()));
      }
      // ensure the field statusReason can be parsed to an enum value
      if (jsonObj.get("statusReason") != null) {
        if(!jsonObj.get("statusReason").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `statusReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReason").toString()));
        }
        StatusReasonEnum.fromValue(jsonObj.get("statusReason").getAsString());
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePaymentInstrument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePaymentInstrument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePaymentInstrument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePaymentInstrument.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePaymentInstrument>() {
           @Override
           public void write(JsonWriter out, UpdatePaymentInstrument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePaymentInstrument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePaymentInstrument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePaymentInstrument
  * @throws IOException if the JSON string is invalid with respect to UpdatePaymentInstrument
  */
  public static UpdatePaymentInstrument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePaymentInstrument.class);
  }

 /**
  * Convert an instance of UpdatePaymentInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

