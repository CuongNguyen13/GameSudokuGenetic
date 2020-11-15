package model;

import java.util.Arrays;
import java.util.Collections;
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
	 * tạo mẫu gen có ràng buộc theo hàng [1,2,3,5,6,4,7,9,8]
	 * 
	 */
	public Gen() {
		Random rdGen = new Random();
		for (int i = 0; i < gen.length; i++) {
			this.gen[i] = rdGen.nextInt(9)+1;
			Collections.shuffle(Arrays.asList(gen));
		}
	
	}

	public int[] getGen() {
		return gen;
	}

	public void setGen(int[] gen) {
		this.gen = gen;
	}

public static void main(String[] args) {
	Gen gen = new Gen();
	System.out.println(Arrays.toString(gen.getGen()));
	System.out.println("122");
}
}
