package coaching;

public class MyApp {
public static void main(String[] args) {
	// Inversion of Control
	Coach coach = new TrackCoach();
	System.out.println(coach.getDailyWorkout());
}
}
