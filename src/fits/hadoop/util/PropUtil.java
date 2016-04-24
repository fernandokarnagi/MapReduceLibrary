package fits.hadoop.util;

import org.apache.commons.lang.StringUtils;

public class PropUtil {

	public static String[] csvSplit(String s, String delimiter) {
		return StringUtils.split(s, delimiter);
	}
}
