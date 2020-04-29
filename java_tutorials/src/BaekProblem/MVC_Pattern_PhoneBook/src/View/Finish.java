package View;

public class Finish implements View {

	@Override
	public void show() {
		out.println("\n############### 종료 ###############\n");
		out.println("수고하셨습니다.");
		System.exit(0);
	}

}
