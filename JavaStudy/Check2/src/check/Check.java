package check;

//constantsパッケージのConstantsクラスをインポートし、定数を使えるようにしている。
import constants.Constants;

public class Check {

	//フィールド変数firstNameとlastNameを宣言し自分の名前で初期化
	//(private修飾子なのでCheckクラスからだけアクセスできる。)
	private String firstName = "梅村";
	private String lastName = "潤也";

	//firstNameとlastNameを連結して表示させるprintNameメソッドを作成
	//(private修飾子なのでCheckクラスからだけアクセスできる。)
	private void printName() {
		System.out.println("printNameメソッド" + " " + "→" + " " + firstName + lastName);
	}

	public static void main(String[] args) {

		//Checkクラスをインスタンス化し、ch変数より、CheckクラスのprintNameメソッドを呼び出している。
		Check ch = new Check();
		ch.printName();

		//Petクラスをインスタンス化し、引数にConstantsクラスの定数を指定し、与えられた引数を元にptが生成される。
		//pt変数よりintroduceメソッドを飛び出している。
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pt.introduce();

		//RobotPetクラスをインスタンス化し、引数にConstantsクラスの定数を指定し、与えられた引数を元にrptが生成される。
		//rpt変数よりintroduceメソッドを呼び出している。
		RobotPet rpt = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rpt.introduce();
	}
}