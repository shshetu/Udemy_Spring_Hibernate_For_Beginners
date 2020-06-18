package coaching;

public class BaseBallCoach implements Coach{
	// Constructor injection
	 FortuneService fortuneService;
 public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
