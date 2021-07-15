package Exception;

public class ExceptionCheck {

	private static final String CONST_ROPPONGI_HILLS = "六本木ヒルズ";
	private static final String CONST_IMPERIAL_HOTEL = "帝国ホテル";

	public static void main(String[] args) {

		String hogeOffice = CONST_ROPPONGI_HILLS;

		try {
			if (!hogeOffice.equals(CONST_IMPERIAL_HOTEL)) {
				throw new Exception("オフィスは帝国ホテルだよ。");
			}
			System.out.println("hogeのオフィスは" + CONST_IMPERIAL_HOTEL + "です。");
		} catch (Exception e) {
			System.out.println("オフィスが間違ってます。");
			System.out.println(e);
		}
	}

}
