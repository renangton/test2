package test2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {	
	public static void main(String[] args) throws Exception{
		//　課題1 HelloWorldを出力
		String greeting = "HelloWorld";
		System.out.println(greeting);
		
		// 課題2	1～10までを足した結果を出力No1
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//　課題3 3年後の今日が何曜日なのかを出力
		// 現在日時を所得
		LocalDateTime today = LocalDateTime.now();
		System.out.println("現在日時：" + today);
		
		/*3年後の日時
		LocalDateTime threeYearsLater = (LocalDateTime.now()).plusYears(3);
		System.out.println(threeYearsLater);
		*/
		
		//　3年後の今日の曜日を所得
		DayOfWeek day = today.plusYears(3).getDayOfWeek();
		String dayJpn = "";
		switch(day) {
		case SUNDAY :
			dayJpn = "日曜日";
			break;
		case MONDAY :
			dayJpn = "月曜日";
			break;
		case TUESDAY :
			dayJpn = "火曜日";
			break;
		case WEDNESDAY :
			dayJpn = "水曜日";
			break;
		case THURSDAY :
			dayJpn = "木曜日";
			break;
		case FRIDAY :
			dayJpn = "金曜日";
			break;
		case SATURDAY :
			dayJpn = "土曜日";
			break;
		} 
		System.out.println("3年後の今日は" + dayJpn);
		
		// 課題3_追加課題　DateTimeformatterを使ってみる
		// 日付パターンを指定
		DateTimeFormatter timeFormat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String timeDisp = today.format(timeFormat1);
		System.out.println("現在日時ver1：" + timeDisp);
		
		// 書式パターンを使用
		DateTimeFormatter timeFormat2 = DateTimeFormatter.ISO_LOCAL_DATE;
		String timeDisp2 = today.format(timeFormat2);
		System.out.println("現在日時ver2:" + timeDisp2);
		
		// 課題4　引数が0なら偽、1なら真を出力　& 課題6　例外処理
		System.out.print("0か1を入力してください:");
		int r = new java.util.Scanner(System.in).nextInt();
		if(r == 0) {
			System.out.println("偽");
		}else if(r == 1) {
			System.out.println("真");
		}else {
			// 0と1以外を参照した時の処理
			throw new Exception("0か1を入力してください");
		}
		
		// 課題5-1　String型のListを作成　& 課題6　例外処理
		List<String> list1 = new ArrayList<String>();
		// 要素[0]に坂井を追加
		list1.add("坂井");
		list1.add("原");
		list1.add("末次");
		// 要素[2]に田村を追加し、[2]以降に格納されたものを、後ろにずらす
		list1.add(2, "田村");
		// 要素[1]の原を杉本に更新
		list1.set(1, "杉本");
		for(String name : list1) {
			System.out.print(name + " ");
		}
		System.out.println(" ");
	    
		try {
			System.out.println(list1.get(5));
		}catch(IndexOutOfBoundsException e) {
			// リスト外を参照した時の処理
			System.out.println("リスト外を参照しています");
		}
		
	    // 課題5-2　String型のMapを作成 & 課題6　例外処理
	    Map<String, Integer> pokemon = new HashMap<String, Integer>();
	    //　名前と種族値合計を追加
	    pokemon.put("ピカチュウ", 320);
	    pokemon.put("ライチュウ", 485);
	    pokemon.put("カイリュウ", 600);
	    
	    System.out.print("ポケモンの名前を入力してください:");
	   	String pokemonName = new java.util.Scanner(System.in).nextLine();
	   	if(pokemon.get(pokemonName) != null) {
	   		//　入力されたポケモンの種族値合計を表示
	   		System.out.println(pokemonName + "の種族値合計は" + pokemon.get(pokemonName));
	   	}else {
	   		// 登録されていないポケモンを参照した時の処理
	   		throw new Exception("このポケモンはまだ登録されていません");
	   	}

    	/* (課題2) 1～nまでを足した結果を出力
		System.out.print("(1~nまでを足し算)数字を入力して下さい：");
		int n = new java.util.Scanner(System.in).nextInt();
		int sum1 = 0;
		for(int i = 1; i <= n; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		*/
	   	 	
	}
}
