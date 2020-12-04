public class Parkingspace{

  String parkingSpaceLocation;
  String parkingTicketid;
  Dimension dimension;

  public Parkingspace(String parkingSpaceLocation,
  String parkingTicketid){
    this.parkingSpaceLocation = parkingSpaceLocation;
    this.parkingTicketid = parkingTicketid;

  }

  public int calcArea(Dimension d){
    int area = d.length * d.breadth;
    return area;
  }
}