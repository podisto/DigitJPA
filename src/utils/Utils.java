package utils;

public class Utils {
	
	private int meter = 0;
	private boolean bind = true;
	public static final int DIGIT_1 = 10000;
	public static final int DIGIT_2 = 1000;
	public static final int DIGIT_3 = 100;
	public static final int DIGIT_4 = 10;
	public static final int DIGIT_5 = 1;
	
	public void increment() {
		this.increment(Utils.DIGIT_5);
	}
	
	/**
	 * Increments one of the things
	 * 
	 * @param digit
	 */
	public void increment(int digit) {
		if (digit != Utils.DIGIT_1 && digit != Utils.DIGIT_2 && digit != Utils.DIGIT_3 && digit != Utils.DIGIT_4 && digit != Utils.DIGIT_5) 
			return;
		
		this.meter += digit;
		if (bind)
			this.meter = Math.abs(this.meter % 100000);
	}
	
	public void add(int number) {
		this.add(number, Utils.DIGIT_5);
	}
	
	public void add(int number, int digit) {
		if (digit != Utils.DIGIT_1 && digit != Utils.DIGIT_2 && digit != Utils.DIGIT_3 && digit != Utils.DIGIT_4 && digit != Utils.DIGIT_5)
			return;
		this.meter += (digit * number);
		if (bind)
			this.meter = Math.abs(this.meter % 100000);
	}

	@Override
	public String toString() {
		return String.format("%05d", this.meter);
	}
}
