class pi
{
	public static void main ( String args[] )
	{
		double pi = 0;
		int denominator = 1, sign = 0; // sign = 0 for +, sign = 1 for -
		for ( int i = 0; i < 500; i++)
		{
			if ( sign == 0 )
			{
				pi = pi + 4.0 / denominator;
				System.out.printf("%d loop. Pi is %1.5f\n", i+1, pi);
				denominator = denominator + 2;
				sign = 1;
    		}
			else
			{
				pi = pi - 4.0 / denominator;
				System.out.printf("%d loop. Pi is %1.5f\n", i+1, pi);
				denominator = denominator + 2;
				sign = 0;				 
			}	
			

		}	
	}
}