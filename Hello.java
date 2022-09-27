import java.net.SocketPermission;
import java.util.*;
public class Hello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        ArrayList<String> Student = new ArrayList<String>(n);
        ArrayList<String> Course = new ArrayList<String>(10);
        System.out.println("Enter the uid , name and Section of Student:");
        for(int i = 0;i<n;i++){
            String element = sc.nextLine();
            Student.add(element);
        }
        System.out.println("Enter the three course details of Student");
        for(int i = 0;i<3;i++){
            String element = sc.nextLine();
            Course.add(element);
        }
        Student.addAll(Course);
        for(int i = 0;i<Student.size();i++){
            System.out.print(Student.get(i)+" ");
        }
        Student.trimToSize();
        // for(int at :a1){
        //         System.out.print(at);
        // }
        System.out.println('\n');
        if(!Student.isEmpty()){
            System.out.println("now it is not empty we will delete a course");
            Student.remove(4);
        }
        for(String itr:Student){
            System.out.print(itr+" ");
        }
        System.out.println("hello world ");
    }
}