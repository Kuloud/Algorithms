/**
 * 
 */
package com.kuloud.algorithm;

/**
 * 字串全排列
 * 
 * @author kuloud
 * 
 */
public class Permutation {

	private static void permute(String str) {
		int length = str.length();
		boolean[] b = new boolean[length];
		StringBuilder out = new StringBuilder();
		char[] in = str.toCharArray();
		doPermute(in, out, b, length, 0);
	}

	private static void doPermute(char[] in, StringBuilder out, boolean[] used,
			int length, int level) {
		if (level == length) {
			System.out.println(out.toString());
			return;
		}
		for (int i = 0; i < length; i++) {
			if (used[i]) {
				continue;
			}
			out.append(in[i]);
			used[i] = true;
			doPermute(in, out, used, length, level + 1);
			// System.out.println("跳出第一递归方法之后的i值为: "+ i);
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		permute("abcdefg");
	}

}
