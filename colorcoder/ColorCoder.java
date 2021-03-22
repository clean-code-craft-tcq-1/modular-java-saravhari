package colorcoder;

import colorcoder.test.ColorCoderTest;
import colorcoder.type.MajorColor;
import colorcoder.type.MinorColor;

public class ColorCoder {
	public static void main(String[] args) {
		ColorCoderTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorCoderTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		ColorCoderTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorCoderTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

		ColorCoderTest.printColorCodes();
	}
}
