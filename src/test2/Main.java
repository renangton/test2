package test2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
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
		System.out.println("3年後の今日は" + day);
		
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
		// 要素[0]にAを追加
		list1.add("坂井");
		list1.add("原");
		list1.add("末次");
		// 要素[2]にEを追加し、[2]以降に格納されたものを、後ろにずらす
		list1.add(2, "田村");
		// 要素[1]のBをDに更新
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
