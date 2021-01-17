package domain;

import java.util.StringJoiner;

/**
 * Клас {@code Manager} представляє об'єкт менеджера.
 * 
 * @see  Artist
 * @see  TechnicalWriter
 * @see  GraphicIllustrator
 * @see  Employee
 * @see  Editor
 */
public class Manager extends Employee {
	
	/**
	 * Ініціалізує новий об'єкт {@code Manager} зі всіма параметрами.
	 * 
	 * @param employees співробітники
	 * @param name ім'я робітника
	 * @param jobTitle посада робітника
	 * @param level рівень робітника
	 * @param dept відділ робітника
	 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Строкове представлення об'єкта {@code Manager}
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює новий об'єкт {@code Manager} з параметром співробітників менеджера.
     * 
     * @param employees співробітники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює новий об'єкт {@code Manager}.<br>
     * При цьому ініціалізується массив {@link Manager#employees}.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Cпівробітники менеджера
     */
    private Employee[] employees;
    
    /**
     * Повертає строку імен співробітників менеджера.<br> 
     * Ім'я менеджерів розділені символом: <b>,</b>
     * 
     * @return Імена співробітників менеджера
     */
    public String getEmployees() {
        /*String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;*/
    	StringJoiner sj = new StringJoiner(", ");
    	for (Employee e : employees) {
    		sj.add(e.getName());
        }
    	return sj.toString();
    }
    
    /**
     * Встановлює массив співробітників менеджера. {@link Manager#employees}
     * 
     * @param employees співробітники
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    
    /**
     * Повертає массив співробітників менеджера. {@link Manager#employees}
     * 
     * @return Массив співробітників менеджера
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}