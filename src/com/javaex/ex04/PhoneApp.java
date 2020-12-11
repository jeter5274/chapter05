package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		List<Person> aList = new ArrayList<Person>();
		
		//방법2 : List를 활용하여 데이터 저장 및 출력
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] sArray = str.split(",");
			
			Person p = new Person(sArray[0], sArray[1], sArray[2]);
			
			aList.add(p);
		}

		for(int i=0; i<aList.size(); i++) {
			aList.get(i).showInfo();
		}
		
		br.close();
		
		//방법3 : 새로운데이터를 추가 및 파일 생성
		Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//리스트에 데이터 추가
		Person pNew = new Person("전재철", "010-1234-5678", "02-1234-5678");
		aList.add(pNew);
		
		for(int i=0; i<aList.size(); i++) {
			bw.write(aList.get(i).getName()+ "," +aList.get(i).getHp()+ "," +aList.get(i).getCompany());
			bw.newLine();
		}
		
		bw.close();
	}

}
