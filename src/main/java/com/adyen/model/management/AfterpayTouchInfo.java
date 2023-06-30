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
 * AfterpayTouchInfo
 */

public class AfterpayTouchInfo {
  public static final String SERIALIZED_NAME_SUPPORT_URL = "supportUrl";
  @SerializedName(SERIALIZED_NAME_SUPPORT_URL)
  private String supportUrl;

  public AfterpayTouchInfo() { 
  }

  public AfterpayTouchInfo supportUrl(String supportUrl) {
    
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * Support Url
   * @return supportUrl
  **/
  public String getSupportUrl() {
    return supportUrl;
  }


  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AfterpayTouchInfo afterpayTouchInfo = (AfterpayTouchInfo) o;
    return Objects.equals(this.supportUrl, afterpayTouchInfo.supportUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfterpayTouchInfo {\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
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
    openapiFields.add("supportUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("supportUrl");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AfterpayTouchInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AfterpayTouchInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AfterpayTouchInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AfterpayTouchInfo is not found in the empty JSON string", AfterpayTouchInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AfterpayTouchInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AfterpayTouchInfo` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AfterpayTouchInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field supportUrl
      if (jsonObj.get("supportUrl") != null && !jsonObj.get("supportUrl").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `supportUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AfterpayTouchInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AfterpayTouchInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AfterpayTouchInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AfterpayTouchInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AfterpayTouchInfo>() {
           @Override
           public void write(JsonWriter out, AfterpayTouchInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AfterpayTouchInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AfterpayTouchInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AfterpayTouchInfo
  * @throws IOException if the JSON string is invalid with respect to AfterpayTouchInfo
  */
  public static AfterpayTouchInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AfterpayTouchInfo.class);
  }

 /**
  * Convert an instance of AfterpayTouchInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

