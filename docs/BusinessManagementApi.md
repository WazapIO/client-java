# BusinessManagementApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchCatlog**](BusinessManagementApi.md#fetchCatlog) | **GET** /instances/{instance_key}/business/catalog | Fetches the catlog. |


<a name="fetchCatlog"></a>
# **fetchCatlog**
> ModelAPIResponse fetchCatlog(instanceKey)

Fetches the catlog.

Gets list of all products registered by you.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.BusinessManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BusinessManagementApi apiInstance = new BusinessManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    try {
      ModelAPIResponse result = apiInstance.fetchCatlog(instanceKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessManagementApi#fetchCatlog");
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

