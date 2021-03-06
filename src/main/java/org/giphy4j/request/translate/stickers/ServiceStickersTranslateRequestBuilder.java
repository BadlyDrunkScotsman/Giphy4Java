package org.giphy4j.request.translate.stickers;

import org.giphy4j.interfaces.OnResponseError;
import org.giphy4j.interfaces.OnSingleSearchSuccess;
import org.giphy4j.request.schemas.builder.RequestBuilder;

/**
 * @author Eryk Szmyt
 * builder class for ServiceStickersTranslateRequest
 */
public final class ServiceStickersTranslateRequestBuilder extends RequestBuilder {

    private String _Query = null;
    private OnSingleSearchSuccess _OnSearchSuccess = null;
    private OnResponseError _OnResponseError = null;

    /**
     * @param ApiKey Giphy ApiKey
     */
    public ServiceStickersTranslateRequestBuilder(String ApiKey){
        super(ApiKey);
    }

    /**
     * Setting on failed request action
     * @param OnResponseError on Error action
     */
    public ServiceStickersTranslateRequestBuilder setOnError(OnResponseError OnResponseError){
        this._OnResponseError = OnResponseError;
        return this;
    }

    /**
     * Setting on Success request action
     * @param onSingleSearchSuccess onSuccess Action
     */
    public ServiceStickersTranslateRequestBuilder setOnSuccess(OnSingleSearchSuccess onSingleSearchSuccess){
        this._OnSearchSuccess = onSingleSearchSuccess;
        return this;
    }

    /**
     * @param Query setting searching query
     */
    public ServiceStickersTranslateRequestBuilder setQuery(String Query) {
        this._Query = Query;
        return this;
    }

    /**
     * building new RequestStickersTranslateSearch
     * @return new RequestStickersTranslateSearch
     */
    @Override
    public RequestStickersTranslateSearch build(){
        if (_Query == null)
            throw new Error("Missing query");

        return new RequestStickersTranslateSearch(_ApiKey,_Query, _OnSearchSuccess, _OnResponseError);
    }
}