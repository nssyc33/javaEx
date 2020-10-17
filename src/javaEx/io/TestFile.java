package javaEx.io;

import java.io.IOException;

public class TestFile implements AutoCloseable{

	@Override
	public void close() throws IOException {
		System.out.println("test~~~~~");
	}
}
