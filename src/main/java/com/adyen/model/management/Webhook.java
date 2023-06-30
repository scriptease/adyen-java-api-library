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
import com.adyen.model.management.AdditionalSettingsResponse;
import com.adyen.model.management.WebhookLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * Webhook
 */

public class Webhook {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private WebhookLinks links;

  public static final String SERIALIZED_NAME_ACCEPTS_EXPIRED_CERTIFICATE = "acceptsExpiredCertificate";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_EXPIRED_CERTIFICATE)
  private Boolean acceptsExpiredCertificate;

  public static final String SERIALIZED_NAME_ACCEPTS_SELF_SIGNED_CERTIFICATE = "acceptsSelfSignedCertificate";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_SELF_SIGNED_CERTIFICATE)
  private Boolean acceptsSelfSignedCertificate;

  public static final String SERIALIZED_NAME_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE = "acceptsUntrustedRootCertificate";
  @SerializedName(SERIALIZED_NAME_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE)
  private Boolean acceptsUntrustedRootCertificate;

  public static final String SERIALIZED_NAME_ACCOUNT_REFERENCE = "accountReference";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_REFERENCE)
  private String accountReference;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ADDITIONAL_SETTINGS = "additionalSettings";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_SETTINGS)
  private AdditionalSettingsResponse additionalSettings;

  public static final String SERIALIZED_NAME_CERTIFICATE_ALIAS = "certificateAlias";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ALIAS)
  private String certificateAlias;

  /**
   * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
   */
  @JsonAdapter(CommunicationFormatEnum.Adapter.class)
  public enum CommunicationFormatEnum {
    HTTP("http"),
    
    JSON("json"),
    
    SOAP("soap");

    private String value;

    CommunicationFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommunicationFormatEnum fromValue(String value) {
      for (CommunicationFormatEnum b : CommunicationFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CommunicationFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommunicationFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommunicationFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CommunicationFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMUNICATION_FORMAT = "communicationFormat";
  @SerializedName(SERIALIZED_NAME_COMMUNICATION_FORMAT)
  private CommunicationFormatEnum communicationFormat;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Shows how merchant accounts are included in company-level webhooks. Possible values: * **includeAccounts** * **excludeAccounts** * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;.
   */
  @JsonAdapter(FilterMerchantAccountTypeEnum.Adapter.class)
  public enum FilterMerchantAccountTypeEnum {
    ALLACCOUNTS("allAccounts"),
    
    EXCLUDEACCOUNTS("excludeAccounts"),
    
    INCLUDEACCOUNTS("includeAccounts");

    private String value;

    FilterMerchantAccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FilterMerchantAccountTypeEnum fromValue(String value) {
      for (FilterMerchantAccountTypeEnum b : FilterMerchantAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FilterMerchantAccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilterMerchantAccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilterMerchantAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FilterMerchantAccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNT_TYPE = "filterMerchantAccountType";
  @SerializedName(SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNT_TYPE)
  private FilterMerchantAccountTypeEnum filterMerchantAccountType;

  public static final String SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNTS = "filterMerchantAccounts";
  @SerializedName(SERIALIZED_NAME_FILTER_MERCHANT_ACCOUNTS)
  private List<String> filterMerchantAccounts = null;

  public static final String SERIALIZED_NAME_HAS_ERROR = "hasError";
  @SerializedName(SERIALIZED_NAME_HAS_ERROR)
  private Boolean hasError;

  public static final String SERIALIZED_NAME_HAS_PASSWORD = "hasPassword";
  @SerializedName(SERIALIZED_NAME_HAS_PASSWORD)
  private Boolean hasPassword;

  public static final String SERIALIZED_NAME_HMAC_KEY_CHECK_VALUE = "hmacKeyCheckValue";
  @SerializedName(SERIALIZED_NAME_HMAC_KEY_CHECK_VALUE)
  private String hmacKeyCheckValue;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Network type for Terminal API details webhooks.
   */
  @JsonAdapter(NetworkTypeEnum.Adapter.class)
  public enum NetworkTypeEnum {
    LOCAL("LOCAL"),
    
    PUBLIC("PUBLIC");

    private String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetworkTypeEnum fromValue(String value) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NetworkTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NETWORK_TYPE = "networkType";
  @SerializedName(SERIALIZED_NAME_NETWORK_TYPE)
  private NetworkTypeEnum networkType;

  public static final String SERIALIZED_NAME_POPULATE_SOAP_ACTION_HEADER = "populateSoapActionHeader";
  @SerializedName(SERIALIZED_NAME_POPULATE_SOAP_ACTION_HEADER)
  private Boolean populateSoapActionHeader;

  /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   */
  @JsonAdapter(SslVersionEnum.Adapter.class)
  public enum SslVersionEnum {
    HTTP("HTTP"),
    
    SSL("SSL"),
    
    SSLV3("SSLv3"),
    
    TLS("TLS"),
    
    TLSV1("TLSv1"),
    
    TLSV1_1("TLSv1.1"),
    
    TLSV1_2("TLSv1.2"),
    
    TLSV1_3("TLSv1.3");

    private String value;

    SslVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SslVersionEnum fromValue(String value) {
      for (SslVersionEnum b : SslVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SslVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SslVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SslVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SslVersionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SSL_VERSION = "sslVersion";
  @SerializedName(SERIALIZED_NAME_SSL_VERSION)
  private SslVersionEnum sslVersion;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public Webhook() { 
  }

  public Webhook links(WebhookLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  public WebhookLinks getLinks() {
    return links;
  }


  public void setLinks(WebhookLinks links) {
    this.links = links;
  }


  public Webhook acceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
    return this;
  }

   /**
   * Indicates if expired SSL certificates are accepted. Default value: **false**.
   * @return acceptsExpiredCertificate
  **/
  public Boolean getAcceptsExpiredCertificate() {
    return acceptsExpiredCertificate;
  }


  public void setAcceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
  }


  public Webhook acceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
    return this;
  }

   /**
   * Indicates if self-signed SSL certificates are accepted. Default value: **false**.
   * @return acceptsSelfSignedCertificate
  **/
  public Boolean getAcceptsSelfSignedCertificate() {
    return acceptsSelfSignedCertificate;
  }


  public void setAcceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
  }


  public Webhook acceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
    return this;
  }

   /**
   * Indicates if untrusted SSL certificates are accepted. Default value: **false**.
   * @return acceptsUntrustedRootCertificate
  **/
  public Boolean getAcceptsUntrustedRootCertificate() {
    return acceptsUntrustedRootCertificate;
  }


  public void setAcceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
  }


  public Webhook accountReference(String accountReference) {
    
    this.accountReference = accountReference;
    return this;
  }

   /**
   * Reference to the account the webook is set on.
   * @return accountReference
  **/
  public String getAccountReference() {
    return accountReference;
  }


  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }


  public Webhook active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Indicates if the webhook configuration is active. The field must be **true** for you to receive webhooks about events related an account.
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Webhook additionalSettings(AdditionalSettingsResponse additionalSettings) {
    
    this.additionalSettings = additionalSettings;
    return this;
  }

   /**
   * Get additionalSettings
   * @return additionalSettings
  **/
  public AdditionalSettingsResponse getAdditionalSettings() {
    return additionalSettings;
  }


  public void setAdditionalSettings(AdditionalSettingsResponse additionalSettings) {
    this.additionalSettings = additionalSettings;
  }


  public Webhook certificateAlias(String certificateAlias) {
    
    this.certificateAlias = certificateAlias;
    return this;
  }

   /**
   * The alias of our SSL certificate. When you receive a notification from us, the alias from the HMAC signature will match this alias.
   * @return certificateAlias
  **/
  public String getCertificateAlias() {
    return certificateAlias;
  }


  public void setCertificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
  }


  public Webhook communicationFormat(CommunicationFormatEnum communicationFormat) {
    
    this.communicationFormat = communicationFormat;
    return this;
  }

   /**
   * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
   * @return communicationFormat
  **/
  public CommunicationFormatEnum getCommunicationFormat() {
    return communicationFormat;
  }


  public void setCommunicationFormat(CommunicationFormatEnum communicationFormat) {
    this.communicationFormat = communicationFormat;
  }


  public Webhook description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for this webhook configuration.
   * @return description
  **/
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Webhook filterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    
    this.filterMerchantAccountType = filterMerchantAccountType;
    return this;
  }

   /**
   * Shows how merchant accounts are included in company-level webhooks. Possible values: * **includeAccounts** * **excludeAccounts** * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;.
   * @return filterMerchantAccountType
  **/
  public FilterMerchantAccountTypeEnum getFilterMerchantAccountType() {
    return filterMerchantAccountType;
  }


  public void setFilterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    this.filterMerchantAccountType = filterMerchantAccountType;
  }


  public Webhook filterMerchantAccounts(List<String> filterMerchantAccounts) {
    
    this.filterMerchantAccounts = filterMerchantAccounts;
    return this;
  }

  public Webhook addFilterMerchantAccountsItem(String filterMerchantAccountsItem) {
    if (this.filterMerchantAccounts == null) {
      this.filterMerchantAccounts = new ArrayList<>();
    }
    this.filterMerchantAccounts.add(filterMerchantAccountsItem);
    return this;
  }

   /**
   * A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**.
   * @return filterMerchantAccounts
  **/
  public List<String> getFilterMerchantAccounts() {
    return filterMerchantAccounts;
  }


  public void setFilterMerchantAccounts(List<String> filterMerchantAccounts) {
    this.filterMerchantAccounts = filterMerchantAccounts;
  }


  public Webhook hasError(Boolean hasError) {
    
    this.hasError = hasError;
    return this;
  }

   /**
   * Indicates if the webhook configuration has errors that need troubleshooting. If the value is **true**, troubleshoot the configuration using the [testing endpoint](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookid}/test).
   * @return hasError
  **/
  public Boolean getHasError() {
    return hasError;
  }


  public void setHasError(Boolean hasError) {
    this.hasError = hasError;
  }


  public Webhook hasPassword(Boolean hasPassword) {
    
    this.hasPassword = hasPassword;
    return this;
  }

   /**
   * Indicates if the webhook is password protected.
   * @return hasPassword
  **/
  public Boolean getHasPassword() {
    return hasPassword;
  }


  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }


  public Webhook hmacKeyCheckValue(String hmacKeyCheckValue) {
    
    this.hmacKeyCheckValue = hmacKeyCheckValue;
    return this;
  }

   /**
   * The [checksum](https://en.wikipedia.org/wiki/Key_checksum_value) of the HMAC key generated for this webhook. You can use this value to uniquely identify the HMAC key configured for this webhook.
   * @return hmacKeyCheckValue
  **/
  public String getHmacKeyCheckValue() {
    return hmacKeyCheckValue;
  }


  public void setHmacKeyCheckValue(String hmacKeyCheckValue) {
    this.hmacKeyCheckValue = hmacKeyCheckValue;
  }


  public Webhook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this webhook.
   * @return id
  **/
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Webhook networkType(NetworkTypeEnum networkType) {
    
    this.networkType = networkType;
    return this;
  }

   /**
   * Network type for Terminal API details webhooks.
   * @return networkType
  **/
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }


  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  public Webhook populateSoapActionHeader(Boolean populateSoapActionHeader) {
    
    this.populateSoapActionHeader = populateSoapActionHeader;
    return this;
  }

   /**
   * Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**.
   * @return populateSoapActionHeader
  **/
  public Boolean getPopulateSoapActionHeader() {
    return populateSoapActionHeader;
  }


  public void setPopulateSoapActionHeader(Boolean populateSoapActionHeader) {
    this.populateSoapActionHeader = populateSoapActionHeader;
  }


  public Webhook sslVersion(SslVersionEnum sslVersion) {
    
    this.sslVersion = sslVersion;
    return this;
  }

   /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   * @return sslVersion
  **/
  public SslVersionEnum getSslVersion() {
    return sslVersion;
  }


  public void setSslVersion(SslVersionEnum sslVersion) {
    this.sslVersion = sslVersion;
  }


  public Webhook type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of webhook. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **terminal-api-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).
   * @return type
  **/
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Webhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**.
   * @return url
  **/
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Webhook username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username to access the webhook URL.
   * @return username
  **/
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.links, webhook.links) &&
        Objects.equals(this.acceptsExpiredCertificate, webhook.acceptsExpiredCertificate) &&
        Objects.equals(this.acceptsSelfSignedCertificate, webhook.acceptsSelfSignedCertificate) &&
        Objects.equals(this.acceptsUntrustedRootCertificate, webhook.acceptsUntrustedRootCertificate) &&
        Objects.equals(this.accountReference, webhook.accountReference) &&
        Objects.equals(this.active, webhook.active) &&
        Objects.equals(this.additionalSettings, webhook.additionalSettings) &&
        Objects.equals(this.certificateAlias, webhook.certificateAlias) &&
        Objects.equals(this.communicationFormat, webhook.communicationFormat) &&
        Objects.equals(this.description, webhook.description) &&
        Objects.equals(this.filterMerchantAccountType, webhook.filterMerchantAccountType) &&
        Objects.equals(this.filterMerchantAccounts, webhook.filterMerchantAccounts) &&
        Objects.equals(this.hasError, webhook.hasError) &&
        Objects.equals(this.hasPassword, webhook.hasPassword) &&
        Objects.equals(this.hmacKeyCheckValue, webhook.hmacKeyCheckValue) &&
        Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.networkType, webhook.networkType) &&
        Objects.equals(this.populateSoapActionHeader, webhook.populateSoapActionHeader) &&
        Objects.equals(this.sslVersion, webhook.sslVersion) &&
        Objects.equals(this.type, webhook.type) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.username, webhook.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, acceptsExpiredCertificate, acceptsSelfSignedCertificate, acceptsUntrustedRootCertificate, accountReference, active, additionalSettings, certificateAlias, communicationFormat, description, filterMerchantAccountType, filterMerchantAccounts, hasError, hasPassword, hmacKeyCheckValue, id, networkType, populateSoapActionHeader, sslVersion, type, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    acceptsExpiredCertificate: ").append(toIndentedString(acceptsExpiredCertificate)).append("\n");
    sb.append("    acceptsSelfSignedCertificate: ").append(toIndentedString(acceptsSelfSignedCertificate)).append("\n");
    sb.append("    acceptsUntrustedRootCertificate: ").append(toIndentedString(acceptsUntrustedRootCertificate)).append("\n");
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalSettings: ").append(toIndentedString(additionalSettings)).append("\n");
    sb.append("    certificateAlias: ").append(toIndentedString(certificateAlias)).append("\n");
    sb.append("    communicationFormat: ").append(toIndentedString(communicationFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filterMerchantAccountType: ").append(toIndentedString(filterMerchantAccountType)).append("\n");
    sb.append("    filterMerchantAccounts: ").append(toIndentedString(filterMerchantAccounts)).append("\n");
    sb.append("    hasError: ").append(toIndentedString(hasError)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    hmacKeyCheckValue: ").append(toIndentedString(hmacKeyCheckValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    populateSoapActionHeader: ").append(toIndentedString(populateSoapActionHeader)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("acceptsExpiredCertificate");
    openapiFields.add("acceptsSelfSignedCertificate");
    openapiFields.add("acceptsUntrustedRootCertificate");
    openapiFields.add("accountReference");
    openapiFields.add("active");
    openapiFields.add("additionalSettings");
    openapiFields.add("certificateAlias");
    openapiFields.add("communicationFormat");
    openapiFields.add("description");
    openapiFields.add("filterMerchantAccountType");
    openapiFields.add("filterMerchantAccounts");
    openapiFields.add("hasError");
    openapiFields.add("hasPassword");
    openapiFields.add("hmacKeyCheckValue");
    openapiFields.add("id");
    openapiFields.add("networkType");
    openapiFields.add("populateSoapActionHeader");
    openapiFields.add("sslVersion");
    openapiFields.add("type");
    openapiFields.add("url");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("communicationFormat");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("url");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Webhook.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Webhook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Webhook.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Webhook is not found in the empty JSON string", Webhook.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Webhook.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Webhook` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Webhook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
        WebhookLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      // validate the optional field accountReference
      if (jsonObj.get("accountReference") != null && !jsonObj.get("accountReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `accountReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountReference").toString()));
      }
      // validate the optional field `additionalSettings`
      if (jsonObj.getAsJsonObject("additionalSettings") != null) {
        AdditionalSettingsResponse.validateJsonObject(jsonObj.getAsJsonObject("additionalSettings"));
      }
      // validate the optional field certificateAlias
      if (jsonObj.get("certificateAlias") != null && !jsonObj.get("certificateAlias").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `certificateAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateAlias").toString()));
      }
      // ensure the field communicationFormat can be parsed to an enum value
      if (jsonObj.get("communicationFormat") != null) {
        if(!jsonObj.get("communicationFormat").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `communicationFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("communicationFormat").toString()));
        }
        CommunicationFormatEnum.fromValue(jsonObj.get("communicationFormat").getAsString());
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the field filterMerchantAccountType can be parsed to an enum value
      if (jsonObj.get("filterMerchantAccountType") != null) {
        if(!jsonObj.get("filterMerchantAccountType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `filterMerchantAccountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filterMerchantAccountType").toString()));
        }
        FilterMerchantAccountTypeEnum.fromValue(jsonObj.get("filterMerchantAccountType").getAsString());
      }
      // ensure the json data is an array
      if (jsonObj.get("filterMerchantAccounts") != null && !jsonObj.get("filterMerchantAccounts").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `filterMerchantAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("filterMerchantAccounts").toString()));
      }
      // validate the optional field hmacKeyCheckValue
      if (jsonObj.get("hmacKeyCheckValue") != null && !jsonObj.get("hmacKeyCheckValue").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `hmacKeyCheckValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hmacKeyCheckValue").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the field networkType can be parsed to an enum value
      if (jsonObj.get("networkType") != null) {
        if(!jsonObj.get("networkType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `networkType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkType").toString()));
        }
        NetworkTypeEnum.fromValue(jsonObj.get("networkType").getAsString());
      }
      // ensure the field sslVersion can be parsed to an enum value
      if (jsonObj.get("sslVersion") != null) {
        if(!jsonObj.get("sslVersion").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `sslVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslVersion").toString()));
        }
        SslVersionEnum.fromValue(jsonObj.get("sslVersion").getAsString());
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field url
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field username
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Webhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Webhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Webhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Webhook.class));

       return (TypeAdapter<T>) new TypeAdapter<Webhook>() {
           @Override
           public void write(JsonWriter out, Webhook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Webhook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Webhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Webhook
  * @throws IOException if the JSON string is invalid with respect to Webhook
  */
  public static Webhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Webhook.class);
  }

 /**
  * Convert an instance of Webhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

