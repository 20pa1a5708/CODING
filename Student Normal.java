class Student {
    private String name;
    private int rollNo;
    private String branch;
    private int year;
    private List<Integer> marks;
    private static int noOfStudents;
    
    public Student(String n, int rollNo, String branch, int year){
        this.name = n;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
        marks = new ArrayList<>();
        noOfStudents++;
    }
    
    public String getName(){
        return name; 
    }
    public int getRollNo(){
        return rollNo; 
    }
    public String getBranch(){
        return branch; 
    }
    public int getYear(){
        return year; 
    }
    public List<Integer> getMarks(){
        return marks; 
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int obtainedMark){
        marks.add(obtainedMark);
    }
    public void display(){
        System.out.println(rollNo+" "+name+" "+branch+" "+year);
    }
    public double computePercentage(){
        double sum = 0;
        for(Integer mark:marks){
            sum = sum + mark;
        }
        if(marks.size()==0)
            return 0;
        return sum/marks.size();
    }
    public static void displayNoStuds(){
        System.out.println("NoOfStudents="+noOfStudents);
    }
    
}
 
