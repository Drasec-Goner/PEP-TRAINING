class Date
{
    int month, day, year;
    public Date()
    {
        month = 1;
        day = 1;
        year = 2000;
    }
    public void setMonth(int month)
    {
        if(month>=1 && month<=12)
        {
            this.month = month;
        }
        else
        {
            System.out.println("Invalid month");
        }
    }
    public void setDay(int day)
    {
        if(day>=1 && day<=31)
        {
            this.day = day;
        }
        else
        {
            System.out.println("Invalid day");
        }
    }
    public void setYear(int year)
    {
        if(year>=1 && year<=2025)
        {
            this.year = year;
        }
        else
        {
            System.out.println("Invalid year");
        }
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }
    public void displayDate()
    {
        System.out.println("Date: "+month+"/"+day+"/"+year);
    }
}    
public class DateTest /*exercise4*/ {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setMonth(12);
        d1.setDay(31);
        d1.setYear(2025);
        d1.displayDate();
    }
}
