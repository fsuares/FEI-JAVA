


package ex1;


public class Datas {
    private int day, mounth, year;
    private String mn;
    private int day1, year1;
    private int completeyear, uncompleteyear;

    public Datas(int day, int mounth, int year){
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }
    public void setDay(int day){
        day = ((day >= 0 && day <= 31)? day : 0);
        this.day = day;
    }
    public void setMounth(int mounth){
        mounth = ((mounth >= 0 && mounth <= 12)? mounth : 0);
        this.mounth = mounth;
    }
    public void setYear(int year){
        year = ((year >= 0)? year : 0);
        this.year = year;
    }




    public Datas(String mn, int day1, int year1){
        setMn(mn);
        setDay1(day1);
        setYear1(year1);
    }
    public void setMn(String mn){
        this.mn = mn;
    }
    public void setDay1(int day1){
        day1 = ((day1 >= 0 && day1 <= 31)? day1 : 0);
        this.day1 = day1;
    }
    public void setYear1(int year1){
        year1 = ((year1 >= 0)? year1 : 0);
        this.year1 = year1;
    }


    public Datas(int complete, int uncomplateyear){
        setCompleteYear(completeyear);
        setUncompleteYear(uncompleteyear);
    }
    public void setCompleteYear(int completeyear){
        completeyear = ((completeyear >= 0)? completeyear : 0);
        this.completeyear = completeyear;
    }
    public void setUncompleteYear(int uncomplateyear){
        uncompleteyear = ((uncomplateyear >= 0)? uncomplateyear : 0);
        this.uncompleteyear = uncompleteyear;
    }

    public void setCalander(int day, int mounth, int year){
        setDay(day);

        setMounth(mounth);

        setYear(year);

    }
    public void setCalander(int day1,int year1){

        setMounth(day1);

        setYear(year1);
    }
    public void setCalander(String mn){
        setMn(mn);
    }
    public void setCalander(int completeyear){
        setCompleteYear(completeyear);
    }
    public void setCalander1(int uncomplateyear){
        setUncompleteYear(uncomplateyear);
    }

    public int getDay(){
        return day;
    }
    public int getMounth(){
        return mounth;
    }
    public int getYear(){
        return year;
    }
    public int getDay1(){
        return day1;
    }
    public String getMn(){
        return mn;
    }
    public int getYear1(){
        return year1;
    }
    public int getCompleteYear(){
        return completeyear;
    }
    public int getUncompleteYear(){
        return uncompleteyear;
    }
    public int getCalander(){
        int a = completeyear;
        int b = uncompleteyear;
        int totaly = a-b;
        return totaly;
    }
}
