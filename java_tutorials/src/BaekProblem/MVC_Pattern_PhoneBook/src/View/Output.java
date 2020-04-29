package View;

public class Output implements View {

	@Override
	public void show() {
		out.println("\n############### 출력기능 ###############\n");
		for(String key : request.keySet()) {
			
			Object value = request.get(key);
			out.println("Id : "+key+request.get(key));
			//request.get(key)는 DTO클래스의 toString수행
			
		}
		
		out.println("\n######################################\n");
		saramController.process();
	}

}
