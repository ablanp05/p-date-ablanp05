

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
	public int getMOnth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}

	int getNumGuess(){
		int contador=0;
		Date randomDate;
		boolean end;
		while(!end){
			randomDate=new Date(this.year);
			contador++;
			if(this.equal(randomDate)){
				end=true
			}
		}
		
	}return contador;


	boolean isSameYear(Date another){
		if(this.year==another.getYear());
		return true;
		}else{
		return false;
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

	private int countDaysOfTheMonth(int Month){
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

	int countDaysOfTheMonth(){
		return this.countDaysOfTheMonth(this.month);
	}
	public int countDaysOfTheYear(){
		int year;
		int count=0;
		for(int i=1;i<=this.mes;i++){
			count=count+getNumDaysMonth(i);
		}
			count=count+this.day;
	return count;
	}





}
