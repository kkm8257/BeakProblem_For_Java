package View;

public class Output implements View {

	@Override
	public void show() {
		out.println("\n############### ��±�� ###############\n");
		for(String key : request.keySet()) {
			
			Object value = request.get(key);
			out.println("Id : "+key+request.get(key));
			//request.get(key)�� DTOŬ������ toString����
			
		}
		
		out.println("\n######################################\n");
		saramController.process();
	}

}
