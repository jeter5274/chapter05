package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		//InputStream FileInputStream
		//OutputStream FileOutputStream

		//속도 향상 - byte배열 사용
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작(쟁반)");
		while(true) {
			int bData = in.read(buff);
			
			if(bData == -1) { 
				System.out.println("복사 끝(쟁반)");
				break;
			}
			
			out.write(buff);
		}
		
		out.close();
		in.close();
		
		/*
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		System.out.println("복사시작");
		while(true) {
			int bData = in.read();
					
			if(bData == -1) { //데이터의 마지막인지 확인
				System.out.println("복사 끝");
				break;	//반복문 탈출
			}
			
			out.write(bData);	//데이터가 있으면 씀
		}
		
		out.close();
		in.close();
		*/
	}

}
