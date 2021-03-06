package org.giphy4j.request.trending.stickers;

import org.giphy4j.interfaces.OnResponseError;
import org.giphy4j.interfaces.OnMultiSearchSuccess;
import org.giphy4j.request.Rating;
import org.giphy4j.request.schemas.builder.RequestBuilder;

/**
 * @author Eryk Szmyt
 * Builder for ServiceTrendingStickersRequest
 */
public final class ServiceTrendingStickersRequestBuilder extends RequestBuilder {

    private int _Limit = 20;
    private String _Rating = "";
    private OnMultiSearchSuccess _OnMultiSearchSuccess;
    private OnResponseError _OnResponseError;

    /**
     * @param ApiKey Key to Giphy Api
     */
    public ServiceTrendingStickersRequestBuilder(String ApiKey){
        super(ApiKey);
    }

    /**
     * Setting max number of results
     * @param _Limit max numbers of results
     */
    public ServiceTrendingStickersRequestBuilder setLimit(int _Limit) {
        this._Limit = _Limit;
        return this;
    }

    /**
     * Setting the rate query
     * @param _Rating Sticker rating
     */
    public ServiceTrendingStickersRequestBuilder setRating(Rating _Rating) {
        this._Rating = _Rating.toString();
        return this;
    }

    /**
     * Setting on Success request action
     * @param _OnMultiSearchSuccess onSuccess Action
     */
    public ServiceTrendingStickersRequestBuilder setOnSearchSuccess(OnMultiSearchSuccess _OnMultiSearchSuccess) {
        this._OnMultiSearchSuccess = _OnMultiSearchSuccess;
        return this;
    }

    /**
     * Setting on failed request action
     * @param _OnResponseError on Error action
     */
    public ServiceTrendingStickersRequestBuilder setOnError(OnResponseError _OnResponseError) {
        this._OnResponseError = _OnResponseError;
        return this;
    }

    /**
     * building new ServiceTrendingStickersRequest
     * @return new ServiceTrendingStickersRequest
     */
    @Override
    public ServiceTrendingStickersRequest build(){
        return new ServiceTrendingStickersRequest(_ApiKey,_Limit,_Rating, _OnMultiSearchSuccess, _OnResponseError);
    }
}
