package day10.task.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
		try {
			// 파일 정보를 받을 객체 생성
			File file = new File("example.txt");

			// 해당 파일이 존재하는지 여부 검사
			if (!file.exists()) {
				// 없다면 파일 생성
				file.createNewFile();
			}

			// 파일에 내용 쓰기 위한 쓰기 객체 생성
			FileWriter writer = new FileWriter(file);

			// 파일 내용 쓰기 위한 버퍼 쓰기 객체 생성
			BufferedWriter bWriter = new BufferedWriter(writer);

			// 내용 입력
			bWriter.write("Hello, world.");
			bWriter.write("\nwrite test");
			
			bWriter.close();

			// 파일에서 데이터 읽기
			FileReader reader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(reader);

			// 읽은 데이터를 임시로 담을 변수 선언
			String line = "";

			while (true) {
				line = bReader.readLine();
				if (line == null) { // 읽을 내용이 더 없을 경우
					break; // while문 탈출
				}
				// 읽은 한 줄의 내용을 처리할 내용을 적는 곳
				System.out.println(line);
			}
			bReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
