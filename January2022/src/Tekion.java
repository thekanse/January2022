import java.util.Arrays;

public class Tekion 
{

	public static void main(String[] args)
	{
		
		String name1= "Army";
		String name2= "Mary";
		String N1=name1.toUpperCase();
		String N2= name2.toUpperCase();
		if(name1.length()==name2.length())
		{
			char [] ch1 =N1.toCharArray();
			char [] ch2 =N2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean res = Arrays.equals(ch1, ch2);
			if(res)
			{
				System.out.println("an anogram");
			}
			else
			{
				System.out.println("not an anogram");
			}

		}
		
	}

}
