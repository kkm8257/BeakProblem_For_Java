package View;

public class Search implements View {

	
	
	@Override
	public void show() {
		out.println("\n############### �˻���� ###############\n");
		
		String SearchID="";
		
		out.print("���̵� �Է��Ͻø� �ش� ���̵� ���� ������ �����մϴ�.\n�˾ƺ����� �ϴ� ���̵� �Է��ϼ���  >>>  ");
		//scan�Է¹ޱ� ����
		
		SearchID=scan.next();
		
		out.println("\nã�� ID : "+SearchID + " --->>> [ "+request.get(SearchID)+" ]\n");
		
		
		saramController.process();
	}

}
