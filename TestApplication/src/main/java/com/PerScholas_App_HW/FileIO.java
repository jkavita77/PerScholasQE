package com.PerScholas_App_HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FileIO {

	public HashMap loadFile() {

		String txtFile = "iofile.txt";
		String line = "";
		String[] data = null;
		String name = null;
		String amount = null;
		HashMap map = new HashMap();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(txtFile));

			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				data = line.split(":");
				name = data[0];
				amount = data[1];

				map.put(name, amount);

//				System.out.println("data[0] :" +data[0]);
//				if (key.equals(data[0]))
//						break;

				// System.out.println(data[0] + " " + data[1]);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return map;

	}

}
