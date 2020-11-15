package model;

import java.util.Random;

public class Gen {
	/**
	 * tạo gen là 1 dòng của [9][9]
	 */
	private int[] gen = new int[9];

	/**
	 * 
	 * tạo gen cho trước
	 */
	public Gen(int[] gen) {
		this.gen = gen;
	}

	/**
	 * tạo gen ngẫu nhiên
	 */
	public Gen() {
		Random rdGen = new Random();
		for (int i = 0; i < gen.length; i++) {
			this.gen[i] = rdGen.nextInt(10);
		}
	}
public static void main(String[] args) {
	System.out.println(222);
}
}
