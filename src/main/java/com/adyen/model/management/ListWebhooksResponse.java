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
import com.adyen.model.management.PaginationLinks;
import com.adyen.model.management.Webhook;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * ListWebhooksResponse
 */

public class ListWebhooksResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PaginationLinks links;

  public static final String SERIALIZED_NAME_ACCOUNT_REFERENCE = "accountReference";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_REFERENCE)
  private String accountReference;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Webhook> data = null;

  public static final String SERIALIZED_NAME_ITEMS_TOTAL = "itemsTotal";
  @SerializedName(SERIALIZED_NAME_ITEMS_TOTAL)
  private Integer itemsTotal;

  public static final String SERIALIZED_NAME_PAGES_TOTAL = "pagesTotal";
  @SerializedName(SERIALIZED_NAME_PAGES_TOTAL)
  private Integer pagesTotal;

  public ListWebhooksResponse() { 
  }

  public ListWebhooksResponse links(PaginationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  public PaginationLinks getLinks() {
    return links;
  }


  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  public ListWebhooksResponse accountReference(String accountReference) {
    
    this.accountReference = accountReference;
    return this;
  }

   /**
   * Reference to the account.
   * @return accountReference
  **/
  @ApiModelProperty(value = "Reference to the account.")

  public String getAccountReference() {
    return accountReference;
  }


  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }


  public ListWebhooksResponse data(List<Webhook> data) {
    
    this.data = data;
    return this;
  }

  public ListWebhooksResponse addDataItem(Webhook dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The list of webhooks configured for this account.
   * @return data
  **/
  @ApiModelProperty(value = "The list of webhooks configured for this account.")

  public List<Webhook> getData() {
    return data;
  }


  public void setData(List<Webhook> data) {
    this.data = data;
  }


  public ListWebhooksResponse itemsTotal(Integer itemsTotal) {
    
    this.itemsTotal = itemsTotal;
    return this;
  }

   /**
   * Total number of items.
   * @return itemsTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of items.")

  public Integer getItemsTotal() {
    return itemsTotal;
  }


  public void setItemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
  }


  public ListWebhooksResponse pagesTotal(Integer pagesTotal) {
    
    this.pagesTotal = pagesTotal;
    return this;
  }

   /**
   * Total number of pages.
   * @return pagesTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of pages.")

  public Integer getPagesTotal() {
    return pagesTotal;
  }


  public void setPagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWebhooksResponse listWebhooksResponse = (ListWebhooksResponse) o;
    return Objects.equals(this.links, listWebhooksResponse.links) &&
        Objects.equals(this.accountReference, listWebhooksResponse.accountReference) &&
        Objects.equals(this.data, listWebhooksResponse.data) &&
        Objects.equals(this.itemsTotal, listWebhooksResponse.itemsTotal) &&
        Objects.equals(this.pagesTotal, listWebhooksResponse.pagesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, accountReference, data, itemsTotal, pagesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWebhooksResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("accountReference");
    openapiFields.add("data");
    openapiFields.add("itemsTotal");
    openapiFields.add("pagesTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("itemsTotal");
    openapiRequiredFields.add("pagesTotal");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(ListWebhooksResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListWebhooksResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListWebhooksResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListWebhooksResponse is not found in the empty JSON string", ListWebhooksResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListWebhooksResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `ListWebhooksResponse` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListWebhooksResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
        PaginationLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      // validate the optional field accountReference
      if (jsonObj.get("accountReference") != null && !jsonObj.get("accountReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `accountReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountReference").toString()));
      }
      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      if (jsonArraydata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
        }

        // validate the optional field `data` (array)
        for (int i = 0; i < jsonArraydata.size(); i++) {
          Webhook.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListWebhooksResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListWebhooksResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListWebhooksResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListWebhooksResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListWebhooksResponse>() {
           @Override
           public void write(JsonWriter out, ListWebhooksResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListWebhooksResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListWebhooksResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListWebhooksResponse
  * @throws IOException if the JSON string is invalid with respect to ListWebhooksResponse
  */
  public static ListWebhooksResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListWebhooksResponse.class);
  }

 /**
  * Convert an instance of ListWebhooksResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

