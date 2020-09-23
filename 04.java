public  class  DateTest {
	public  static  void  main ( String [] args ) {
		Data d =  nova  data ( 16 , 9 , 2020 );
		d . displayDate ();
		d . setDay ( 23 );
		d . setMonth ( 1 );
		d . setYear ( 1564 );
		d . displayDate ();
		
		d =  nova  data ( 8 , 10 , 2234 );
		d . displayDate ();
	}
}