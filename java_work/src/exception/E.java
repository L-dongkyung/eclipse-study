package exception;

import java.io.IOException;

class E {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOExceprion1() {
		try {
			throw new IOException();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException{
		throw new IOException();
	}
}
