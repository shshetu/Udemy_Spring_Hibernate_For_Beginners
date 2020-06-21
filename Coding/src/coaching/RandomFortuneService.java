package coaching;

import java.util.LinkedList;
import java.util.List;

public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// add an array of messages
		List<String> fortunes = new LinkedList<String>();
		fortunes.add("Today is your Lucky Day!");
		fortunes.add("Today is your Unlucky Day!");
		fortunes.add("Today is your Normal Day!");
		fortunes.add("Today is your Best Day of the year!");
		fortunes.add("Today is your Worst Day of the year!");
		// create random numbers upto the size of array
		int randomMessageNum = (int)(Math.random()*(fortunes.size()));
		String randomMessage = fortunes.get(randomMessageNum);
		return randomMessage;
	}

}
