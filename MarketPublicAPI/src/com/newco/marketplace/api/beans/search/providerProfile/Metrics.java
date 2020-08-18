/*
 *	Date        Project       Author         Version
 * -----------  --------- 	-----------  	---------
 * 08-SEP-2009	KMSTRSUP   Infosys				1.0
 * 
 * 
 */

package com.newco.marketplace.api.beans.search.providerProfile;

import com.newco.marketplace.search.vo.ProviderSearchResponseVO;
import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * This is a bean class for storing all information of 
 * the Metrics 
 * @author Infosys
 *
 */
@XStreamAlias("metrics")
public class Metrics {
	@XStreamAlias("closedOrderTotal")
	private Integer closedOrderTotal;
	
	@XStreamAlias("ratingTotal")
	private Integer ratingTotal;
	
	@XStreamAlias("reviewsTotal")
	private Integer  reviewsTotal;
	
	@XStreamAlias("avgRating")
	private float avgRating;
	
	@XStreamAlias("avgReviewerRating")
	private float avgReviewerRating;
	
	@XStreamAlias("reviewCount")
	private Integer reviewCount;
	
	@XStreamAlias("avgByKPI")
	private AvgByKPI avgByKPI;
	
	@XStreamAlias("credentialTotal")
	private int credentialTotal;

	public Metrics() {
		
	}
	
	public Metrics(ProviderSearchResponseVO providerSearchResponseVO) {
		//Mapping  Metrics starts		
		this.setClosedOrderTotal(providerSearchResponseVO
				.getClosedOrderTotal());
		this.setRatingTotal(providerSearchResponseVO
				.getRatingTotal());
		this.setReviewsTotal(providerSearchResponseVO
				.getReviewCount());
		this.setAvgRating(providerSearchResponseVO.getAvgRating());
		this.setAvgReviewerRating(providerSearchResponseVO
				.getAvgReviewerRating());
		this.setReviewCount(providerSearchResponseVO
				.getReviewCount());
		
		this.avgByKPI = new AvgByKPI(providerSearchResponseVO);		
		this.setCredentialTotal(providerSearchResponseVO
				.getCredentialTotal());
	}
	public Integer getClosedOrderTotal() {
		return closedOrderTotal;
	}

	public void setClosedOrderTotal(Integer closedOrderTotal) {
		this.closedOrderTotal = closedOrderTotal;
	}

	public Integer getRatingTotal() {
		return ratingTotal;
	}

	public void setRatingTotal(Integer ratingTotal) {
		this.ratingTotal = ratingTotal;
	}



	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}

	public AvgByKPI getAvgByKPI() {
		return avgByKPI;
	}

	public void setAvgByKPI(AvgByKPI avgByKPI) {
		this.avgByKPI = avgByKPI;
	}

	

	public Integer getReviewsTotal() {
		return reviewsTotal;
	}

	public void setReviewsTotal(Integer reviewsTotal) {
		this.reviewsTotal = reviewsTotal;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}

	public float getAvgReviewerRating() {
		return avgReviewerRating;
	}

	public void setAvgReviewerRating(float avgReviewerRating) {
		this.avgReviewerRating = avgReviewerRating;
	}

	public int getCredentialTotal() {
		return credentialTotal;
	}

	public void setCredentialTotal(int credentialTotal) {
		this.credentialTotal = credentialTotal;
	}


	
}