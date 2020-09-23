public  class  Employee {
	// Variáveis ​​de instância
	private  String firstName;
	private  String lastName;
	 duplo salário privado ;
	
	// Construtor
	Public  Employee ( String  firstName , String  lastName , double  salary ) {
		setFirstName (firstName);
		setLastName (lastName);
		setSalário (salário);
	}
	// retorna o primeiroNome
	public  String  getFirstName () {
		return firstName;
	}
	// "seta" o primeiroNome
	public  void  setFirstName ( String  firstName ) {
		isso . firstName = firstName;
	}
	// retorna o lastName
	public  String  getLastName () {
		return lastName;
	}
	// "seta" o lastName
	public  void  setLastName ( String  lastName ) {
		isso . lastName = lastName;
	}
	// devolve salário
	public  double  getSalary () {
		salário de retorno ;
	}
	// "seta" o salário
	public  void  setSalary ( salário duplo  ) {
		if (salário >  0 ) {
			isso . salário = salário;
		}
	}
	
}