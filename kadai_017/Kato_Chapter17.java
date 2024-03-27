package kadai_017;  //親

abstract public class Kato_Chapter17 {
	
	public String familyName = "加藤"; //性を表す
	public String givenName;           //名を表す
	public String address = "東京都中野区○×"; //住所を表す
	
	
	//共通の紹介を出力
	public void commonIntroduce() {
		
		System.out.println("名前は" + familyName + givenName + "です" );
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力
	abstract public void eachIntroduce();
	abstract public void setGivenName();
	
    //紹介を実行する
    public void execIntroduce() {
    	commonIntroduce();
		eachIntroduce();
		System.out.println();
    }
}
