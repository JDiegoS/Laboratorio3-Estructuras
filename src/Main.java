//Juan Diego Solorzano 18151

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dataNum = new int[3000];
		WriteFile("./data.txt");
		dataNum = ReadFile("./data.txt");

	}
	private static int[] ReadFile(String fileName) {
		int[] textNumbers = new int[3000];
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader= new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			int i = 0;
			while(line != null) {
				textNumbers[i]=Integer.parseInt(line);
				line = bufferedReader.readLine();
				i++;
			}
			
			
		}catch(Exception var10) {
			System.out.println("Error");
		}
		return textNumbers;
	}
	
	private static void WriteFile(String fileName) {
		try{
			File text = new File(fileName);
			FileOutputStream fos=new FileOutputStream(text);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			Random randomNum = new Random();
			
			for(int i = 0; i<=2999; i++) {
				int num = randomNum.nextInt(3000);
				bw.write("" + num);
				bw.newLine();
		}
			bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
