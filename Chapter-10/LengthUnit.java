
public class LengthUnit {
	public LengthUnit(String unit){
		this.unit = unit;
	}
	
	public double getUnit(){
		double val = 0;
		if(unit.equals("Inches")){
			val = 1;
		} else if(unit.equals("Feet")){
			val = 12;
		} else if(unit.equals("Yards")){
			val = 36;
		} else if(unit.equals("Miles")){
			val = 63360;
		} else if(unit.equals("Fathoms")){
			val = 72;
		} else if(unit.equals("Rods")){
			val = 198;
		} else if(unit.equals("Furlongs")){
			val = 7920;
		}
		return val;
	}
	public String toString(){
		return unit;
	}
	/**/
	private String unit;
}
