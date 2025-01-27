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
import com.adyen.model.balanceplatform.Expiry;
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
 * PaymentInstrumentRevealInfo
 */

public class PaymentInstrumentRevealInfo {
  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Expiry expiration;

  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public PaymentInstrumentRevealInfo() { 
  }

  public PaymentInstrumentRevealInfo cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * The CVC2 value of the card.
   * @return cvc
  **/
  @ApiModelProperty(required = true, value = "The CVC2 value of the card.")

  public String getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public PaymentInstrumentRevealInfo expiration(Expiry expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(required = true, value = "")

  public Expiry getExpiration() {
    return expiration;
  }


  public void setExpiration(Expiry expiration) {
    this.expiration = expiration;
  }


  public PaymentInstrumentRevealInfo pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * The primary account number (PAN) of the card.
   * @return pan
  **/
  @ApiModelProperty(required = true, value = "The primary account number (PAN) of the card.")

  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentRevealInfo paymentInstrumentRevealInfo = (PaymentInstrumentRevealInfo) o;
    return Objects.equals(this.cvc, paymentInstrumentRevealInfo.cvc) &&
        Objects.equals(this.expiration, paymentInstrumentRevealInfo.expiration) &&
        Objects.equals(this.pan, paymentInstrumentRevealInfo.pan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvc, expiration, pan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentRevealInfo {\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
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
    openapiFields.add("cvc");
    openapiFields.add("expiration");
    openapiFields.add("pan");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cvc");
    openapiRequiredFields.add("expiration");
    openapiRequiredFields.add("pan");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(PaymentInstrumentRevealInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInstrumentRevealInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInstrumentRevealInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInstrumentRevealInfo is not found in the empty JSON string", PaymentInstrumentRevealInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInstrumentRevealInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `PaymentInstrumentRevealInfo` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentInstrumentRevealInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field cvc
      if (jsonObj.get("cvc") != null && !jsonObj.get("cvc").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cvc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvc").toString()));
      }
      // validate the optional field `expiration`
      if (jsonObj.getAsJsonObject("expiration") != null) {
        Expiry.validateJsonObject(jsonObj.getAsJsonObject("expiration"));
      }
      // validate the optional field pan
      if (jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInstrumentRevealInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInstrumentRevealInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInstrumentRevealInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInstrumentRevealInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInstrumentRevealInfo>() {
           @Override
           public void write(JsonWriter out, PaymentInstrumentRevealInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInstrumentRevealInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInstrumentRevealInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInstrumentRevealInfo
  * @throws IOException if the JSON string is invalid with respect to PaymentInstrumentRevealInfo
  */
  public static PaymentInstrumentRevealInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInstrumentRevealInfo.class);
  }

 /**
  * Convert an instance of PaymentInstrumentRevealInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

