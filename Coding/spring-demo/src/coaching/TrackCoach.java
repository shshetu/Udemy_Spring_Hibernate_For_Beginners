package coaching;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	// constructor injection
	public TrackCoach() {
	
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: "+fortuneService.getFortune();
	}
	
	// init-method
	public void myInitMethod() {
		System.out.println("TrackCoach: Inside myInitMethod()");
	}
	// destory-method
	public void myDestroyMethod() {
		System.out.println("TrackCoach: Inside myDestroyMethod()");
	}

}
