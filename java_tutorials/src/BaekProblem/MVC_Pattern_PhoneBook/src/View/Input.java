package View;

import java.util.Scanner;

import Model.SaramDTO;

public class Input implements View  {

	
	
	
	@Override
	public void show() {

		out.println("\n############### �Է±�� ###############\n");
		SaramDTO dto = new SaramDTO();
		
		out.print("���̵��Է� >>> ");
		dto.setId(scan.next());
		out.print("�����Է� >>> ");
		dto.setName(scan.next());
		out.print("�����Է� >>> ");
		dto.setAge(scan.next());
		
		
		request.put(dto.getId(),dto);
		
		saramController.process();
	}
	

}
