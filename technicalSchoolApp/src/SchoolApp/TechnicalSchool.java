package SchoolApp;

/** This is a class for Technical School. It
 * determines different types of courses offered
 * by the school
 * @author Ghazi Suliyanto 15903239
 *
 */
public class TechnicalSchool {
	private Module[] offerings;

	/** This is the constructor
	 * which sets the offerings for the semester.
	 * 
	 */
	public TechnicalSchool() {
		this.offerings=TechnicalSchool.semesterOneModuleOfferings();
	}

	/** returns the semester modules
	 * @return the semester modules
	 * @author 15903239
	 */
	public Module[] getSemesterOfferings() {
		return offerings;
	}

	/** returns the module based on the code
	 * @param code
	 * @return the module based on the code
	 * @author 15903239
	 */
	public Module lookup(String code) {
		Module modules=null;
		for(int iterator=0;iterator<13;iterator++) {
			if(offerings[iterator].getCode().equals(code)) {
				return offerings[iterator];
			}
		}
		return modules;
	}
	
	/** returns an array of semester modules
	 * @return an array of semester modules
	 * @author 15903239 
	 */
	private static Module[] semesterOneModuleOfferings() {
		Module m[]=new Module[13];
		m[0]=new Module(ModuleType.TAUGHT,"Programming","PROG101",Level.ONE);
		m[1]=new Module(ModuleType.TAUGHT,"Statistics","STAT102",Level.ONE);
		m[2]=new Module(ModuleType.TAUGHT,"Database Design","DATA222",Level.TWO);
		m[3]=new Module(ModuleType.TAUGHT,"Object-oriented Programming","PROG202",Level.TWO);
		m[4]=new Module(ModuleType.TAUGHT,"Information Systems","INSY313",Level.THREE);
		m[5]=new Module(ModuleType.SELF_STUDY,"Wen Services","WEBS332",Level.THREE);
		m[6]=new Module(ModuleType.SELF_STUDY,"Technology Applications","TECH103",Level.ONE);
		m[7]=new Module(ModuleType.SELF_STUDY,"Theory of Computation","THEO111",Level.ONE);
		m[8]=new Module(ModuleType.SELF_STUDY,"Model Checking","MODC233",Level.TWO);
		m[9]=new Module(ModuleType.SELF_STUDY,"Topology","TOPG233",Level.TWO);
		m[10]=new Module(ModuleType.SELF_STUDY,"Logic","LOGI321",Level.THREE);
		m[11]=new Module(ModuleType.PROJECT,"Web App Dev","PROJ399",Level.THREE);
		m[12]=new Module(ModuleType.CLIENT_PROJECT,"Great Code Company","EXTO396",Level.THREE);
		return m;
	}
	
	/** Check if the student is certified
	 * @param student
	 * @return true if the student is certified
	 * @author 15903239
	 */
	public boolean isCertified(Student student) {
		Result results[]=student.getTranscript();
		int first=0, second=0, third=0, fourth=0;
		int taught=0, self_study=0;
		for(int num=0;num<results.length;num++) {
			ModuleType m=results[num].getModule().getType();
			Level levels=results[num].getModule().getLevel();
			boolean parameter=results[num].getgrade().isPass();
			if(parameter) {
				if(levels==Level.ONE) {
					if(m==ModuleType.TAUGHT || m==ModuleType.SELF_STUDY) {
						first++;
					}
				}
				else if(levels==Level.TWO) {
					second++;
					if(m==ModuleType.TAUGHT) {
						taught++;
					}
				}
				else if(levels==Level.THREE) {
					third++;
					if(m==ModuleType.SELF_STUDY) {
						self_study++;
					}
				}
				if(m==ModuleType.PROJECT || m==ModuleType.CLIENT_PROJECT) {
					fourth++;
				}
			}

		}
		if(first>=3 && (second>=3 && taught>1) && (third>=4 && self_study>=2) && fourth>=1) {
			return true;
		}
		else {
			return false;
		}
	}

}