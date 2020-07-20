class Figure
{
	public static void main ( String args[] )
	{
		// (a)
		for ( int i = 0; i < 10; i++)
		{
			System.out.println(); 
			for ( int j = 0; j <= i; j++)
				System.out.print('*');
		}

		System.out.println(); System.out.println(); 

		// (b)
		for ( int i = 0; i < 10; i++)
		{
			System.out.println(); 
			for ( int j = 10; j > i; j--)
				System.out.print('*');
		}

		System.out.println(); System.out.println();
		
		// (c)
		int spaces=0;
		for ( int i = 0; i < 10; i++)
		{
			System.out.println();
			if ( spaces != 0 )
				for ( int k = 0; k < spaces; k++)
					System.out.print(' ');
			for ( int j = 10; j > i; j--)
				System.out.print('*');
			spaces++;
		}

		System.out.println(); System.out.println();
		
		// (d)
		spaces=9;
		for ( int i = 0; i < 10; i++)
		{
			System.out.println();
			if ( spaces != 0 )
				for ( int k = 0; k < spaces; k++)
					System.out.print(' ');
			for ( int j = 0; j <= i; j++)
				System.out.print('*');
			spaces--;
		}
	
	}
}