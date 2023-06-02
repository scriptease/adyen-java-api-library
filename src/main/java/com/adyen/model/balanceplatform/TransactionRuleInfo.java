/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.TransactionRuleEntityKey;
import com.adyen.model.balanceplatform.TransactionRuleInterval;
import com.adyen.model.balanceplatform.TransactionRuleRestrictions;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * TransactionRuleInfo
 */

public class TransactionRuleInfo {
  public static final String SERIALIZED_NAME_AGGREGATION_LEVEL = "aggregationLevel";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_LEVEL)
  private String aggregationLevel;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_ENTITY_KEY = "entityKey";
  @SerializedName(SERIALIZED_NAME_ENTITY_KEY)
  private TransactionRuleEntityKey entityKey;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TransactionRuleInterval interval;

  /**
   * The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the &#x60;score&#x60; you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.
   */
  @JsonAdapter(OutcomeTypeEnum.Adapter.class)
  public enum OutcomeTypeEnum {
    HARDBLOCK("hardBlock"),
    
    SCOREBASED("scoreBased");

    private String value;

    OutcomeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OutcomeTypeEnum fromValue(String value) {
      for (OutcomeTypeEnum b : OutcomeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OutcomeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OutcomeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OutcomeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OutcomeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OUTCOME_TYPE = "outcomeType";
  @SerializedName(SERIALIZED_NAME_OUTCOME_TYPE)
  private OutcomeTypeEnum outcomeType;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**.
   */
  @JsonAdapter(RequestTypeEnum.Adapter.class)
  public enum RequestTypeEnum {
    AUTHENTICATION("authentication"),
    
    AUTHORIZATION("authorization"),
    
    TOKENIZATION("tokenization");

    private String value;

    RequestTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestTypeEnum fromValue(String value) {
      for (RequestTypeEnum b : RequestTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequestTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private RequestTypeEnum requestType;

  public static final String SERIALIZED_NAME_RULE_RESTRICTIONS = "ruleRestrictions";
  @SerializedName(SERIALIZED_NAME_RULE_RESTRICTIONS)
  private TransactionRuleRestrictions ruleRestrictions;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  /**
   * The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ALLOWLIST("allowList"),
    
    BLOCKLIST("blockList"),
    
    MAXUSAGE("maxUsage"),
    
    VELOCITY("velocity");

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
  private TypeEnum type;

  public TransactionRuleInfo() { 
  }

  public TransactionRuleInfo aggregationLevel(String aggregationLevel) {
    
    this.aggregationLevel = aggregationLevel;
    return this;
  }

   /**
   * The level at which data must be accumulated, used in rules with &#x60;type&#x60; **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the &#x60;entityKey&#x60;.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**.
   * @return aggregationLevel
  **/
  @ApiModelProperty(value = "The level at which data must be accumulated, used in rules with `type` **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the `entityKey`.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**.")

  public String getAggregationLevel() {
    return aggregationLevel;
  }


  public void setAggregationLevel(String aggregationLevel) {
    this.aggregationLevel = aggregationLevel;
  }


  public TransactionRuleInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the transaction rule, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Your description for the transaction rule, maximum 300 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionRuleInfo endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**.
   * @return endDate
  **/
  @ApiModelProperty(value = "The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TransactionRuleInfo entityKey(TransactionRuleEntityKey entityKey) {
    
    this.entityKey = entityKey;
    return this;
  }

   /**
   * Get entityKey
   * @return entityKey
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionRuleEntityKey getEntityKey() {
    return entityKey;
  }


  public void setEntityKey(TransactionRuleEntityKey entityKey) {
    this.entityKey = entityKey;
  }


  public TransactionRuleInfo interval(TransactionRuleInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionRuleInterval getInterval() {
    return interval;
  }


  public void setInterval(TransactionRuleInterval interval) {
    this.interval = interval;
  }


  public TransactionRuleInfo outcomeType(OutcomeTypeEnum outcomeType) {
    
    this.outcomeType = outcomeType;
    return this;
  }

   /**
   * The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the &#x60;score&#x60; you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.
   * @return outcomeType
  **/
  @ApiModelProperty(value = "The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the `score` you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.")

  public OutcomeTypeEnum getOutcomeType() {
    return outcomeType;
  }


  public void setOutcomeType(OutcomeTypeEnum outcomeType) {
    this.outcomeType = outcomeType;
  }


  public TransactionRuleInfo reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the transaction rule, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "Your reference for the transaction rule, maximum 150 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public TransactionRuleInfo requestType(RequestTypeEnum requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**.
   * @return requestType
  **/
  @ApiModelProperty(value = "Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**.")

  public RequestTypeEnum getRequestType() {
    return requestType;
  }


  public void setRequestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
  }


  public TransactionRuleInfo ruleRestrictions(TransactionRuleRestrictions ruleRestrictions) {
    
    this.ruleRestrictions = ruleRestrictions;
    return this;
  }

   /**
   * Get ruleRestrictions
   * @return ruleRestrictions
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionRuleRestrictions getRuleRestrictions() {
    return ruleRestrictions;
  }


  public void setRuleRestrictions(TransactionRuleRestrictions ruleRestrictions) {
    this.ruleRestrictions = ruleRestrictions;
  }


  public TransactionRuleInfo score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when &#x60;outcomeType&#x60; is **scoreBased**.  The value must be between **-100** and **100**.
   * @return score
  **/
  @ApiModelProperty(value = "A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when `outcomeType` is **scoreBased**.  The value must be between **-100** and **100**.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public TransactionRuleInfo startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the &#x60;startDate&#x60; is set to the date when the rule status is set to **active**.   
   * @return startDate
  **/
  @ApiModelProperty(value = "The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the `startDate` is set to the date when the rule status is set to **active**.   ")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TransactionRuleInfo status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the transaction rule. If you provide a `startDate` in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransactionRuleInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. ")

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
    TransactionRuleInfo transactionRuleInfo = (TransactionRuleInfo) o;
    return Objects.equals(this.aggregationLevel, transactionRuleInfo.aggregationLevel) &&
        Objects.equals(this.description, transactionRuleInfo.description) &&
        Objects.equals(this.endDate, transactionRuleInfo.endDate) &&
        Objects.equals(this.entityKey, transactionRuleInfo.entityKey) &&
        Objects.equals(this.interval, transactionRuleInfo.interval) &&
        Objects.equals(this.outcomeType, transactionRuleInfo.outcomeType) &&
        Objects.equals(this.reference, transactionRuleInfo.reference) &&
        Objects.equals(this.requestType, transactionRuleInfo.requestType) &&
        Objects.equals(this.ruleRestrictions, transactionRuleInfo.ruleRestrictions) &&
        Objects.equals(this.score, transactionRuleInfo.score) &&
        Objects.equals(this.startDate, transactionRuleInfo.startDate) &&
        Objects.equals(this.status, transactionRuleInfo.status) &&
        Objects.equals(this.type, transactionRuleInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationLevel, description, endDate, entityKey, interval, outcomeType, reference, requestType, ruleRestrictions, score, startDate, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleInfo {\n");
    sb.append("    aggregationLevel: ").append(toIndentedString(aggregationLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    entityKey: ").append(toIndentedString(entityKey)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    outcomeType: ").append(toIndentedString(outcomeType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    ruleRestrictions: ").append(toIndentedString(ruleRestrictions)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("aggregationLevel");
    openapiFields.add("description");
    openapiFields.add("endDate");
    openapiFields.add("entityKey");
    openapiFields.add("interval");
    openapiFields.add("outcomeType");
    openapiFields.add("reference");
    openapiFields.add("requestType");
    openapiFields.add("ruleRestrictions");
    openapiFields.add("score");
    openapiFields.add("startDate");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("entityKey");
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("ruleRestrictions");
    openapiRequiredFields.add("type");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(TransactionRuleInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRuleInfo is not found in the empty JSON string", TransactionRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionRuleInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `TransactionRuleInfo` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionRuleInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field aggregationLevel
      if (jsonObj.get("aggregationLevel") != null && !jsonObj.get("aggregationLevel").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `aggregationLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregationLevel").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field endDate
      if (jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      // validate the optional field `entityKey`
      if (jsonObj.getAsJsonObject("entityKey") != null) {
        TransactionRuleEntityKey.validateJsonObject(jsonObj.getAsJsonObject("entityKey"));
      }
      // validate the optional field `interval`
      if (jsonObj.getAsJsonObject("interval") != null) {
        TransactionRuleInterval.validateJsonObject(jsonObj.getAsJsonObject("interval"));
      }
      // ensure the field outcomeType can be parsed to an enum value
      if (jsonObj.get("outcomeType") != null) {
        if(!jsonObj.get("outcomeType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `outcomeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outcomeType").toString()));
        }
        OutcomeTypeEnum.fromValue(jsonObj.get("outcomeType").getAsString());
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // ensure the field requestType can be parsed to an enum value
      if (jsonObj.get("requestType") != null) {
        if(!jsonObj.get("requestType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `requestType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestType").toString()));
        }
        RequestTypeEnum.fromValue(jsonObj.get("requestType").getAsString());
      }
      // validate the optional field `ruleRestrictions`
      if (jsonObj.getAsJsonObject("ruleRestrictions") != null) {
        TransactionRuleRestrictions.validateJsonObject(jsonObj.getAsJsonObject("ruleRestrictions"));
      }
      // validate the optional field startDate
      if (jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
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
       if (!TransactionRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRuleInfo>() {
           @Override
           public void write(JsonWriter out, TransactionRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRuleInfo
  * @throws IOException if the JSON string is invalid with respect to TransactionRuleInfo
  */
  public static TransactionRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRuleInfo.class);
  }

 /**
  * Convert an instance of TransactionRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
