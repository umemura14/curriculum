package study;

public class NanaumiMain {

	public static void main(String[] args) {
		Nanaumi nanaumi = new Nanaumi("七海", "2019/01");

		// Javaカリキュラム作って報告
		final String message = nanaumi.doCreateJavaCurriculum();
		System.out.println("message = " + message);
	}
}