package SchoolApp;

/**
 * This is a result class used to get and set the result of a student
 * @author Ghazi Suliyanto 15903239
 *
 */
public class Result

{
	private Module module;
	private Grade grade;
	
	/**
	 * This is a constructor which sets the module and the grade.
	 * @param module
	 * @param grade
	 * @author 15903239
	 */
	public Result(Module module,Grade grade)
	{
		this.module=module;
		this.grade=grade;
	}

	/** returns the module from the result
	 * @return module from the result
	 * @author 15903239
	 */
	public Module getModule() {
		return this.module;
	}

	/** sets the module
	 * @param module
	 * @author 15903239
	 */
	public void setModule(Module module) {
		this.module = module;
	}
	
	/** returns the grade from the result
	 * @return the grade from the result
	 * @author 15903239
	 */
	public Grade getgrade() {
		return this.grade;
	}

	/** set the grade value
	 * @param grade
	 * @author 15903239
	 */
	public void setgrade(Grade grade) {
		this.grade = grade;
	}
}