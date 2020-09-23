public  class  Date {
	 dia interno privado ;
	 mês int privado ;
	 ano int privado ;
	
	public  Date ( int  dia , int  mês , int  ano ) {
		isso . dia = dia;
		isso . mês = mês;
		isso . ano = ano;
	}
	
	public  void  setDay ( int  day ) {
		isso . dia = dia;
	}
	public  int  getDay () {
		dia de retorno ;
	}
	
	public  void  setMonth ( int  month ) {
		isso . mês = mês;
	}
	public  int  getMonth () {
		mês de retorno ;
	}
	
	public  void  setYear ( int  year ) {
		isso . ano = ano;
	}
	public  int  getYear () {
		ano de retorno ;
	}
	
	public  void  displayDate () {
		Sistema . para fora . printf ( " % 02d /% 02d /% d \ n " , dia, mês, ano);
	}
}