package AccessModifier;

class Private {
	private String subject;
	Private() {
	    System.out.println("Constructor Called:");
	    subject="Maths";
	}
	public static void main(String[] args) {
		Private a=new Private();
		System.out.println(a.subject);
		
	}
}
