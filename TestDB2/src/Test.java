
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestUserDAO dao = new TestUserDAO();
		dao.selectAll();
		dao.selectByName("Taro");
		dao.selectByPassword("bbbb");
		dao.updateUserNameByUserName("John", "Taro");
		dao.insert(4, "Shiro", "eeee");
		dao.delete(4, "Shiro", "eeee");
	}

}
