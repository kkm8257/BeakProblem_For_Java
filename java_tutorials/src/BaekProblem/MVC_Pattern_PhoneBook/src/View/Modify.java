package View;

import Model.SaramDTO;

public class Modify implements View {

	@Override
	public void show() {
		out.println("\n############### ������� ###############\n");
		
		String SearchID="";
		String changeName="";
		String changeAge="";
		
		SaramDTO TempObject;
		
		out.print("���̵� �Է��Ͻø� �ش� ���̵� ���� ������ �����մϴ�.\n���� �� ���̵� �Է��ϼ���  >>>  ");
		
		while(true) {
			
			SearchID=scan.next();
			if(request.containsKey(SearchID)) {
				break;
			}
			else {
				out.print("�ٽ� �Է��ϼ���!  >>>  ");
			}
			
		}
		
		TempObject=request.get(SearchID);
		
		
		
		out.print("�ٲ� �̸� �Է� : ");
		changeName=scan.next();
		TempObject.setName(changeName);
		
		out.print("�ٲ� ���� �Է� : ");
		changeAge=scan.next();
		TempObject.setAge(changeAge);
		
		////���ڵ� Ȯ���ؼ� ��������
		
		
		saramController.process();
	}

}
