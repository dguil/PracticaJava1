package practice1;



public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Douglas";
		String lastName = "Guillen";
		String telephone = "99885544";
		
		Persona p = new Persona(firstName,lastName,telephone);
		
		
		System.out.println(p.getPersona());
		
	}
}
