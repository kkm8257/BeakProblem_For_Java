package mvc.model;

public class DTO {

	private String Name;
	private String Phone;
	
	public DTO(String Name,String Phone) {
		
		this.Name=Name;
		this.Phone=Phone;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "DTO [Name=" + Name + ", Phone=" + Phone + "]";
	}

	
	
}
