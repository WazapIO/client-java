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
import models.TemplateButton;

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
 * TemplateButtonPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-05T18:11:35.787596300+05:30[Asia/Calcutta]")
public class TemplateButtonPayload {
  public static final String SERIALIZED_NAME_BUTTONS = "buttons";
  @SerializedName(SERIALIZED_NAME_BUTTONS)
  private List<TemplateButton> buttons = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTENT_TEXT = "content_text";
  @SerializedName(SERIALIZED_NAME_CONTENT_TEXT)
  private String contentText;

  public static final String SERIALIZED_NAME_FOOTER = "footer";
  @SerializedName(SERIALIZED_NAME_FOOTER)
  private String footer;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private String header;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public TemplateButtonPayload() {
  }

  public TemplateButtonPayload buttons(List<TemplateButton> buttons) {
    
    this.buttons = buttons;
    return this;
  }

  public TemplateButtonPayload addButtonsItem(TemplateButton buttonsItem) {
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * Get buttons
   * @return buttons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TemplateButton> getButtons() {
    return buttons;
  }


  public void setButtons(List<TemplateButton> buttons) {
    this.buttons = buttons;
  }


  public TemplateButtonPayload contentText(String contentText) {
    
    this.contentText = contentText;
    return this;
  }

   /**
   * Get contentText
   * @return contentText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContentText() {
    return contentText;
  }


  public void setContentText(String contentText) {
    this.contentText = contentText;
  }


  public TemplateButtonPayload footer(String footer) {
    
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFooter() {
    return footer;
  }


  public void setFooter(String footer) {
    this.footer = footer;
  }


  public TemplateButtonPayload header(String header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHeader() {
    return header;
  }


  public void setHeader(String header) {
    this.header = header;
  }


  public TemplateButtonPayload to(String to) {
    
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
    TemplateButtonPayload templateButtonPayload = (TemplateButtonPayload) o;
    return Objects.equals(this.buttons, templateButtonPayload.buttons) &&
        Objects.equals(this.contentText, templateButtonPayload.contentText) &&
        Objects.equals(this.footer, templateButtonPayload.footer) &&
        Objects.equals(this.header, templateButtonPayload.header) &&
        Objects.equals(this.to, templateButtonPayload.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttons, contentText, footer, header, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateButtonPayload {\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    contentText: ").append(toIndentedString(contentText)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
    openapiFields.add("content_text");
    openapiFields.add("footer");
    openapiFields.add("header");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("buttons");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateButtonPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TemplateButtonPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateButtonPayload is not found in the empty JSON string", TemplateButtonPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateButtonPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateButtonPayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateButtonPayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("buttons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buttons` to be an array in the JSON string but got `%s`", jsonObj.get("buttons").toString()));
      }

      JsonArray jsonArraybuttons = jsonObj.getAsJsonArray("buttons");
      // validate the required field `buttons` (array)
      for (int i = 0; i < jsonArraybuttons.size(); i++) {
        TemplateButton.validateJsonObject(jsonArraybuttons.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("content_text") != null && !jsonObj.get("content_text").isJsonNull()) && !jsonObj.get("content_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_text").toString()));
      }
      if ((jsonObj.get("footer") != null && !jsonObj.get("footer").isJsonNull()) && !jsonObj.get("footer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `footer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("footer").toString()));
      }
      if ((jsonObj.get("header") != null && !jsonObj.get("header").isJsonNull()) && !jsonObj.get("header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("header").toString()));
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateButtonPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateButtonPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateButtonPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateButtonPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateButtonPayload>() {
           @Override
           public void write(JsonWriter out, TemplateButtonPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateButtonPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateButtonPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateButtonPayload
  * @throws IOException if the JSON string is invalid with respect to TemplateButtonPayload
  */
  public static TemplateButtonPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateButtonPayload.class);
  }

 /**
  * Convert an instance of TemplateButtonPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
