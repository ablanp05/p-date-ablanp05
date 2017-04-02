package es.unileon.prg.date;

public class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}

	/*int getNumGuess(){
		int contador=0;
		Date randomDate;
		boolean end;
		while(!end){
			randomDate=new Date(this.year);
			contador++;
			if(this.equal(randomDate)){
				end=true;
			}
		}
	return contador;	
	}
*/

	boolean isSameYear(Date another){
		if(this.year==another.getYear()){
		return true;
		}else{
		return false;
		}
	}
	boolean isSameDay(Date another){
		if(this.day==another.getDay()){
		return true;
		}else{
		return false;
		}
	}
	boolean isSameMonth(Date another){
		if(this.month==another.getMonth()){
		return true;
		}else{
		return false;
		}
	}
	boolean isSame(Date another){
		if(this.month==another.getMonth() || this.day==another.getDay() || this.year==another.getYear()){
		return true;
		}else{
		return false;
		}
	}

	int nameOfTheMonth(int Month){
		String m=" ";
		switch(month){
			case 1:m="Enero";
			break;
			case 2:m="Febrero";
			break;
			case 3:m="Marzo";
			break;
			case 4:m="Abril";
			break;
			case 5:m="Mayo";
			break;
			case 6:m="Junio";
			break;
			case 7:m="Julio";
			break;
			case 8:m="Agosto";
			break;
			case 9:m="Septiembre";
			break;
			case 10:m="Octubre";
			break;
			case 11:m="Noviembre";
			break;
			case 12:m="Diciembre";
			break;
		}
		return 0;
	}
	int nameOfTheMonth(){
		return this.nameOfTheMonth(this.month);
	}
	private int estacionOfTheMonth(int Month){
		String e=" ";
		switch(month){
			case 3:
			case 4:
			case 5:
				e="primavera";
			break;
			case 6:
			case 7:
			case 8:
				e="verano";
			break;
			case 9:
			case 10:
			case 11:
				e="otoño";
			break;
			case 1:
			case 2:
			case 12:
				e="invierno";
			break;

		}
		return 0;
	}
	int estacionOfTheMonth(){
		return this.estacionOfTheMonth(this.month);
	}
	private int daysOfTheMonth(int Month){
		int n=0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				n=31;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				n=30;
			break;
			case 2:
				n=28;
			break;
		}

		return n;
	}

	int daysOfTheMonth(){
		return this.daysOfTheMonth(this.month);
	}
/*	public int countDaysOfTheYear(){
		int year;
		int count=0;
		for(int i=1;i<=this.mes;i++){
			count=count+getNumDaysMonth(i);
		}
			count=count+this.day;
	return count;
	}

*/
	int mesesQuedan(nameOfTheMonth){
	
		for(int i=m;i<m=12;i++){
		}
		
		System.out.println("meses que quedan",mesesQuedan);
	
	}

	int

}
