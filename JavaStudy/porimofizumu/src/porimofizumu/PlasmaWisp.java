package porimofizumu;

import study.AbilityOfEnemy;

public class PlasmaWisp extends AbilityOfEnemy {

	public PlasmaWisp(String attackName) {
		super.attackName = attackName;
	}

	@Override
	protected void useAbility() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.attackName);

	}

}
