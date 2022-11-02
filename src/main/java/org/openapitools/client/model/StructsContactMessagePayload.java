/*
 * WhatsAPI Go
 * The V2 of WhatsAPI Go
 *
 * The version of the OpenAPI document: 2.0
 * Contact: manjit@sponsorbook.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.StructsContactMessagePayloadVcard;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * StructsContactMessagePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:11:18.612358500+05:30[Asia/Calcutta]")
public class StructsContactMessagePayload {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_VCARD = "vcard";
  @SerializedName(SERIALIZED_NAME_VCARD)
  private StructsContactMessagePayloadVcard vcard;

  public StructsContactMessagePayload() {
  }

  public StructsContactMessagePayload to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public StructsContactMessagePayload vcard(StructsContactMessagePayloadVcard vcard) {
    
    this.vcard = vcard;
    return this;
  }

   /**
   * Get vcard
   * @return vcard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StructsContactMessagePayloadVcard getVcard() {
    return vcard;
  }


  public void setVcard(StructsContactMessagePayloadVcard vcard) {
    this.vcard = vcard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructsContactMessagePayload structsContactMessagePayload = (StructsContactMessagePayload) o;
    return Objects.equals(this.to, structsContactMessagePayload.to) &&
        Objects.equals(this.vcard, structsContactMessagePayload.vcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, vcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructsContactMessagePayload {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    vcard: ").append(toIndentedString(vcard)).append("\n");
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
    openapiFields.add("to");
    openapiFields.add("vcard");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("vcard");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructsContactMessagePayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructsContactMessagePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructsContactMessagePayload is not found in the empty JSON string", StructsContactMessagePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructsContactMessagePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructsContactMessagePayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StructsContactMessagePayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      // validate the required field `vcard`
      StructsContactMessagePayloadVcard.validateJsonObject(jsonObj.getAsJsonObject("vcard"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructsContactMessagePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructsContactMessagePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructsContactMessagePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructsContactMessagePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<StructsContactMessagePayload>() {
           @Override
           public void write(JsonWriter out, StructsContactMessagePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructsContactMessagePayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructsContactMessagePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructsContactMessagePayload
  * @throws IOException if the JSON string is invalid with respect to StructsContactMessagePayload
  */
  public static StructsContactMessagePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructsContactMessagePayload.class);
  }

 /**
  * Convert an instance of StructsContactMessagePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

