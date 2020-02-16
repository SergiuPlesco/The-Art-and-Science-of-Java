/*
 * Chapter 9, ex. 9 Calendar
 */
import acm.program.*;
import acm.graphics.*;
public class Calendar extends GraphicsProgram {
	public void run(){
		double dayWidth = getWidth() / 7;
		double dayHeight = (getHeight() - 25)/ 6;
		
		GLabel numDay = new GLabel("   ");
		
		GLabel monday = new GLabel("MON");
		GLabel tuesday = new GLabel("TUE");
		GLabel wednesday = new GLabel("WED");
		GLabel thursday = new GLabel("THU");
		GLabel friday = new GLabel("FRI");
		GLabel saturday = new GLabel("SAT");
		GLabel sunday = new GLabel("SUN");
		add(monday, dayWidth / 2 - monday.getWidth() / 2, monday.getHeight());
		add(tuesday, (dayWidth + dayWidth / 2) - tuesday.getWidth() / 2, tuesday.getHeight());
		add(wednesday, (dayWidth * 2 + dayWidth / 2) - wednesday.getWidth() / 2, wednesday.getHeight());
		add(thursday, (dayWidth * 3 + dayWidth / 2) - thursday.getWidth() / 2, thursday.getHeight());
		add(friday, (dayWidth * 4 + dayWidth / 2) - friday.getWidth() / 2, friday.getHeight());
		add(saturday, (dayWidth * 5 + dayWidth / 2) - saturday.getWidth() / 2, saturday.getHeight());
		add(sunday, (dayWidth * 6 + dayWidth / 2) - sunday.getWidth() / 2, sunday.getHeight());
		
		for(int row = 0; row < 6; row++){
			for(int col = 0; col < 7; col++){
				GRect dayBox = new GRect(col * dayWidth, (row * dayHeight) + 25, dayWidth, dayHeight);
				add(dayBox);	
			}
		}
		
		//displays days starting from position col and row
		double col = DAY_MONTH_STARTS - 1;
		double row = 1;
		for(int i = 1; i <= DAYS_IN_MONTH; i++){
			
			numDay = new GLabel("  " + i);
			numDay.setFont("Arial-bold-16");
			add(numDay, col * dayWidth, row * dayHeight);
			col++;
			
			if(col == 7){
				col = 0;
				row++;
			}
				
		}//end of for loop 31 days
		
	}
	/* The number of days in month */
	private static final int DAYS_IN_MONTH = 30;
	
	/* The day of the week on which the month starts */
	/* Sunday = 0, Monday = 1, Tuesday = 2, and so on */
	private static final int DAY_MONTH_STARTS = 7;
}
