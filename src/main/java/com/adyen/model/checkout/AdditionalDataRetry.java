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

import com.adyen.model.checkout.JSON;

/**
 * AdditionalDataRetry
 */

public class AdditionalDataRetry {
  public static final String SERIALIZED_NAME_RETRY_CHAIN_ATTEMPT_NUMBER = "retry.chainAttemptNumber";
  @SerializedName(SERIALIZED_NAME_RETRY_CHAIN_ATTEMPT_NUMBER)
  private String retryChainAttemptNumber;

  public static final String SERIALIZED_NAME_RETRY_ORDER_ATTEMPT_NUMBER = "retry.orderAttemptNumber";
  @SerializedName(SERIALIZED_NAME_RETRY_ORDER_ATTEMPT_NUMBER)
  private String retryOrderAttemptNumber;

  public static final String SERIALIZED_NAME_RETRY_SKIP_RETRY = "retry.skipRetry";
  @SerializedName(SERIALIZED_NAME_RETRY_SKIP_RETRY)
  private String retrySkipRetry;

  public AdditionalDataRetry() { 
  }

  public AdditionalDataRetry retryChainAttemptNumber(String retryChainAttemptNumber) {
    
    this.retryChainAttemptNumber = retryChainAttemptNumber;
    return this;
  }

   /**
   * The number of times the transaction (not order) has been retried between different payment service providers. For instance, the &#x60;chainAttemptNumber&#x60; set to 2 means that this transaction has been recently tried on another provider before being sent to Adyen.  &gt; If you submit &#x60;retry.chainAttemptNumber&#x60;, &#x60;retry.orderAttemptNumber&#x60;, and &#x60;retry.skipRetry&#x60; values, we also recommend you provide the &#x60;merchantOrderReference&#x60; to facilitate linking payment attempts together.
   * @return retryChainAttemptNumber
  **/
  @ApiModelProperty(value = "The number of times the transaction (not order) has been retried between different payment service providers. For instance, the `chainAttemptNumber` set to 2 means that this transaction has been recently tried on another provider before being sent to Adyen.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together.")

  public String getRetryChainAttemptNumber() {
    return retryChainAttemptNumber;
  }


  public void setRetryChainAttemptNumber(String retryChainAttemptNumber) {
    this.retryChainAttemptNumber = retryChainAttemptNumber;
  }


  public AdditionalDataRetry retryOrderAttemptNumber(String retryOrderAttemptNumber) {
    
    this.retryOrderAttemptNumber = retryOrderAttemptNumber;
    return this;
  }

   /**
   * The index of the attempt to bill a particular order, which is identified by the &#x60;merchantOrderReference&#x60; field. For example, if a recurring transaction fails and is retried one day later, then the order number for these attempts would be 1 and 2, respectively.  &gt; If you submit &#x60;retry.chainAttemptNumber&#x60;, &#x60;retry.orderAttemptNumber&#x60;, and &#x60;retry.skipRetry&#x60; values, we also recommend you provide the &#x60;merchantOrderReference&#x60; to facilitate linking payment attempts together.
   * @return retryOrderAttemptNumber
  **/
  @ApiModelProperty(value = "The index of the attempt to bill a particular order, which is identified by the `merchantOrderReference` field. For example, if a recurring transaction fails and is retried one day later, then the order number for these attempts would be 1 and 2, respectively.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together.")

  public String getRetryOrderAttemptNumber() {
    return retryOrderAttemptNumber;
  }


  public void setRetryOrderAttemptNumber(String retryOrderAttemptNumber) {
    this.retryOrderAttemptNumber = retryOrderAttemptNumber;
  }


  public AdditionalDataRetry retrySkipRetry(String retrySkipRetry) {
    
    this.retrySkipRetry = retrySkipRetry;
    return this;
  }

   /**
   * The Boolean value indicating whether Adyen should skip or retry this transaction, if possible.  &gt; If you submit &#x60;retry.chainAttemptNumber&#x60;, &#x60;retry.orderAttemptNumber&#x60;, and &#x60;retry.skipRetry&#x60; values, we also recommend you provide the &#x60;merchantOrderReference&#x60; to facilitate linking payment attempts together.
   * @return retrySkipRetry
  **/
  @ApiModelProperty(value = "The Boolean value indicating whether Adyen should skip or retry this transaction, if possible.  > If you submit `retry.chainAttemptNumber`, `retry.orderAttemptNumber`, and `retry.skipRetry` values, we also recommend you provide the `merchantOrderReference` to facilitate linking payment attempts together.")

  public String getRetrySkipRetry() {
    return retrySkipRetry;
  }


  public void setRetrySkipRetry(String retrySkipRetry) {
    this.retrySkipRetry = retrySkipRetry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataRetry additionalDataRetry = (AdditionalDataRetry) o;
    return Objects.equals(this.retryChainAttemptNumber, additionalDataRetry.retryChainAttemptNumber) &&
        Objects.equals(this.retryOrderAttemptNumber, additionalDataRetry.retryOrderAttemptNumber) &&
        Objects.equals(this.retrySkipRetry, additionalDataRetry.retrySkipRetry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retryChainAttemptNumber, retryOrderAttemptNumber, retrySkipRetry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataRetry {\n");
    sb.append("    retryChainAttemptNumber: ").append(toIndentedString(retryChainAttemptNumber)).append("\n");
    sb.append("    retryOrderAttemptNumber: ").append(toIndentedString(retryOrderAttemptNumber)).append("\n");
    sb.append("    retrySkipRetry: ").append(toIndentedString(retrySkipRetry)).append("\n");
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
    openapiFields.add("retry.chainAttemptNumber");
    openapiFields.add("retry.orderAttemptNumber");
    openapiFields.add("retry.skipRetry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataRetry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataRetry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataRetry is not found in the empty JSON string", AdditionalDataRetry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataRetry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataRetry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field retry.chainAttemptNumber
      if (jsonObj.get("retry.chainAttemptNumber") != null && !jsonObj.get("retry.chainAttemptNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retry.chainAttemptNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retry.chainAttemptNumber").toString()));
      }
      // validate the optional field retry.orderAttemptNumber
      if (jsonObj.get("retry.orderAttemptNumber") != null && !jsonObj.get("retry.orderAttemptNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retry.orderAttemptNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retry.orderAttemptNumber").toString()));
      }
      // validate the optional field retry.skipRetry
      if (jsonObj.get("retry.skipRetry") != null && !jsonObj.get("retry.skipRetry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retry.skipRetry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retry.skipRetry").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataRetry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataRetry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataRetry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataRetry.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataRetry>() {
           @Override
           public void write(JsonWriter out, AdditionalDataRetry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataRetry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataRetry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataRetry
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataRetry
  */
  public static AdditionalDataRetry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataRetry.class);
  }

 /**
  * Convert an instance of AdditionalDataRetry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

