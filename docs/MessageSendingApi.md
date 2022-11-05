# MessageSendingApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendAudio**](MessageSendingApi.md#sendAudio) | **POST** /instances/{instance_key}/send/audio | Send raw audio. |
| [**sendButtonMessage**](MessageSendingApi.md#sendButtonMessage) | **POST** /instances/{instance_key}/send/buttons | Send a button message. |
| [**sendButtonWithMedia**](MessageSendingApi.md#sendButtonWithMedia) | **POST** /instances/{instance_key}/send/button-media | Send a button message with a media header. |
| [**sendContact**](MessageSendingApi.md#sendContact) | **POST** /instances/{instance_key}/send/contact | Send a contact message. |
| [**sendDocument**](MessageSendingApi.md#sendDocument) | **POST** /instances/{instance_key}/send/document | Send raw document. |
| [**sendImage**](MessageSendingApi.md#sendImage) | **POST** /instances/{instance_key}/send/image | Send raw image. |
| [**sendListMessage**](MessageSendingApi.md#sendListMessage) | **POST** /instances/{instance_key}/send/list | Send a List message. |
| [**sendLocation**](MessageSendingApi.md#sendLocation) | **POST** /instances/{instance_key}/send/location | Send a location message. |
| [**sendMediaMessage**](MessageSendingApi.md#sendMediaMessage) | **POST** /instances/{instance_key}/send/media | Send a media message. |
| [**sendPollMessage**](MessageSendingApi.md#sendPollMessage) | **POST** /instances/{instance_key}/send/poll | Send a Poll message. |
| [**sendTemplate**](MessageSendingApi.md#sendTemplate) | **POST** /instances/{instance_key}/send/template | Send a template message. |
| [**sendTemplateWithMedia**](MessageSendingApi.md#sendTemplateWithMedia) | **POST** /instances/{instance_key}/send/template-media | Send a template message with media. |
| [**sendTextMessage**](MessageSendingApi.md#sendTextMessage) | **POST** /instances/{instance_key}/send/text | Send a text message. |
| [**sendVideo**](MessageSendingApi.md#sendVideo) | **POST** /instances/{instance_key}/send/video | Send raw video. |
| [**uploadMedia**](MessageSendingApi.md#uploadMedia) | **POST** /instances/{instance_key}/send/upload | Upload media. |


<a name="sendAudio"></a>
# **sendAudio**
> ModelAPIResponse sendAudio(instanceKey, to, sendAudioRequest, caption)

Send raw audio.

Sends a audio message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String to = "to_example"; // String | The recipient's number
    SendAudioRequest sendAudioRequest = new SendAudioRequest(); // SendAudioRequest | 
    String caption = "caption_example"; // String | Attached caption
    try {
      ModelAPIResponse result = apiInstance.sendAudio(instanceKey, to, sendAudioRequest, caption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendAudio");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **to** | **String**| The recipient&#39;s number | |
| **sendAudioRequest** | [**SendAudioRequest**](SendAudioRequest.md)|  | |
| **caption** | **String**| Attached caption | [optional] |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendButtonMessage"></a>
# **sendButtonMessage**
> ModelAPIResponse sendButtonMessage(instanceKey, data)

Send a button message.

Sends an interactive button message to the given user. Make sure that all the button ids are unique

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    ButtonMessagePayload data = new ButtonMessagePayload(); // ButtonMessagePayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendButtonMessage(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendButtonMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**ButtonMessagePayload**](ButtonMessagePayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendButtonWithMedia"></a>
# **sendButtonWithMedia**
> ModelAPIResponse sendButtonWithMedia(instanceKey, data)

Send a button message with a media header.

Sends an interactive button message to the given user. This message also has media header with it. Make sure that all the button ids are unique

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    ButtonMessageWithMediaPayload data = new ButtonMessageWithMediaPayload(); // ButtonMessageWithMediaPayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendButtonWithMedia(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendButtonWithMedia");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**ButtonMessageWithMediaPayload**](ButtonMessageWithMediaPayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendContact"></a>
# **sendContact**
> ModelAPIResponse sendContact(instanceKey, data)

Send a contact message.

Sends a contact (vcard) message to the given user.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    ContactMessagePayload data = new ContactMessagePayload(); // ContactMessagePayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendContact(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**ContactMessagePayload**](ContactMessagePayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendDocument"></a>
# **sendDocument**
> ModelAPIResponse sendDocument(instanceKey, to, sendDocumentRequest, caption)

Send raw document.

Sends a document message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String to = "to_example"; // String | The recipient's number
    SendDocumentRequest sendDocumentRequest = new SendDocumentRequest(); // SendDocumentRequest | 
    String caption = "caption_example"; // String | Attached caption
    try {
      ModelAPIResponse result = apiInstance.sendDocument(instanceKey, to, sendDocumentRequest, caption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **to** | **String**| The recipient&#39;s number | |
| **sendDocumentRequest** | [**SendDocumentRequest**](SendDocumentRequest.md)|  | |
| **caption** | **String**| Attached caption | [optional] |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendImage"></a>
# **sendImage**
> ModelAPIResponse sendImage(instanceKey, to, sendImageRequest, caption)

Send raw image.

Sends a image message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String to = "to_example"; // String | The recipient's number
    SendImageRequest sendImageRequest = new SendImageRequest(); // SendImageRequest | 
    String caption = "caption_example"; // String | Attached caption
    try {
      ModelAPIResponse result = apiInstance.sendImage(instanceKey, to, sendImageRequest, caption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **to** | **String**| The recipient&#39;s number | |
| **sendImageRequest** | [**SendImageRequest**](SendImageRequest.md)|  | |
| **caption** | **String**| Attached caption | [optional] |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendListMessage"></a>
# **sendListMessage**
> ModelAPIResponse sendListMessage(instanceKey, data)

Send a List message.

Sends an interactive List message to the given user.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    ListMessagePayload data = new ListMessagePayload(); // ListMessagePayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendListMessage(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendListMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**ListMessagePayload**](ListMessagePayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendLocation"></a>
# **sendLocation**
> ModelAPIResponse sendLocation(instanceKey, data)

Send a location message.

Sends a location message to the given user. This is static location and does not update Note: The Address and Url fields are optional

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    LocationMessagePayload data = new LocationMessagePayload(); // LocationMessagePayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendLocation(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendLocation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**LocationMessagePayload**](LocationMessagePayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendMediaMessage"></a>
# **sendMediaMessage**
> ModelAPIResponse sendMediaMessage(instanceKey, data)

Send a media message.

Sends a media message to the given user.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    SendMediaPayload data = new SendMediaPayload(); // SendMediaPayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendMediaMessage(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendMediaMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**SendMediaPayload**](SendMediaPayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendPollMessage"></a>
# **sendPollMessage**
> ModelAPIResponse sendPollMessage(instanceKey, data)

Send a Poll message.

Sends an interactive poll message to the given user. The poll message is a new feature that is currently in beta.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    PollMessagePayload data = new PollMessagePayload(); // PollMessagePayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendPollMessage(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendPollMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**PollMessagePayload**](PollMessagePayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendTemplate"></a>
# **sendTemplate**
> ModelAPIResponse sendTemplate(instanceKey, data)

Send a template message.

Sends an interactive template message to the given user. Note: The valid button types are \&quot;replyButton\&quot;, \&quot;urlButton\&quot;, \&quot;callButton\&quot;

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    TemplateButtonPayload data = new TemplateButtonPayload(); // TemplateButtonPayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendTemplate(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**TemplateButtonPayload**](TemplateButtonPayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendTemplateWithMedia"></a>
# **sendTemplateWithMedia**
> ModelAPIResponse sendTemplateWithMedia(instanceKey, data)

Send a template message with media.

Sends an interactive template message with a media header to the given user. Note: The valid button types are \&quot;replyButton\&quot;, \&quot;urlButton\&quot;, \&quot;callButton\&quot;

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    TemplateButtonWithMediaPayload data = new TemplateButtonWithMediaPayload(); // TemplateButtonWithMediaPayload | Message data
    try {
      ModelAPIResponse result = apiInstance.sendTemplateWithMedia(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendTemplateWithMedia");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**TemplateButtonWithMediaPayload**](TemplateButtonWithMediaPayload.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendTextMessage"></a>
# **sendTextMessage**
> ModelAPIResponse sendTextMessage(instanceKey, data)

Send a text message.

Sends a text message to the given user.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    TextMessage data = new TextMessage(); // TextMessage | Message data
    try {
      ModelAPIResponse result = apiInstance.sendTextMessage(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendTextMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **data** | [**TextMessage**](TextMessage.md)| Message data | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="sendVideo"></a>
# **sendVideo**
> ModelAPIResponse sendVideo(instanceKey, to, sendVideoRequest, caption)

Send raw video.

Sends a video message by uploading to the WhatsApp servers every time. This is not recommended for bulk sending.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String to = "to_example"; // String | The recipient's number
    SendVideoRequest sendVideoRequest = new SendVideoRequest(); // SendVideoRequest | 
    String caption = "caption_example"; // String | Attached caption
    try {
      ModelAPIResponse result = apiInstance.sendVideo(instanceKey, to, sendVideoRequest, caption);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#sendVideo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **to** | **String**| The recipient&#39;s number | |
| **sendVideoRequest** | [**SendVideoRequest**](SendVideoRequest.md)|  | |
| **caption** | **String**| Attached caption | [optional] |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="uploadMedia"></a>
# **uploadMedia**
> ModelAPIResponse uploadMedia(instanceKey, type, uploadMediaRequest)

Upload media.

Uploads media to WhatsApp servers and returns the media keys. Store the returned media keys, as you will need them to send media messages

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MessageSendingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MessageSendingApi apiInstance = new MessageSendingApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String type = "image"; // String | Media type
    UploadMediaRequest uploadMediaRequest = new UploadMediaRequest(); // UploadMediaRequest | 
    try {
      ModelAPIResponse result = apiInstance.uploadMedia(instanceKey, type, uploadMediaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageSendingApi#uploadMedia");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceKey** | **String**| Instance key | |
| **type** | **String**| Media type | [enum: image, video, audio, document] |
| **uploadMediaRequest** | [**UploadMediaRequest**](UploadMediaRequest.md)|  | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

