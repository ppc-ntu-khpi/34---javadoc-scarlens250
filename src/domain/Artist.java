package domain;

import java.util.StringJoiner;

/**
 * Клас {@code Artist} представляє об'єкт артиста.
 * 
 * @see  TechnicalWriter
 * @see  Manager
 * @see  GraphicIllustrator
 * @see  Employee
 * @see  Editor
 */

public class Artist extends Employee {
	
	/**
	 * Ініціалізує новий об'єкт {@code Artist} зі всіма параметрами.
	 * 
	 * @param skiils навики робітника
	 * @param name ім'я робітника
	 * @param jobTitle посада робітника
	 * @param level рівень робітника
	 * @param dept відділ робітника
	 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт {@code Artist} з параметром навиків артиста.
     * 
     * @param skiils навики робітника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Створює новий об'єкт {@code Artist}. <br>
     * При цьому ініціалізується массив {@link Artist#skiils}.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Строкове представлення об'єкта {@code Artist}
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
    
    /**
     * Навики артиста
     */
    private String[] skiils;
    
    /**
     * Повертає строку навиків артиста.<br>
     * Навики розділені символом: <b>,</b>
     * 
     * @return Навики артиста
     */
    public String getSkills() {
        /*String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;*/
    	StringJoiner sj = new StringJoiner(", ");
    	for (String skiil : skiils) {
    		sj.add(skiil);
        }
    	return sj.toString();
    }
    
    /**
     * Встановлює массив навиків артисту. {@link Artist#skiils}
     * 
     * @param skills навики робітника
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }
    
    /**
     * Повертає массив навиків артиста. {@link Artist#skiils}
     * 
     * @return Массив навиків артиста
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}