package SchoolApp;

/** 
 * This is a class for module which holds all the details 
 * of a particular module which student has opted for.
 * @author Ghazi Suliyanto 15903239
 *
 */
public class Module {
	private String title;
	private String code;
	private Level level;
	private ModuleType type;


	/**
	 * This is a constructor which has the following parameters for a module
	 * @param type
	 * @param title
	 * @param code
	 * @param level
	 * @author 15903239
	 */
	public Module(ModuleType type,String title, String code, Level level) {
		this.title = title;
		this.code = code;
		this.level = level;
		this.type = type;
	}
	
	/**
	 * returns the title of a module
	 * @return the title of a module
	 * @author 15903239
	 */
	public String getTitle() {
		return title;
	}
	
	/** 
	 * returns the code of a module
	 * @return the code of a module
	 * @author 15903239
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return
	 * @author 15903239
	 */
	public Level getLevel() {
		return level;
	}
	
	/**
	 * returns the type of a module
	 * @return the type of a module
	 * @author 15903239
	 */
	public ModuleType getType() {
		return type;
	}
	
	/**
	 * sets the tile of a module
	 * @param title
	 * @author 15903239
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * sets the code of a module
	 * @param code
	 * @author 15903239
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * sets the level of a module
	 * @param level
	 * @author 15903239
	 */
	public void setLevel(Level level) {
		this.level = level;
	}
	
	/**
	 * sets a type of a module
	 * @param type
	 * @author 15903239
	 */
	public void setType(ModuleType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Module [title=" + title + ", code=" + code + ", level=" + level + ", type=" + type + "]";
	}


}