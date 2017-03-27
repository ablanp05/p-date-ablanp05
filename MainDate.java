

Class MainDate{
	public static void main(SString args[]){
		Date today, tomorrow;
		today= new Date(27,3,2017); 
		tomorrow= new Date(28,3,2017);
		
		System.out.println(today.isSame(tomorrow));
		System.out.println(today.getNumGuess());
	}	
	
}
