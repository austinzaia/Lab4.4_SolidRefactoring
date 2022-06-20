
import java.util.ArrayList;

public class MovieList {
	private static ArrayList<Movie> movies = new ArrayList<>();

	public static void addMovies() {
		VHS vhs = new VHS();
		DVD dvd = new DVD();
		
		Movie vhs1 = new Movie(vhs);
		Movie vhs2 = new Movie(vhs);
		Movie vhs3 = new Movie(vhs);
		Movie dvd1 = new Movie(dvd);
		Movie dvd2 = new Movie(dvd);
		Movie dvd3 = new Movie(dvd);

		movies.add(vhs1);
		movies.add(vhs2);
		movies.add(vhs3);
		movies.add(dvd1);
		movies.add(dvd2);
		movies.add(dvd3);

		vhs1.setTitle("Joker");
		vhs1.setRunTime(122);
		vhs1.scenes.add("Arthur is depressed");
		vhs1.scenes.add("He gets his chance at fame");
		vhs1.scenes.add("Arthur uses the chance to send a message instead");

		vhs2.setTitle("Belladonna of Sadness");
		vhs2.setRunTime(86);
		vhs2.scenes.add("Jeane and Jeanne get married in feudal France");
		vhs2.scenes.add("They are then betrayed by the lord on the day of their wedding");
		vhs2.scenes.add("Jeanne sells her soul to the devil and exacts her revenge");
		vhs2.scenes.add("Jeanne runs away being branded a witch");
		vhs2.scenes.add("She returns to make a point to the lord of the land and is burned at the stake");

		vhs3.setTitle("The Iron Giant");
		vhs3.setRunTime(86);
		vhs3.scenes.add("Hogarth finds a giant robot");
		vhs3.scenes.add("He befriends the robot");
		vhs3.scenes.add("They play together in the forest, and hide when their done to keep the robot safe");
		vhs3.scenes.add("A federal agent is suspicous of Hogarth");
		vhs3.scenes.add("He finds the robot and has a warhead launched to destroy it");
		vhs3.scenes.add("The robot sacrifices himself to save the city from the warhead");

		dvd1.setTitle("Everything Everywhere All at Once");
		dvd1.setRunTime(139);
		dvd1.scenes.add("Evelyn is getting audited and her husband wants a divorce");
		dvd1.scenes.add("She is visited by her husband claiming to come from another universe");
		dvd1.scenes.add("They need to work together to stop an evil force from consuming the multiverse");
		dvd1.scenes.add("They save the world and their family in the process");

		dvd2.setTitle("The Platform");
		dvd2.setRunTime(94);
		dvd2.scenes.add("Goreng wakes up in a vertical prison with a cellmate");
		dvd2.scenes.add("Every day their food is brought down on a platform, and they must eat what is left by the levels above");
		dvd2.scenes.add("Goreng is later sent to a lower level where he must face starvation until his next move");
		dvd2.scenes.add("Goreng looks for a way to destablize the prison that he now sees as a failed project of society");
		
		dvd3.setTitle("The Babadook");
		dvd3.setRunTime(94);
		dvd3.scenes.add("Amelia's son Samuel claims to see scary things and constantly misbehaves");
		dvd3.scenes.add("Strange things start to hapen at home, like doors slamming and lights flickering");
		dvd3.scenes.add("A sisnister book talking about a creature called the Babadook appears");
		dvd3.scenes.add("Amelia must face the Babadook");

	}

	public static ArrayList<Movie> getMovies() {
		return movies;
	}

}
