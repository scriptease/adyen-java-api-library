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
import com.adyen.model.management.LinksElement;
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
 * WebhookLinks
 */

public class WebhookLinks {
  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private LinksElement company;

  public static final String SERIALIZED_NAME_GENERATE_HMAC = "generateHmac";
  @SerializedName(SERIALIZED_NAME_GENERATE_HMAC)
  private LinksElement generateHmac;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private LinksElement merchant;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private LinksElement self;

  public static final String SERIALIZED_NAME_TEST_WEBHOOK = "testWebhook";
  @SerializedName(SERIALIZED_NAME_TEST_WEBHOOK)
  private LinksElement testWebhook;

  public WebhookLinks() { 
  }

  public WebhookLinks company(LinksElement company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  public LinksElement getCompany() {
    return company;
  }


  public void setCompany(LinksElement company) {
    this.company = company;
  }


  public WebhookLinks generateHmac(LinksElement generateHmac) {
    
    this.generateHmac = generateHmac;
    return this;
  }

   /**
   * Get generateHmac
   * @return generateHmac
  **/
  public LinksElement getGenerateHmac() {
    return generateHmac;
  }


  public void setGenerateHmac(LinksElement generateHmac) {
    this.generateHmac = generateHmac;
  }


  public WebhookLinks merchant(LinksElement merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public LinksElement getMerchant() {
    return merchant;
  }


  public void setMerchant(LinksElement merchant) {
    this.merchant = merchant;
  }


  public WebhookLinks self(LinksElement self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  public LinksElement getSelf() {
    return self;
  }


  public void setSelf(LinksElement self) {
    this.self = self;
  }


  public WebhookLinks testWebhook(LinksElement testWebhook) {
    
    this.testWebhook = testWebhook;
    return this;
  }

   /**
   * Get testWebhook
   * @return testWebhook
  **/
  public LinksElement getTestWebhook() {
    return testWebhook;
  }


  public void setTestWebhook(LinksElement testWebhook) {
    this.testWebhook = testWebhook;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLinks webhookLinks = (WebhookLinks) o;
    return Objects.equals(this.company, webhookLinks.company) &&
        Objects.equals(this.generateHmac, webhookLinks.generateHmac) &&
        Objects.equals(this.merchant, webhookLinks.merchant) &&
        Objects.equals(this.self, webhookLinks.self) &&
        Objects.equals(this.testWebhook, webhookLinks.testWebhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, generateHmac, merchant, self, testWebhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLinks {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    generateHmac: ").append(toIndentedString(generateHmac)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    testWebhook: ").append(toIndentedString(testWebhook)).append("\n");
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
    openapiFields.add("company");
    openapiFields.add("generateHmac");
    openapiFields.add("merchant");
    openapiFields.add("self");
    openapiFields.add("testWebhook");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("generateHmac");
    openapiRequiredFields.add("self");
    openapiRequiredFields.add("testWebhook");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(WebhookLinks.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WebhookLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookLinks is not found in the empty JSON string", WebhookLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookLinks.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `WebhookLinks` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookLinks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `company`
      if (jsonObj.getAsJsonObject("company") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("company"));
      }
      // validate the optional field `generateHmac`
      if (jsonObj.getAsJsonObject("generateHmac") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("generateHmac"));
      }
      // validate the optional field `merchant`
      if (jsonObj.getAsJsonObject("merchant") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("merchant"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
      // validate the optional field `testWebhook`
      if (jsonObj.getAsJsonObject("testWebhook") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("testWebhook"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookLinks>() {
           @Override
           public void write(JsonWriter out, WebhookLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookLinks
  * @throws IOException if the JSON string is invalid with respect to WebhookLinks
  */
  public static WebhookLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookLinks.class);
  }

 /**
  * Convert an instance of WebhookLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

