package SchoolApp;

import java.util.Arrays;

/** This is a student class which associates
 * all the information related to a student
 * @author Ghazi Suliyanto 15903239
 *
 */
/**
 * @author Ghazi Suliyanto 15903239
 *
 */
public class Student {
	private String name;
	private int MAX_TRANSCRIPT_LENGTH=20;
	private int nResults;
	private Result[] transcript;

	/** this is a constructor which sets the student name 
	 * and their transcript
	 * @param name
	 * @author 15903239
	 */
	public Student(String name) {
		this.name = name;
		transcript=new Result[MAX_TRANSCRIPT_LENGTH];
	}
	
	/** this adds the result of a student to their
	 * transcript.
	 * @param modules
	 * @param grades
	 * @author 15903239
	 */
	public void addResultToTranscript(Module modules, Grade grades) {
		System.out.print(modules.getCode()+" ");
		if(grades.toString().equals("APLUS")) {
			System.out.println("A+");
		}
		else if(grades.toString().equals("AMINUS")) {
			System.out.println("A-");
		}
		else if(grades.toString().equals("BPLUS")) {
			System.out.println("B+");
		}
		else if(grades.toString().equals("BMINUS")) {
			System.out.println("B-");
		}
		else if(grades.toString().equals("CPLUS")) {
			System.out.println("C+");
		}
		else if(grades.toString().equals("CMINUS")) {
			System.out.println("C-");
		}
		else {
			System.out.println(grades.toString());
		}
		Result r=new Result(modules,grades);
		if(nResults<MAX_TRANSCRIPT_LENGTH) {
			transcript[nResults]=r;
		}
		nResults++;
	}

	
	/** 
	 * @return
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @return
	 */
	public int getNResults() {
		return nResults;
	}

	
	/** It returns array of results
	 * @return array of results
	 * @author 15903239
	 */
	public Result[] getTranscript() {
		Result[] trans=new Result[nResults];
		int num=0;
		for(int iterator=0;iterator<20;iterator++) {
			if(transcript[iterator]!=null) {
				trans[num]=transcript[iterator];
				num++;
			}
		}
		return trans;
	}

	
	/** set the name for student
	 * @param name
	 * @author 15903239
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/** set the result of a student
	 * @param nResults
	 * @author 15903239
	 */
	public void setnResults(int nResults) {
		this.nResults = nResults;
	}

	
	/** set the transcript of a student
	 * @param transcript
	 * @author 15903239
	 */
	public void setTranscript(Result[] transcript) {
		this.transcript = transcript;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", MAX_TRANSCRIPT_LENGTH=" + MAX_TRANSCRIPT_LENGTH + ", nResults=" + nResults
				+ ", transcript=" + Arrays.toString(transcript) + "]";
	}


}