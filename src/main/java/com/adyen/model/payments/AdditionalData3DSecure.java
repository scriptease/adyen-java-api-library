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
 * AdditionalData3DSecure
 */

public class AdditionalData3DSecure {
  public static final String SERIALIZED_NAME_ALLOW3_D_S2 = "allow3DS2";
  @SerializedName(SERIALIZED_NAME_ALLOW3_D_S2)
  private String allow3DS2;

  /**
   * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
   */
  @JsonAdapter(ChallengeWindowSizeEnum.Adapter.class)
  public enum ChallengeWindowSizeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05");

    private String value;

    ChallengeWindowSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChallengeWindowSizeEnum fromValue(String value) {
      for (ChallengeWindowSizeEnum b : ChallengeWindowSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChallengeWindowSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChallengeWindowSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChallengeWindowSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChallengeWindowSizeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHALLENGE_WINDOW_SIZE = "challengeWindowSize";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_WINDOW_SIZE)
  private ChallengeWindowSizeEnum challengeWindowSize;

  public static final String SERIALIZED_NAME_EXECUTE_THREE_D = "executeThreeD";
  @SerializedName(SERIALIZED_NAME_EXECUTE_THREE_D)
  private String executeThreeD;

  public static final String SERIALIZED_NAME_MPI_IMPLEMENTATION_TYPE = "mpiImplementationType";
  @SerializedName(SERIALIZED_NAME_MPI_IMPLEMENTATION_TYPE)
  private String mpiImplementationType;

  public static final String SERIALIZED_NAME_SCA_EXEMPTION = "scaExemption";
  @SerializedName(SERIALIZED_NAME_SCA_EXEMPTION)
  private String scaExemption;

  public static final String SERIALIZED_NAME_THREE_D_S_VERSION = "threeDSVersion";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_VERSION)
  private String threeDSVersion;

  public AdditionalData3DSecure() { 
  }

  public AdditionalData3DSecure allow3DS2(String allow3DS2) {
    
    this.allow3DS2 = allow3DS2;
    return this;
  }

   /**
   * Indicates if you are able to process 3D Secure 2 transactions natively on your payment page. Send this parameter when you are using &#x60;/payments&#x60; endpoint with any of our [native 3D Secure 2 solutions](https://docs.adyen.com/online-payments/3d-secure/native-3ds2).   &gt; This parameter only indicates readiness to support native 3D Secure 2 authentication. To specify if you _want_ to perform 3D Secure, use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) or send the &#x60;executeThreeD&#x60; parameter.  Possible values: * **true** - Ready to support native 3D Secure 2 authentication. Setting this to true does not mean always applying 3D Secure 2. Adyen still selects the version of 3D Secure based on configuration to optimize authorisation rates and improve the shopper&#39;s experience. * **false** – Not ready to support native 3D Secure 2 authentication. Adyen will not offer 3D Secure 2 to your shopper regardless of your configuration. 
   * @return allow3DS2
  **/
  @ApiModelProperty(value = "Indicates if you are able to process 3D Secure 2 transactions natively on your payment page. Send this parameter when you are using `/payments` endpoint with any of our [native 3D Secure 2 solutions](https://docs.adyen.com/online-payments/3d-secure/native-3ds2).   > This parameter only indicates readiness to support native 3D Secure 2 authentication. To specify if you _want_ to perform 3D Secure, use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) or send the `executeThreeD` parameter.  Possible values: * **true** - Ready to support native 3D Secure 2 authentication. Setting this to true does not mean always applying 3D Secure 2. Adyen still selects the version of 3D Secure based on configuration to optimize authorisation rates and improve the shopper's experience. * **false** – Not ready to support native 3D Secure 2 authentication. Adyen will not offer 3D Secure 2 to your shopper regardless of your configuration. ")

  public String getAllow3DS2() {
    return allow3DS2;
  }


  public void setAllow3DS2(String allow3DS2) {
    this.allow3DS2 = allow3DS2;
  }


