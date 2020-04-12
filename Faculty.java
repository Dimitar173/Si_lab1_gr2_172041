package faculty;

public class facultyFeature {
    List <Student> students;
    String faculty;
    String university;
    public facultyFeature(String faculty, String university){
        this.university=university;
        this.faculty=faculty;
    }

   public void insertStudnets (Student student){
        this.students.add(student);
   }
    public Student bestOfGenerationStudent(){
        int flag=1;
        int max;
        Student bestStudent=new Student()
        for(student:this.students){
            if(flag){
                max=student.getAverage();
                bestStudent=student;
                flag=0;
            }
            if(max<student.getAverage()){
                max=student.getAverage;
                bestStudent=student;
            }
        }
        return bestStudent;
    }
}