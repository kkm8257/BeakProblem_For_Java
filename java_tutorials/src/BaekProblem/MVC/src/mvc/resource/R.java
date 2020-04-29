package mvc.resource;

import java.util.Scanner;

import mvc.controller.Controller;
import mvc.controller.InputController;
import mvc.controller.OutputController;
import mvc.model.DAO;

public interface R {

	Scanner sc=new Scanner(System.in);
	Res res= new Res();
	
	
	Controller controller= new Controller();
	
	InputController inputController = new InputController();
	OutputController outputController=new OutputController();
	
	
	DAO dao=DAO.getInstance();
	
	
	
}
