package SchoolApp;


/** Evaluates the student
 * @author Ghazi Suliyanto 15903239
 *
 */
public class StudentEvaluation {

	/** returns an object for student axel
	 * @return an object for student axel
	 */
	public static Student axel() {
		Student s=new Student("Axel");
		TechnicalSchool ts=new TechnicalSchool();
		s.addResultToTranscript(ts.lookup("PROG101"), Grade.BPLUS);
		s.addResultToTranscript(ts.lookup("STAT102"), Grade.C);
		s.addResultToTranscript(ts.lookup("DATA222"), Grade.A);
		s.addResultToTranscript(ts.lookup("PROG202"), Grade.C);
		s.addResultToTranscript(ts.lookup("INSY313"), Grade.AMINUS);
		s.addResultToTranscript(ts.lookup("WEBS332"), Grade.A);
		s.addResultToTranscript(ts.lookup("TECH103"), Grade.D);
		s.addResultToTranscript(ts.lookup("MODC233"), Grade.B);
		s.addResultToTranscript(ts.lookup("TOPG233"), Grade.B);
		s.addResultToTranscript(ts.lookup("PROJ399"), Grade.CMINUS);
		s.addResultToTranscript(ts.lookup("EXTO396"), Grade.C);
		return s;
	}
	
	/**
	 * @return an object for student jim
	 */
	public static Student jim() {
		Student s=new Student("Jim");
		TechnicalSchool ts=new TechnicalSchool();
		s.addResultToTranscript(ts.lookup("PROG101"), Grade.A);
		s.addResultToTranscript(ts.lookup("STAT102"), Grade.BPLUS);
		s.addResultToTranscript(ts.lookup("DATA222"), Grade.CPLUS);
		s.addResultToTranscript(ts.lookup("PROG202"), Grade.C);
		s.addResultToTranscript(ts.lookup("INSY313"), Grade.C);
		s.addResultToTranscript(ts.lookup("WEBS332"), Grade.CPLUS);
		s.addResultToTranscript(ts.lookup("TECH103"), Grade.CMINUS);
		s.addResultToTranscript(ts.lookup("THEO111"), Grade.D);
		s.addResultToTranscript(ts.lookup("MODC233"), Grade.APLUS);
		s.addResultToTranscript(ts.lookup("TOPG233"), Grade.A);
		s.addResultToTranscript(ts.lookup("LOGI321"), Grade.B);
		s.addResultToTranscript(ts.lookup("PROJ399"), Grade.BMINUS);
		s.addResultToTranscript(ts.lookup("EXTO396"), Grade.APLUS);
		return s;
	}
	
	/** returns an object for student kate
	 * @return an object for student kate
	 * @author 15903239
	 */
	public static Student kate() {
		Student s=new Student("Kate");
		TechnicalSchool ts=new TechnicalSchool();
		s.addResultToTranscript(ts.lookup("PROG101"), Grade.APLUS);
		s.addResultToTranscript(ts.lookup("STAT102"), Grade.AMINUS);
		s.addResultToTranscript(ts.lookup("TECH103"), Grade.BPLUS);
		s.addResultToTranscript(ts.lookup("MODC233"), Grade.A);
		s.addResultToTranscript(ts.lookup("TOPG233"), Grade.C);
		s.addResultToTranscript(ts.lookup("DATA222"), Grade.A);
		s.addResultToTranscript(ts.lookup("INSY313"), Grade.BPLUS);
		s.addResultToTranscript(ts.lookup("WEBS332"), Grade.AMINUS);
		s.addResultToTranscript(ts.lookup("PROJ399"), Grade.B);
		s.addResultToTranscript(ts.lookup("EXTO396"), Grade.B);
		return s;
	}
	
	/** returns an object for student robin
	 * @return  an object for student kate
	 * @author Ghazi Suliyanto
	 */
	public static Student robin() {
		Student s=new Student("Robin");
		TechnicalSchool ts=new TechnicalSchool();
		s.addResultToTranscript(ts.lookup("PROG101"), Grade.C);
		s.addResultToTranscript(ts.lookup("DATA222"), Grade.C);
		s.addResultToTranscript(ts.lookup("INSY313"), Grade.CPLUS);
		s.addResultToTranscript(ts.lookup("WEBS332"), Grade.CPLUS);
		s.addResultToTranscript(ts.lookup("TECH103"), Grade.CPLUS);
		s.addResultToTranscript(ts.lookup("MODC233"), Grade.CMINUS);
		s.addResultToTranscript(ts.lookup("TOPG233"), Grade.CMINUS);
		s.addResultToTranscript(ts.lookup("PROJ399"), Grade.APLUS);
		return s;
	}

	/**
	 * This is the main function to run the program
	 * @param args
	 * @author 15903239
	 */
	public static void main(String[] args) {
		TechnicalSchool ts=new TechnicalSchool();
		System.out.println("Transcript for Robin: ");
		System.out.println(ts.isCertified(StudentEvaluation.robin())+"\n");
		System.out.println("Transcript for Kate: ");
		System.out.println(ts.isCertified(StudentEvaluation.kate())+"\n");
		System.out.println("Transcript for Axel: ");
		System.out.println(ts.isCertified(StudentEvaluation.axel())+"\n");
		System.out.println("Transcript for Jim: ");
		System.out.println(ts.isCertified(StudentEvaluation.jim())+"\n");

	}
}