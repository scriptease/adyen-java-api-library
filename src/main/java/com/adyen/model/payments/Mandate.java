/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

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

import com.adyen.model.payments.JSON;

/**
 * Mandate
 */

public class Mandate {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  /**
   * The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.  
   */
  @JsonAdapter(AmountRuleEnum.Adapter.class)
  public enum AmountRuleEnum {
    MAX("max"),
    
    EXACT("exact");

    private String value;

    AmountRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AmountRuleEnum fromValue(String value) {
      for (AmountRuleEnum b : AmountRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AmountRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AmountRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AmountRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AmountRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AMOUNT_RULE = "amountRule";
  @SerializedName(SERIALIZED_NAME_AMOUNT_RULE)
  private AmountRuleEnum amountRule;

  /**
   * The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  
   */
  @JsonAdapter(BillingAttemptsRuleEnum.Adapter.class)
  public enum BillingAttemptsRuleEnum {
    ON("on"),
    
    BEFORE("before"),
    
    AFTER("after");

    private String value;

    BillingAttemptsRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingAttemptsRuleEnum fromValue(String value) {
      for (BillingAttemptsRuleEnum b : BillingAttemptsRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BillingAttemptsRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingAttemptsRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingAttemptsRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BillingAttemptsRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BILLING_ATTEMPTS_RULE = "billingAttemptsRule";
  @SerializedName(SERIALIZED_NAME_BILLING_ATTEMPTS_RULE)
  private BillingAttemptsRuleEnum billingAttemptsRule;

  public static final String SERIALIZED_NAME_BILLING_DAY = "billingDay";
  @SerializedName(SERIALIZED_NAME_BILLING_DAY)
  private String billingDay;

  public static final String SERIALIZED_NAME_ENDS_AT = "endsAt";
  @SerializedName(SERIALIZED_NAME_ENDS_AT)
  private String endsAt;

  /**
   * The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    ADHOC("adhoc"),
    
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    BIWEEKLY("biWeekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    HALFYEARLY("halfYearly"),
    
    YEARLY("yearly");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  private String remarks;

  public static final String SERIALIZED_NAME_STARTS_AT = "startsAt";
  @SerializedName(SERIALIZED_NAME_STARTS_AT)
  private String startsAt;

  public Mandate() { 
  }

  public Mandate amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The billing amount (in minor units) of the recurring transactions.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The billing amount (in minor units) of the recurring transactions.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Mandate amountRule(AmountRuleEnum amountRule) {
    
    this.amountRule = amountRule;
    return this;
  }

   /**
   * The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.  
   * @return amountRule
  **/
  @ApiModelProperty(value = "The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the `amount`.   * **exact**: The transaction amount should be the same as the `amount`.  ")

  public AmountRuleEnum getAmountRule() {
    return amountRule;
  }


  public void setAmountRule(AmountRuleEnum amountRule) {
    this.amountRule = amountRule;
  }


  public Mandate billingAttemptsRule(BillingAttemptsRuleEnum billingAttemptsRule) {
    
    this.billingAttemptsRule = billingAttemptsRule;
    return this;
  }

   /**
   * The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  
   * @return billingAttemptsRule
  **/
  @ApiModelProperty(value = "The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  ")

  public BillingAttemptsRuleEnum getBillingAttemptsRule() {
    return billingAttemptsRule;
  }


  public void setBillingAttemptsRule(BillingAttemptsRuleEnum billingAttemptsRule) {
    this.billingAttemptsRule = billingAttemptsRule;
  }


  public Mandate billingDay(String billingDay) {
    
    this.billingDay = billingDay;
    return this;
  }

   /**
   * The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the &#x60;frequency&#x60;.
   * @return billingDay
  **/
  @ApiModelProperty(value = "The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the `frequency`.")

  public String getBillingDay() {
    return billingDay;
  }


  public void setBillingDay(String billingDay) {
    this.billingDay = billingDay;
  }


  public Mandate endsAt(String endsAt) {
    
    this.endsAt = endsAt;
    return this;
  }

   /**
   * End date of the billing plan, in YYYY-MM-DD format.
   * @return endsAt
  **/
  @ApiModelProperty(required = true, value = "End date of the billing plan, in YYYY-MM-DD format.")

  public String getEndsAt() {
    return endsAt;
  }


  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }


  public Mandate frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public Mandate remarks(String remarks) {
    
    this.remarks = remarks;
    return this;
  }

   /**
   * The message shown by UPI to the shopper on the approval screen.
   * @return remarks
  **/
  @ApiModelProperty(value = "The message shown by UPI to the shopper on the approval screen.")

  public String getRemarks() {
    return remarks;
  }


  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Mandate startsAt(String startsAt) {
    
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date.
   * @return startsAt
  **/
  @ApiModelProperty(value = "Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date.")

  public String getStartsAt() {
    return startsAt;
  }


  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandate mandate = (Mandate) o;
    return Objects.equals(this.amount, mandate.amount) &&
        Objects.equals(this.amountRule, mandate.amountRule) &&
        Objects.equals(this.billingAttemptsRule, mandate.billingAttemptsRule) &&
        Objects.equals(this.billingDay, mandate.billingDay) &&
        Objects.equals(this.endsAt, mandate.endsAt) &&
        Objects.equals(this.frequency, mandate.frequency) &&
        Objects.equals(this.remarks, mandate.remarks) &&
        Objects.equals(this.startsAt, mandate.startsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountRule, billingAttemptsRule, billingDay, endsAt, frequency, remarks, startsAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandate {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountRule: ").append(toIndentedString(amountRule)).append("\n");
    sb.append("    billingAttemptsRule: ").append(toIndentedString(billingAttemptsRule)).append("\n");
    sb.append("    billingDay: ").append(toIndentedString(billingDay)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("amountRule");
    openapiFields.add("billingAttemptsRule");
    openapiFields.add("billingDay");
    openapiFields.add("endsAt");
    openapiFields.add("frequency");
    openapiFields.add("remarks");
    openapiFields.add("startsAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("endsAt");
    openapiRequiredFields.add("frequency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Mandate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Mandate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mandate is not found in the empty JSON string", Mandate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Mandate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Mandate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Mandate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field amount
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      // ensure the field amountRule can be parsed to an enum value
      if (jsonObj.get("amountRule") != null) {
        if(!jsonObj.get("amountRule").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `amountRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountRule").toString()));
        }
        AmountRuleEnum.fromValue(jsonObj.get("amountRule").getAsString());
      }
      // ensure the field billingAttemptsRule can be parsed to an enum value
      if (jsonObj.get("billingAttemptsRule") != null) {
        if(!jsonObj.get("billingAttemptsRule").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `billingAttemptsRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAttemptsRule").toString()));
        }
        BillingAttemptsRuleEnum.fromValue(jsonObj.get("billingAttemptsRule").getAsString());
      }
      // validate the optional field billingDay
      if (jsonObj.get("billingDay") != null && !jsonObj.get("billingDay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingDay").toString()));
      }
      // validate the optional field endsAt
      if (jsonObj.get("endsAt") != null && !jsonObj.get("endsAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endsAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endsAt").toString()));
      }
      // ensure the field frequency can be parsed to an enum value
      if (jsonObj.get("frequency") != null) {
        if(!jsonObj.get("frequency").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
        }
        FrequencyEnum.fromValue(jsonObj.get("frequency").getAsString());
      }
      // validate the optional field remarks
      if (jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      // validate the optional field startsAt
      if (jsonObj.get("startsAt") != null && !jsonObj.get("startsAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startsAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startsAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mandate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mandate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mandate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mandate.class));

       return (TypeAdapter<T>) new TypeAdapter<Mandate>() {
           @Override
           public void write(JsonWriter out, Mandate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Mandate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Mandate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Mandate
  * @throws IOException if the JSON string is invalid with respect to Mandate
  */
  public static Mandate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mandate.class);
  }

 /**
  * Convert an instance of Mandate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

