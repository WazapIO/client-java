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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.MainAPIResponse;
import org.openapitools.client.model.StructsWebhookPayload;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstanceApi
 */
@Disabled
public class InstanceApiTest {

    private final InstanceApi api = new InstanceApi();

    /**
     * Creates a new instance key.
     *
     * This endpoint is used to create a new WhatsApp Web instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesCreateGetTest() throws ApiException {
        String instanceKey = null;
        MainAPIResponse response = api.instancesCreateGet(instanceKey);
        // TODO: test validations
    }

    /**
     * Get contacts.
     *
     * Fetches the list of contacts in the instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesInstanceKeyContactsGetTest() throws ApiException {
        String instanceKey = null;
        MainAPIResponse response = api.instancesInstanceKeyContactsGet(instanceKey);
        // TODO: test validations
    }

    /**
     * Delete Instance.
     *
     * Deletes the instance with the provided key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesInstanceKeyDeleteDeleteTest() throws ApiException {
        String instanceKey = null;
        MainAPIResponse response = api.instancesInstanceKeyDeleteDelete(instanceKey);
        // TODO: test validations
    }

    /**
     * Get Instance.
     *
     * Returns the instance data of single instance with connection status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesInstanceKeyGetTest() throws ApiException {
        String instanceKey = null;
        MainAPIResponse response = api.instancesInstanceKeyGet(instanceKey);
        // TODO: test validations
    }

    /**
     * Logout Instance.
     *
     * Logouts of the instance with the provided key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesInstanceKeyLogoutDeleteTest() throws ApiException {
        String instanceKey = null;
        MainAPIResponse response = api.instancesInstanceKeyLogoutDelete(instanceKey);
        // TODO: test validations
    }

    /**
     * Get QrCode.
     *
     * Returns the qrcode in the base64 format.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesInstanceKeyQrcodeGetTest() throws ApiException {
        String instanceKey = null;
        MainAPIResponse response = api.instancesInstanceKeyQrcodeGet(instanceKey);
        // TODO: test validations
    }

    /**
     * Change Webhook url.
     *
     * Changes the webhook url of an instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesInstanceKeyWebhookPutTest() throws ApiException {
        String instanceKey = null;
        StructsWebhookPayload data = null;
        MainAPIResponse response = api.instancesInstanceKeyWebhookPut(instanceKey, data);
        // TODO: test validations
    }

    /**
     * Get all instances.
     *
     * Fetches the list of all Instances with login status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void instancesListGetTest() throws ApiException {
        MainAPIResponse response = api.instancesListGet();
        // TODO: test validations
    }

}
