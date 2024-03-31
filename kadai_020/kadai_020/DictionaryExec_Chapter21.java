package kadai_020;
import java.util.HashMap;  //辞書クラス

public class DictionaryExec_Chapter21 {

	public void referer (String[] word) { //メソッド
		
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
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
	    	String result = dictionary.get(word[i]); //result(変数）word[i]は、1回目はword[0]、2回目「１」となる
	                                                 //[0]は今回はapple ヒットするとresultにりんごが入る
	    	if (result == null) {  //resultはnull    //orangは存在しない為、nullになる
	    		result = word[i] + "は存在しません";
	    	} else {                                //elseは、nullじゃなければ、elseが動く。
	    		result = word[i] + "の意味は" + result;
	    	}
	    	
	    	System.out.println(result); //出力
	    }
       
	}

}
