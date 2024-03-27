package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		// 子クラスのインスタンスを作成する
				KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
			 	KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
				KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
				
				//太郎
				taro.setGivenName();
				taro.execIntroduce();
				System.out.println("");
			
				//一郎
				ichiro.setGivenName();
				ichiro.execIntroduce();
				System.out.println("");

				//花子
				hanako.setGivenName();
				hanako.execIntroduce();
				System.out.println("");
			}

	}


