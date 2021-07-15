package study;

import interfaces.OrderFromMotoki;
import interfaces.OrderFromShihandai;

public class Nanaumi implements OrderFromMotoki, OrderFromShihandai{

	private String name;
	private String date;

	public Nanaumi(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}

	private void submitOrder(final int shoriFlg) {
		String nameAnd = name + ",";

		if (shoriFlg == 0) {
			System.out.println(nameAnd + date + "の勤務表出しました(｀･ω･´)ゞ！！！！！！");
		} else if (shoriFlg == 1) {
			// 交通費
			System.out.println(nameAnd + date + "の交通費も出しました(｀･ω･´)ゞ！！！！！！");
		} else {
			// その他
			System.out.println(nameAnd + "本当はまだ何も出してません(｀･ω･´)ドヤ！！！！！！");
		}
	}
	
	public void doNothing() {
		submitOrder(-1);
	}

	@Override
	public void daseyaKinmuhyo() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(0);

	}

	@Override
	public void daseyaKotsuhi() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(1);

	}

	@Override
	public void goToSevenEleven() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("先にセブンイレブン行ってきやす！");

	}

	@Override
	public String doCreateJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		return "Javaカリキュラム完成しました！";
	}

}
