// Method Overloading
class Test{
    void read(int a,int b){
        System.out.println("I am reading");
    }
    void read(String a,int b){
        System.out.println("I am reading book");
    }
    public static void main(String[]args){
        Test test=new Test();
        test.read('a',5); // Automatic Promotion
    }
}
// Method Overriding
class Exam{
    void Unit(){
        System.out.println("Unit Test");
    }
}
class Oral{
    void Unit(){
        System.out.println("Unit Test");
    }
    public static void main(String[]args){
        Oral oral=new Oral();
        oral.Unit();

    }
}