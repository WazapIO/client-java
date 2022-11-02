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

import org.openapitools.client.JSON;

/**
 * StructsGroupUpdateParticipantsPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:13:40.502456600+05:30[Asia/Calcutta]")
public class StructsGroupUpdateParticipantsPayload {
  public static final String SERIALIZED_NAME_PARTICIPANTS = "participants";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS)
  private List<String> participants = null;

  public StructsGroupUpdateParticipantsPayload() {
  }

  public StructsGroupUpdateParticipantsPayload participants(List<String> participants) {
    
    this.participants = participants;
    return this;
  }

  public StructsGroupUpdateParticipantsPayload addParticipantsItem(String participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getParticipants() {
    return participants;
  }


  public void setParticipants(List<String> participants) {
    this.participants = participants;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructsGroupUpdateParticipantsPayload structsGroupUpdateParticipantsPayload = (StructsGroupUpdateParticipantsPayload) o;
    return Objects.equals(this.participants, structsGroupUpdateParticipantsPayload.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructsGroupUpdateParticipantsPayload {\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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
    openapiFields.add("participants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructsGroupUpdateParticipantsPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructsGroupUpdateParticipantsPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructsGroupUpdateParticipantsPayload is not found in the empty JSON string", StructsGroupUpdateParticipantsPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructsGroupUpdateParticipantsPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructsGroupUpdateParticipantsPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("participants") != null && !jsonObj.get("participants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `participants` to be an array in the JSON string but got `%s`", jsonObj.get("participants").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructsGroupUpdateParticipantsPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructsGroupUpdateParticipantsPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructsGroupUpdateParticipantsPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructsGroupUpdateParticipantsPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<StructsGroupUpdateParticipantsPayload>() {
           @Override
           public void write(JsonWriter out, StructsGroupUpdateParticipantsPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructsGroupUpdateParticipantsPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructsGroupUpdateParticipantsPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructsGroupUpdateParticipantsPayload
  * @throws IOException if the JSON string is invalid with respect to StructsGroupUpdateParticipantsPayload
  */
  public static StructsGroupUpdateParticipantsPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructsGroupUpdateParticipantsPayload.class);
  }

 /**
  * Convert an instance of StructsGroupUpdateParticipantsPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

