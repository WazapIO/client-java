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
import models.StructsListSection;

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
 * StructsListMessagePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T13:24:11.691029500+05:30[Asia/Calcutta]")
public class StructsListMessagePayload {
  public static final String SERIALIZED_NAME_BUTTON_TEXT = "button_text";
  @SerializedName(SERIALIZED_NAME_BUTTON_TEXT)
  private String buttonText;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MULTI_SELECT = "multi_select";
  @SerializedName(SERIALIZED_NAME_MULTI_SELECT)
  private Boolean multiSelect;

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<StructsListSection> sections = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public StructsListMessagePayload() {
  }

  public StructsListMessagePayload buttonText(String buttonText) {
    
    this.buttonText = buttonText;
    return this;
  }

   /**
   * Get buttonText
   * @return buttonText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getButtonText() {
    return buttonText;
  }


  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }


  public StructsListMessagePayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public StructsListMessagePayload multiSelect(Boolean multiSelect) {
    
    this.multiSelect = multiSelect;
    return this;
  }

   /**
   * Get multiSelect
   * @return multiSelect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMultiSelect() {
    return multiSelect;
  }


  public void setMultiSelect(Boolean multiSelect) {
    this.multiSelect = multiSelect;
  }


  public StructsListMessagePayload sections(List<StructsListSection> sections) {
    
    this.sections = sections;
    return this;
  }

  public StructsListMessagePayload addSectionsItem(StructsListSection sectionsItem) {
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<StructsListSection> getSections() {
    return sections;
  }


  public void setSections(List<StructsListSection> sections) {
    this.sections = sections;
  }


  public StructsListMessagePayload text(String text) {
    
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


  public StructsListMessagePayload title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StructsListMessagePayload to(String to) {
    
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
    StructsListMessagePayload structsListMessagePayload = (StructsListMessagePayload) o;
    return Objects.equals(this.buttonText, structsListMessagePayload.buttonText) &&
        Objects.equals(this.description, structsListMessagePayload.description) &&
        Objects.equals(this.multiSelect, structsListMessagePayload.multiSelect) &&
        Objects.equals(this.sections, structsListMessagePayload.sections) &&
        Objects.equals(this.text, structsListMessagePayload.text) &&
        Objects.equals(this.title, structsListMessagePayload.title) &&
        Objects.equals(this.to, structsListMessagePayload.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, description, multiSelect, sections, text, title, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructsListMessagePayload {\n");
    sb.append("    buttonText: ").append(toIndentedString(buttonText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    multiSelect: ").append(toIndentedString(multiSelect)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("button_text");
    openapiFields.add("description");
    openapiFields.add("multi_select");
    openapiFields.add("sections");
    openapiFields.add("text");
    openapiFields.add("title");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sections");
    openapiRequiredFields.add("to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StructsListMessagePayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StructsListMessagePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StructsListMessagePayload is not found in the empty JSON string", StructsListMessagePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StructsListMessagePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StructsListMessagePayload` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StructsListMessagePayload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("button_text") != null && !jsonObj.get("button_text").isJsonNull()) && !jsonObj.get("button_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `button_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("button_text").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("sections").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sections` to be an array in the JSON string but got `%s`", jsonObj.get("sections").toString()));
      }

      JsonArray jsonArraysections = jsonObj.getAsJsonArray("sections");
      // validate the required field `sections` (array)
      for (int i = 0; i < jsonArraysections.size(); i++) {
        StructsListSection.validateJsonObject(jsonArraysections.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StructsListMessagePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StructsListMessagePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StructsListMessagePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StructsListMessagePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<StructsListMessagePayload>() {
           @Override
           public void write(JsonWriter out, StructsListMessagePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StructsListMessagePayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StructsListMessagePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StructsListMessagePayload
  * @throws IOException if the JSON string is invalid with respect to StructsListMessagePayload
  */
  public static StructsListMessagePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StructsListMessagePayload.class);
  }

 /**
  * Convert an instance of StructsListMessagePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

