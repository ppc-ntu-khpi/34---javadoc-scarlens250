package domain;

/**
 * Клас {@code Editor} представляє об'єкт редактора.
 * 
 * @see  TechnicalWriter
 * @see  Manager
 * @see  GraphicIllustrator
 * @see  Employee
 * @see  Artist
 */
public class Editor extends Artist {
	
	/**
	 * Ініціалізує новий об'єкт {@code Editor} зі всіма параметрами.
	 * 
	 * @param electronicEditing електронна обробка
	 * @param skiils навики робітника
	 * @param name ім'я робітника
	 * @param jobTitle посада робітника
	 * @param level рівень робітника
	 * @param dept відділ робітника
	 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює новий об'єкт {@code Editor} з параметром навиків редактора та електронної обробки.
     * 
     * @param electronicEditing електронна обробка
     * @param skiils навики робітника
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює новий об'єкт {@code Editor} з параметром електронної обробки.
     * 
     * @param electronicEditing електронна обробка
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює новий об'єкт {@code Editor}.<br>
     * При цьому електронна обробка {@link Editor#electronicEditing} увімкнена.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /**
     * Строкове представлення об'єкта {@code Editor}
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * Електронна обробка
     */
    private boolean electronicEditing;
    
    /**
     * Повертає перевагу редактора.<br>
     * Якщо у редактора є навик електронної обробки – <b>true</b>
     * 
     * @return Перевага редактора
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    
    /**
     * Встановлює поле електронної обробки. {@link Editor#electronicEditing}
     * 
     * @param electronic електронна обробка
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}