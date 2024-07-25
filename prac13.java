class Date {
    int month = 0;
    int day = 0;
    int  year = 0;

    Date(int m, int d,int y)
    {
            month = m;
            day = d;
            year = y;
        

    }
    
    public void setmonth(int m){
        month = m;
    }
    public void getmonth()
    {
        
        System.out.println("The month is "+month);
    
    }

    public void setday(int d)
    {
        day = d;
    }
    public void getday(){
        System.out.println("The day is "+day);
    }
    
    public void setyear(int y){
        year = y;
    }
    public void getyear()
    {
        System.out.println("The year is "+year);
    
    }

    public void DisplayDate()
    {
        System.out.println(month + " / " + day + " / " + year);
       
    }


    public static void main(String[] args) {

        Date e1 = new Date(05,03,2005);
        
        e1.getClass();
        e1.setday(05);
        e1.getday();
        e1.setmonth(03);
        e1.getmonth();
        e1.setyear(2005);
        e1.getyear();
        e1.DisplayDate();

        System.out.println("\nID: 23DIT009");




    }
    
}