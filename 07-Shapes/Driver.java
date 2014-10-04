
public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));
	
	System.out.println(s.tri1(4));
	System.out.println(s.tri1(6));
	System.out.println(s.tri1(2));

	System.out.println(s.tri2(4));
	System.out.println(s.tri2(6));
	System.out.println(s.tri2(2));

	System.out.println(s.tri3(4));
	System.out.println(s.tri3(6));
	System.out.println(s.tri3(2));

	System.out.println(s.diamond(5));
	System.out.println(s.diamond(7));
	System.out.println(s.diamond(3));

	System.out.println(s.tri4(4));
	System.out.println(s.tri4(6));
	System.out.println(s.tri4(2));

    }
}
