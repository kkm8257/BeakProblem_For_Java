package mvc.view;

public class Menu implements View {

	@Override
	public void display() {

		while (true) {
			int choose=0;
			
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.추가 2.출력 3.종료   >>>");
			
			res.choose= Integer.parseInt(sc.nextLine());
			
			controller.dicision();
			
			
		}
	}

}
