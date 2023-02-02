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

import com.adyen.model.management.JSON;

/**
 * ApiCredentialLinks
 */

public class ApiCredentialLinks {
  public static final String SERIALIZED_NAME_ALLOWED_ORIGINS = "allowedOrigins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ORIGINS)
  private LinksElement allowedOrigins;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private LinksElement company;

  public static final String SERIALIZED_NAME_GENERATE_API_KEY = "generateApiKey";
  @SerializedName(SERIALIZED_NAME_GENERATE_API_KEY)
  private LinksElement generateApiKey;

  public static final String SERIALIZED_NAME_GENERATE_CLIENT_KEY = "generateClientKey";
  @SerializedName(SERIALIZED_NAME_GENERATE_CLIENT_KEY)
  private LinksElement generateClientKey;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private LinksElement merchant;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private LinksElement self;

  public ApiCredentialLinks() { 
  }

  public ApiCredentialLinks allowedOrigins(LinksElement allowedOrigins) {
    
    this.allowedOrigins = allowedOrigins;
    return this;
  }

   /**
   * Get allowedOrigins
   * @return allowedOrigins
  **/
  @ApiModelProperty(value = "")

  public LinksElement getAllowedOrigins() {
    return allowedOrigins;
  }


  public void setAllowedOrigins(LinksElement allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public ApiCredentialLinks company(LinksElement company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")

  public LinksElement getCompany() {
    return company;
  }


  public void setCompany(LinksElement company) {
    this.company = company;
  }


  public ApiCredentialLinks generateApiKey(LinksElement generateApiKey) {
    
    this.generateApiKey = generateApiKey;
    return this;
  }

   /**
   * Get generateApiKey
   * @return generateApiKey
  **/
  @ApiModelProperty(value = "")

  public LinksElement getGenerateApiKey() {
    return generateApiKey;
  }


  public void setGenerateApiKey(LinksElement generateApiKey) {
    this.generateApiKey = generateApiKey;
  }


  public ApiCredentialLinks generateClientKey(LinksElement generateClientKey) {
    
    this.generateClientKey = generateClientKey;
    return this;
  }

   /**
   * Get generateClientKey
   * @return generateClientKey
  **/
  @ApiModelProperty(value = "")

  public LinksElement getGenerateClientKey() {
    return generateClientKey;
  }


  public void setGenerateClientKey(LinksElement generateClientKey) {
    this.generateClientKey = generateClientKey;
  }


  public ApiCredentialLinks merchant(LinksElement merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(value = "")

  public LinksElement getMerchant() {
    return merchant;
  }


  public void setMerchant(LinksElement merchant) {
    this.merchant = merchant;
  }


  public ApiCredentialLinks self(LinksElement self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")

  public LinksElement getSelf() {
    return self;
  }


  public void setSelf(LinksElement self) {
    this.self = self;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCredentialLinks apiCredentialLinks = (ApiCredentialLinks) o;
    return Objects.equals(this.allowedOrigins, apiCredentialLinks.allowedOrigins) &&
        Objects.equals(this.company, apiCredentialLinks.company) &&
        Objects.equals(this.generateApiKey, apiCredentialLinks.generateApiKey) &&
        Objects.equals(this.generateClientKey, apiCredentialLinks.generateClientKey) &&
        Objects.equals(this.merchant, apiCredentialLinks.merchant) &&
        Objects.equals(this.self, apiCredentialLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOrigins, company, generateApiKey, generateClientKey, merchant, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCredentialLinks {\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    generateApiKey: ").append(toIndentedString(generateApiKey)).append("\n");
    sb.append("    generateClientKey: ").append(toIndentedString(generateClientKey)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("allowedOrigins");
    openapiFields.add("company");
    openapiFields.add("generateApiKey");
    openapiFields.add("generateClientKey");
    openapiFields.add("merchant");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("self");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiCredentialLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApiCredentialLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCredentialLinks is not found in the empty JSON string", ApiCredentialLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiCredentialLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCredentialLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiCredentialLinks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `allowedOrigins`
      if (jsonObj.getAsJsonObject("allowedOrigins") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("allowedOrigins"));
      }
      // validate the optional field `company`
      if (jsonObj.getAsJsonObject("company") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("company"));
      }
      // validate the optional field `generateApiKey`
      if (jsonObj.getAsJsonObject("generateApiKey") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("generateApiKey"));
      }
      // validate the optional field `generateClientKey`
      if (jsonObj.getAsJsonObject("generateClientKey") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("generateClientKey"));
      }
      // validate the optional field `merchant`
      if (jsonObj.getAsJsonObject("merchant") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("merchant"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCredentialLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCredentialLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCredentialLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCredentialLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCredentialLinks>() {
           @Override
           public void write(JsonWriter out, ApiCredentialLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCredentialLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiCredentialLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiCredentialLinks
  * @throws IOException if the JSON string is invalid with respect to ApiCredentialLinks
  */
  public static ApiCredentialLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCredentialLinks.class);
  }

 /**
  * Convert an instance of ApiCredentialLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

