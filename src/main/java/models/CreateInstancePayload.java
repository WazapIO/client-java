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


package models;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import WhatsAPI.JSON;

/**
 * CreateInstancePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-30T17:55:55.962510800+05:30[Asia/Calcutta]")
public class CreateInstancePayload {
  public static final String SERIALIZED_NAME_INSTANCE_KEY = "instance_key";
  @SerializedName(SERIALIZED_NAME_INSTANCE_KEY)
  private String instanceKey;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public CreateInstancePayload() {
  }

  public CreateInstancePayload instanceKey(String instanceKey) {
    
    this.instanceKey = instanceKey;
    return this;
  }

   /**
   * Get instanceKey
   * @return instanceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getInstanceKey() {
    return instanceKey;
  }


  public void setInstanceKey(String instanceKey) {
    this.instanceKey = instanceKey;
  }


  public CreateInstancePayload webhookUrl(String webhookUrl) {
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancePayload createInstancePayload = (CreateInstancePayload) o;
    return Objects.equals(this.instanceKey, createInstancePayload.instanceKey) &&
        Objects.equals(this.webhookUrl, createInstancePayload.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceKey, webhookUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancePayload {\n");
    sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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
    openapiFields.add("instance_key");
    openapiFields.add("webhook_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateInstancePayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateInstancePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateInstancePayload is not found in the empty JSON string", CreateInstancePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateInstancePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateInstancePayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("instance_key") != null && !jsonObj.get("instance_key").isJsonNull()) && !jsonObj.get("instance_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance_key").toString()));
      }
      if ((jsonObj.get("webhook_url") != null && !jsonObj.get("webhook_url").isJsonNull()) && !jsonObj.get("webhook_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateInstancePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateInstancePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateInstancePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateInstancePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateInstancePayload>() {
           @Override
           public void write(JsonWriter out, CreateInstancePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateInstancePayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateInstancePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateInstancePayload
  * @throws IOException if the JSON string is invalid with respect to CreateInstancePayload
  */
  public static CreateInstancePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateInstancePayload.class);
  }

 /**
  * Convert an instance of CreateInstancePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

