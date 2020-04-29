package mvc.controller;

import mvc.resource.R;

public class Controller implements R{

	public void dicision() {
		
		
		int choose = res.choose;
		if(choose==1) {
			
			inputController.service();
			
		}
		else if(choose==2) {
			outputController.service();
			
		}
		else if(choose==3) {
			
			
		}
	}
	
	
}
