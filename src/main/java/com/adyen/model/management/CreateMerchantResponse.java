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

import com.adyen.model.management.JSON;

/**
 * CreateMerchantResponse
 */

public class CreateMerchantResponse {
  public static final String SERIALIZED_NAME_BUSINESS_LINE_ID = "businessLineId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LINE_ID)
  private String businessLineId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  public static final String SERIALIZED_NAME_PRICING_PLAN = "pricingPlan";
  @SerializedName(SERIALIZED_NAME_PRICING_PLAN)
  private String pricingPlan;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public CreateMerchantResponse() { 
  }

  public CreateMerchantResponse businessLineId(String businessLineId) {
    
    this.businessLineId = businessLineId;
    return this;
  }

   /**
   * The unique identifier of the [business line](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines).
   * @return businessLineId
  **/
  @ApiModelProperty(value = "The unique identifier of the [business line](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines).")

  public String getBusinessLineId() {
    return businessLineId;
  }


  public void setBusinessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
  }


  public CreateMerchantResponse companyId(String companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The unique identifier of the company account.
   * @return companyId
  **/
  @ApiModelProperty(value = "The unique identifier of the company account.")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public CreateMerchantResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the merchant account, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the merchant account, maximum 300 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateMerchantResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the merchant account. If Adyen set up a template for the &#x60;reference&#x60;, then the &#x60;id&#x60; will have the same value as the &#x60;reference&#x60; that you sent in the request. Otherwise, the value is generated by Adyen.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant account. If Adyen set up a template for the `reference`, then the `id` will have the same value as the `reference` that you sent in the request. Otherwise, the value is generated by Adyen.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateMerchantResponse legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).
   * @return legalEntityId
  **/
  @ApiModelProperty(value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public CreateMerchantResponse pricingPlan(String pricingPlan) {
    
    this.pricingPlan = pricingPlan;
    return this;
  }

   /**
   * Partner pricing plan for the merchant, applicable for merchants under AfP managed company accounts.
   * @return pricingPlan
  **/
  @ApiModelProperty(value = "Partner pricing plan for the merchant, applicable for merchants under AfP managed company accounts.")

  public String getPricingPlan() {
    return pricingPlan;
  }


  public void setPricingPlan(String pricingPlan) {
    this.pricingPlan = pricingPlan;
  }


  public CreateMerchantResponse reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the merchant account.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the merchant account.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMerchantResponse createMerchantResponse = (CreateMerchantResponse) o;
    return Objects.equals(this.businessLineId, createMerchantResponse.businessLineId) &&
        Objects.equals(this.companyId, createMerchantResponse.companyId) &&
        Objects.equals(this.description, createMerchantResponse.description) &&
        Objects.equals(this.id, createMerchantResponse.id) &&
        Objects.equals(this.legalEntityId, createMerchantResponse.legalEntityId) &&
        Objects.equals(this.pricingPlan, createMerchantResponse.pricingPlan) &&
        Objects.equals(this.reference, createMerchantResponse.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLineId, companyId, description, id, legalEntityId, pricingPlan, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMerchantResponse {\n");
    sb.append("    businessLineId: ").append(toIndentedString(businessLineId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    pricingPlan: ").append(toIndentedString(pricingPlan)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("businessLineId");
    openapiFields.add("companyId");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("legalEntityId");
    openapiFields.add("pricingPlan");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateMerchantResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateMerchantResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMerchantResponse is not found in the empty JSON string", CreateMerchantResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateMerchantResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMerchantResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field businessLineId
      if (jsonObj.get("businessLineId") != null && !jsonObj.get("businessLineId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessLineId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessLineId").toString()));
      }
      // validate the optional field companyId
      if (jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
      }
      // validate the optional field pricingPlan
      if (jsonObj.get("pricingPlan") != null && !jsonObj.get("pricingPlan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricingPlan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricingPlan").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMerchantResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMerchantResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMerchantResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMerchantResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMerchantResponse>() {
           @Override
           public void write(JsonWriter out, CreateMerchantResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMerchantResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateMerchantResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMerchantResponse
  * @throws IOException if the JSON string is invalid with respect to CreateMerchantResponse
  */
  public static CreateMerchantResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMerchantResponse.class);
  }

 /**
  * Convert an instance of CreateMerchantResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

