# MiscellaneousApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadMedia**](MiscellaneousApi.md#downloadMedia) | **POST** /instances/{instance_key}/misc/download | Download media |
| [**getProfilePic**](MiscellaneousApi.md#getProfilePic) | **GET** /instances/{instance_key}/misc/profile-pic | Get profile pic. |
| [**getUsersInfo**](MiscellaneousApi.md#getUsersInfo) | **POST** /instances/{instance_key}/misc/user-info | Fetches the users info. |
| [**setChatPresence**](MiscellaneousApi.md#setChatPresence) | **POST** /instances/{instance_key}/misc/chat-presence | Set chat presence |
| [**updateProfilePic**](MiscellaneousApi.md#updateProfilePic) | **PUT** /instances/{instance_key}/misc/profile-pic | Update profile picture |


<a name="downloadMedia"></a>
# **downloadMedia**
> ModelAPIResponse downloadMedia(instanceKey, fileType, data, responseType)

Download media

Downloads the media from the given media keys.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String fileType = "image"; // String | File type
    FileUpload data = new FileUpload(); // FileUpload | Media data
    String responseType = "responseType_example"; // String | Response type (file, base64)
    try {
      ModelAPIResponse result = apiInstance.downloadMedia(instanceKey, fileType, data, responseType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#downloadMedia");
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
| **fileType** | **String**| File type | [enum: image, video, audio, document] |
| **data** | [**FileUpload**](FileUpload.md)| Media data | |
| **responseType** | **String**| Response type (file, base64) | [optional] |

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

<a name="getProfilePic"></a>
# **getProfilePic**
> ModelAPIResponse getProfilePic(instanceKey, jid)

Get profile pic.

Returns the profile pic of the given user.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String jid = "jid_example"; // String | JID
    try {
      ModelAPIResponse result = apiInstance.getProfilePic(instanceKey, jid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getProfilePic");
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
| **jid** | **String**| JID | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="getUsersInfo"></a>
# **getUsersInfo**
> ModelAPIResponse getUsersInfo(instanceKey, data)

Fetches the users info.

Gets the user info for the given user ids. This does not checks if user is registered or not

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    UserInfoPayload data = new UserInfoPayload(); // UserInfoPayload | Data
    try {
      ModelAPIResponse result = apiInstance.getUsersInfo(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#getUsersInfo");
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
| **data** | [**UserInfoPayload**](UserInfoPayload.md)| Data | |

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

<a name="setChatPresence"></a>
# **setChatPresence**
> ModelAPIResponse setChatPresence(instanceKey, jid, presence)

Set chat presence

Sets the presence of the given chat. (Typing, Recording, Paused) Options: typing, recording, paused

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String jid = "jid_example"; // String | JID
    String presence = "presence_example"; // String | Presence
    try {
      ModelAPIResponse result = apiInstance.setChatPresence(instanceKey, jid, presence);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#setChatPresence");
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
| **jid** | **String**| JID | |
| **presence** | **String**| Presence | |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Instance not found |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateProfilePic"></a>
# **updateProfilePic**
> ModelAPIResponse updateProfilePic(instanceKey, updateProfilePicRequest)

Update profile picture

Changes the profile pic of the current logged in user.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.MiscellaneousApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    UpdateProfilePicRequest updateProfilePicRequest = new UpdateProfilePicRequest(); // UpdateProfilePicRequest | 
    try {
      ModelAPIResponse result = apiInstance.updateProfilePic(instanceKey, updateProfilePicRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MiscellaneousApi#updateProfilePic");
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
| **updateProfilePicRequest** | [**UpdateProfilePicRequest**](UpdateProfilePicRequest.md)|  | |

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

