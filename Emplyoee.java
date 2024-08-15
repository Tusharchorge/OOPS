class Emplyoee{
    private int empid; // data hiding
    public void set(int eid){
      empid=eid;
    }
    public int get(){
      return empid;
    }
  }
  class Company{
      public static void main(String[] args) {
          Emplyoee emplyoee=new Emplyoee();
          emplyoee.set(101);
          System.out.println(emplyoee.get());
      }
  }