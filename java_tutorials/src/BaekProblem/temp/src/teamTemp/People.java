package teamTemp;

public class People {

	private int Idx;
	private String Name;
	private String Phone;
	
	public People(int Idx,String Name, String Phone){
		
		this.Idx=Idx;
		this.Name=Name;
		this.Phone=Phone;
		
	}
	
	
	////////////////////////////
	
	
	@Override
	public String toString() {
		return "People [Idx=" + Idx + ", Name=" + Name + ", Phone=" + Phone + "]";
	}


	public int getIdx() {
		return Idx;
	}
	public void setIdx(int idx) {
		Idx = idx;
	}
	
	///////////////////////////
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	///////////////////////////
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	
	
	

}
