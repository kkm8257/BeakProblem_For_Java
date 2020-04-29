package mvc.controller;

import mvc.model.DTO;

public class InputController  implements Control{

	@Override
	public void service() {

		
		System.out.println("이름을 입력하세요.");
		String name=sc.nextLine();
		System.out.println("번호를 입력하세요");
		String phone=sc.nextLine();
		
		
		DTO dto = new DTO(name,phone);
		
		dao.insert(dto);
		
		
		
	}

	
	
	
	
	
}
