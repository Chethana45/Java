import java.util.Scanner;
import java.util.Arrays;

public class Student
{
    String name;
    int[] marks = new int[5];
    char[] grade = new char[5];
    int total;
    String result;
    int rank;

    void getDetails()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scan.nextLine();
        System.out.print("Enter student's English, language, maths, science, social marks(range 0 to 100): ");
        for(int i=0;i<5;i++)
        {
          marks[i] = scan.nextInt();
        }
        scan.nextLine();
    }
    void setTotal()
    {
    for(int a: marks) total+=a;
    }
    void setGrade()
    {
   for(int i=0;i<5;i++)
{
if(marks[i]>=90 && marks[i]<=100)  grade[i] = 'S';
else if(marks[i]>=80 && marks[i]<=89) grade[i] = 'A';
else if(marks[i]>=70 && marks[i]<=79) grade[i] = 'B';
else if(marks[i]>=60 && marks[i]<=69) grade[i] = 'C';
else if(marks[i]>=50 && marks[i]<=59) grade[i] = 'D';
else grade[i] = 'E';
}
    }
    void setResult()
    {
if(marks[0]>=50 && marks[1]>=50 && marks[2]>=50 && marks[3]>=50 && marks[4]>=50)
{
result = "Pass";
}
else result = "Fail";
    }
    void display()
    {
System.out.println("\nStudent Name: "+name);
System.out.println("English mark = "+marks[0]);
System.out.println("Language mark = "+marks[1]);
System.out.println("Maths mark = "+marks[2]);
System.out.println("Science mark = "+marks[3]);
System.out.println("Social mark = "+marks[4]);
System.out.println("English grade = "+grade[0]);
System.out.println("Language grade = "+grade[1]);
System.out.println("Maths grade = "+grade[2]);
System.out.println("Science grade = "+grade[3]);
System.out.println("Social grade = "+grade[4]);
System.out.println("Total = "+total);
System.out.println("Result = "+result);
    }
        public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the students: ");
        int size = scan.nextInt();
int[] passResult = new int[50];
int countPass=0,j=0,len,flag=0;
int[] passedStudentMarks = new int[50];
float classAverage=0, passPercentage;

  Student[] s = new Student[50];
for(int i=0;i<size;i++)
{
s[i] = new Student();
}
for(int i=0;i<size;i++)
{
System.out.println("For student "+(i+1)+" Enter the details");
s[i].getDetails();
s[i].setTotal();
s[i].setGrade();
s[i].setResult();
if(s[i].result.equals("Pass"))
{
passResult[i]=1;
countPass++;
}
else passResult[i]=0;
}

passPercentage =(float) countPass/size;
passPercentage*=100;
for(int i=0; i<size;i++)
{
classAverage+=(float) s[i].total/size;
}
System.out.println("Class Average: "+classAverage);
System.out.println("Pass Percentage: "+passPercentage);
System.out.println("Number of failures: "+(size-countPass));
for(int i=0;i<size;i++)
{
if(s[i].result == "Pass")
{
passedStudentMarks[j]=s[i].total;
j++;
}
}
for(int i=0;i<countPass;i++)
{
for(j=0;j<countPass;j++)
{
if(passedStudentMarks[i]>passedStudentMarks[j])
{
int temp = passedStudentMarks[i];
passedStudentMarks[i] = passedStudentMarks[j];
passedStudentMarks[j] = temp;
}
}
}
len = passedStudentMarks.length;
for(int i=0;i<len;i++)
{
for(j=i+1;j<len;j++)
  {
if(passedStudentMarks[i]==passedStudentMarks[j])
{
for(int k=j;k<len-1;k++)
{
 passedStudentMarks[k]=passedStudentMarks[k+1];
}
len--;
}
}
}
for(int i=0;i<size;i++)
{
for(j=0;j<countPass;j++)
{
if(s[i].total==passedStudentMarks[j])
{
  s[i].rank = j+1;
break;
}
else s[i].rank=0;
}
}
System.out.println("Report card of the passed students:-");
for(int i=0;i<size;i++)
{
if(s[i].rank>0)
{
s[i].display();
System.out.println("Student Rank: "+s[i].rank);
System.out.println("\n");
flag=1;
}
}
if(flag==0)
{
System.out.println("\t No one is passed");
}
}
}



