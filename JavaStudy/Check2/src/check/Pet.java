package check;

public class Pet {
	
    //フィールド変数
    private String name;
    private String masterName;
    
    
    //コンストラクタ
    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }
    
    
    //getNameメソッドを定義。getNameメソッドを呼び出すとnameが返される。
    protected String getName() {
        return name;
    }
    
    
    //getMasterNameメソッドを定義。getMasterNameメソッドを呼び出すとmasterNameが返される。
    protected String getMasterName() {
        return masterName;
    }
    
    
    //introduceメソッドを定義。戻り値なし。
    //introduceを呼び出すと下記の２行が処理される。
    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

//extends Petクラスを継承して作られたRobotPetクラス
class RobotPet extends Pet {
	
	//親クラスであるPetクラスのname,masterNameコンストラクタを呼び出す、RobotPetメソッド
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }
    
    
    //継承先で新たにintroduceメソッドを定義。
    //下の２行が処理される。
    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}