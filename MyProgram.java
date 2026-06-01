import java.util.*;
import java.io.*;
public class MyProgram
{
    public static void main(String[] args) throws IOException{

        ArrayList<Student> students = loadStudents("grades.txt");
        ArrayList<Student> honorsStudents = getHonorsStudents(students);
        
        System.out.println("Honors students of 90 and above:");
        for(Student student : honorsStudents){
            System.out.println(student);
        }
        
        removeFailingStudents(students);
        System.out.println("remaining students of 65 and above:");
        for(Student s : students){
        System.out.println(s);
    }
}
        public static ArrayList<Student> loadStudents(String filename) throws IOException {
        Scanner reader = new Scanner(new File(filename));
        ArrayList<Student> students = new ArrayList<>();
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(!line.isEmpty()){
            
            String[] parts = line.split(" ");
            String name = parts[0];
            int score1 = Integer.parseInt(parts[1]);
            int score2 = Integer.parseInt(parts[2]);
            int score3 = Integer.parseInt(parts[3]);
            students.add(new Student(name, score1,score2, score3));
        }
        }
        reader.close();
        return students;
        }
        public static ArrayList<Student>getHonorsStudents(ArrayList<Student> students){
            ArrayList<Student> honors = new ArrayList<>();
            for(Student s : students){
                if(s.getAverage() >= 90){
                    honors.add(s);
                }
            }
            return honors;
        }

        public static void removeFailingStudents(ArrayList<Student>students){
            for(int i = students.size() - 1; i>= 0; i--)
                if(students.get(i).getAverage() < 65){
                    students.remove(i);
                }
            }
    }
