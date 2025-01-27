/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.BalancePlatform;
import com.adyen.model.balanceplatform.PaginatedAccountHoldersResponse;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PlatformApi extends Service {
    private final String baseURL;

    public PlatformApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Get a balance platform
    *
    * @param id {@link String } The unique identifier of the balance platform. (required)
    * @return {@link BalancePlatform }
    * @throws ApiException if fails to make API call
    */
    public BalancePlatform getBalancePlatform(String id) throws ApiException, IOException {
        return getBalancePlatform(id, null);
    }

    /**
    * Get a balance platform
    *
    * @param id {@link String } The unique identifier of the balance platform. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link BalancePlatform }
    * @throws ApiException if fails to make API call
    */
    public BalancePlatform getBalancePlatform(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balancePlatforms/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return BalancePlatform.fromJson(jsonResult);
    }

    /**
    * Get all account holders under a balance platform
    *
    * @param id {@link String } The unique identifier of the balance platform. (required)
    * @return {@link PaginatedAccountHoldersResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedAccountHoldersResponse getAllAccountHoldersUnderBalancePlatform(String id) throws ApiException, IOException {
        return getAllAccountHoldersUnderBalancePlatform(id, null,  null,  null);
    }

    /**
    * Get all account holders under a balance platform
    *
    * @param id {@link String } The unique identifier of the balance platform. (required)
    * @param offset {@link Integer } Query: The number of items that you want to skip. (optional)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaginatedAccountHoldersResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedAccountHoldersResponse getAllAccountHoldersUnderBalancePlatform(String id, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/balancePlatforms/{id}/accountHolders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return PaginatedAccountHoldersResponse.fromJson(jsonResult);
    }
}
