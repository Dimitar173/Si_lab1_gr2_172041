import java.util.*;
class Student {
	String index;
	String firstName;
	String lastName;

    List<Integer> grades = new ArrayList<>();

	//TODO constructor
    public Student(String index, String firstName, String lastName, List<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }
    //TODO seters & getters
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


	public double getAverage() {
		//TODO
        int suma=0;
        for (int i=0; i<grades.size();i++){
            suma+=grades.get(i) ;
        }
        double prosek;
        prosek=suma/grades.size();
        return prosek;
	}

	public int ECTSCredits() {
		//TODO
        int krediti;
        int polozeni=0;

        for (int i=0; i< grades.size();i++){
            if (grades.get(i)>=6){
                polozeni++;
                krediti=polozeni*6;
            }
        }
        return krediti;
    }


}
