package Resource;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

import Controller.SaramController;
import Model.SaramDTO;
import View.Delete;
import View.Finish;
import View.Input;
import View.Menu;
import View.Modify;
import View.Output;
import View.Search;

public interface R {

	
		PrintStream out= System.out;
		
		String menuStr = "1.INPUT   2.OUTPUT  3.SEARCH  4.MODIFY  5. DELETE  6.FINISH";
		
		
		
		
		
		HashMap <String , SaramDTO> request = new HashMap();
		//중복 안되고(자동) , 오름차순 정렬 HashMap
		
		SaramController saramController = new SaramController();
		
		Scanner scan = new Scanner(System.in);
		
		Menu menu =new Menu();
		
		Input input = new Input();
		Output output = new Output();
		Search search = new Search();
		Modify modify = new Modify();
		Delete delete = new Delete();
		Finish finish= new Finish();
		

}
