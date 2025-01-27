/*
 * POS Terminal Management API
 * This API provides endpoints for managing your point-of-sale (POS) payment terminals. You can use the API to obtain information about a specific terminal, retrieve overviews of your terminals and stores, and assign terminals to a merchant account or store.  For more information, refer to [Assign terminals](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api).  ## Authentication Each request to the Terminal Management API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Terminal Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://postfmapi-test.adyen.com/postfmapi/terminal/v1/getTerminalsUnderAccount ``` When using versioned endpoints, Boolean response values are returned in string format: `\"true\"` or `\"false\"`. If you omit the version from the endpoint URL, Boolean response values are returned like this: `true` or `false`.
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.posterminalmanagement;

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

import com.adyen.model.posterminalmanagement.JSON;

/**
 * AssignTerminalsRequest
 */

public class AssignTerminalsRequest {
  public static final String SERIALIZED_NAME_COMPANY_ACCOUNT = "companyAccount";
  @SerializedName(SERIALIZED_NAME_COMPANY_ACCOUNT)
  private String companyAccount;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_MERCHANT_INVENTORY = "merchantInventory";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INVENTORY)
  private Boolean merchantInventory;

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private String store;

  public static final String SERIALIZED_NAME_TERMINALS = "terminals";
  @SerializedName(SERIALIZED_NAME_TERMINALS)
  private List<String> terminals = new ArrayList<>();

  public AssignTerminalsRequest() { 
  }

  public AssignTerminalsRequest companyAccount(String companyAccount) {
    
    this.companyAccount = companyAccount;
    return this;
  }

   /**
   * Your company account. To return terminals to the company inventory, specify only this parameter and the &#x60;terminals&#x60;.
   * @return companyAccount
  **/
  @ApiModelProperty(required = true, value = "Your company account. To return terminals to the company inventory, specify only this parameter and the `terminals`.")

  public String getCompanyAccount() {
    return companyAccount;
  }


  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }


  public AssignTerminalsRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * Name of the merchant account. Specify this parameter to assign terminals to this merchant account or to a store under this merchant account.
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "Name of the merchant account. Specify this parameter to assign terminals to this merchant account or to a store under this merchant account.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public AssignTerminalsRequest merchantInventory(Boolean merchantInventory) {
    
    this.merchantInventory = merchantInventory;
    return this;
  }

   /**
   * Boolean that indicates if you are assigning the terminals to the merchant inventory. Do not use when assigning terminals to a store. Required when assigning the terminal to a merchant account.  - Set this to **true** to assign the terminals to the merchant inventory. This also means that the terminals cannot be boarded.  - Set this to **false** to assign the terminals to the merchant account as in-store terminals. This makes the terminals ready to be boarded and to process payments through the specified merchant account.
   * @return merchantInventory
  **/
  @ApiModelProperty(value = "Boolean that indicates if you are assigning the terminals to the merchant inventory. Do not use when assigning terminals to a store. Required when assigning the terminal to a merchant account.  - Set this to **true** to assign the terminals to the merchant inventory. This also means that the terminals cannot be boarded.  - Set this to **false** to assign the terminals to the merchant account as in-store terminals. This makes the terminals ready to be boarded and to process payments through the specified merchant account.")

  public Boolean getMerchantInventory() {
    return merchantInventory;
  }


  public void setMerchantInventory(Boolean merchantInventory) {
    this.merchantInventory = merchantInventory;
  }


  public AssignTerminalsRequest store(String store) {
    
    this.store = store;
    return this;
  }

   /**
   * The store code of the store that you want to assign the terminals to.
   * @return store
  **/
  @ApiModelProperty(value = "The store code of the store that you want to assign the terminals to.")

  public String getStore() {
    return store;
  }


  public void setStore(String store) {
    this.store = store;
  }


  public AssignTerminalsRequest terminals(List<String> terminals) {
    
    this.terminals = terminals;
    return this;
  }

  public AssignTerminalsRequest addTerminalsItem(String terminalsItem) {
    this.terminals.add(terminalsItem);
    return this;
  }

   /**
   * Array containing a list of terminal IDs that you want to assign or reassign to the merchant account or store, or that you want to return to the company inventory.  For example, &#x60;[\&quot;V400m-324689776\&quot;,\&quot;P400Plus-329127412\&quot;]&#x60;.
   * @return terminals
  **/
  @ApiModelProperty(required = true, value = "Array containing a list of terminal IDs that you want to assign or reassign to the merchant account or store, or that you want to return to the company inventory.  For example, `[\"V400m-324689776\",\"P400Plus-329127412\"]`.")

  public List<String> getTerminals() {
    return terminals;
  }


  public void setTerminals(List<String> terminals) {
    this.terminals = terminals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignTerminalsRequest assignTerminalsRequest = (AssignTerminalsRequest) o;
    return Objects.equals(this.companyAccount, assignTerminalsRequest.companyAccount) &&
        Objects.equals(this.merchantAccount, assignTerminalsRequest.merchantAccount) &&
        Objects.equals(this.merchantInventory, assignTerminalsRequest.merchantInventory) &&
        Objects.equals(this.store, assignTerminalsRequest.store) &&
        Objects.equals(this.terminals, assignTerminalsRequest.terminals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAccount, merchantAccount, merchantInventory, store, terminals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignTerminalsRequest {\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    merchantInventory: ").append(toIndentedString(merchantInventory)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    terminals: ").append(toIndentedString(terminals)).append("\n");
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
    openapiFields.add("companyAccount");
    openapiFields.add("merchantAccount");
    openapiFields.add("merchantInventory");
    openapiFields.add("store");
    openapiFields.add("terminals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("companyAccount");
    openapiRequiredFields.add("terminals");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AssignTerminalsRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssignTerminalsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssignTerminalsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssignTerminalsRequest is not found in the empty JSON string", AssignTerminalsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssignTerminalsRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AssignTerminalsRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssignTerminalsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field companyAccount
      if (jsonObj.get("companyAccount") != null && !jsonObj.get("companyAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `companyAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyAccount").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field store
      if (jsonObj.get("store") != null && !jsonObj.get("store").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `store` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("terminals") != null && !jsonObj.get("terminals").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `terminals` to be an array in the JSON string but got `%s`", jsonObj.get("terminals").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssignTerminalsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssignTerminalsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssignTerminalsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssignTerminalsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AssignTerminalsRequest>() {
           @Override
           public void write(JsonWriter out, AssignTerminalsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssignTerminalsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssignTerminalsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssignTerminalsRequest
  * @throws IOException if the JSON string is invalid with respect to AssignTerminalsRequest
  */
  public static AssignTerminalsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssignTerminalsRequest.class);
  }

 /**
  * Convert an instance of AssignTerminalsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

