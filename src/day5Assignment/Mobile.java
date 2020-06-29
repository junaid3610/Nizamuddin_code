package day5Assignment;

public class Mobile extends CordLess{
	Mobile()
	{
		System.out.println("In Mobile Constructor");
	}
void accesories() {
	super.accesories(1);
	System.out.println("sim card");
}
public static void main(String[] args) {
	
	Landline obj = new Landline();
	obj.accesories("1.1f");//calls accessories method from LandLine, CordLess and then Mobile
	CordLess ob = new CordLess();
	ob.accesories(1);
	Mobile o = new Mobile();
	o.accesories();
}
}
