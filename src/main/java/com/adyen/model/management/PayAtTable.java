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
 * PayAtTable
 */

public class PayAtTable {
  /**
   * Allowed authentication methods: Magswipe, Manual Entry.
   */
  @JsonAdapter(AuthenticationMethodEnum.Adapter.class)
  public enum AuthenticationMethodEnum {
    MAGSWIPE("MAGSWIPE"),
    
    MKE("MKE");

    private String value;

    AuthenticationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationMethodEnum fromValue(String value) {
      for (AuthenticationMethodEnum b : AuthenticationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthenticationMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_METHOD = "authenticationMethod";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_METHOD)
  private AuthenticationMethodEnum authenticationMethod;

  public static final String SERIALIZED_NAME_ENABLE_PAY_AT_TABLE = "enablePayAtTable";
  @SerializedName(SERIALIZED_NAME_ENABLE_PAY_AT_TABLE)
  private Boolean enablePayAtTable;

  public PayAtTable() { 
  }

  public PayAtTable authenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * Allowed authentication methods: Magswipe, Manual Entry.
   * @return authenticationMethod
  **/
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }


  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }


  public PayAtTable enablePayAtTable(Boolean enablePayAtTable) {
    
    this.enablePayAtTable = enablePayAtTable;
    return this;
  }

   /**
   * Enable Pay at table.
   * @return enablePayAtTable
  **/
  public Boolean getEnablePayAtTable() {
    return enablePayAtTable;
  }


  public void setEnablePayAtTable(Boolean enablePayAtTable) {
    this.enablePayAtTable = enablePayAtTable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayAtTable payAtTable = (PayAtTable) o;
    return Objects.equals(this.authenticationMethod, payAtTable.authenticationMethod) &&
        Objects.equals(this.enablePayAtTable, payAtTable.enablePayAtTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethod, enablePayAtTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayAtTable {\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    enablePayAtTable: ").append(toIndentedString(enablePayAtTable)).append("\n");
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
    openapiFields.add("authenticationMethod");
    openapiFields.add("enablePayAtTable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(PayAtTable.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayAtTable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PayAtTable.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayAtTable is not found in the empty JSON string", PayAtTable.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PayAtTable.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `PayAtTable` properties.", entry.getKey()));
        }
      }
      // ensure the field authenticationMethod can be parsed to an enum value
      if (jsonObj.get("authenticationMethod") != null) {
        if(!jsonObj.get("authenticationMethod").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `authenticationMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authenticationMethod").toString()));
        }
        AuthenticationMethodEnum.fromValue(jsonObj.get("authenticationMethod").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayAtTable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayAtTable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayAtTable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayAtTable.class));

       return (TypeAdapter<T>) new TypeAdapter<PayAtTable>() {
           @Override
           public void write(JsonWriter out, PayAtTable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayAtTable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayAtTable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayAtTable
  * @throws IOException if the JSON string is invalid with respect to PayAtTable
  */
  public static PayAtTable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayAtTable.class);
  }

 /**
  * Convert an instance of PayAtTable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

