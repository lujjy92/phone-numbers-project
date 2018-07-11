package practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIOStream {
	public static void main(String[] args) {
		char[] c = new char[] { 'a', 'b', 'c', 'd', 'e' }; // 글자
		CharArrayReader car = new CharArrayReader(c);
		CharArrayWriter caw = new CharArrayWriter();
		char[] res2 = null;
		int data2 = 0;
		try {
			while ((data2 = car.read()) != -1) {
				System.out.println(data2);
				caw.write(data2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		res2 = caw.toCharArray();
		System.out.println("ArrayWriter 내용" + Arrays.toString(res2));

		// ------------------------------------------------
		byte[] b = { 1, 2, 3, 4, 5 };
		ByteArrayInputStream is = new ByteArrayInputStream(b);
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		byte[] res = null;
		int data = 0;
		while ((data = is.read()) != -1) { // is.read 읽었냐? 라고 묻는 순간 이미 한번 읽었다
											// 그래서
			// data = is.read를 사용
			System.out.println(data);
			out.write(data);
		}

		res = out.toByteArray();
		System.out.println("outstream 내용 " + Arrays.toString(res));

	}
}
