package SchoolApp;

/** This is Grade enum class which has grades as enum
 * @author Ghazi Suliyanto 15903239
 *
 */
public enum Grade {
	APLUS(90,100,true),
	A(85,89,true),
	AMINUS(80,84,true),
	BPLUS(75,79,true),
	B(70,74,true),
	BMINUS(65,69,true),
	CPLUS(60,64,true),
	C(55,59,true),
	CMINUS(50,54,true),
	D(0,49,false);

	private int low;
	private int high;

	/**
	 * @param low
	 * @param high
	 * @param pass
	 * @author Ghazi Suliyanto
	 */
	private Grade(int low, int high, boolean pass) {
		this.low = low;
		this.high = high;
	}

	/** Get a Low integer value for the Grade
	 * @return a Low integer value for the Grade
	 * @author 15903239
	 */
	public int getLow() {
		return low;
	}

	/** Get a High integer value for the Grade
	 * @return a High integer value for the Grade
	 * @author 15903239
	 */
	public int getHigh() {
		return high;
	}

	/** returns true if value is greater than 50
	 * @return true if value is greater than 50.
	 * @author 15903239
	 */
	public boolean isPass() {
		if(getLow()>=50) {
			return true;
		}
		else {
			return false;
		}
	}

}