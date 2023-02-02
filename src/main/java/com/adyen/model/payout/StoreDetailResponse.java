/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.adyen.model.payout.JSON;

/**
 * StoreDetailResponse
 */

public class StoreDetailResponse {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public StoreDetailResponse() { 
  }

  public StoreDetailResponse additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public StoreDetailResponse putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be returned in a particular response.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be returned in a particular response.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public StoreDetailResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * A new reference to uniquely identify this request.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "A new reference to uniquely identify this request.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public StoreDetailResponse recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * The token which you can use later on for submitting the payout.
   * @return recurringDetailReference
  **/
  @ApiModelProperty(required = true, value = "The token which you can use later on for submitting the payout.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public StoreDetailResponse resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result code of the transaction. &#x60;Success&#x60; indicates that the details were stored successfully.
   * @return resultCode
  **/
  @ApiModelProperty(required = true, value = "The result code of the transaction. `Success` indicates that the details were stored successfully.")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDetailResponse storeDetailResponse = (StoreDetailResponse) o;
    return Objects.equals(this.additionalData, storeDetailResponse.additionalData) &&
        Objects.equals(this.pspReference, storeDetailResponse.pspReference) &&
        Objects.equals(this.recurringDetailReference, storeDetailResponse.recurringDetailReference) &&
        Objects.equals(this.resultCode, storeDetailResponse.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, pspReference, recurringDetailReference, resultCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDetailResponse {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("pspReference");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("resultCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pspReference");
    openapiRequiredFields.add("recurringDetailReference");
    openapiRequiredFields.add("resultCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoreDetailResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoreDetailResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoreDetailResponse is not found in the empty JSON string", StoreDetailResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoreDetailResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StoreDetailResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StoreDetailResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field resultCode
      if (jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoreDetailResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoreDetailResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoreDetailResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoreDetailResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StoreDetailResponse>() {
           @Override
           public void write(JsonWriter out, StoreDetailResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoreDetailResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoreDetailResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoreDetailResponse
  * @throws IOException if the JSON string is invalid with respect to StoreDetailResponse
  */
  public static StoreDetailResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoreDetailResponse.class);
  }

 /**
  * Convert an instance of StoreDetailResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

