package main.excel;

class Raspisanie 
{
    private String monday, tuesday, wednesday, thursday, friday, total;

    public Raspisanie(String monday, String tuesday, String wednesday, 
            String thursday, String friday, String total)
    {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.total = total;
    }
    
    public String getMonday()
    {
        return monday; 
    }
    
    public void setMonday(String monday) 
    {
        this.monday = monday;
    }
    
    public String getTuesday()
    {
        return tuesday; 
    }
    
    public void setTuesday(String tuesday) 
    {
        this.tuesday = tuesday;
    }
    
    public String getWednesday()
    {
        return wednesday; 
    }
    
    public void setWednesday(String wednesday) 
    {
        this.wednesday = wednesday;
    }
    
    public String getThursday()
    {
        return thursday; 
    }
    
    public void setThursday(String thursday) 
    {
        this.thursday = thursday;
    }
    
    public String getFriday()
    {
        return friday; 
    }
    
    public void setFriday(String friday) 
    {
        this.friday = friday;
    }
    
    public String getTotal()
    {
        return total; 
    }
    
    public void setTotal(String total) 
    {
        this.total = total;
    }
}