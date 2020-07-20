class Sqr
{
	public static void main ( String args[] )
	{
		int n = 20000, l = 0;
		double guess = n / 2.0, r, temp;
		
		do {
			r = n / guess;
			temp = guess;
			guess = ( guess + r ) / 2.0;
			l++;
			System.out.printf("loop:%d. guess=%.3f \n", l, guess);
		}
		while ( temp - guess >= 0.01 );

		System.out.printf("\nSqrt from %d is %.3f\n", n, guess); 
	}
}