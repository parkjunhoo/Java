package api.lang;

public class Owner {
	private String name;
	private String cellPhone;
	
	public Owner() {
		
	}
	public Owner(String name , String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Owner) {
			Owner other = (Owner)obj;
			if(this.name.equals(other.name)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("이름은 %s이고, 핸드폰 번호는 %s입니다.", this.name , this.cellPhone);
	}
	
	
	
	
}
