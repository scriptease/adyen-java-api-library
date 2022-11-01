/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
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

import com.adyen.model.checkout.JSON;

/**
 * DokuDetails
 */

public class DokuDetails {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  /**
   * **doku**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MANDIRI_VA("doku_mandiri_va"),
    
    CIMB_VA("doku_cimb_va"),
    
    DANAMON_VA("doku_danamon_va"),
    
    BNI_VA("doku_bni_va"),
    
    PERMATA_LITE_ATM("doku_permata_lite_atm"),
    
    BRI_VA("doku_bri_va"),
    
    BCA_VA("doku_bca_va"),
    
    ALFAMART("doku_alfamart"),
    
    INDOMARET("doku_indomaret");

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

  public DokuDetails() { 
  }

  public DokuDetails firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The shopper&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shopper's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public DokuDetails lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The shopper&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shopper's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public DokuDetails shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper&#39;s email.
   * @return shopperEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shopper's email.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public DokuDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **doku**
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "**doku**")

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
    DokuDetails dokuDetails = (DokuDetails) o;
    return Objects.equals(this.firstName, dokuDetails.firstName) &&
        Objects.equals(this.lastName, dokuDetails.lastName) &&
        Objects.equals(this.shopperEmail, dokuDetails.shopperEmail) &&
        Objects.equals(this.type, dokuDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, shopperEmail, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DokuDetails {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("shopperEmail");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("shopperEmail");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DokuDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DokuDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DokuDetails is not found in the empty JSON string", DokuDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DokuDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DokuDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DokuDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field firstName
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      // validate the optional field lastName
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
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
       if (!DokuDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DokuDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DokuDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DokuDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DokuDetails>() {
           @Override
           public void write(JsonWriter out, DokuDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DokuDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DokuDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DokuDetails
  * @throws IOException if the JSON string is invalid with respect to DokuDetails
  */
  public static DokuDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DokuDetails.class);
  }

 /**
  * Convert an instance of DokuDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

