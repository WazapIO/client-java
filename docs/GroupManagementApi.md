# GroupManagementApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addParticipant**](GroupManagementApi.md#addParticipant) | **POST** /instances/{instance_key}/groups/{group_id}/participants/add | Add participant. |
| [**createGroup**](GroupManagementApi.md#createGroup) | **POST** /instances/{instance_key}/groups/create | Create group. |
| [**demoteParticipant**](GroupManagementApi.md#demoteParticipant) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/demote | Demote participant. |
| [**getAdminGroups**](GroupManagementApi.md#getAdminGroups) | **GET** /instances/{instance_key}/groups/admin | Get admin groups. |
| [**getAllGroups**](GroupManagementApi.md#getAllGroups) | **GET** /instances/{instance_key}/groups/ | Get all groups. |
| [**getGroup**](GroupManagementApi.md#getGroup) | **GET** /instances/{instance_key}/groups/{group_id} | Get group. |
| [**getGroupFromInviteLink**](GroupManagementApi.md#getGroupFromInviteLink) | **GET** /instances/{instance_key}/groups/invite-info | Get group from invite link. |
| [**getGroupInviteCode**](GroupManagementApi.md#getGroupInviteCode) | **GET** /instances/{instance_key}/groups/{group_id}/invite-code | Get group invite code. |
| [**leaveGroup**](GroupManagementApi.md#leaveGroup) | **DELETE** /instances/{instance_key}/groups/{group_id}/ | Leaves the group. |
| [**promoteParticipant**](GroupManagementApi.md#promoteParticipant) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/promote | Promote participant. |
| [**removeParticipant**](GroupManagementApi.md#removeParticipant) | **DELETE** /instances/{instance_key}/groups/{group_id}/participants/remove | Remove participant. |
| [**setGroupAnnounce**](GroupManagementApi.md#setGroupAnnounce) | **PUT** /instances/{instance_key}/groups/{group_id}/announce | Set group announce. |
| [**setGroupDescription**](GroupManagementApi.md#setGroupDescription) | **PUT** /instances/{instance_key}/groups/{group_id}/description | Set group description. |
| [**setGroupLocked**](GroupManagementApi.md#setGroupLocked) | **PUT** /instances/{instance_key}/groups/{group_id}/lock | Set group locked. |
| [**setGroupName**](GroupManagementApi.md#setGroupName) | **PUT** /instances/{instance_key}/groups/{group_id}/name | Set group name. |
| [**setGroupPicture**](GroupManagementApi.md#setGroupPicture) | **PUT** /instances/{instance_key}/groups/{group_id}/profile-pic | Set group picture. |


<a name="addParticipant"></a>
# **addParticipant**
> ModelAPIResponse addParticipant(instanceKey, groupId, data)

Add participant.

Handles adding participants to a group. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupUpdateParticipantsPayload data = new GroupUpdateParticipantsPayload(); // GroupUpdateParticipantsPayload | Group update payload
    try {
      ModelAPIResponse result = apiInstance.addParticipant(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#addParticipant");
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
| **data** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload | |

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

<a name="createGroup"></a>
# **createGroup**
> ModelAPIResponse createGroup(instanceKey, data)

Create group.

Creates a group with the participant data. The creator is automatically added to the group.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupCreatePayload data = new GroupCreatePayload(); // GroupCreatePayload | Group create payload
    try {
      ModelAPIResponse result = apiInstance.createGroup(instanceKey, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#createGroup");
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
| **data** | [**GroupCreatePayload**](GroupCreatePayload.md)| Group create payload | |

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

<a name="demoteParticipant"></a>
# **demoteParticipant**
> ModelAPIResponse demoteParticipant(instanceKey, groupId, data)

Demote participant.

Demotes admins in groups. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupUpdateParticipantsPayload data = new GroupUpdateParticipantsPayload(); // GroupUpdateParticipantsPayload | Group update payload
    try {
      ModelAPIResponse result = apiInstance.demoteParticipant(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#demoteParticipant");
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
| **data** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload | |

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

<a name="getAdminGroups"></a>
# **getAdminGroups**
> ModelAPIResponse getAdminGroups(instanceKey)

Get admin groups.

Returns list of all groups in which you are admin.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.getAdminGroups(instanceKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#getAdminGroups");
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

<a name="getAllGroups"></a>
# **getAllGroups**
> ModelAPIResponse getAllGroups(instanceKey, includeParticipants)

Get all groups.

Returns list of all groups with participants data. Set include_participants to false to exclude participants data.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.getAllGroups(instanceKey, includeParticipants);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#getAllGroups");
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

<a name="getGroup"></a>
# **getGroup**
> ModelAPIResponse getGroup(instanceKey, groupId)

Get group.

Fetches the group data.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.getGroup(instanceKey, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#getGroup");
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

<a name="getGroupFromInviteLink"></a>
# **getGroupFromInviteLink**
> ModelAPIResponse getGroupFromInviteLink(instanceKey, inviteLink)

Get group from invite link.

Gets a group info from an invite link. An invite link is a link that can be used to join a group. It is usually in the format https://chat.whatsapp.com/{invitecode}

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.getGroupFromInviteLink(instanceKey, inviteLink);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#getGroupFromInviteLink");
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

<a name="getGroupInviteCode"></a>
# **getGroupInviteCode**
> ModelAPIResponse getGroupInviteCode(instanceKey, groupId)

Get group invite code.

Gets the invite code of the group.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.getGroupInviteCode(instanceKey, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#getGroupInviteCode");
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

<a name="leaveGroup"></a>
# **leaveGroup**
> ModelAPIResponse leaveGroup(instanceKey, groupId)

Leaves the group.

Leaves the specified group.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.leaveGroup(instanceKey, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#leaveGroup");
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

<a name="promoteParticipant"></a>
# **promoteParticipant**
> ModelAPIResponse promoteParticipant(instanceKey, groupId, data)

Promote participant.

Promotes participants to admin. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupUpdateParticipantsPayload data = new GroupUpdateParticipantsPayload(); // GroupUpdateParticipantsPayload | Group update payload
    try {
      ModelAPIResponse result = apiInstance.promoteParticipant(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#promoteParticipant");
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
| **data** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload | |

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

<a name="removeParticipant"></a>
# **removeParticipant**
> ModelAPIResponse removeParticipant(instanceKey, groupId, data)

Remove participant.

Handles removing participants from a group. You must be admin in the group or the query will fail.

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupUpdateParticipantsPayload data = new GroupUpdateParticipantsPayload(); // GroupUpdateParticipantsPayload | Group update payload
    try {
      ModelAPIResponse result = apiInstance.removeParticipant(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#removeParticipant");
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
| **data** | [**GroupUpdateParticipantsPayload**](GroupUpdateParticipantsPayload.md)| Group update payload | |

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

<a name="setGroupAnnounce"></a>
# **setGroupAnnounce**
> ModelAPIResponse setGroupAnnounce(instanceKey, announce, groupId)

Set group announce.

Set if non-admins are allowed to send messages in groups

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.setGroupAnnounce(instanceKey, announce, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#setGroupAnnounce");
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

<a name="setGroupDescription"></a>
# **setGroupDescription**
> ModelAPIResponse setGroupDescription(instanceKey, groupId, data)

Set group description.

Changes the group description

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupUpdateDescriptionPayload data = new GroupUpdateDescriptionPayload(); // GroupUpdateDescriptionPayload | Group description data
    try {
      ModelAPIResponse result = apiInstance.setGroupDescription(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#setGroupDescription");
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
| **data** | [**GroupUpdateDescriptionPayload**](GroupUpdateDescriptionPayload.md)| Group description data | |

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

<a name="setGroupLocked"></a>
# **setGroupLocked**
> ModelAPIResponse setGroupLocked(instanceKey, locked, groupId)

Set group locked.

Set if non-admins are allowed to change the group dp and other stuff

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
      ModelAPIResponse result = apiInstance.setGroupLocked(instanceKey, locked, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#setGroupLocked");
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

<a name="setGroupName"></a>
# **setGroupName**
> ModelAPIResponse setGroupName(instanceKey, groupId, data)

Set group name.

Changes the group name. The max limit is 22 chars

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    GroupUpdateNamePayload data = new GroupUpdateNamePayload(); // GroupUpdateNamePayload | Group name data
    try {
      ModelAPIResponse result = apiInstance.setGroupName(instanceKey, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#setGroupName");
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
| **data** | [**GroupUpdateNamePayload**](GroupUpdateNamePayload.md)| Group name data | |

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

<a name="setGroupPicture"></a>
# **setGroupPicture**
> ModelAPIResponse setGroupPicture(instanceKey, groupId, setGroupPictureRequest)

Set group picture.

Changes the group profile picture. Currently it only seems to accept JPEG images only

### Example
```java
// Import classes:
import WhatsAPI.ApiClient;
import WhatsAPI.ApiException;
import WhatsAPI.Configuration;
import WhatsAPI.auth.*;
import WhatsAPI.models.*;
import whatsapi.GroupManagementApi;

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
    SetGroupPictureRequest setGroupPictureRequest = new SetGroupPictureRequest(); // SetGroupPictureRequest | 
    try {
      ModelAPIResponse result = apiInstance.setGroupPicture(instanceKey, groupId, setGroupPictureRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupManagementApi#setGroupPicture");
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
| **setGroupPictureRequest** | [**SetGroupPictureRequest**](SetGroupPictureRequest.md)|  | |

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

