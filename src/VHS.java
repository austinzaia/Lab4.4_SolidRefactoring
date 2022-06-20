import java.util.ArrayList;

public class VHS implements Play {
	private int currentTime = 0;
	ArrayList<String> scenes = new ArrayList<>();

	public VHS() {

	}

	public int getCurrentTime() {
		return currentTime;
	}

	@Override
	public void play(ArrayList<String> scenes) {
		do {
			if (currentTime < scenes.size()) {
				System.out.println(scenes.get(currentTime));
				currentTime += 1;
			} else {
				rewind();
			}
		} while (currentTime != 0);

	}

	public void rewind() {
		currentTime = 0;
	}

}