import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void testDVDInstance() {
		DVD dvd1 = new DVD();
		assertNotNull(dvd1);
	}

	@Test
	void testDVDTitle() {
		DVD dvd2 = new DVD();
		String expected = "The Platform";
		dvd2.setTitle("The Platform");
		String actual = dvd2.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	void testDVDRunTime() {
		DVD dvd3 = new DVD();
		int expected = 94;
		dvd3.setRunTime(94);
		int actual = dvd3.getRunTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSInstance() {
		VHS vhs1 = new VHS();
		assertNotNull(vhs1);
	}

	@Test
	void testVHSTitle() {
		VHS vhs2 = new VHS();
		String expected = "Belladonna of Sadness";
		vhs2.setTitle("Belladonna of Sadness");
		String actual = vhs2.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSRunTime() {
		VHS vhs3 = new VHS();
		int expected = 86;
		vhs3.setRunTime(86);
		int actual = vhs3.getRunTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSCurrentTime() {
		VHS vhs4 = new VHS();
		int expected = 0;
		int actual = vhs4.getCurrentTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSPlay() {
		VHS vhs5 = new VHS();
		vhs5.setTitle("Joker");
		vhs5.scenes.add("Arthur is depressed");
		vhs5.scenes.add("He gets his chance at fame");
		vhs5.scenes.add("Arthur uses the chance to send a message instead");
		vhs5.play();
		int expected = 1;
		int actual = vhs5.getCurrentTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSPlayExtended() {
		VHS vhs5 = new VHS();
		vhs5.setTitle("Joker");
		vhs5.scenes.add("Arthur is depressed");
		vhs5.scenes.add("He gets his chance at fame");
		vhs5.scenes.add("Arthur uses the chance to send a message instead");
		vhs5.play();
		vhs5.play();
		vhs5.play();
		vhs5.play();
		int expected = 0;
		int actual = vhs5.getCurrentTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSRewind() {
		VHS vhs5 = new VHS();
		vhs5.setTitle("Joker");
		vhs5.scenes.add("Arthur is depressed");
		vhs5.scenes.add("He gets his chance at fame");
		vhs5.scenes.add("Arthur uses the chance to send a message instead");
		vhs5.play();
		vhs5.play();
		vhs5.play();
		vhs5.rewind();
		int expected = 0;
		int actual = vhs5.getCurrentTime();
		assertEquals(expected, actual);
	}

}