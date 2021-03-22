package colorcoder.test;

import colorcoder.names.ColorName;
import colorcoder.pair.ColorPair;
import colorcoder.pair.ColorSearch;
import colorcoder.type.MajorColor;
import colorcoder.type.MinorColor;

public class ColorCoderTest {
	public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = ColorSearch.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = ColorSearch.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

	public static void printColorCodes() {

		int totalCount = ColorName.MAJOR_COUNT * ColorName.MINOR_COUNT;
		for (int i = 1; i <= totalCount; i++) {
			System.out.println("Color pair " + i + " " + ColorSearch.getColorFromPairNumber(i).toString());
		}
	}
}
