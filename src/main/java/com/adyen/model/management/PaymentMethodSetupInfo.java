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
import com.adyen.model.management.AfterpayTouchInfo;
import com.adyen.model.management.ApplePayInfo;
import com.adyen.model.management.BcmcInfo;
import com.adyen.model.management.CartesBancairesInfo;
import com.adyen.model.management.ClearpayInfo;
import com.adyen.model.management.GiroPayInfo;
import com.adyen.model.management.GooglePayInfo;
import com.adyen.model.management.KlarnaInfo;
import com.adyen.model.management.MealVoucherFRInfo;
import com.adyen.model.management.PayPalInfo;
import com.adyen.model.management.SofortInfo;
import com.adyen.model.management.SwishInfo;
import com.adyen.model.management.TwintInfo;
import com.adyen.model.management.VippsInfo;
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
 * PaymentMethodSetupInfo
 */

public class PaymentMethodSetupInfo {
  public static final String SERIALIZED_NAME_AFTERPAY_TOUCH = "afterpayTouch";
  @SerializedName(SERIALIZED_NAME_AFTERPAY_TOUCH)
  private AfterpayTouchInfo afterpayTouch;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private ApplePayInfo applePay;

  public static final String SERIALIZED_NAME_BCMC = "bcmc";
  @SerializedName(SERIALIZED_NAME_BCMC)
  private BcmcInfo bcmc;

  public static final String SERIALIZED_NAME_BUSINESS_LINE_ID = "businessLineId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LINE_ID)
  private String businessLineId;

  public static final String SERIALIZED_NAME_CARTES_BANCAIRES = "cartesBancaires";
  @SerializedName(SERIALIZED_NAME_CARTES_BANCAIRES)
  private CartesBancairesInfo cartesBancaires;

  public static final String SERIALIZED_NAME_CLEARPAY = "clearpay";
  @SerializedName(SERIALIZED_NAME_CLEARPAY)
  private ClearpayInfo clearpay;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = null;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<String> currencies = null;

