import acm.util.RandomGenerator;

/*
 * Slot Machine Simulation
 */
public class SlotMachineGame {
	public SlotMachineGame(boolean flag, int sum){
		isReady = flag;
		moneyToPlay = sum;
	}
	public int Wheel1(){
		int wheel1 = rgen.nextInt(1, 6);
		String symbol1 = "";
		switch(wheel1){
		case 1: symbol1 = "CHERRY"; break;
		case 2: symbol1 = "LEMON"; break;
		case 3: symbol1 = "ORANGE"; break;
		case 4: symbol1 = "PLUM"; break;
		case 5: symbol1 = "BELL"; break;
		case 6: symbol1 = "BAR"; break;
		default: break;
		}
		return wheel1;
	}
	public int Wheel2(){
		int wheel2 = rgen.nextInt(1, 6);
		String symbol2 = "";
		switch(wheel2){
		case 1: symbol2 = "CHERRY"; break;
		case 2: symbol2 = "LEMON"; break;
		case 3: symbol2 = "ORANGE"; break;
		case 4: symbol2 = "PLUM"; break;
		case 5: symbol2 = "BELL"; break;
		case 6: symbol2 = "BAR"; break;
		default: break;
		}
		return wheel2;
	}
	public int Wheel3(){
		int wheel3 = rgen.nextInt(1, 6);
		String symbol3 = "";
		switch(wheel3){
		case 1: symbol3 = "CHERRY"; break;
		case 2: symbol3 = "LEMON"; break;
		case 3: symbol3 = "ORANGE"; break;
		case 4: symbol3 = "PLUM"; break;
		case 5: symbol3 = "BELL"; break;
		case 6: symbol3 = "BAR"; break;
		default: break;
		}
		return wheel3;
	}
	
	
	private boolean isReady;
	private int moneyToPlay;
	
	private final int win250 = 250;
	private final int win20 = 20;
	private final int win14 = 14;
	private final int win10 = 10;
	private final int win7 = 7;
	private final int win5 = 5;
	private final int win2 = 2;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
