public class Staff {

   private String idColor;
   private boolean parkingSpace;
  

    Staff(String idColor, Boolean parkingSpace) {
        this.idColor = idColor;
        this.parkingSpace = parkingSpace;

    }

    public boolean cleans(){
        return false;
    }

    public void canAdmit(){    
      String admits = "Admissions";
      System.out.println(admits);
    }


    public boolean punish(){
      return false;
    }

    public String getIdColor() {
        return idColor;
    }

    public void setIdColor(String idColor) {
        this.idColor = idColor;
    }

    public boolean getParkingSpace(){
        return parkingSpace;
    }

    public void setParkingSpace(boolean parkingSpace){
        this.parkingSpace = parkingSpace;
    }
}
