/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payment.ThreeDS2Result;
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

import com.adyen.model.payment.JSON;

/**
 * ThreeDS2ResultResponse
 */

public class ThreeDS2ResultResponse {
  public static final String SERIALIZED_NAME_THREE_D_S2_RESULT = "threeDS2Result";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_RESULT)
  private ThreeDS2Result threeDS2Result;

  public ThreeDS2ResultResponse() { 
  }

  public ThreeDS2ResultResponse threeDS2Result(ThreeDS2Result threeDS2Result) {
    
    this.threeDS2Result = threeDS2Result;
    return this;
  }

   /**
   * Get threeDS2Result
   * @return threeDS2Result
  **/
  @ApiModelProperty(value = "")

  public ThreeDS2Result getThreeDS2Result() {
    return threeDS2Result;
  }


  public void setThreeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS2ResultResponse threeDS2ResultResponse = (ThreeDS2ResultResponse) o;
    return Objects.equals(this.threeDS2Result, threeDS2ResultResponse.threeDS2Result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDS2Result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS2ResultResponse {\n");
    sb.append("    threeDS2Result: ").append(toIndentedString(threeDS2Result)).append("\n");
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
    openapiFields.add("threeDS2Result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(ThreeDS2ResultResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDS2ResultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDS2ResultResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDS2ResultResponse is not found in the empty JSON string", ThreeDS2ResultResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDS2ResultResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `ThreeDS2ResultResponse` properties.", entry.getKey()));
        }
      }
      // validate the optional field `threeDS2Result`
      if (jsonObj.getAsJsonObject("threeDS2Result") != null) {
        ThreeDS2Result.validateJsonObject(jsonObj.getAsJsonObject("threeDS2Result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDS2ResultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDS2ResultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDS2ResultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDS2ResultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDS2ResultResponse>() {
           @Override
           public void write(JsonWriter out, ThreeDS2ResultResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDS2ResultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDS2ResultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDS2ResultResponse
  * @throws IOException if the JSON string is invalid with respect to ThreeDS2ResultResponse
  */
  public static ThreeDS2ResultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDS2ResultResponse.class);
  }

 /**
  * Convert an instance of ThreeDS2ResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

