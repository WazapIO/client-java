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
import org.openapitools.client.model.StructsFileUpload;
import org.openapitools.client.model.StructsReplyButton;

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
 * StructsButtonMessageWithMediaPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:13:40.502456600+05:30[Asia/Calcutta]")
public class StructsButtonMessageWithMediaPayload {
  public static final String SERIALIZED_NAME_BUTTONS = "buttons";
  @SerializedName(SERIALIZED_NAME_BUTTONS)
  private List<StructsReplyButton> buttons = null;

  public static final String SERIALIZED_NAME_FOOTER_TEXT = "footer_text";
  @SerializedName(SERIALIZED_NAME_FOOTER_TEXT)
  private String footerText;

  public static final String SERIALIZED_NAME_MEDIA_DATA = "media_data";
  @SerializedName(SERIALIZED_NAME_MEDIA_DATA)
  private StructsFileUpload mediaData;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public StructsButtonMessageWithMediaPayload() {
  }

  public StructsButtonMessageWithMediaPayload buttons(List<StructsReplyButton> buttons) {
    
    this.buttons = buttons;
    return this;
  }

  public StructsButtonMessageWithMediaPayload addButtonsItem(StructsReplyButton buttonsItem) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<>();
    }
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * Get buttons
   * @return buttons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StructsReplyButton> getButtons() {
    return buttons;
  }


  public void setButtons(List<StructsReplyButton> buttons) {
    this.buttons = buttons;
  }


  public StructsButtonMessageWithMediaPayload footerText(String footerText) {
    
    this.footerText = footerText;
    return this;
  }

   /**
   * Get footerText
   * @return footerText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFooterText() {
    return footerText;
  }


  public void setFooterText(String footerText) {
    this.footerText = footerText;
  }


  public StructsButtonMessageWithMediaPayload mediaData(StructsFileUpload mediaData) {
    
    this.mediaData = mediaData;
    return this;
  }

   /**
   * Get mediaData
   * @return mediaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StructsFileUpload getMediaData() {
    return mediaData;
  }


  public void setMediaData(StructsFileUpload mediaData) {
    this.mediaData = mediaData;
  }


  public StructsButtonMessageWithMediaPayload text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public StructsButtonMessageWithMediaPayload to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    StructsButtonMessageWithMediaPayload structsButtonMessageWithMediaPayload = (StructsButtonMessageWithMediaPayload) o;
    return Objects.equals(this.buttons, structsButtonMessageWithMediaPayload.buttons) &&
        Objects.equals(this.footerText, structsButtonMessageWithMediaPayload.footerText) &&
        Objects.equals(this.mediaData, structsButtonMessageWithMediaPayload.mediaData) &&
        Objects.equals(this.text, structsButtonMessageWithMediaPayload.text) &&
        Objects.equals(this.to, structsButtonMessageWithMediaPayload.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttons, footerText, mediaData, text, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructsButtonMessageWithMediaPayload {\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    footerText: ").append(toIndentedString(footerText)).append("\n");
    sb.append("    mediaData: ").append(toIndentedString(mediaData)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("buttons");
    openapiFields.add("footer_text");
    openapiFields.add("media_data");
    openapiFields.add("text");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructsButtonMessageWithMediaPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructsButtonMessageWithMediaPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructsButtonMessageWithMediaPayload is not found in the empty JSON string", StructsButtonMessageWithMediaPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructsButtonMessageWithMediaPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructsButtonMessageWithMediaPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("buttons") != null && !jsonObj.get("buttons").isJsonNull()) {
        JsonArray jsonArraybuttons = jsonObj.getAsJsonArray("buttons");
        if (jsonArraybuttons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("buttons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `buttons` to be an array in the JSON string but got `%s`", jsonObj.get("buttons").toString()));
          }

          // validate the optional field `buttons` (array)
          for (int i = 0; i < jsonArraybuttons.size(); i++) {
            StructsReplyButton.validateJsonObject(jsonArraybuttons.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("footer_text") != null && !jsonObj.get("footer_text").isJsonNull()) && !jsonObj.get("footer_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footer_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footer_text").toString()));
      }
      // validate the optional field `media_data`
      if (jsonObj.get("media_data") != null && !jsonObj.get("media_data").isJsonNull()) {
        StructsFileUpload.validateJsonObject(jsonObj.getAsJsonObject("media_data"));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructsButtonMessageWithMediaPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructsButtonMessageWithMediaPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructsButtonMessageWithMediaPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructsButtonMessageWithMediaPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<StructsButtonMessageWithMediaPayload>() {
           @Override
           public void write(JsonWriter out, StructsButtonMessageWithMediaPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructsButtonMessageWithMediaPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructsButtonMessageWithMediaPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructsButtonMessageWithMediaPayload
  * @throws IOException if the JSON string is invalid with respect to StructsButtonMessageWithMediaPayload
  */
  public static StructsButtonMessageWithMediaPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructsButtonMessageWithMediaPayload.class);
  }

 /**
  * Convert an instance of StructsButtonMessageWithMediaPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