  public static final String SERIALIZED_NAME_CUSTOM_ROUTING_FLAGS = "customRoutingFlags";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ROUTING_FLAGS)
  private List<String> customRoutingFlags = null;

  public static final String SERIALIZED_NAME_GIRO_PAY = "giroPay";
  @SerializedName(SERIALIZED_NAME_GIRO_PAY)
  private GiroPayInfo giroPay;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private GooglePayInfo googlePay;

  public static final String SERIALIZED_NAME_KLARNA = "klarna";
  @SerializedName(SERIALIZED_NAME_KLARNA)
  private KlarnaInfo klarna;

  public static final String SERIALIZED_NAME_MEAL_VOUCHER_F_R = "mealVoucher_FR";
  @SerializedName(SERIALIZED_NAME_MEAL_VOUCHER_F_R)
  private MealVoucherFRInfo mealVoucherFR;

  public static final String SERIALIZED_NAME_PAYPAL = "paypal";
  @SerializedName(SERIALIZED_NAME_PAYPAL)
  private PayPalInfo paypal;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The sales channel. Required if the merchant account does not have a sales channel. When you provide this field, it overrides the default sales channel set on the merchant account.  Possible values: **eCommerce**, **pos**, **contAuth**, and **moto**. 
   */
  @JsonAdapter(ShopperInteractionEnum.Adapter.class)
  public enum ShopperInteractionEnum {
    ECOMMERCE("eCommerce"),
    
    POS("pos"),
    
    MOTO("moto"),
    
    CONTAUTH("contAuth");

    private String value;

    ShopperInteractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShopperInteractionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShopperInteractionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShopperInteractionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShopperInteractionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHOPPER_INTERACTION = "shopperInteraction";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INTERACTION)
  private ShopperInteractionEnum shopperInteraction;

  public static final String SERIALIZED_NAME_SOFORT = "sofort";
  @SerializedName(SERIALIZED_NAME_SOFORT)
  private SofortInfo sofort;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_SWISH = "swish";
  @SerializedName(SERIALIZED_NAME_SWISH)
  private SwishInfo swish;

  public static final String SERIALIZED_NAME_TWINT = "twint";
  @SerializedName(SERIALIZED_NAME_TWINT)
  private TwintInfo twint;

  /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AFTERPAYTOUCH("afterpaytouch"),
    
    ALIPAY("alipay"),
    
    ALIPAY_HK("alipay_hk"),
    
    AMEX("amex"),
    
    APPLEPAY("applepay"),
    
    BCMC("bcmc"),
    
    BLIK("blik"),
    
    CARTEBANCAIRE("cartebancaire"),
    
    CLEARPAY("clearpay"),
    
    CUP("cup"),
    
    DINERS("diners"),
    
    DIRECTEBANKING("directEbanking"),
    
    DIRECTDEBIT_GB("directdebit_GB"),
    
    DISCOVER("discover"),
    
    EBANKING_FI("ebanking_FI"),
    
    EFTPOS_AUSTRALIA("eftpos_australia"),
    
    ELO("elo"),
    
    ELOCREDIT("elocredit"),
    
    ELODEBIT("elodebit"),
    
    GIROCARD("girocard"),
    
    GIROPAY("giropay"),
    
    GOOGLEPAY("googlepay"),
    
    HIPER("hiper"),
    
    HIPERCARD("hipercard"),
    
    IDEAL("ideal"),
    
    INTERAC_CARD("interac_card"),
    
    JCB("jcb"),
    
    KLARNA("klarna"),
    
    KLARNA_ACCOUNT("klarna_account"),
    
    KLARNA_PAYNOW("klarna_paynow"),
    
    MAESTRO("maestro"),
    
    MBWAY("mbway"),
    
    MC("mc"),
    
    MCDEBIT("mcdebit"),
    
    MEALVOUCHER_FR("mealVoucher_FR"),
    
    MOBILEPAY("mobilepay"),
    
    MULTIBANCO("multibanco"),
    
    ONLINEBANKING_PL("onlineBanking_PL"),
    
    PAYPAL("paypal"),
    
    PAYSHOP("payshop"),
    
    SWISH("swish"),
    
    TRUSTLY("trustly"),
    
    TWINT("twint"),
    
    TWINT_POS("twint_pos"),
    
    VIPPS("vipps"),
    
    VISA("visa"),
    
    VISADEBIT("visadebit"),
    
    VPAY("vpay"),
    
    WECHATPAY("wechatpay"),
    
    WECHATPAY_POS("wechatpay_pos");

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

  public static final String SERIALIZED_NAME_VIPPS = "vipps";
  @SerializedName(SERIALIZED_NAME_VIPPS)
  private VippsInfo vipps;

  public PaymentMethodSetupInfo() { 
  }

  public PaymentMethodSetupInfo afterpayTouch(AfterpayTouchInfo afterpayTouch) {
    
    this.afterpayTouch = afterpayTouch;
    return this;
  }

   /**
   * Get afterpayTouch
   * @return afterpayTouch
  **/
  public AfterpayTouchInfo getAfterpayTouch() {
    return afterpayTouch;
  }


  public void setAfterpayTouch(AfterpayTouchInfo afterpayTouch) {
    this.afterpayTouch = afterpayTouch;
  }


  public PaymentMethodSetupInfo applePay(ApplePayInfo applePay) {
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  public ApplePayInfo getApplePay() {
    return applePay;
  }


  public void setApplePay(ApplePayInfo applePay) {
    this.applePay = applePay;
  }


  public PaymentMethodSetupInfo bcmc(BcmcInfo bcmc) {
    
    this.bcmc = bcmc;
    return this;
  }

   /**
   * Get bcmc
   * @return bcmc
  **/
  public BcmcInfo getBcmc() {
    return bcmc;
  }


  public void setBcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
  }


  public PaymentMethodSetupInfo businessLineId(String businessLineId) {
    
    this.businessLineId = businessLineId;
    return this;
  }

   /**
   * The unique identifier of the business line.
   * @return businessLineId
  **/
  public String getBusinessLineId() {
    return businessLineId;
  }


  public void setBusinessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
  }


  public PaymentMethodSetupInfo cartesBancaires(CartesBancairesInfo cartesBancaires) {
    
    this.cartesBancaires = cartesBancaires;
    return this;
  }

   /**
   * Get cartesBancaires
   * @return cartesBancaires
  **/
  public CartesBancairesInfo getCartesBancaires() {
    return cartesBancaires;
  }


  public void setCartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
  }


  public PaymentMethodSetupInfo clearpay(ClearpayInfo clearpay) {
    
    this.clearpay = clearpay;
    return this;
  }

   /**
   * Get clearpay
   * @return clearpay
  **/
  public ClearpayInfo getClearpay() {
    return clearpay;
  }


  public void setClearpay(ClearpayInfo clearpay) {
    this.clearpay = clearpay;
  }


  public PaymentMethodSetupInfo countries(List<String> countries) {
    
    this.countries = countries;
    return this;
  }

  public PaymentMethodSetupInfo addCountriesItem(String countriesItem) {
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
  public List<String> getCountries() {
    return countries;
  }


  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public PaymentMethodSetupInfo currencies(List<String> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public PaymentMethodSetupInfo addCurrenciesItem(String currenciesItem) {
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
  public List<String> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }


  public PaymentMethodSetupInfo customRoutingFlags(List<String> customRoutingFlags) {
    
    this.customRoutingFlags = customRoutingFlags;
    return this;
  }

  public PaymentMethodSetupInfo addCustomRoutingFlagsItem(String customRoutingFlagsItem) {
    if (this.customRoutingFlags == null) {
      this.customRoutingFlags = new ArrayList<>();
    }
    this.customRoutingFlags.add(customRoutingFlagsItem);
    return this;
  }

   /**
   * The list of custom routing flags to route payment to the intended acquirer.
   * @return customRoutingFlags
  **/
  public List<String> getCustomRoutingFlags() {
    return customRoutingFlags;
  }


  public void setCustomRoutingFlags(List<String> customRoutingFlags) {
    this.customRoutingFlags = customRoutingFlags;
  }


  public PaymentMethodSetupInfo giroPay(GiroPayInfo giroPay) {
    
    this.giroPay = giroPay;
    return this;
  }

   /**
   * Get giroPay
   * @return giroPay
  **/
  public GiroPayInfo getGiroPay() {
    return giroPay;
  }


  public void setGiroPay(GiroPayInfo giroPay) {
    this.giroPay = giroPay;
  }


  public PaymentMethodSetupInfo googlePay(GooglePayInfo googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  public GooglePayInfo getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(GooglePayInfo googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentMethodSetupInfo klarna(KlarnaInfo klarna) {
    
    this.klarna = klarna;
    return this;
  }

   /**
   * Get klarna
   * @return klarna
  **/
  public KlarnaInfo getKlarna() {
    return klarna;
  }


  public void setKlarna(KlarnaInfo klarna) {
    this.klarna = klarna;
  }


  public PaymentMethodSetupInfo mealVoucherFR(MealVoucherFRInfo mealVoucherFR) {
    
    this.mealVoucherFR = mealVoucherFR;
    return this;
  }

   /**
   * Get mealVoucherFR
   * @return mealVoucherFR
  **/
  public MealVoucherFRInfo getMealVoucherFR() {
    return mealVoucherFR;
  }


  public void setMealVoucherFR(MealVoucherFRInfo mealVoucherFR) {
    this.mealVoucherFR = mealVoucherFR;
  }


  public PaymentMethodSetupInfo paypal(PayPalInfo paypal) {
    
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  public PayPalInfo getPaypal() {
    return paypal;
  }


  public void setPaypal(PayPalInfo paypal) {
    this.paypal = paypal;
  }


  public PaymentMethodSetupInfo reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment method. Supported characters a-z, A-Z, 0-9.
   * @return reference
  **/
  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentMethodSetupInfo shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * The sales channel. Required if the merchant account does not have a sales channel. When you provide this field, it overrides the default sales channel set on the merchant account.  Possible values: **eCommerce**, **pos**, **contAuth**, and **moto**. 
   * @return shopperInteraction
  **/
  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }


  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public PaymentMethodSetupInfo sofort(SofortInfo sofort) {
    
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  public SofortInfo getSofort() {
    return sofort;
  }


  public void setSofort(SofortInfo sofort) {
    this.sofort = sofort;
  }


  public PaymentMethodSetupInfo storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.
   * @return storeId
  **/
  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentMethodSetupInfo swish(SwishInfo swish) {
    
    this.swish = swish;
    return this;
  }

   /**
   * Get swish
   * @return swish
  **/
  public SwishInfo getSwish() {
    return swish;
  }


  public void setSwish(SwishInfo swish) {
    this.swish = swish;
  }


  public PaymentMethodSetupInfo twint(TwintInfo twint) {
    
    this.twint = twint;
    return this;
  }

   /**
   * Get twint
   * @return twint
  **/
  public TwintInfo getTwint() {
    return twint;
  }


  public void setTwint(TwintInfo twint) {
    this.twint = twint;
  }


  public PaymentMethodSetupInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PaymentMethodSetupInfo vipps(VippsInfo vipps) {
    
    this.vipps = vipps;
    return this;
  }

   /**
   * Get vipps
   * @return vipps
  **/
  public VippsInfo getVipps() {
    return vipps;
  }


  public void setVipps(VippsInfo vipps) {
    this.vipps = vipps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodSetupInfo paymentMethodSetupInfo = (PaymentMethodSetupInfo) o;
    return Objects.equals(this.afterpayTouch, paymentMethodSetupInfo.afterpayTouch) &&
        Objects.equals(this.applePay, paymentMethodSetupInfo.applePay) &&
        Objects.equals(this.bcmc, paymentMethodSetupInfo.bcmc) &&
        Objects.equals(this.businessLineId, paymentMethodSetupInfo.businessLineId) &&
        Objects.equals(this.cartesBancaires, paymentMethodSetupInfo.cartesBancaires) &&
        Objects.equals(this.clearpay, paymentMethodSetupInfo.clearpay) &&
        Objects.equals(this.countries, paymentMethodSetupInfo.countries) &&
        Objects.equals(this.currencies, paymentMethodSetupInfo.currencies) &&
        Objects.equals(this.customRoutingFlags, paymentMethodSetupInfo.customRoutingFlags) &&
        Objects.equals(this.giroPay, paymentMethodSetupInfo.giroPay) &&
        Objects.equals(this.googlePay, paymentMethodSetupInfo.googlePay) &&
        Objects.equals(this.klarna, paymentMethodSetupInfo.klarna) &&
        Objects.equals(this.mealVoucherFR, paymentMethodSetupInfo.mealVoucherFR) &&
        Objects.equals(this.paypal, paymentMethodSetupInfo.paypal) &&
        Objects.equals(this.reference, paymentMethodSetupInfo.reference) &&
        Objects.equals(this.shopperInteraction, paymentMethodSetupInfo.shopperInteraction) &&
        Objects.equals(this.sofort, paymentMethodSetupInfo.sofort) &&
        Objects.equals(this.storeId, paymentMethodSetupInfo.storeId) &&
        Objects.equals(this.swish, paymentMethodSetupInfo.swish) &&
        Objects.equals(this.twint, paymentMethodSetupInfo.twint) &&
        Objects.equals(this.type, paymentMethodSetupInfo.type) &&
        Objects.equals(this.vipps, paymentMethodSetupInfo.vipps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterpayTouch, applePay, bcmc, businessLineId, cartesBancaires, clearpay, countries, currencies, customRoutingFlags, giroPay, googlePay, klarna, mealVoucherFR, paypal, reference, shopperInteraction, sofort, storeId, swish, twint, type, vipps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSetupInfo {\n");
    sb.append("    afterpayTouch: ").append(toIndentedString(afterpayTouch)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    businessLineId: ").append(toIndentedString(businessLineId)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    clearpay: ").append(toIndentedString(clearpay)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    customRoutingFlags: ").append(toIndentedString(customRoutingFlags)).append("\n");
    sb.append("    giroPay: ").append(toIndentedString(giroPay)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    klarna: ").append(toIndentedString(klarna)).append("\n");
    sb.append("    mealVoucherFR: ").append(toIndentedString(mealVoucherFR)).append("\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    swish: ").append(toIndentedString(swish)).append("\n");
    sb.append("    twint: ").append(toIndentedString(twint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vipps: ").append(toIndentedString(vipps)).append("\n");
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
    openapiFields.add("afterpayTouch");
    openapiFields.add("applePay");
    openapiFields.add("bcmc");
    openapiFields.add("businessLineId");
    openapiFields.add("cartesBancaires");
    openapiFields.add("clearpay");
    openapiFields.add("countries");
    openapiFields.add("currencies");
    openapiFields.add("customRoutingFlags");
    openapiFields.add("giroPay");
    openapiFields.add("googlePay");
    openapiFields.add("klarna");
    openapiFields.add("mealVoucher_FR");
    openapiFields.add("paypal");
    openapiFields.add("reference");
    openapiFields.add("shopperInteraction");
    openapiFields.add("sofort");
    openapiFields.add("storeId");
    openapiFields.add("swish");
    openapiFields.add("twint");
    openapiFields.add("type");
    openapiFields.add("vipps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(PaymentMethodSetupInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethodSetupInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentMethodSetupInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethodSetupInfo is not found in the empty JSON string", PaymentMethodSetupInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentMethodSetupInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `PaymentMethodSetupInfo` properties.", entry.getKey()));
        }
      }
      // validate the optional field `afterpayTouch`
      if (jsonObj.getAsJsonObject("afterpayTouch") != null) {
        AfterpayTouchInfo.validateJsonObject(jsonObj.getAsJsonObject("afterpayTouch"));
      }
      // validate the optional field `applePay`
      if (jsonObj.getAsJsonObject("applePay") != null) {
        ApplePayInfo.validateJsonObject(jsonObj.getAsJsonObject("applePay"));
      }
      // validate the optional field `bcmc`
      if (jsonObj.getAsJsonObject("bcmc") != null) {
        BcmcInfo.validateJsonObject(jsonObj.getAsJsonObject("bcmc"));
      }
      // validate the optional field businessLineId
      if (jsonObj.get("businessLineId") != null && !jsonObj.get("businessLineId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `businessLineId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessLineId").toString()));
      }
      // validate the optional field `cartesBancaires`
      if (jsonObj.getAsJsonObject("cartesBancaires") != null) {
        CartesBancairesInfo.validateJsonObject(jsonObj.getAsJsonObject("cartesBancaires"));
      }
      // validate the optional field `clearpay`
      if (jsonObj.getAsJsonObject("clearpay") != null) {
        ClearpayInfo.validateJsonObject(jsonObj.getAsJsonObject("clearpay"));
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
      if (jsonObj.get("customRoutingFlags") != null && !jsonObj.get("customRoutingFlags").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `customRoutingFlags` to be an array in the JSON string but got `%s`", jsonObj.get("customRoutingFlags").toString()));
      }
      // validate the optional field `giroPay`
      if (jsonObj.getAsJsonObject("giroPay") != null) {
        GiroPayInfo.validateJsonObject(jsonObj.getAsJsonObject("giroPay"));
      }
      // validate the optional field `googlePay`
      if (jsonObj.getAsJsonObject("googlePay") != null) {
        GooglePayInfo.validateJsonObject(jsonObj.getAsJsonObject("googlePay"));
      }
      // validate the optional field `klarna`
      if (jsonObj.getAsJsonObject("klarna") != null) {
        KlarnaInfo.validateJsonObject(jsonObj.getAsJsonObject("klarna"));
      }
      // validate the optional field `mealVoucher_FR`
      if (jsonObj.getAsJsonObject("mealVoucher_FR") != null) {
        MealVoucherFRInfo.validateJsonObject(jsonObj.getAsJsonObject("mealVoucher_FR"));
      }
      // validate the optional field `paypal`
      if (jsonObj.getAsJsonObject("paypal") != null) {
        PayPalInfo.validateJsonObject(jsonObj.getAsJsonObject("paypal"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // ensure the field shopperInteraction can be parsed to an enum value
      if (jsonObj.get("shopperInteraction") != null) {
        if(!jsonObj.get("shopperInteraction").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `shopperInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperInteraction").toString()));
        }
        ShopperInteractionEnum.fromValue(jsonObj.get("shopperInteraction").getAsString());
      }
      // validate the optional field `sofort`
      if (jsonObj.getAsJsonObject("sofort") != null) {
        SofortInfo.validateJsonObject(jsonObj.getAsJsonObject("sofort"));
      }
      // validate the optional field storeId
      if (jsonObj.get("storeId") != null && !jsonObj.get("storeId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `storeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeId").toString()));
      }
      // validate the optional field `swish`
      if (jsonObj.getAsJsonObject("swish") != null) {
        SwishInfo.validateJsonObject(jsonObj.getAsJsonObject("swish"));
      }
      // validate the optional field `twint`
      if (jsonObj.getAsJsonObject("twint") != null) {
        TwintInfo.validateJsonObject(jsonObj.getAsJsonObject("twint"));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
      // validate the optional field `vipps`
      if (jsonObj.getAsJsonObject("vipps") != null) {
        VippsInfo.validateJsonObject(jsonObj.getAsJsonObject("vipps"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodSetupInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodSetupInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodSetupInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodSetupInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodSetupInfo>() {
           @Override
           public void write(JsonWriter out, PaymentMethodSetupInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodSetupInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodSetupInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodSetupInfo
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodSetupInfo
  */
  public static PaymentMethodSetupInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodSetupInfo.class);
  }

 /**
  * Convert an instance of PaymentMethodSetupInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

