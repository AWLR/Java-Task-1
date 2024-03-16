import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("Calculate the percentage of a student out of 5 Subject marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter subject 1 mark:");
        float s1 = sc.nextFloat();
        System.out.println("Enter subject 2 mark:");
        float s2 = sc.nextFloat();
        System.out.println("Enter subject 3 mark:");
        float s3 = sc.nextFloat();
        System.out.println("Enter subject 4 mark:");
        float s4= sc.nextFloat();
        System.out.println("Enter subject 5 mark:");
        float s5= sc.nextFloat();

        float sum = s1+s2+s3+s4+s5;
        float percentage = ((float) sum / 500) * 100;

        System.out.println("Percentage obtained by " + name + " is: " + percentage + "%");




    }
}
