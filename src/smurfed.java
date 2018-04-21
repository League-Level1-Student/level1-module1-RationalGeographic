
public class smurfed {
	public static void main(String[] args) {

		Smurf handy = new Smurf("handy");
		String q = handy.getName();

		System.out.println(q);

		handy.eat();

		Smurf papa = new Smurf("papa");
		String h = papa.getName();
		System.out.println(h);
papa.eat();
String j = papa.getHatColor();
System.out.println(j);
 String z =papa.isGirlOrBoy();
 System.out.println(z);
Smurf smurfette = new Smurf("smurfette");
String k = smurfette.getName();
System.out.println(k);
String o = smurfette.getHatColor();
System.out.println(o);
String y =smurfette.isGirlOrBoy();
System.out.println(y);
	}

}
