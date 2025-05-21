public class ADDTASK{
    private String title;
    private String description;
    
    public ADDTASK(String title,String description){
        this.title=title;
        this.description=description;
    }
    public String getTitle(){
        return title;
    }
    public String getDesc(){
        return description;
    }
}