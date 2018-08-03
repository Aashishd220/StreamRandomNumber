//generating 100 random numbers and put them in file and retrieve unique random numbers in collection
package com.cg.randomnumber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String args[]) throws IOException {

		List<Integer> arrayList = new ArrayList<>();
		Random random = new Random();
		// generating 100 random elements
		for (int i = 0; i < 100; i++) {
			arrayList.add(random.nextInt(49));
		}

		FileWriter fileWriter = new FileWriter("boy.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		// writing 100 elements in file
		for (Integer list : arrayList) {
			printWriter.println(list);
		}
		printWriter.close();

		// file address to read
		File file = new File("C:\\work\\Assignment9\\boy.txt");

		Scanner scanner = new Scanner(file);
		// storing elements in arraylist
		while (scanner.hasNext()) {
			arrayList.add(scanner.nextInt());
		}
		// printing distinct elements and in sorted order
		arrayList.stream().distinct().sorted().forEach(System.out::println);
		scanner.close();

	}
}
