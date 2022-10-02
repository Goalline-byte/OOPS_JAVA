class Student
{
    String name;
    int age;
    public void getinfo()
    {
        System.out.println("the name of a student is " + this.name);
        System.out.println("the age of a student is  " + this.age);

    }

}
class OOPS{
    public static void main(String args[])
    {
         Student s1 = new Student();
         s1.name = "goalline_byte";
         s1.age = 21;
         s1.getinfo();

    }
}
