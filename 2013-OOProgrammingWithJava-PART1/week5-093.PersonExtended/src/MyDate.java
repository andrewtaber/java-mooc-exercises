import static java.lang.Math.abs;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate){
        int yearDifference;
        int thisDateNumberOfDays;
        int compareDateNumberOfDays;
        int accurateYearDifference;
       
        yearDifference = this.year - comparedDate.year;
        
        compareDateNumberOfDays = comparedDate.dayOfYear();
        thisDateNumberOfDays = (yearDifference * 365) + this.dayOfYear();
        accurateYearDifference = abs((thisDateNumberOfDays - compareDateNumberOfDays)/365);
        return accurateYearDifference;
    }
    
    public int dayOfYear() {
        int dayNumberOfThisYear = 0;
        
        for(int i = 0; i < this.month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dayNumberOfThisYear += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dayNumberOfThisYear += 30;
                    break;
                case 2:
                    dayNumberOfThisYear += 28;
                    break;
            }
        }
        
        dayNumberOfThisYear += this.day;
        
        return dayNumberOfThisYear;
    }


  
}