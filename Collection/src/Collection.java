/**
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * @author internousdev
 *
 */
public class Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = new ArrayList<String>();
		
		//値の記憶はaddメソッドを利用
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		System.out.println(list.size());
		//値の取得はgetメソッドを利用
		for(int i = 0; i <= list.size() - 1; i++){
			System.out.println(list.get(i));
		}
		
		for(String s : list){
			System.out.println(s);
		}
		
		Map<String, String> map = new HashMap<String, String>();
		
		//値のセットはputメソッドを利用
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		
		//値の取得はgetメソッドを利用
		String value = map.get("key1");
		System.out.println(value);
		
		String valueNull = map.get("key6");
		System.out.println(valueNull);
		
		//mapに該当するkey画存在するか否かチェック
		if(map.containsKey("key1")){
			System.out.println("key1は存在します");
		}else{
			System.out.println("key1は存在しません");
		}
		
		//拡張for文を利用してすべての情報を取得
		for(Map.Entry<String, String> e : map.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		Set<String> set = new HashSet<String>();
		
		//値のセットはaddメソッドを利用
		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");
		
		set.add("value2"); //重複要素をadd
		
		//拡張for文を利用
		for(String s : set){
			System.out.println(s);
		}
	}

}
