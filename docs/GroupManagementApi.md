# GroupManagementApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**instancesInstanceKeyGroupsAdminGet**](GroupManagementApi.md#instancesInstanceKeyGroupsAdminGet) | **GET** /instances/{instance_key}/groups/admin | Get admin groupss. |
| [**instancesInstanceKeyGroupsCreatePost**](GroupManagementApi.md#instancesInstanceKeyGroupsCreatePost) | **POST** /instances/{instance_key}/groups/create | Create group. |
| [**instancesInstanceKeyGroupsGet**](GroupManagementApi.md#instancesInstanceKeyGroupsGet) | **GET** /instances/{instance_key}/groups/ | Get all groups. |
| [**instancesInstanceKeyGroupsGroupIdAnnouncePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdAnnouncePut) | **PUT** /instances/{instance_key}/groups/{group_id}/announce | Set group announce. |
| [**instancesInstanceKeyGroupsGroupIdDelete**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdDelete) | **DELETE** /instances/{instance_key}/groups/{group_id}/ | Leaves the group. |
| [**instancesInstanceKeyGroupsGroupIdDescriptionPut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdDescriptionPut) | **PUT** /instances/{instance_key}/groups/{group_id}/description | Set group description. |
| [**instancesInstanceKeyGroupsGroupIdGet**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdGet) | **GET** /instances/{instance_key}/groups/{group_id} | Get group. |
| [**instancesInstanceKeyGroupsGroupIdInviteCodeGet**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdInviteCodeGet) | **GET** /instances/{instance_key}/groups/{group_id}/invite-code | Get group invite code. |
| [**instancesInstanceKeyGroupsGroupIdLockPut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdLockPut) | **PUT** /instances/{instance_key}/groups/{group_id}/lock | Set group locked. |
| [**instancesInstanceKeyGroupsGroupIdNamePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdNamePut) | **PUT** /instances/{instance_key}/groups/{group_id}/name | Set group name. |
| [**instancesInstanceKeyGroupsGroupIdParticipantsAddPost**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsAddPost) | **POST** /instances/{instance_key}/groups/{group_id}/participants/add | Add participant. |
| [**instancesInstanceKeyGroupsGroupIdParticipantsDemotePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsDemotePut) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/demote | Demote participant. |
| [**instancesInstanceKeyGroupsGroupIdParticipantsPromotePut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsPromotePut) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/promote | Promote participant. |
| [**instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete) | **DELETE** /instances/{instance_key}/groups/{group_id}/participants/remove | Remove participant. |
| [**instancesInstanceKeyGroupsGroupIdProfilePicPut**](GroupManagementApi.md#instancesInstanceKeyGroupsGroupIdProfilePicPut) | **PUT** /instances/{instance_key}/groups/{group_id}/profile-pic | Set group picture. |
| [**instancesInstanceKeyGroupsInviteInfoGet**](GroupManagementApi.md#instancesInstanceKeyGroupsInviteInfoGet) | **GET** /instances/{instance_key}/groups/invite-info | Get group from invite link. |


<a name="instancesInstanceKeyGroupsAdminGet"></a>
# **instancesInstanceKeyGroupsAdminGet**
> MainAPIResponse instancesInstanceKeyGroupsAdminGet(instanceKey)

Get admin groupss.

Returns list of all groups in which you are admin.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsAdminGet(instanceKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsAdminGet");
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

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsCreatePost"></a>
# **instancesInstanceKeyGroupsCreatePost**
> MainAPIResponse instancesInstanceKeyGroupsCreatePost(instanceKey, data)

Create group.

Creates a group with the participant data. The creator is automatically added to the group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    StructsGroupCreatePayload data = new StructsGroupCreatePayload(); // StructsGroupCreatePayload | Group create payload
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsCreatePost(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsCreatePost");
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
| **data** | [**StructsGroupCreatePayload**](StructsGroupCreatePayload.md)| Group create payload | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGet"></a>
# **instancesInstanceKeyGroupsGet**
> MainAPIResponse instancesInstanceKeyGroupsGet(instanceKey, includeParticipants)

Get all groups.

Returns list of all groups with participants data. Set include_participants to false to exclude participants data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String includeParticipants = "false"; // String | Include participants data
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGet(instanceKey, includeParticipants);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGet");
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
| **includeParticipants** | **String**| Include participants data | [optional] [default to true] [enum: false, true] |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdAnnouncePut"></a>
# **instancesInstanceKeyGroupsGroupIdAnnouncePut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdAnnouncePut(instanceKey, announce, groupId)

Set group announce.

Set if non-admins are allowed to send messages in groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    Boolean announce = true; // Boolean | Announce status
    String groupId = "groupId_example"; // String | Group id of the group
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdAnnouncePut(instanceKey, announce, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdAnnouncePut");
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
| **announce** | **Boolean**| Announce status | [default to false] [enum: true, false] |
| **groupId** | **String**| Group id of the group | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdDelete"></a>
# **instancesInstanceKeyGroupsGroupIdDelete**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdDelete(instanceKey, groupId)

Leaves the group.

Leaves the specified group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdDelete(instanceKey, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdDelete");
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
| **groupId** | **String**| Group id of the group | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdDescriptionPut"></a>
# **instancesInstanceKeyGroupsGroupIdDescriptionPut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdDescriptionPut(instanceKey, groupId, data)

Set group description.

Changes the group description

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    StructsGroupUpdateDescriptionPayload data = new StructsGroupUpdateDescriptionPayload(); // StructsGroupUpdateDescriptionPayload | Group description data
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdDescriptionPut(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdDescriptionPut");
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
| **groupId** | **String**| Group id of the group | |
| **data** | [**StructsGroupUpdateDescriptionPayload**](StructsGroupUpdateDescriptionPayload.md)| Group description data | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdGet"></a>
# **instancesInstanceKeyGroupsGroupIdGet**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdGet(instanceKey, groupId)

Get group.

Fetches the group data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdGet(instanceKey, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdGet");
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
| **groupId** | **String**| Group id of the group | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdInviteCodeGet"></a>
# **instancesInstanceKeyGroupsGroupIdInviteCodeGet**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdInviteCodeGet(instanceKey, groupId)

Get group invite code.

Gets the invite code of the group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdInviteCodeGet(instanceKey, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdInviteCodeGet");
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
| **groupId** | **String**| Group id of the group | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdLockPut"></a>
# **instancesInstanceKeyGroupsGroupIdLockPut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdLockPut(instanceKey, locked, groupId)

Set group locked.

Set if non-admins are allowed to change the group dp and other stuff

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    Boolean locked = true; // Boolean | Locked status
    String groupId = "groupId_example"; // String | Group id of the group
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdLockPut(instanceKey, locked, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdLockPut");
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
| **locked** | **Boolean**| Locked status | [default to false] [enum: true, false] |
| **groupId** | **String**| Group id of the group | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdNamePut"></a>
# **instancesInstanceKeyGroupsGroupIdNamePut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdNamePut(instanceKey, groupId, data)

Set group name.

Changes the group name. The max limit is 22 chars

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    StructsGroupUpdateNamePayload data = new StructsGroupUpdateNamePayload(); // StructsGroupUpdateNamePayload | Group name data
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdNamePut(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdNamePut");
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
| **groupId** | **String**| Group id of the group | |
| **data** | [**StructsGroupUpdateNamePayload**](StructsGroupUpdateNamePayload.md)| Group name data | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdParticipantsAddPost"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsAddPost**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdParticipantsAddPost(instanceKey, groupId, data)

Add participant.

Handles adding participants to a group. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    StructsGroupUpdateParticipantsPayload data = new StructsGroupUpdateParticipantsPayload(); // StructsGroupUpdateParticipantsPayload | Group update payload
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsAddPost(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsAddPost");
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
| **groupId** | **String**| Group id of the group | |
| **data** | [**StructsGroupUpdateParticipantsPayload**](StructsGroupUpdateParticipantsPayload.md)| Group update payload | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdParticipantsDemotePut"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsDemotePut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdParticipantsDemotePut(instanceKey, groupId, data)

Demote participant.

Demotes admins in groups. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    StructsGroupUpdateParticipantsPayload data = new StructsGroupUpdateParticipantsPayload(); // StructsGroupUpdateParticipantsPayload | Group update payload
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsDemotePut(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsDemotePut");
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
| **groupId** | **String**| Group id of the group | |
| **data** | [**StructsGroupUpdateParticipantsPayload**](StructsGroupUpdateParticipantsPayload.md)| Group update payload | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdParticipantsPromotePut"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsPromotePut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdParticipantsPromotePut(instanceKey, groupId, data)

Promote participant.

Promotes participants to admin. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    StructsGroupUpdateParticipantsPayload data = new StructsGroupUpdateParticipantsPayload(); // StructsGroupUpdateParticipantsPayload | Group update payload
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsPromotePut(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsPromotePut");
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
| **groupId** | **String**| Group id of the group | |
| **data** | [**StructsGroupUpdateParticipantsPayload**](StructsGroupUpdateParticipantsPayload.md)| Group update payload | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete"></a>
# **instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete(instanceKey, groupId, data)

Remove participant.

Handles removing participants from a group. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    StructsGroupUpdateParticipantsPayload data = new StructsGroupUpdateParticipantsPayload(); // StructsGroupUpdateParticipantsPayload | Group update payload
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdParticipantsRemoveDelete");
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
| **groupId** | **String**| Group id of the group | |
| **data** | [**StructsGroupUpdateParticipantsPayload**](StructsGroupUpdateParticipantsPayload.md)| Group update payload | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsGroupIdProfilePicPut"></a>
# **instancesInstanceKeyGroupsGroupIdProfilePicPut**
> MainAPIResponse instancesInstanceKeyGroupsGroupIdProfilePicPut(instanceKey, groupId, instancesInstanceKeyGroupsGroupIdProfilePicPutRequest)

Set group picture.

Changes the group profile picture. Currently it only seems to accept JPEG images only

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String groupId = "groupId_example"; // String | Group id of the group
    InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest instancesInstanceKeyGroupsGroupIdProfilePicPutRequest = new InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest(); // InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest | 
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsGroupIdProfilePicPut(instanceKey, groupId, instancesInstanceKeyGroupsGroupIdProfilePicPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsGroupIdProfilePicPut");
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
| **groupId** | **String**| Group id of the group | |
| **instancesInstanceKeyGroupsGroupIdProfilePicPutRequest** | [**InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest**](InstancesInstanceKeyGroupsGroupIdProfilePicPutRequest.md)|  | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

<a name="instancesInstanceKeyGroupsInviteInfoGet"></a>
# **instancesInstanceKeyGroupsInviteInfoGet**
> MainAPIResponse instancesInstanceKeyGroupsInviteInfoGet(instanceKey, inviteLink)

Get group from invite link.

Gets a group info from an invite link. An invite link is a link that can be used to join a group. It is usually in the format https://chat.whatsapp.com/{invitecode}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupManagementApi apiInstance = new GroupManagementApi(defaultClient);
    String instanceKey = "instanceKey_example"; // String | Instance key
    String inviteLink = "inviteLink_example"; // String | The invite link to check
    try {
      MainAPIResponse result = apiInstance.instancesInstanceKeyGroupsInviteInfoGet(instanceKey, inviteLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#instancesInstanceKeyGroupsInviteInfoGet");
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
| **inviteLink** | **String**| The invite link to check | |

### Return type

[**MainAPIResponse**](MainAPIResponse.md)

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

