package mvc.controller;

import mvc.model.DTO;

public class InputController  implements Control{

	@Override
	public void service() {

		
		System.out.println("�̸��� �Է��ϼ���.");
		String name=sc.nextLine();
		System.out.println("��ȣ�� �Է��ϼ���");
		String phone=sc.nextLine();
		
		
		DTO dto = new DTO(name,phone);
		
		dao.insert(dto);
		
		
		
	}

	
	
	
	
	
}
