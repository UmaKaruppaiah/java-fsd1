package AccessModifier;

public class MAinfunction {
	public static void main(String[] args) {
		DefaultD a=new DefaultD();
		publiC  b=new publiC();
		Protected c=new Protected();
		//Private  d=new Private();
		class publiC extends Protected{}
		a.value();
		b.valueOfPublic();
		c.valueOf();
		//d.valueOf();
		
	}

}
