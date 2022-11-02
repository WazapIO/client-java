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
import org.openapitools.client.model.StructsFileUpload;

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
 * StructsSendMediaPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:11:18.612358500+05:30[Asia/Calcutta]")
public class StructsSendMediaPayload {
  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_MEDIA_DATA = "media_data";
  @SerializedName(SERIALIZED_NAME_MEDIA_DATA)
  private StructsFileUpload mediaData;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public StructsSendMediaPayload() {
  }

  public StructsSendMediaPayload caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaption() {
    return caption;
  }


  public void setCaption(String caption) {
    this.caption = caption;
  }


  public StructsSendMediaPayload filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public StructsSendMediaPayload mediaData(StructsFileUpload mediaData) {
    
    this.mediaData = mediaData;
    return this;
  }

   /**
   * Get mediaData
   * @return mediaData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StructsFileUpload getMediaData() {
    return mediaData;
  }


  public void setMediaData(StructsFileUpload mediaData) {
    this.mediaData = mediaData;
  }


  public StructsSendMediaPayload mediaType(String mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  public StructsSendMediaPayload to(String to) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructsSendMediaPayload structsSendMediaPayload = (StructsSendMediaPayload) o;
    return Objects.equals(this.caption, structsSendMediaPayload.caption) &&
        Objects.equals(this.filename, structsSendMediaPayload.filename) &&
        Objects.equals(this.mediaData, structsSendMediaPayload.mediaData) &&
        Objects.equals(this.mediaType, structsSendMediaPayload.mediaType) &&
        Objects.equals(this.to, structsSendMediaPayload.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caption, filename, mediaData, mediaType, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructsSendMediaPayload {\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    mediaData: ").append(toIndentedString(mediaData)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("caption");
    openapiFields.add("filename");
    openapiFields.add("media_data");
    openapiFields.add("media_type");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("media_data");
    openapiRequiredFields.add("media_type");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructsSendMediaPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructsSendMediaPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructsSendMediaPayload is not found in the empty JSON string", StructsSendMediaPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructsSendMediaPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructsSendMediaPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StructsSendMediaPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("caption") != null && !jsonObj.get("caption").isJsonNull()) && !jsonObj.get("caption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caption").toString()));
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      // validate the required field `media_data`
      StructsFileUpload.validateJsonObject(jsonObj.getAsJsonObject("media_data"));
      if (!jsonObj.get("media_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_type").toString()));
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructsSendMediaPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructsSendMediaPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructsSendMediaPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructsSendMediaPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<StructsSendMediaPayload>() {
           @Override
           public void write(JsonWriter out, StructsSendMediaPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructsSendMediaPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructsSendMediaPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructsSendMediaPayload
  * @throws IOException if the JSON string is invalid with respect to StructsSendMediaPayload
  */
  public static StructsSendMediaPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructsSendMediaPayload.class);
  }

 /**
  * Convert an instance of StructsSendMediaPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

