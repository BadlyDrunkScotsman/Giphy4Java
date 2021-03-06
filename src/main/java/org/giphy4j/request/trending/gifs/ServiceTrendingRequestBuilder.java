package org.giphy4j.request.trending.gifs;

import org.giphy4j.interfaces.OnResponseError;
import org.giphy4j.interfaces.OnMultiSearchSuccess;
import org.giphy4j.request.Rating;
import org.giphy4j.request.schemas.builder.RequestBuilder;

/**
 * @author Eryk Szmyt
 * builder for ServiceTrendingRequest
 */
public final class ServiceTrendingRequestBuilder extends RequestBuilder {

    private int _Limit = 20;
    private int _Offset = 20;
    private String _Rating = "";
    private OnMultiSearchSuccess _OnMultiSearchSuccess;
    private OnResponseError _OnResponseError;

    /**
     * @param ApiKey Giphy ApiKey
     */
    public ServiceTrendingRequestBuilder(String ApiKey){
        super(ApiKey);
    }

    /**
     * Setting max number of results
     * @param _Limit max numbers of results
     */
    public ServiceTrendingRequestBuilder setLimit(int _Limit) {
        this._Limit = _Limit;
        return this;
    }

    /**
     * Setting minimal number of results
     * @param _Offset min number of results
     */
    public ServiceTrendingRequestBuilder setOffset(int _Offset) {
        this._Offset = _Offset;
        return this;
    }

    /**
     * Setting the rate query
     * @param _Rating Gif rating
     */
    public ServiceTrendingRequestBuilder setRating(Rating _Rating) {
        this._Rating = _Rating.toString();
        return this;
    }

    /**
     * Setting on Success request action
     * @param _OnMultiSearchSuccess onSuccess Action
     */
    public ServiceTrendingRequestBuilder setOnSearchSuccess(OnMultiSearchSuccess _OnMultiSearchSuccess) {
        this._OnMultiSearchSuccess = _OnMultiSearchSuccess;
        return this;
    }

    /**
     * Setting on failed request action
     * @param _OnResponseError on Error action
     */
    public ServiceTrendingRequestBuilder setOnError(OnResponseError _OnResponseError) {
        this._OnResponseError = _OnResponseError;
        return this;
    }

    /**
     * building new ServiceTrendingRequest
     * @return new ServiceTrendingRequest
     */
    @Override
    public ServiceTrendingRequest build(){
        return new ServiceTrendingRequest(_ApiKey,_Limit,_Offset,_Rating, _OnMultiSearchSuccess, _OnResponseError);
    }
}
