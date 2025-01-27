/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * BcmcInfo
 */

public class BcmcInfo {
  public static final String SERIALIZED_NAME_ENABLE_BCMC_MOBILE = "enableBcmcMobile";
  @SerializedName(SERIALIZED_NAME_ENABLE_BCMC_MOBILE)
  private Boolean enableBcmcMobile;

  public BcmcInfo() { 
  }

  public BcmcInfo enableBcmcMobile(Boolean enableBcmcMobile) {
    
    this.enableBcmcMobile = enableBcmcMobile;
    return this;
  }

   /**
   * Indicates if [Bancontact mobile](https://docs.adyen.com/payment-methods/bancontact/bancontact-mobile) is enabled.
   * @return enableBcmcMobile
  **/
  @ApiModelProperty(value = "Indicates if [Bancontact mobile](https://docs.adyen.com/payment-methods/bancontact/bancontact-mobile) is enabled.")

  public Boolean getEnableBcmcMobile() {
    return enableBcmcMobile;
  }


  public void setEnableBcmcMobile(Boolean enableBcmcMobile) {
    this.enableBcmcMobile = enableBcmcMobile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcmcInfo bcmcInfo = (BcmcInfo) o;
    return Objects.equals(this.enableBcmcMobile, bcmcInfo.enableBcmcMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableBcmcMobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcmcInfo {\n");
    sb.append("    enableBcmcMobile: ").append(toIndentedString(enableBcmcMobile)).append("\n");
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
    openapiFields.add("enableBcmcMobile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BcmcInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BcmcInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BcmcInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BcmcInfo is not found in the empty JSON string", BcmcInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BcmcInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BcmcInfo` properties.", entry.getKey()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BcmcInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BcmcInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BcmcInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BcmcInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BcmcInfo>() {
           @Override
           public void write(JsonWriter out, BcmcInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BcmcInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BcmcInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BcmcInfo
  * @throws IOException if the JSON string is invalid with respect to BcmcInfo
  */
  public static BcmcInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BcmcInfo.class);
  }

 /**
  * Convert an instance of BcmcInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

