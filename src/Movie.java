import java.util.ArrayList;

public class Movie {

	private Play iPlay;
	private String title;
	private int runTime;
	ArrayList<String> scenes = new ArrayList<>();

	public Movie(Play iPlay) {
		this.iPlay = iPlay;
	}

	public void printInfo() {
		System.out.println(title);
		System.out.println(runTime + " minutes");

	}

	public void printScenes() {

		for (int i = 0; i < scenes.size(); i++) {
			System.out.print(scenes.get(i));
			System.out.println(" is scene number " + i);
		}

	}

	public void play() {
		iPlay.play(scenes);
	}

	public Play getiPlay() {
		return iPlay;
	}

	public void setiPlay(Play iPlay) {
		this.iPlay = iPlay;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

}
