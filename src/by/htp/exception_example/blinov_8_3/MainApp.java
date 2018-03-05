package by.htp.exception_example.blinov_8_3;

public class MainApp {

	public static void main(String[] args) {

	}

	public static void doSmth(Object obj) {
		try {
			doA();
			doC();
			doG();
			doH();
			}
		catch(C e){}catch(D e){}catch(H e){}catch(A e){} //1
//		catch(C e){}catch(D e){}catch(E e){}catch(A e){} //2
//		catch(C e){}catch(D e){}catch(G e){}catch(A e){} //3
//		catch(A e){}catch(D e){}catch(G e){}catch(H e){} //4
//		catch(E e){}catch(D e){}catch(B e){}catch(A e){} //5
	}
	
	public static void doA() throws A {
		throw new A();
	}
	
	public static void doB() throws B {
		throw new B();
	}
	
	public static void doC() throws C {
		throw new C();
	}
	
	public static void doD() throws D {
		throw new D();
	}
	
	public static void doE() throws E {
		throw new E();
	}
	
	public static void doF() throws F {
		throw new F();
	}
	
	public static void doG() throws G {
		throw new G();
	}
	
	public static void doH() throws H {
		throw new H();
	}
	
}
