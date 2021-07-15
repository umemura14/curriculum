package check;

public class Pet {

	//フィールド変数の定義
	private String name;
	private String masterName;

	//コンストラクタ
	//引数にnameとmasterNameを指定
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	protected String getName() {
		return name;
	}

	protected String getMasterName() {
		return masterName;
	}

	//introduceメソッドを定義している。
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です");
		System.out.println("■ご主人様は" + masterName + "です");
	}
}

//Petクラスを継承しRobotPetクラスを作成
class RobotPet extends Pet {

	//継承元のコンストラクタを参照している。
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	//introduceメソッドを定義。
	//フィールド変数のnameとmasterNameはprivate修飾子で呼び出せないので
	//protected修飾子のgetName,getMasterNameメソッドを呼び出している。
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}
}