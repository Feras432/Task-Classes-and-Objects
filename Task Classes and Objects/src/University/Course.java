package University; // Step 1: just right click on the src folder and press new folder and name it University and you just created a new package

public class Course {
        //class properties
        String name;
        String instructer;
        int students;
        //contructor
        Course(String courseName, String courseInstructer, int courseStudents){

            name = courseName;
            instructer = courseInstructer;
            students = courseStudents;
        }
        // the getter for the name property
        public String getName(){
            return name;
        }
        // the setter for the name property
        public void setName(String newName){
            name = newName;
        }
        // the getter for the instructer property
        public String getInstructer(){
            return instructer;
        }
        // the setter for the instructer property
        public void setInstructer(String newInstructer){
            instructer = newInstructer;
        }
        // the getter for the students property
        public int getStudents(){
            return students;
        }
        // the setter for the students property
        public void setStudents(int newStudents){
            students = newStudents;
        }

        // the toString() method: step 5 
    public String toString() {
        return "Course Name: " + name + ", Instructer: " + instructer + ", Students: " + students;
         }
}