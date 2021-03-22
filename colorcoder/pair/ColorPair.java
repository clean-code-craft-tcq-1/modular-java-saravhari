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
};