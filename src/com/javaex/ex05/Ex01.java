package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		/*
		//Scanner sc = new Scanner(System.in) 흉내내기
		
		//(1)
		Scanner sc = new Scanner(System.in);
		//(2)
		String msg = sc.nextLine();
		//(3)
		System.out.println(msg);
		//(4)
		sc.close();
		
		//기존파일 -> 키보드(System.in 사용)
		//InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		//(1)
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr); 
		//(2)
		String str = br.readLine();
		//(3)
		System.out.println(str);
		//(4)
		br.close();
		*/
		
		//모니터 출력하기
		//System.out.println(str); 흉내
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr); 
		
		String str = br.readLine();
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write(str);
		
		bw.close();
		br.close();
	}

}
