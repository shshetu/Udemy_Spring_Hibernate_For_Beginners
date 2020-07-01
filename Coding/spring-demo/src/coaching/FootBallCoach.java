package coaching;

public class FootBallCoach implements Coach{

	// BeanFactory will create the bean and manage the dependencies
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Shoot 50 Balls to the footBall net";
	}

	@Override
	public String getDailyFortune() {
		return "FootBall Coach: "+fortuneService.getFortune();
	}

}
