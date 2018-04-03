package master;

public class Master {
	public static void main(String[] args){
//		// ###############################################################
//		// ###   コレクションとジェネリックス
//		// ###############################################################
//		// Listインタフェースの実装
//		chapter03.Sample01.main(args);
//		// Setインタフェースの実装
//		chapter03.Sample02.main(args);
//		// Queueインタフェースの実装
//		chapter03.Sample03.main(args);
//		// Mapインタフェースの実装
//		chapter03.Sample04.main(args);
//		// ジェネリクスを用いた独自クラスの定義
//		chapter03.Sample05.main(args);
//		// 順序付け HashSet, TreeSet, TreeMap
//		chapter03.Sample06.main(args);
//		// Comparableインタフェースの実装
//		chapter03.Sample07.main(args);
//		// Comparatorインタフェースの実装
//		chapter03.Sample08.main(args);
//		// Collectionsクラスの実装
//		chapter03.Sample09.main(args);
//		//  Arraysクラスの実装
//		chapter03.Sample10.main(args);
//
//		// ###############################################################
//		// ###   ラムダ式とメソッド参照
//		// ###############################################################
//		// ラムダ式の実装
//		chapter04.Sample01.main(args);
//		// 基本データ型の関数型インタフェース
//		chapter04.Sample02.main(args);
//
//		// ###############################################################
//		// ###   JavaストリームAPI
//		// ###############################################################
//		// Streamの生成
//		chapter05.Sample01.main(args);
//		// ストリームの終端操作
//		chapter05.Sample02.main(args);
//		// Optionalクラスの実装
//		chapter05.Sample03.main(args);
//		// Streamの中間操作の実装
//		chapter05.Sample04.main(args);
//		// Collectorsクラスの実装
//		chapter05.Sample05.main(args);
//
//		// ###############################################################
//		// ###  例外処理
//		// ###############################################################
//		//
//		// ###############################################################
//		// ###  日付/時刻API
//		// ###############################################################
//		// 日付・時刻オブジェクトの種類
//		chapter07.Sample01.main(args);
//		// 日付・時刻オブジェクトの生成と値の取得
//		chapter07.Sample02.main(args);
//		// 日付・時刻のフォーマット
//		chapter07.Sample03.main(args);
//		// 日付・時刻の加算・減算
//		chapter07.Sample04.main(args);
//		// ZonedDateTimeとOffsetDateTimeクラス
//		chapter07.Sample05.main(args);
//		// 夏時間
//		chapter07.Sample06.main(args);
//		// 日や時間の間隔
//		chapter07.Sample07.main(args);
//
//		// ###############################################################
//		// ###  入出力
//		// ###############################################################
//		// Fileクラス
//		chapter08.Sample01.main(args);
//		// ストリーム
//		chapter08.Sample02.main(args);
	}





	// 共通メソッド
	public static void out(String str){
		System.out.println();
		System.out.println("-- " + str);
	}

	public static void show(Object obj){
		System.out.println("【"+ obj.getClass() +"】" + obj.toString());
	}

	public static void show(String str, Object obj){
		out(str);
		show(obj);
	}

	public static void title(String title){
		System.out.println("#######################################");
		System.out.println("###    " + title);
		System.out.println("#######################################");
	}
}
