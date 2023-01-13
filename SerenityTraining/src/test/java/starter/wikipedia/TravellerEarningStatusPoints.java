package starter.wikipedia;

import net.thucydides.core.annotations.Step;

public class TravellerEarningStatusPoints {
	
	private String actor;
	
	private FrequentFlyer frequentFlyer;
	
	@Step("#actor joins the frequent flyer program")
	public void joins_the_frequent_program() {
		frequentFlyer = FrequentFlyer.withInitialBalanceOf(0);
	}
	
	@Step("#actor flies {0} km")
	public void flies(int distance) {
		frequentFlyer.recordFlightDistanceInKilometers(distance);
	}
	
	@Step("#actor should have a status of {0}")
	public void should_have_a_status_of(Status expectedStatus) {
		assertThat(frequentFlyer.getStatus()).isEqualTo(expectedStatus);
	}
	
	@Step("#actor transfer {0} points to {1}")
	public void transfer_points(int points, TravellerEarningStatusPoints otherFrequentFlyer) {
		
	}
	
	@Override
	public String toString() {
		return actor;
	}
	
	@Step("#actor should have {0} points")
	public void should_have_points(int expectedPoints) {
		
	}

}
