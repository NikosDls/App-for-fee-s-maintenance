import java.util.Random;

class RandomGen
{
	public static void main ( String args[] )
	{	
		Random randomGenerator = new Random();
		// (a)
		int dice1 = randomGenerator.nextInt(6) + 1, dice2 = randomGenerator.nextInt(6) + 1;

		System.out.printf("\n1st dice rolled %d and 2nd dice rolled %d\n\n", dice1 ,dice2);

		// (b)
		int number = randomGenerator.nextInt(46) + 45;

		System.out.printf("Number (45-90) is %d\n\n", number);

		// (c)
		int hours = randomGenerator.nextInt(24), minutes = randomGenerator.nextInt(60), seconds = randomGenerator.nextInt(60);
 			
		if ( ( hours >= 0 ) && ( hours <= 12 ) )
			if ( hours == 0 )
				System.out.printf("0%d:%d:%d twentyfourth hour scale , %d:%d:%d twelfth hour scale\n",hours ,minutes ,seconds ,hours+12 ,minutes ,seconds);
			else
				System.out.printf("%d:%d:%d twentyfourth hour scale , %d:%d:%d twelfth hour scale\n", hours ,minutes ,seconds ,hours ,minutes ,seconds);
			
		if ( ( hours >= 13 ) && ( hours <= 23 ) )
			System.out.printf("%d:%d:%d twentyfourth hour scale , %d:%d:%d twelfth hour scale\n", hours ,minutes ,seconds ,hours-12 ,minutes ,seconds);
	}
}