  public AdditionalData3DSecure challengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    
    this.challengeWindowSize = challengeWindowSize;
    return this;
  }

   /**
   * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
   * @return challengeWindowSize
  **/
  @ApiModelProperty(value = "Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen")

  public ChallengeWindowSizeEnum getChallengeWindowSize() {
    return challengeWindowSize;
  }


  public void setChallengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
  }


  public AdditionalData3DSecure executeThreeD(String executeThreeD) {
    
    this.executeThreeD = executeThreeD;
    return this;
  }

   /**
   * Indicates if you want to perform 3D Secure authentication on a transaction.   &gt; Alternatively, you can use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) to configure rules for applying 3D Secure.  Possible values: * **true** – Perform 3D Secure authentication. * **false** – Don&#39;t perform 3D Secure authentication. Note that this setting results in refusals if the issuer mandates 3D Secure because of the PSD2 directive  or other, national regulations.  
   * @return executeThreeD
  **/
  @ApiModelProperty(value = "Indicates if you want to perform 3D Secure authentication on a transaction.   > Alternatively, you can use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) to configure rules for applying 3D Secure.  Possible values: * **true** – Perform 3D Secure authentication. * **false** – Don't perform 3D Secure authentication. Note that this setting results in refusals if the issuer mandates 3D Secure because of the PSD2 directive  or other, national regulations.  ")

  public String getExecuteThreeD() {
    return executeThreeD;
  }


  public void setExecuteThreeD(String executeThreeD) {
    this.executeThreeD = executeThreeD;
  }


  public AdditionalData3DSecure mpiImplementationType(String mpiImplementationType) {
    
    this.mpiImplementationType = mpiImplementationType;
    return this;
  }

   /**
   * In case of Secure+, this field must be set to **CUPSecurePlus**.
   * @return mpiImplementationType
  **/
  @ApiModelProperty(value = "In case of Secure+, this field must be set to **CUPSecurePlus**.")

  public String getMpiImplementationType() {
    return mpiImplementationType;
  }


  public void setMpiImplementationType(String mpiImplementationType) {
    this.mpiImplementationType = mpiImplementationType;
  }


  public AdditionalData3DSecure scaExemption(String scaExemption) {
    
    this.scaExemption = scaExemption;
    return this;
  }

   /**
   * Indicates the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that you want to request for the transaction.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** 
   * @return scaExemption
  **/
  @ApiModelProperty(value = "Indicates the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that you want to request for the transaction.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** ")

  public String getScaExemption() {
    return scaExemption;
  }


  public void setScaExemption(String scaExemption) {
    this.scaExemption = scaExemption;
  }


  public AdditionalData3DSecure threeDSVersion(String threeDSVersion) {
    
    this.threeDSVersion = threeDSVersion;
    return this;
  }

   /**
   * Indicates your preference for the 3D Secure version.  &gt; If you use this parameter, you override the checks from Adyen&#39;s Authentication Engine. We recommend to use this field only if you have an extensive knowledge of 3D Secure.  Possible values: * **1.0.2**: Apply 3D Secure version 1.0.2.  * **2.1.0**: Apply 3D Secure version 2.1.0.  * **2.2.0**: Apply 3D Secure version 2.2.0. If the issuer does not support version 2.2.0, we will fall back to 2.1.0.  The following rules apply: * If you prefer 2.1.0 or 2.2.0 but we receive a negative &#x60;transStatus&#x60; in the &#x60;ARes&#x60;, we will apply the fallback policy configured in your account. For example, if the configuration is to fall back to 3D Secure 1, we will apply version 1.0.2. * If you prefer 2.1.0 or 2.2.0 but the BIN is not enrolled, you will receive an error.  
   * @return threeDSVersion
  **/
  @ApiModelProperty(value = "Indicates your preference for the 3D Secure version.  > If you use this parameter, you override the checks from Adyen's Authentication Engine. We recommend to use this field only if you have an extensive knowledge of 3D Secure.  Possible values: * **1.0.2**: Apply 3D Secure version 1.0.2.  * **2.1.0**: Apply 3D Secure version 2.1.0.  * **2.2.0**: Apply 3D Secure version 2.2.0. If the issuer does not support version 2.2.0, we will fall back to 2.1.0.  The following rules apply: * If you prefer 2.1.0 or 2.2.0 but we receive a negative `transStatus` in the `ARes`, we will apply the fallback policy configured in your account. For example, if the configuration is to fall back to 3D Secure 1, we will apply version 1.0.2. * If you prefer 2.1.0 or 2.2.0 but the BIN is not enrolled, you will receive an error.  ")

  public String getThreeDSVersion() {
    return threeDSVersion;
  }


  public void setThreeDSVersion(String threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalData3DSecure additionalData3DSecure = (AdditionalData3DSecure) o;
    return Objects.equals(this.allow3DS2, additionalData3DSecure.allow3DS2) &&
        Objects.equals(this.challengeWindowSize, additionalData3DSecure.challengeWindowSize) &&
        Objects.equals(this.executeThreeD, additionalData3DSecure.executeThreeD) &&
        Objects.equals(this.mpiImplementationType, additionalData3DSecure.mpiImplementationType) &&
        Objects.equals(this.scaExemption, additionalData3DSecure.scaExemption) &&
        Objects.equals(this.threeDSVersion, additionalData3DSecure.threeDSVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow3DS2, challengeWindowSize, executeThreeD, mpiImplementationType, scaExemption, threeDSVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalData3DSecure {\n");
    sb.append("    allow3DS2: ").append(toIndentedString(allow3DS2)).append("\n");
    sb.append("    challengeWindowSize: ").append(toIndentedString(challengeWindowSize)).append("\n");
    sb.append("    executeThreeD: ").append(toIndentedString(executeThreeD)).append("\n");
    sb.append("    mpiImplementationType: ").append(toIndentedString(mpiImplementationType)).append("\n");
    sb.append("    scaExemption: ").append(toIndentedString(scaExemption)).append("\n");
    sb.append("    threeDSVersion: ").append(toIndentedString(threeDSVersion)).append("\n");
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
    openapiFields.add("allow3DS2");
    openapiFields.add("challengeWindowSize");
    openapiFields.add("executeThreeD");
    openapiFields.add("mpiImplementationType");
    openapiFields.add("scaExemption");
    openapiFields.add("threeDSVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalData3DSecure
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalData3DSecure.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalData3DSecure is not found in the empty JSON string", AdditionalData3DSecure.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalData3DSecure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalData3DSecure` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field allow3DS2
      if (jsonObj.get("allow3DS2") != null && !jsonObj.get("allow3DS2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allow3DS2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allow3DS2").toString()));
      }
      // ensure the field challengeWindowSize can be parsed to an enum value
      if (jsonObj.get("challengeWindowSize") != null) {
        if(!jsonObj.get("challengeWindowSize").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `challengeWindowSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challengeWindowSize").toString()));
        }
        ChallengeWindowSizeEnum.fromValue(jsonObj.get("challengeWindowSize").getAsString());
      }
      // validate the optional field executeThreeD
      if (jsonObj.get("executeThreeD") != null && !jsonObj.get("executeThreeD").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `executeThreeD` to be a primitive type in the JSON string but got `%s`", jsonObj.get("executeThreeD").toString()));
      }
      // validate the optional field mpiImplementationType
      if (jsonObj.get("mpiImplementationType") != null && !jsonObj.get("mpiImplementationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpiImplementationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mpiImplementationType").toString()));
      }
      // validate the optional field scaExemption
      if (jsonObj.get("scaExemption") != null && !jsonObj.get("scaExemption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scaExemption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scaExemption").toString()));
      }
      // validate the optional field threeDSVersion
      if (jsonObj.get("threeDSVersion") != null && !jsonObj.get("threeDSVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalData3DSecure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalData3DSecure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalData3DSecure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalData3DSecure.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalData3DSecure>() {
           @Override
           public void write(JsonWriter out, AdditionalData3DSecure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalData3DSecure read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalData3DSecure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalData3DSecure
  * @throws IOException if the JSON string is invalid with respect to AdditionalData3DSecure
  */
  public static AdditionalData3DSecure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalData3DSecure.class);
  }

 /**
  * Convert an instance of AdditionalData3DSecure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

