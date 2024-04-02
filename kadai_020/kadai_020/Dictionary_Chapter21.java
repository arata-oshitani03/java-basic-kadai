package kadai_020;
import java.util.HashMap; 

public class Dictionary_Chapter21 {

public void referer (String[] word) { //メソッド
	
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	String fruit = "";
	
	    dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
	
	//繰り返し処理が必要（for文） 一つずつ調べていく。
        //lengthは数（要素）取得する
        //33行目が終わると、i++　で　24行目の０が１に変わる
       //要素を４つ入れているから、４　要素が５つなら５になる
    for (int i = 0; i < word.length; i++) {
    	   fruit = dictionary.get(word[i]);
        if(fruit == null) {
      	  System.out.println(word[i] + "は辞書に存在しません");
  	  } else {
  	    	System.out.println(word[i] + "の意味は" + fruit);
      }
   }
  }
}