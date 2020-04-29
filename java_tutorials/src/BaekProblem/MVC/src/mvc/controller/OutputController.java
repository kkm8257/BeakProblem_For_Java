package mvc.controller;

public class OutputController implements Control{

	
	@Override
	public void service() {

		dao.printAll();
		
		
	}
}