public class Student {
    int id;
    int cprogramming;
    int DSA;
    int Math;
    int totalMarks;

    public int sum(){
        int sum = cprogramming + DSA+Math;
        System.out.println("Sum of marks is: "+sum);
        return sum;
    }
    public float average(){
        int sum = cprogramming + DSA + Math;
        int average = sum/4;
        System.out.println("The average of marks is: "+average);
        return average;
    }
    public void maltiply(){
        int mul = cprogramming*DSA*Math;
        System.out.println("Multiplecation of Marks is: "+mul);
    }
    public void percentage(){
        int mysum = sum();
        int percentage = (mysum*100)/totalMarks;
        System.out.println("persentage is: "+percentage + "%");
    }
}
