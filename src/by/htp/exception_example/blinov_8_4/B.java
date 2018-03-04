package by.htp.exception_example.blinov_8_4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A{

//	public void f() throws Exception {} //1
//	public void f() throws IOException {} //2
//	public void f() throws InterruptedException, IOException {} //3
// 	public void f() throws IOException, FileNotFoundException {} //4
//	public void f() throws FileNotFoundException {} //5
	public void f() throws FileNotFoundException, InternalError {} //6
	
}
