
import static java.lang.Math.abs;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    public int differenceInYears(MyDate comparedDate){
        int yearDifference = 0;
        int thisDateNumberOfDays = 0;
        int compareDateNumberOfDays = 0;
        int accurateYearDifference = 0;
       
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
