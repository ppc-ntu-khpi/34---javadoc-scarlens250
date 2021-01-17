package domain;

/**
 * Клас {@code Employee} представляє об'єкт працівника.
 * 
 * @see  TechnicalWriter
 * @see  Manager
 * @see  GraphicIllustrator
 * @see  Artist
 * @see  Editor
 */
public class Employee {
	
    /**
     * Строкове представлення об'єкта {@code Employee}
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + 
        		jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Ім'я робітника
     */
    private String name;
    
    /**
     * Посада робітника
     */
    private String jobTitle;
    
    /**
     * Ідентифікатор робітника
     */
    private int ID;
    
    /**
     * Рівень робітника
     */
    private int level;
    
    /**
     * Відділ робітника
     */
    private String dept;

   // private static int employeesCount = 0;
    
    /**
     * Створює новий об'єкт {@code Employee}.
     * 
	 * @param name ім'я робітника
	 * @param jobTitle посада робітника
	 * @param level рівень робітника
	 * @param dept відділ робітника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    
    /**
     * Створює новий об'єкт {@code Employee}.<br>
     * Ініціалізується ідентифікатор {@link Employee#ID} робітника 
     *		 цілим числом в діапазоні <b>0-1000</b>
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    
    /**
     * Встановлює поле посади робітника. {@link Employee#jobTitle}
     * 
     * @param job посада робітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    
    /**
     * Повертає посаду робітника {@link Employee#jobTitle}
     * 
     * @return посада робітника
     */
    public String getJobTitle() {
        return jobTitle;
    }
    
    /**
     * Повертає ім'я робітника {@link Employee#name}
     * 
     * @return ім'я робітника
     */
    public String getName() {
        return name;
    }
    
    /**
     * Встановлює поле і визначає рівень робітника. {@link Employee#level}
     * 
     * @param level рівень робітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    
    /**
     * Повертає рівень робітника {@link Employee#level}
     * 
     * @return рівень робітника
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Повертає відділ робітника {@link Employee#dept}
     * 
     * @return відділ робітника
     */
    public String getDept() {
        return dept;
    }
    
    /**
     * Встановлює поле відділа робітника. {@link Employee#dept}
     * 
     * @param dept відділ робітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    /**
     * Встановлює поле імені робітника. {@link Employee#name}.<br>
     * Якщо ім'я вірне і відповідає RegExp, встановлюється значення параметру <b>name</b>.<br>
     * Якщо ім'я не вірне – встановлюється значення <b>John Doe</b>.
     * 
     * @param name ім'я робітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}