package javaEx.io.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		String[] arr = new String[] {
			"a","b","c"	
		};
		
		List asLists = Arrays.asList(arr);
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArraysPart = Arrays.stream(arr,1,3);
				
		//Stream 사용 전
		String[] strArr = { "mash-up", "backend", "codingsquid" };
		List<String> strList = Arrays.asList(strArr);

		Arrays.sort(strArr);
		Collections.sort(strList);

		for(String str: strArr) {
		  System.out.println(str);
		}

		for(String str : strList) {
		  System.out.println(str);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//Stream 사용 후
		Stream<String> listStream = strList.stream();
		Stream<String> arrayStream = Arrays.stream(strArr);

		listStream.sorted().forEach(System.out::println);
		arrayStream.sorted().forEach(System.out::println);
		System.out.println(listStream.count());
		
		
	}
}
