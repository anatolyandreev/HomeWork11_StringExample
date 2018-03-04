package by.htp.exception_example.blinov_8_5;

public class Quest {
	private int qQ;

	public Quest(int q) {
		qQ = 12 / q;// 1
	}

	public int getQQ() {
		return qQ;// 2
	}

	public static void main(String[] args) {
		Quest quest = null;
		try {
				// 3
		} catch (Exception e) {// 4
		}
		System.out.println(quest.getQQ());// 5
		System.out.println("");
	}
}
