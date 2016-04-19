import org.junit.Test;

public class A 
{
	@Test
	public void test1()
	{
		Encap e=new Encap(3,7,5);
		System.out.println(e.getA());
		e.setA(13);
		System.out.println(e.getA());
		
		Encap e1=new Encap(13,27,15);
		System.out.println(e1.getA());
	}

}
