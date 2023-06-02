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
import com.adyen.model.management.BcmcInfo;
import com.adyen.model.management.CartesBancairesInfo;
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
 * UpdatePaymentMethodInfo
 */

public class UpdatePaymentMethodInfo {
  public static final String SERIALIZED_NAME_BCMC = "bcmc";
  @SerializedName(SERIALIZED_NAME_BCMC)
  private BcmcInfo bcmc;

  public static final String SERIALIZED_NAME_CARTES_BANCAIRES = "cartesBancaires";
  @SerializedName(SERIALIZED_NAME_CARTES_BANCAIRES)
  private CartesBancairesInfo cartesBancaires;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = null;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<String> currencies = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_STORE_IDS = "storeIds";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<String> storeIds = null;

  public UpdatePaymentMethodInfo() { 
  }

  public UpdatePaymentMethodInfo bcmc(BcmcInfo bcmc) {
    
    this.bcmc = bcmc;
    return this;
  }

   /**
   * Get bcmc
   * @return bcmc
  **/
  @ApiModelProperty(value = "")

  public BcmcInfo getBcmc() {
    return bcmc;
  }


  public void setBcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
  }


  public UpdatePaymentMethodInfo cartesBancaires(CartesBancairesInfo cartesBancaires) {
    
    this.cartesBancaires = cartesBancaires;
    return this;
  }

   /**
   * Get cartesBancaires
   * @return cartesBancaires
  **/
  @ApiModelProperty(value = "")

  public CartesBancairesInfo getCartesBancaires() {
    return cartesBancaires;
  }


  public void setCartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
  }


  public UpdatePaymentMethodInfo countries(List<String> countries) {
    
    this.countries = countries;
    return this;
  }

  public UpdatePaymentMethodInfo addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   * @return countries
  **/
  @ApiModelProperty(value = "The list of countries where a payment method is available. By default, all countries supported by the payment method.")

  public List<String> getCountries() {
    return countries;
  }


  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public UpdatePaymentMethodInfo currencies(List<String> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public UpdatePaymentMethodInfo addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   * @return currencies
  **/
  @ApiModelProperty(value = "The list of currencies that a payment method supports. By default, all currencies supported by the payment method.")

  public List<String> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }


  public UpdatePaymentMethodInfo enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   * @return enabled
  **/
  @ApiModelProperty(value = "Indicates whether the payment method is enabled (**true**) or disabled (**false**).")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UpdatePaymentMethodInfo storeIds(List<String> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public UpdatePaymentMethodInfo addStoreIdsItem(String storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * The list of stores for this payment method
   * @return storeIds
  **/
  @ApiModelProperty(value = "The list of stores for this payment method")

  public List<String> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentMethodInfo updatePaymentMethodInfo = (UpdatePaymentMethodInfo) o;
    return Objects.equals(this.bcmc, updatePaymentMethodInfo.bcmc) &&
        Objects.equals(this.cartesBancaires, updatePaymentMethodInfo.cartesBancaires) &&
        Objects.equals(this.countries, updatePaymentMethodInfo.countries) &&
        Objects.equals(this.currencies, updatePaymentMethodInfo.currencies) &&
        Objects.equals(this.enabled, updatePaymentMethodInfo.enabled) &&
        Objects.equals(this.storeIds, updatePaymentMethodInfo.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcmc, cartesBancaires, countries, currencies, enabled, storeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentMethodInfo {\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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
    openapiFields.add("bcmc");
    openapiFields.add("cartesBancaires");
    openapiFields.add("countries");
    openapiFields.add("currencies");
    openapiFields.add("enabled");
    openapiFields.add("storeIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(UpdatePaymentMethodInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePaymentMethodInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePaymentMethodInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePaymentMethodInfo is not found in the empty JSON string", UpdatePaymentMethodInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePaymentMethodInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `UpdatePaymentMethodInfo` properties.", entry.getKey()));
        }
      }
      // validate the optional field `bcmc`
      if (jsonObj.getAsJsonObject("bcmc") != null) {
        BcmcInfo.validateJsonObject(jsonObj.getAsJsonObject("bcmc"));
      }
      // validate the optional field `cartesBancaires`
      if (jsonObj.getAsJsonObject("cartesBancaires") != null) {
        CartesBancairesInfo.validateJsonObject(jsonObj.getAsJsonObject("cartesBancaires"));
      }
      // ensure the json data is an array
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `countries` to be an array in the JSON string but got `%s`", jsonObj.get("countries").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("currencies") != null && !jsonObj.get("currencies").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `currencies` to be an array in the JSON string but got `%s`", jsonObj.get("currencies").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("storeIds") != null && !jsonObj.get("storeIds").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `storeIds` to be an array in the JSON string but got `%s`", jsonObj.get("storeIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePaymentMethodInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePaymentMethodInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePaymentMethodInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePaymentMethodInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePaymentMethodInfo>() {
           @Override
           public void write(JsonWriter out, UpdatePaymentMethodInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePaymentMethodInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePaymentMethodInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePaymentMethodInfo
  * @throws IOException if the JSON string is invalid with respect to UpdatePaymentMethodInfo
  */
  public static UpdatePaymentMethodInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePaymentMethodInfo.class);
  }

 /**
  * Convert an instance of UpdatePaymentMethodInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
