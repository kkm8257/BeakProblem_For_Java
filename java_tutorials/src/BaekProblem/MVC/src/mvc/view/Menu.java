package mvc.view;

public class Menu implements View {

	@Override
	public void display() {

		while (true) {
			int choose=0;
			
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�߰� 2.��� 3.����   >>>");
			
			res.choose= Integer.parseInt(sc.nextLine());
			
			controller.dicision();
			
			
		}
	}

}
