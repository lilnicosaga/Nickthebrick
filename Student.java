public class Student {
    private String name;
    private int[] scores;
    
    
    
        public Student(String name, int score1, int score2, int score3){
            this.name = name;
            scores = new int[3];
            scores[0] = score1;
            scores[1] = score2;
            scores[2] = score3;
        } 
        public String getName(){
            return name;
        
        }
        
        public Double getAverage(){
            return (scores[0] + scores[1] + scores[2]) / 3.0;
        }
      
             
        
        
        public String toString(){
            return "\n"+ name + " got an average score of " + getAverage();

    }
}
