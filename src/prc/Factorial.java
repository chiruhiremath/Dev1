package prc;

import org.testng.annotations.Test;

public class Factorial {
@Test
public void fact()
{
	int no=5;
	int fact=1;
	for(int i=no;i>=1;i--)
	{
		fact=fact*i;
}
System.out.println(fact);
}
}
