/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * MasterpassDetails
 */

public class MasterpassDetails {
  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  @JsonAdapter(FundingSourceEnum.Adapter.class)
  public enum FundingSourceEnum {
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FundingSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FundingSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FundingSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FundingSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FUNDING_SOURCE = "fundingSource";
  @SerializedName(SERIALIZED_NAME_FUNDING_SOURCE)
  private FundingSourceEnum fundingSource;

  public static final String SERIALIZED_NAME_MASTERPASS_TRANSACTION_ID = "masterpassTransactionId";
  @SerializedName(SERIALIZED_NAME_MASTERPASS_TRANSACTION_ID)
  private String masterpassTransactionId;

  /**
   * **masterpass**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MASTERPASS("masterpass");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.MASTERPASS;

  public MasterpassDetails() { 
  }

  public MasterpassDetails checkoutAttemptId(String checkoutAttemptId) {
    
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public MasterpassDetails fundingSource(FundingSourceEnum fundingSource) {
    
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.")

  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }


  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }


  public MasterpassDetails masterpassTransactionId(String masterpassTransactionId) {
    
    this.masterpassTransactionId = masterpassTransactionId;
    return this;
  }

   /**
   * The Masterpass transaction ID.
   * @return masterpassTransactionId
  **/
  @ApiModelProperty(required = true, value = "The Masterpass transaction ID.")

  public String getMasterpassTransactionId() {
    return masterpassTransactionId;
  }


  public void setMasterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
  }


  public MasterpassDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **masterpass**
   * @return type
  **/
  @ApiModelProperty(value = "**masterpass**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterpassDetails masterpassDetails = (MasterpassDetails) o;
    return Objects.equals(this.checkoutAttemptId, masterpassDetails.checkoutAttemptId) &&
        Objects.equals(this.fundingSource, masterpassDetails.fundingSource) &&
        Objects.equals(this.masterpassTransactionId, masterpassDetails.masterpassTransactionId) &&
        Objects.equals(this.type, masterpassDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, fundingSource, masterpassTransactionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterpassDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    masterpassTransactionId: ").append(toIndentedString(masterpassTransactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("fundingSource");
    openapiFields.add("masterpassTransactionId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("masterpassTransactionId");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(MasterpassDetails.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MasterpassDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MasterpassDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MasterpassDetails is not found in the empty JSON string", MasterpassDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MasterpassDetails.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `MasterpassDetails` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MasterpassDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // ensure the field fundingSource can be parsed to an enum value
      if (jsonObj.get("fundingSource") != null) {
        if(!jsonObj.get("fundingSource").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `fundingSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundingSource").toString()));
        }
        FundingSourceEnum.fromValue(jsonObj.get("fundingSource").getAsString());
      }
      // validate the optional field masterpassTransactionId
      if (jsonObj.get("masterpassTransactionId") != null && !jsonObj.get("masterpassTransactionId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `masterpassTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masterpassTransactionId").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MasterpassDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MasterpassDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MasterpassDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MasterpassDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<MasterpassDetails>() {
           @Override
           public void write(JsonWriter out, MasterpassDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MasterpassDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MasterpassDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MasterpassDetails
  * @throws IOException if the JSON string is invalid with respect to MasterpassDetails
  */
  public static MasterpassDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MasterpassDetails.class);
  }

 /**
  * Convert an instance of MasterpassDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
