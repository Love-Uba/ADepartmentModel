public class Principal extends Staff{

  Principal(String idColor, Boolean parkingSpace){
           super(idColor, parkingSpace);

      }

@Override
public String getIdColor(){
     return "Black";
}

@Override
    public boolean cleans(){
      return false;
    }

@Override
    public void canAdmit(){ 
      super.canAdmit(); 
      String admits = "Yeapie I can";
      System.out.println(admits);
    }
@Override
    public boolean punish(){
      return true;
    }
//   public void setParkingSpace(){
//      return parkingSpace;
//   }

//   public boolean getParkingSpace(boolean parkingSpace){
//      this.parkingSpace = parkingSpace;
//   }
}