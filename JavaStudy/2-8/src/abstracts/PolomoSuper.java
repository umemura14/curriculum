package abstracts;

class PolimoSub1 extends PolimoSuper {

	protected void call() {
		super.call();
	}

}

class PolimoSub2 extends PolimoSuper {

	protected void call() {
		super.call();
	}

}

public static void main(String []args) {
PolimoSuper polimo1 = new PolimoSub1();
polimo1.call();

PolimoSuper polimo2 = new PolimoSub2();
polimo2.call();
}