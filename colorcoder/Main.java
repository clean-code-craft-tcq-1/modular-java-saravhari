package colorcoder;

import colorcoder.names.ColorName;
import colorcoder.pair.ColorPair;
import colorcoder.type.MajorColor;
import colorcoder.type.MinorColor;

public class Main {
	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = ColorPair.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = ColorPair.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

	static void formatColorCodes() {

		int totalCount = ColorName.MAJOR_COUNT * ColorName.MINOR_COUNT;
		for (int i = 1; i <= totalCount; i++) {
			System.out.println("Color pair " + i + " " + ColorPair.getColorFromPairNumber(i).toString());
		}
	}

	public static void main(String[] args) {
		testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

		formatColorCodes();
	}
}
