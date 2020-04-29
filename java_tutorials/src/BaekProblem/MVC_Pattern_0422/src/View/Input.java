package View;

import java.util.Scanner;

import Model.SaramDTO;

public class Input implements View  {

	
	
	
	@Override
	public void show() {

		out.println("\n############### 입력기능 ###############\n");
		SaramDTO dto = new SaramDTO();
		
		out.print("아이디입력 >>> ");
		dto.setId(scan.next());
		out.print("성명입력 >>> ");
		dto.setName(scan.next());
		out.print("나이입력 >>> ");
		dto.setAge(scan.next());
		
		
		request.put(dto.getId(),dto);
		
		saramController.process();
	}
	

}
