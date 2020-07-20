class Date
{
    public static void main ( String args[] )
    {
		String date = "9/12/2014";
        
		int firstPosition = date.indexOf('/');
		int secondPosition = date.lastIndexOf('/');

		String sDay = date.substring(0,firstPosition);
		String sMonth = date.substring(firstPosition+1,secondPosition);
		String sYear = date.substring(secondPosition+1,date.length());
        
		int day = Integer.parseInt(sDay);
		int month = Integer.parseInt(sMonth);
		int year = Integer.parseInt(sYear);
	
        switch ( month )
        {
            case 1:System.out.printf("%d January %d\n", day, year);
                break;

            case 2:System.out.printf("%d February %d\n", day, year);
                break;

            case 3:System.out.printf("%d March %d\n", day, year);
                break;

            case 4:System.out.printf("%d April %d\n", day, year);
                break;

            case 5:System.out.printf("%d May %d\n", day, year);
                break;

            case 6:System.out.printf("%d June %d\n", day, year);
                break; 
 
            case 7:System.out.printf("%d July %d\n", day, year);
                break;

            case 8:System.out.printf("%d August %d\n", day, year);
                break;

            case 9:System.out.printf("%d September %d\n", day, year);
                break;

            case 10:System.out.printf("%d October %d\n", day, year);
                break; 
 
            case 11:System.out.printf("%d November %d\n", day, year);
                break;

            case 12:System.out.printf("%d December %d\n", day, year);
                break;                
        }
        
        if ( ( year % 400 == 0 ) || ( year % 4 == 0 ) )
            System.out.printf("Year is leap.\n");
        else
            System.out.printf("Year isn't leap.\n");
    }
}