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
import java.io.File;
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

import org.openapitools.client.JSON;

/**
 * InstancesInstanceKeySendUploadPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:13:40.502456600+05:30[Asia/Calcutta]")
public class InstancesInstanceKeySendUploadPostRequest {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public InstancesInstanceKeySendUploadPostRequest() {
  }

  public InstancesInstanceKeySendUploadPostRequest _file(File _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Media file
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Media file")

  public File getFile() {
    return _file;
  }


  public void setFile(File _file) {
    this._file = _file;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancesInstanceKeySendUploadPostRequest instancesInstanceKeySendUploadPostRequest = (InstancesInstanceKeySendUploadPostRequest) o;
    return Objects.equals(this._file, instancesInstanceKeySendUploadPostRequest._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancesInstanceKeySendUploadPostRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
    openapiFields.add("file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstancesInstanceKeySendUploadPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstancesInstanceKeySendUploadPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstancesInstanceKeySendUploadPostRequest is not found in the empty JSON string", InstancesInstanceKeySendUploadPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstancesInstanceKeySendUploadPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstancesInstanceKeySendUploadPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstancesInstanceKeySendUploadPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstancesInstanceKeySendUploadPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstancesInstanceKeySendUploadPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstancesInstanceKeySendUploadPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstancesInstanceKeySendUploadPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<InstancesInstanceKeySendUploadPostRequest>() {
           @Override
           public void write(JsonWriter out, InstancesInstanceKeySendUploadPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstancesInstanceKeySendUploadPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstancesInstanceKeySendUploadPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstancesInstanceKeySendUploadPostRequest
  * @throws IOException if the JSON string is invalid with respect to InstancesInstanceKeySendUploadPostRequest
  */
  public static InstancesInstanceKeySendUploadPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstancesInstanceKeySendUploadPostRequest.class);
  }

 /**
  * Convert an instance of InstancesInstanceKeySendUploadPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

