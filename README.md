# openapi-java-client

WhatsAPI Go
- API version: 2.0
  - Build date: 2022-11-18T21:16:08.870513900+05:30[Asia/Calcutta]

The V2 of WhatsAPI Go


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:2.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to */api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BusinessManagementApi* | [**fetchCatlog**](docs/BusinessManagementApi.md#fetchCatlog) | **GET** /instances/{instance_key}/business/catalog | Fetches the catlog.
*BusinessManagementApi* | [**sendPaymentRequest**](docs/BusinessManagementApi.md#sendPaymentRequest) | **POST** /instances/{instance_key}/business/payment-request | Send a payment request.
*GroupManagementApi* | [**addParticipant**](docs/GroupManagementApi.md#addParticipant) | **POST** /instances/{instance_key}/groups/{group_id}/participants/add | Add participant.
*GroupManagementApi* | [**createGroup**](docs/GroupManagementApi.md#createGroup) | **POST** /instances/{instance_key}/groups/create | Create group.
*GroupManagementApi* | [**demoteParticipant**](docs/GroupManagementApi.md#demoteParticipant) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/demote | Demote participant.
*GroupManagementApi* | [**getAdminGroups**](docs/GroupManagementApi.md#getAdminGroups) | **GET** /instances/{instance_key}/groups/admin | Get admin groups.
*GroupManagementApi* | [**getAllGroups**](docs/GroupManagementApi.md#getAllGroups) | **GET** /instances/{instance_key}/groups/ | Get all groups.
*GroupManagementApi* | [**getAllParticipants**](docs/GroupManagementApi.md#getAllParticipants) | **GET** /instances/{instance_key}/groups/{group_id}/participants | Get all participants.
*GroupManagementApi* | [**getGroup**](docs/GroupManagementApi.md#getGroup) | **GET** /instances/{instance_key}/groups/{group_id} | Get group.
*GroupManagementApi* | [**getGroupFromInviteLink**](docs/GroupManagementApi.md#getGroupFromInviteLink) | **GET** /instances/{instance_key}/groups/invite-info | Get group from invite link.
*GroupManagementApi* | [**getGroupInviteCode**](docs/GroupManagementApi.md#getGroupInviteCode) | **GET** /instances/{instance_key}/groups/{group_id}/invite-code | Get group invite code.
*GroupManagementApi* | [**joinGroupWithLink**](docs/GroupManagementApi.md#joinGroupWithLink) | **GET** /instances/{instance_key}/groups/join | Join group with invite code.
*GroupManagementApi* | [**leaveGroup**](docs/GroupManagementApi.md#leaveGroup) | **DELETE** /instances/{instance_key}/groups/{group_id}/ | Leaves the group.
*GroupManagementApi* | [**promoteParticipant**](docs/GroupManagementApi.md#promoteParticipant) | **PUT** /instances/{instance_key}/groups/{group_id}/participants/promote | Promote participant.
*GroupManagementApi* | [**removeParticipant**](docs/GroupManagementApi.md#removeParticipant) | **DELETE** /instances/{instance_key}/groups/{group_id}/participants/remove | Remove participant.
*GroupManagementApi* | [**setGroupAnnounce**](docs/GroupManagementApi.md#setGroupAnnounce) | **PUT** /instances/{instance_key}/groups/{group_id}/announce | Set group announce.
*GroupManagementApi* | [**setGroupDescription**](docs/GroupManagementApi.md#setGroupDescription) | **PUT** /instances/{instance_key}/groups/{group_id}/description | Set group description.
*GroupManagementApi* | [**setGroupLocked**](docs/GroupManagementApi.md#setGroupLocked) | **PUT** /instances/{instance_key}/groups/{group_id}/lock | Set group locked.
*GroupManagementApi* | [**setGroupName**](docs/GroupManagementApi.md#setGroupName) | **PUT** /instances/{instance_key}/groups/{group_id}/name | Set group name.
*GroupManagementApi* | [**setGroupPicture**](docs/GroupManagementApi.md#setGroupPicture) | **PUT** /instances/{instance_key}/groups/{group_id}/profile-pic | Set group picture.
*InstanceApi* | [**changeWebhookUrl**](docs/InstanceApi.md#changeWebhookUrl) | **PUT** /instances/{instance_key}/webhook | Change Webhook url.
*InstanceApi* | [**createInstance**](docs/InstanceApi.md#createInstance) | **GET** /instances/create | Creates a new instance key.
*InstanceApi* | [**deleteInstance**](docs/InstanceApi.md#deleteInstance) | **DELETE** /instances/{instance_key}/delete | Delete Instance.
*InstanceApi* | [**getContacts**](docs/InstanceApi.md#getContacts) | **GET** /instances/{instance_key}/contacts | Get contacts.
*InstanceApi* | [**getInstance**](docs/InstanceApi.md#getInstance) | **GET** /instances/{instance_key}/ | Get Instance.
*InstanceApi* | [**getQrCode**](docs/InstanceApi.md#getQrCode) | **GET** /instances/{instance_key}/qrcode | Get QrCode.
*InstanceApi* | [**listInstances**](docs/InstanceApi.md#listInstances) | **GET** /instances/list | Get all instances.
*InstanceApi* | [**logoutInstance**](docs/InstanceApi.md#logoutInstance) | **DELETE** /instances/{instance_key}/logout | Logout Instance.
*MessageSendingApi* | [**sendAudio**](docs/MessageSendingApi.md#sendAudio) | **POST** /instances/{instance_key}/send/audio | Send raw audio.
*MessageSendingApi* | [**sendButtonMessage**](docs/MessageSendingApi.md#sendButtonMessage) | **POST** /instances/{instance_key}/send/buttons | Send a button message.
*MessageSendingApi* | [**sendButtonWithMedia**](docs/MessageSendingApi.md#sendButtonWithMedia) | **POST** /instances/{instance_key}/send/button-media | Send a button message with a media header.
*MessageSendingApi* | [**sendContact**](docs/MessageSendingApi.md#sendContact) | **POST** /instances/{instance_key}/send/contact | Send a contact message.
*MessageSendingApi* | [**sendDocument**](docs/MessageSendingApi.md#sendDocument) | **POST** /instances/{instance_key}/send/document | Send raw document.
*MessageSendingApi* | [**sendGroupInvite**](docs/MessageSendingApi.md#sendGroupInvite) | **POST** /instances/{instance_key}/send/group-invite | Send a group invite message
*MessageSendingApi* | [**sendImage**](docs/MessageSendingApi.md#sendImage) | **POST** /instances/{instance_key}/send/image | Send raw image.
*MessageSendingApi* | [**sendListMessage**](docs/MessageSendingApi.md#sendListMessage) | **POST** /instances/{instance_key}/send/list | Send a List message.
*MessageSendingApi* | [**sendLocation**](docs/MessageSendingApi.md#sendLocation) | **POST** /instances/{instance_key}/send/location | Send a location message.
*MessageSendingApi* | [**sendMediaMessage**](docs/MessageSendingApi.md#sendMediaMessage) | **POST** /instances/{instance_key}/send/media | Send a media message.
*MessageSendingApi* | [**sendPollMessage**](docs/MessageSendingApi.md#sendPollMessage) | **POST** /instances/{instance_key}/send/poll | Send a Poll message.
*MessageSendingApi* | [**sendTemplate**](docs/MessageSendingApi.md#sendTemplate) | **POST** /instances/{instance_key}/send/template | Send a template message.
*MessageSendingApi* | [**sendTemplateWithMedia**](docs/MessageSendingApi.md#sendTemplateWithMedia) | **POST** /instances/{instance_key}/send/template-media | Send a template message with media.
*MessageSendingApi* | [**sendTextMessage**](docs/MessageSendingApi.md#sendTextMessage) | **POST** /instances/{instance_key}/send/text | Send a text message.
*MessageSendingApi* | [**sendVideo**](docs/MessageSendingApi.md#sendVideo) | **POST** /instances/{instance_key}/send/video | Send raw video.
*MessageSendingApi* | [**uploadMedia**](docs/MessageSendingApi.md#uploadMedia) | **POST** /instances/{instance_key}/send/upload | Upload media.
*MiscellaneousApi* | [**downloadMedia**](docs/MiscellaneousApi.md#downloadMedia) | **POST** /instances/{instance_key}/misc/download | Download media
*MiscellaneousApi* | [**getProfilePic**](docs/MiscellaneousApi.md#getProfilePic) | **GET** /instances/{instance_key}/misc/profile-pic | Get profile pic.
*MiscellaneousApi* | [**getUsersInfo**](docs/MiscellaneousApi.md#getUsersInfo) | **POST** /instances/{instance_key}/misc/user-info | Fetches the users info.
*MiscellaneousApi* | [**setChatPresence**](docs/MiscellaneousApi.md#setChatPresence) | **POST** /instances/{instance_key}/misc/chat-presence | Set chat presence
*MiscellaneousApi* | [**updateProfilePic**](docs/MiscellaneousApi.md#updateProfilePic) | **PUT** /instances/{instance_key}/misc/profile-pic | Update profile picture


## Documentation for Models

 - [ButtonMessagePayload](docs/ButtonMessagePayload.md)
 - [ButtonMessageWithMediaPayload](docs/ButtonMessageWithMediaPayload.md)
 - [ContactMessagePayload](docs/ContactMessagePayload.md)
 - [ContactMessagePayloadVcard](docs/ContactMessagePayloadVcard.md)
 - [FileUpload](docs/FileUpload.md)
 - [GroupCreatePayload](docs/GroupCreatePayload.md)
 - [GroupInviteMessagePayload](docs/GroupInviteMessagePayload.md)
 - [GroupUpdateDescriptionPayload](docs/GroupUpdateDescriptionPayload.md)
 - [GroupUpdateNamePayload](docs/GroupUpdateNamePayload.md)
 - [GroupUpdateParticipantsPayload](docs/GroupUpdateParticipantsPayload.md)
 - [ListItem](docs/ListItem.md)
 - [ListMessagePayload](docs/ListMessagePayload.md)
 - [ListSection](docs/ListSection.md)
 - [LocationMessagePayload](docs/LocationMessagePayload.md)
 - [LocationMessagePayloadLocation](docs/LocationMessagePayloadLocation.md)
 - [ModelAPIResponse](docs/ModelAPIResponse.md)
 - [PaymentRequestPayload](docs/PaymentRequestPayload.md)
 - [PollMessagePayload](docs/PollMessagePayload.md)
 - [ReplyButton](docs/ReplyButton.md)
 - [SendAudioRequest](docs/SendAudioRequest.md)
 - [SendDocumentRequest](docs/SendDocumentRequest.md)
 - [SendMediaPayload](docs/SendMediaPayload.md)
 - [SendVideoRequest](docs/SendVideoRequest.md)
 - [SetGroupPictureRequest](docs/SetGroupPictureRequest.md)
 - [TemplateButton](docs/TemplateButton.md)
 - [TemplateButtonPayload](docs/TemplateButtonPayload.md)
 - [TemplateButtonWithMediaPayload](docs/TemplateButtonWithMediaPayload.md)
 - [TextMessage](docs/TextMessage.md)
 - [UpdateProfilePicRequest](docs/UpdateProfilePicRequest.md)
 - [UploadMediaRequest](docs/UploadMediaRequest.md)
 - [UserInfoPayload](docs/UserInfoPayload.md)
 - [WebhookPayload](docs/WebhookPayload.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

manjit@sponsorbook.io

