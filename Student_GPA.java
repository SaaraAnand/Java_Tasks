
import java.util.*;
class Student{
   private int id;
   private String fname;
   private String address;
   private double cgpa;
   public Student(int id, String fname,String address, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.address=address;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public String getAddress() {
      return address;
   }
   public double getCgpa() {
      return cgpa;
   }
}
class JavaSort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         String address= in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname,address, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       Collections.sort(studentList, new Comparator<Student>() {
              @Override
               public int compare(Student s1, Student s2) {
                    if(s2.getCgpa()>s1.getCgpa()){
                        return 1;
                    }else if(s2.getCgpa()<s1.getCgpa()){
                        return -1;
                    }
                    return s1.getFname().compareTo(s2.getFname());
                }
        });
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
