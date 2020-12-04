public class Teacher extends Staff{

    boolean hasChalk;
  // String subjectTaken;
  // Int classesTaken;
  

  Teacher(String idColor, boolean parkingSpace, boolean hasChalk){
           super(idColor, parkingSpace);
          this.hasChalk = true;
      }

  
@Override
    public boolean cleans(){
      return false;
    }

@Override
    public void canAdmit(){ 
      super.canAdmit(); 
      String admits = "Nope I can't";
      System.out.println(admits);
    }
@Override
    public boolean punish(){
      return true;
    }

}