class Students
{
    String name, branch, clgName, city, country;
    int age, rollNo;
    
    public void getinfo()
    {
        System.out.println("The name of a student is " + this.name);
        System.out.println("The age of a student is  " + this.age);
        System.out.println("The Branch of a student is" +this.branch);
        System.out.println("The college name of a student is" +this.clgName);
        System.out.println("The roll no. of a student is" +this.rollNo);
        System.out.println("The city of a student is" +this.city);
        System.out.println("The country of a student is" +this.country);

    }

}
class OOPS{
    public static void main(String args[])
    {
         Students s1 = new Students();
         Students s2 = new Students();
        
         s1.name = "goalline_byte";
         s1.age = 21;
         s1.branch = "CSE";
         s1.clgName = "RCEW";
         s1.rollNo = 13;
         s1.city = "Jaipur";
         s1.country = "India";
             
         s2.name = "Aradhna";
         s2.age = 21;
         s2.branch = "EE";
         s1.clgName = "RTU";
         s1.rollNo = 20;
         s1.city = "Lucknow";
         s1.country = "India";
              
         s1.getinfo();
         s2.getinfo();

    }
}
