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


package com.adyen.model.checkout;

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

import com.adyen.model.checkout.JSON;

/**
 * CheckoutThreeDS2Action
 */

public class CheckoutThreeDS2Action {
  public static final String SERIALIZED_NAME_AUTHORISATION_TOKEN = "authorisationToken";
  @SerializedName(SERIALIZED_NAME_AUTHORISATION_TOKEN)
  private String authorisationToken;

  public static final String SERIALIZED_NAME_PAYMENT_DATA = "paymentData";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATA)
  private String paymentData;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPE = "paymentMethodType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPE)
  private String paymentMethodType;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  /**
   * **threeDS2**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    THREEDS2("threeDS2");

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

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public CheckoutThreeDS2Action() { 
  }

  public CheckoutThreeDS2Action authorisationToken(String authorisationToken) {
    
    this.authorisationToken = authorisationToken;
    return this;
  }

   /**
   * A token needed to authorise a payment.
   * @return authorisationToken
  **/
  @ApiModelProperty(value = "A token needed to authorise a payment.")

  public String getAuthorisationToken() {
    return authorisationToken;
  }


  public void setAuthorisationToken(String authorisationToken) {
    this.authorisationToken = authorisationToken;
  }


  public CheckoutThreeDS2Action paymentData(String paymentData) {
    
    this.paymentData = paymentData;
    return this;
  }

   /**
   * A value that must be submitted to the &#x60;/payments/details&#x60; endpoint to verify this payment.
   * @return paymentData
  **/
  @ApiModelProperty(value = "A value that must be submitted to the `/payments/details` endpoint to verify this payment.")

  public String getPaymentData() {
    return paymentData;
  }


  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public CheckoutThreeDS2Action paymentMethodType(String paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Specifies the payment method.
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "Specifies the payment method.")

  public String getPaymentMethodType() {
    return paymentMethodType;
  }


  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public CheckoutThreeDS2Action subtype(String subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * A subtype of the token.
   * @return subtype
  **/
  @ApiModelProperty(value = "A subtype of the token.")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public CheckoutThreeDS2Action token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * A token to pass to the 3DS2 Component to get the fingerprint.
   * @return token
  **/
  @ApiModelProperty(value = "A token to pass to the 3DS2 Component to get the fingerprint.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public CheckoutThreeDS2Action type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **threeDS2**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**threeDS2**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CheckoutThreeDS2Action url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL to redirect to.
   * @return url
  **/
  @ApiModelProperty(value = "Specifies the URL to redirect to.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutThreeDS2Action checkoutThreeDS2Action = (CheckoutThreeDS2Action) o;
    return Objects.equals(this.authorisationToken, checkoutThreeDS2Action.authorisationToken) &&
        Objects.equals(this.paymentData, checkoutThreeDS2Action.paymentData) &&
        Objects.equals(this.paymentMethodType, checkoutThreeDS2Action.paymentMethodType) &&
        Objects.equals(this.subtype, checkoutThreeDS2Action.subtype) &&
        Objects.equals(this.token, checkoutThreeDS2Action.token) &&
        Objects.equals(this.type, checkoutThreeDS2Action.type) &&
        Objects.equals(this.url, checkoutThreeDS2Action.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationToken, paymentData, paymentMethodType, subtype, token, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutThreeDS2Action {\n");
    sb.append("    authorisationToken: ").append(toIndentedString(authorisationToken)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("authorisationToken");
    openapiFields.add("paymentData");
    openapiFields.add("paymentMethodType");
    openapiFields.add("subtype");
    openapiFields.add("token");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(CheckoutThreeDS2Action.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutThreeDS2Action
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CheckoutThreeDS2Action.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutThreeDS2Action is not found in the empty JSON string", CheckoutThreeDS2Action.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckoutThreeDS2Action.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `CheckoutThreeDS2Action` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutThreeDS2Action.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field authorisationToken
      if (jsonObj.get("authorisationToken") != null && !jsonObj.get("authorisationToken").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `authorisationToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorisationToken").toString()));
      }
      // validate the optional field paymentData
      if (jsonObj.get("paymentData") != null && !jsonObj.get("paymentData").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `paymentData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentData").toString()));
      }
      // validate the optional field paymentMethodType
      if (jsonObj.get("paymentMethodType") != null && !jsonObj.get("paymentMethodType").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `paymentMethodType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethodType").toString()));
      }
      // validate the optional field subtype
      if (jsonObj.get("subtype") != null && !jsonObj.get("subtype").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      // validate the optional field token
      if (jsonObj.get("token") != null && !jsonObj.get("token").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
      // validate the optional field url
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutThreeDS2Action.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutThreeDS2Action' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutThreeDS2Action> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutThreeDS2Action.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutThreeDS2Action>() {
           @Override
           public void write(JsonWriter out, CheckoutThreeDS2Action value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutThreeDS2Action read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutThreeDS2Action given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutThreeDS2Action
  * @throws IOException if the JSON string is invalid with respect to CheckoutThreeDS2Action
  */
  public static CheckoutThreeDS2Action fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutThreeDS2Action.class);
  }

 /**
  * Convert an instance of CheckoutThreeDS2Action to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

