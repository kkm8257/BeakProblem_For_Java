package View;

public class Delete implements View {

	@Override
	public void show() {

		String DeleteID="";
		
		
		out.println("\n############### ������� ###############\n");
		
		out.print("������ ID�� �Է��ϼ���.  >>>");
		DeleteID=scan.next();
		
		request.remove(DeleteID);
		
		if(!request.containsKey(DeleteID)) {
			
			out.println("\n���������� �����Ǿ����ϴ�.\n");
			
		}
		
		saramController.process();
	}

}
