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
import com.adyen.model.management.TerminalProduct;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TerminalProductsResponse
 */

public class TerminalProductsResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<TerminalProduct> data = null;

  public TerminalProductsResponse() { 
  }

  public TerminalProductsResponse data(List<TerminalProduct> data) {
    
    this.data = data;
    return this;
  }

  public TerminalProductsResponse addDataItem(TerminalProduct dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Terminal products that can be ordered.
   * @return data
  **/
  public List<TerminalProduct> getData() {
    return data;
  }


  public void setData(List<TerminalProduct> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalProductsResponse terminalProductsResponse = (TerminalProductsResponse) o;
    return Objects.equals(this.data, terminalProductsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalProductsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(TerminalProductsResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TerminalProductsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TerminalProductsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminalProductsResponse is not found in the empty JSON string", TerminalProductsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TerminalProductsResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `TerminalProductsResponse` properties.", entry.getKey()));
        }
      }
      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      if (jsonArraydata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
        }

        // validate the optional field `data` (array)
        for (int i = 0; i < jsonArraydata.size(); i++) {
          TerminalProduct.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalProductsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalProductsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalProductsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalProductsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalProductsResponse>() {
           @Override
           public void write(JsonWriter out, TerminalProductsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalProductsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalProductsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalProductsResponse
  * @throws IOException if the JSON string is invalid with respect to TerminalProductsResponse
  */
  public static TerminalProductsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalProductsResponse.class);
  }

 /**
  * Convert an instance of TerminalProductsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

