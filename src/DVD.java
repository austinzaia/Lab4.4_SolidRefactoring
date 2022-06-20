import java.util.Scanner;
import java.util.ArrayList;

public class DVD implements Play {
	ArrayList<String> scenes = new ArrayList<>();

	public DVD() {

	}

	@Override
	public void play(ArrayList<String> scenes) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select the scene you would like to watch: ");
		for (int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + (i + 1) + ")");
			System.out.println(scenes.get(i));

		}

		int sceneSelect = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Now playing scene #" + sceneSelect + ", " + scenes.get(sceneSelect));

		scanner.close();
	}
}
