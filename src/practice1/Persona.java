package practice1;

public class Persona {
	String firstName;
	String lastName;
	String telephone;
	
	Persona familiares [];
	
	//Constructor por defecto.
	Persona(){
		
	}
	
	Persona(String firstName, String lastName, String telephone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
	}
	
	public String getPersona() {
		return this.firstName + ' ' + this.lastName + " Phone Number: "+this.telephone;
	}
	
	public void setFirstName(String firstName){
		this.lastName = firstName;
	}
	
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}	

	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getTelephone(){
		return this.telephone;
	}	
	
}
