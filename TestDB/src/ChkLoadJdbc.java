public class ChkLoadJdbc {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		String msg = "";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバロードに成功しました";
		}catch(ClassNotFoundException e) {
			msg = "ドライバロードに失敗しました";
		}
		System.out.println(msg);
	}
}