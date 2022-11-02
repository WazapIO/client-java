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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import WhatsAPI.JSON;

/**
 * StructsFileUpload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:24:11.691029500+05:30[Asia/Calcutta]")
public class StructsFileUpload {
  public static final String SERIALIZED_NAME_DIRECT_PATH = "direct_path";
  @SerializedName(SERIALIZED_NAME_DIRECT_PATH)
  private String directPath;

  public static final String SERIALIZED_NAME_FILE_ENC_SHA256 = "file_enc_sha256";
  @SerializedName(SERIALIZED_NAME_FILE_ENC_SHA256)
  private List<Integer> fileEncSha256 = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILE_LENGTH = "file_length";
  @SerializedName(SERIALIZED_NAME_FILE_LENGTH)
  private Integer fileLength;

  public static final String SERIALIZED_NAME_FILE_SHA256 = "file_sha256";
  @SerializedName(SERIALIZED_NAME_FILE_SHA256)
  private List<Integer> fileSha256 = new ArrayList<>();

  public static final String SERIALIZED_NAME_MEDIA_KEY = "media_key";
  @SerializedName(SERIALIZED_NAME_MEDIA_KEY)
  private List<Integer> mediaKey = new ArrayList<>();

  public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public StructsFileUpload() {
  }

  public StructsFileUpload directPath(String directPath) {
    
    this.directPath = directPath;
    return this;
  }

   /**
   * Get directPath
   * @return directPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDirectPath() {
    return directPath;
  }


  public void setDirectPath(String directPath) {
    this.directPath = directPath;
  }


  public StructsFileUpload fileEncSha256(List<Integer> fileEncSha256) {
    
    this.fileEncSha256 = fileEncSha256;
    return this;
  }

  public StructsFileUpload addFileEncSha256Item(Integer fileEncSha256Item) {
    this.fileEncSha256.add(fileEncSha256Item);
    return this;
  }

   /**
   * Get fileEncSha256
   * @return fileEncSha256
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getFileEncSha256() {
    return fileEncSha256;
  }


  public void setFileEncSha256(List<Integer> fileEncSha256) {
    this.fileEncSha256 = fileEncSha256;
  }


  public StructsFileUpload fileLength(Integer fileLength) {
    
    this.fileLength = fileLength;
    return this;
  }

   /**
   * Get fileLength
   * @return fileLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getFileLength() {
    return fileLength;
  }


  public void setFileLength(Integer fileLength) {
    this.fileLength = fileLength;
  }


  public StructsFileUpload fileSha256(List<Integer> fileSha256) {
    
    this.fileSha256 = fileSha256;
    return this;
  }

  public StructsFileUpload addFileSha256Item(Integer fileSha256Item) {
    this.fileSha256.add(fileSha256Item);
    return this;
  }

   /**
   * Get fileSha256
   * @return fileSha256
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getFileSha256() {
    return fileSha256;
  }


  public void setFileSha256(List<Integer> fileSha256) {
    this.fileSha256 = fileSha256;
  }


  public StructsFileUpload mediaKey(List<Integer> mediaKey) {
    
    this.mediaKey = mediaKey;
    return this;
  }

  public StructsFileUpload addMediaKeyItem(Integer mediaKeyItem) {
    this.mediaKey.add(mediaKeyItem);
    return this;
  }

   /**
   * Get mediaKey
   * @return mediaKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getMediaKey() {
    return mediaKey;
  }


  public void setMediaKey(List<Integer> mediaKey) {
    this.mediaKey = mediaKey;
  }


  public StructsFileUpload mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public StructsFileUpload url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructsFileUpload structsFileUpload = (StructsFileUpload) o;
    return Objects.equals(this.directPath, structsFileUpload.directPath) &&
        Objects.equals(this.fileEncSha256, structsFileUpload.fileEncSha256) &&
        Objects.equals(this.fileLength, structsFileUpload.fileLength) &&
        Objects.equals(this.fileSha256, structsFileUpload.fileSha256) &&
        Objects.equals(this.mediaKey, structsFileUpload.mediaKey) &&
        Objects.equals(this.mimeType, structsFileUpload.mimeType) &&
        Objects.equals(this.url, structsFileUpload.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directPath, fileEncSha256, fileLength, fileSha256, mediaKey, mimeType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructsFileUpload {\n");
    sb.append("    directPath: ").append(toIndentedString(directPath)).append("\n");
    sb.append("    fileEncSha256: ").append(toIndentedString(fileEncSha256)).append("\n");
    sb.append("    fileLength: ").append(toIndentedString(fileLength)).append("\n");
    sb.append("    fileSha256: ").append(toIndentedString(fileSha256)).append("\n");
    sb.append("    mediaKey: ").append(toIndentedString(mediaKey)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("direct_path");
    openapiFields.add("file_enc_sha256");
    openapiFields.add("file_length");
    openapiFields.add("file_sha256");
    openapiFields.add("media_key");
    openapiFields.add("mime_type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("direct_path");
    openapiRequiredFields.add("file_enc_sha256");
    openapiRequiredFields.add("file_length");
    openapiRequiredFields.add("file_sha256");
    openapiRequiredFields.add("media_key");
    openapiRequiredFields.add("mime_type");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructsFileUpload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructsFileUpload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructsFileUpload is not found in the empty JSON string", StructsFileUpload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructsFileUpload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructsFileUpload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StructsFileUpload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("direct_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direct_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direct_path").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("file_enc_sha256") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("file_enc_sha256").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_enc_sha256` to be an array in the JSON string but got `%s`", jsonObj.get("file_enc_sha256").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("file_sha256") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("file_sha256").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_sha256` to be an array in the JSON string but got `%s`", jsonObj.get("file_sha256").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("media_key") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("media_key").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_key` to be an array in the JSON string but got `%s`", jsonObj.get("media_key").toString()));
      }
      if (!jsonObj.get("mime_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mime_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mime_type").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructsFileUpload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructsFileUpload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructsFileUpload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructsFileUpload.class));

       return (TypeAdapter<T>) new TypeAdapter<StructsFileUpload>() {
           @Override
           public void write(JsonWriter out, StructsFileUpload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructsFileUpload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructsFileUpload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructsFileUpload
  * @throws IOException if the JSON string is invalid with respect to StructsFileUpload
  */
  public static StructsFileUpload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructsFileUpload.class);
  }

 /**
  * Convert an instance of StructsFileUpload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
