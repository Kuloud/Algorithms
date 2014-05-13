/**
 * 
 */
package com.kuloud.algorithm;

/**
 * 两个字串的最长公共子序列
 * 
 * @author kuloud
 * 
 */
public class LCS {

	private static int[][] intC;
	private static int[][] intB;

	private static void maxComSubStrLen(int m, int n, String strA, String strB,
			int[][] intC, int[][] intB) {
		int i, j;
		for (i = 0; i <= m; i++) {
			intC[i][0] = 0;
		}
		for (i = 1; i <= n; i++) {
			intC[0][i] = 0;
		}
		for (i = 1; i <= m; i++) {
			for (j = 1; j <= n; j++) {
				if (strA.charAt(i - 1) == strB.charAt(j - 1)) {
					intC[i][j] = intC[i - 1][j - 1] + 1;
					intB[i][j] = 1;
				} else if (intC[i - 1][j] >= intC[i][j - 1]) {
					intC[i][j] = intC[i - 1][j];
					intB[i][j] = 2;
				} else {
					intC[i][j] = intC[i][j - 1];
					intB[i][j] = 3;
				}
			}
		}
	}

	private static String maxComSubStr(int i, int j, String strA, int[][] intA) {
		if (i == 0 || j == 0) {
			return "";
		}
		if (intA[i][j] == 1) {
			return maxComSubStr(i - 1, j - 1, strA, intA) + strA.charAt(i - 1);
		} else if (intA[i][j] == 2) {
			return maxComSubStr(i - 1, j, strA, intA);
		} else {
			return maxComSubStr(i, j - 1, strA, intA);
		}
	}

	private static String lcs(final String strA, final String strB) {
		int intALen = strA.length();
		int intBLen = strB.length();
		intC = new int[intALen + 1][intBLen + 1];
		intB = new int[intALen + 1][intBLen + 1];
		maxComSubStrLen(intALen, intBLen, strA, strB, intC, intB);
		return maxComSubStr(intALen, intBLen, strA, intB);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lcs("qeqwsdsas", "asdasdasf"));
	}

}
