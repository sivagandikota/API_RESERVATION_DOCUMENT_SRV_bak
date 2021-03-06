/*
 * OData Service for Business Partner
 * This service enables you to create, read, update, and    delete master data related to Business Partners,    Suppliers, and Customers in an SAP S/4HANA system.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_business_partner.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sap.apibhub.sdk.api_business_partner.model.ABPContactToAddressType;
import com.sap.apibhub.sdk.api_business_partner.model.OdataError;
import com.sap.apibhub.sdk.api_business_partner.model.Wrapper4;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ABPContactToAddressApi {
    private ApiClient apiClient;

    public ABPContactToAddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ABPContactToAddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for aBPContactToAddressGet */
    private com.squareup.okhttp.Call aBPContactToAddressGetCall(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/A_BPContactToAddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$filter", filter));
        if (inlinecount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$inlinecount", inlinecount));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$orderby", orderby));
        if (select != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$select", select));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$expand", expand));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aBPContactToAddressGetValidateBeforeCall(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = aBPContactToAddressGetCall(top, skip, filter, inlinecount, orderby, select, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get entities from A_BPContactToAddress
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return Wrapper4
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Wrapper4 aBPContactToAddressGet(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand) throws ApiException {
        ApiResponse<Wrapper4> resp = aBPContactToAddressGetWithHttpInfo(top, skip, filter, inlinecount, orderby, select, expand);
        return resp.getData();
    }

    /**
     * Get entities from A_BPContactToAddress
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ApiResponse&lt;Wrapper4&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Wrapper4> aBPContactToAddressGetWithHttpInfo(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand) throws ApiException {
        com.squareup.okhttp.Call call = aBPContactToAddressGetValidateBeforeCall(top, skip, filter, inlinecount, orderby, select, expand, null, null);
        Type localVarReturnType = new TypeToken<Wrapper4>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entities from A_BPContactToAddress (asynchronously)
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aBPContactToAddressGetAsync(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ApiCallback<Wrapper4> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aBPContactToAddressGetValidateBeforeCall(top, skip, filter, inlinecount, orderby, select, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Wrapper4>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet */
    private com.squareup.okhttp.Call aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetCall(String relationshipNumber, String businessPartnerCompany, String businessPartnerPerson, String validityEndDate, String addressID, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/A_BPContactToAddress(RelationshipNumber='{RelationshipNumber}',BusinessPartnerCompany='{BusinessPartnerCompany}',BusinessPartnerPerson='{BusinessPartnerPerson}',ValidityEndDate={ValidityEndDate},AddressID='{AddressID}')".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "RelationshipNumber" + "\\}", apiClient.escapeString(relationshipNumber.toString()))
        .replaceAll("\\{" + "BusinessPartnerCompany" + "\\}", apiClient.escapeString(businessPartnerCompany.toString()))
        .replaceAll("\\{" + "BusinessPartnerPerson" + "\\}", apiClient.escapeString(businessPartnerPerson.toString()))
        .replaceAll("\\{" + "ValidityEndDate" + "\\}", apiClient.escapeString(validityEndDate.toString()))
        .replaceAll("\\{" + "AddressID" + "\\}", apiClient.escapeString(addressID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (select != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$select", select));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$expand", expand));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetValidateBeforeCall(String relationshipNumber, String businessPartnerCompany, String businessPartnerPerson, String validityEndDate, String addressID, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'relationshipNumber' is set
        if (relationshipNumber == null) {
            throw new ApiException("Missing the required parameter 'relationshipNumber' when calling aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet(Async)");
        }
        
        // verify the required parameter 'businessPartnerCompany' is set
        if (businessPartnerCompany == null) {
            throw new ApiException("Missing the required parameter 'businessPartnerCompany' when calling aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet(Async)");
        }
        
        // verify the required parameter 'businessPartnerPerson' is set
        if (businessPartnerPerson == null) {
            throw new ApiException("Missing the required parameter 'businessPartnerPerson' when calling aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet(Async)");
        }
        
        // verify the required parameter 'validityEndDate' is set
        if (validityEndDate == null) {
            throw new ApiException("Missing the required parameter 'validityEndDate' when calling aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet(Async)");
        }
        
        // verify the required parameter 'addressID' is set
        if (addressID == null) {
            throw new ApiException("Missing the required parameter 'addressID' when calling aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetCall(relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate, addressID, select, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get entity from A_BPContactToAddress by key
     * 
     * @param relationshipNumber BP Relationship Number   The business partner relationship number is an internal number that identifies the business partner relationship set. (required)
     * @param businessPartnerCompany Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client. (required)
     * @param businessPartnerPerson Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client. (required)
     * @param validityEndDate Validity Date (Valid To) (required)
     * @param addressID Internal key for identifying a Business Address Services address.   For more information about the meaning and use of the address number and the Business Address Services concepts, see the function group SZA0 documentation. (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ABPContactToAddressType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ABPContactToAddressType aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGet(String relationshipNumber, String businessPartnerCompany, String businessPartnerPerson, String validityEndDate, String addressID, List<String> select, List<String> expand) throws ApiException {
        ApiResponse<ABPContactToAddressType> resp = aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetWithHttpInfo(relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate, addressID, select, expand);
        return resp.getData();
    }

    /**
     * Get entity from A_BPContactToAddress by key
     * 
     * @param relationshipNumber BP Relationship Number   The business partner relationship number is an internal number that identifies the business partner relationship set. (required)
     * @param businessPartnerCompany Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client. (required)
     * @param businessPartnerPerson Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client. (required)
     * @param validityEndDate Validity Date (Valid To) (required)
     * @param addressID Internal key for identifying a Business Address Services address.   For more information about the meaning and use of the address number and the Business Address Services concepts, see the function group SZA0 documentation. (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ApiResponse&lt;ABPContactToAddressType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ABPContactToAddressType> aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetWithHttpInfo(String relationshipNumber, String businessPartnerCompany, String businessPartnerPerson, String validityEndDate, String addressID, List<String> select, List<String> expand) throws ApiException {
        com.squareup.okhttp.Call call = aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetValidateBeforeCall(relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate, addressID, select, expand, null, null);
        Type localVarReturnType = new TypeToken<ABPContactToAddressType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entity from A_BPContactToAddress by key (asynchronously)
     * 
     * @param relationshipNumber BP Relationship Number   The business partner relationship number is an internal number that identifies the business partner relationship set. (required)
     * @param businessPartnerCompany Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client. (required)
     * @param businessPartnerPerson Business Partner Number   Key identifying a business partner in the SAP system. The key is unique within a client. (required)
     * @param validityEndDate Validity Date (Valid To) (required)
     * @param addressID Internal key for identifying a Business Address Services address.   For more information about the meaning and use of the address number and the Business Address Services concepts, see the function group SZA0 documentation. (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetAsync(String relationshipNumber, String businessPartnerCompany, String businessPartnerPerson, String validityEndDate, String addressID, List<String> select, List<String> expand, final ApiCallback<ABPContactToAddressType> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aBPContactToAddressRelationshipNumberRelationshipNumberBusinessPartnerCompanyBusinessPartnerCompanyBusinessPartnerPersonBusinessPartnerPersonValidityEndDateValidityEndDateAddressIDAddressIDGetValidateBeforeCall(relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate, addressID, select, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ABPContactToAddressType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
