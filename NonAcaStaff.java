public class NonAcaStaff extends Staff{


  NonAcaStaff(String idColor){
           super(idColor, false);

  }
@Override
    public boolean cleans(){
      return true;
    }

@Override
    public void canAdmit(){ 
      super.canAdmit(); 
      String admits = "Nope I can't";
      System.out.println(admits);
    }
@Override
    public boolean punish(){
      return false;
    }

  
}