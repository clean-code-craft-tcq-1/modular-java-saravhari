package colorcoder.pair;

import colorcoder.names.ColorName;
import colorcoder.type.MajorColor;
import colorcoder.type.MinorColor;

public class ColorPair {
	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	public String toString() {
		String colorPairStr = ColorName.MAJOR[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += ColorName.MINOR[minorColor.getIndex()];
		return colorPairStr;
	}

	public static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = (MajorColor) fromIndex(MajorColor.values(),
				zeroBasedPairNumber / ColorName.MINOR_COUNT);
		MinorColor minorColor = (MinorColor) fromIndex(MinorColor.values(),
				zeroBasedPairNumber % ColorName.MINOR_COUNT);
		return new ColorPair(majorColor, minorColor);
	}

	public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorName.MINOR_COUNT + minor.getIndex() + 1;
	}

	public static Object fromIndex(Object[] values, int index) {
		return values[index];
	}
};