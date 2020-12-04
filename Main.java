class Main {
  public static void main(String[] args) {

// Staff staff = new Staff("Green", true);
// staff.setIdColor("Brown");
// System.out.println(staff.getIdColor());

Principal principal = new Principal("Green", true);

System.out.println(principal.cleans());
principal.canAdmit();


// principal.idColor("Red");
// principal.parkingSpace(true);
//System.out.println(principal.getIdColor());


Teacher teacher = new Teacher("Yellow", true, true);

System.out.println(teacher.cleans());
teacher.canAdmit();

NonAcaStaff nas = new NonAcaStaff("Brown");
System.out.println(nas.cleans());
nas.canAdmit();
// System.out.println(nas.getIdColor);


//String staffName = this.getClass().getName();


 Engine eng = new Engine("Gp555");

 Car car = new Car(eng);


System.out.println(car.engine.modelName);

//Aggregation example

Parkingspace parking = new Parkingspace("Lagos Decagon","Visitor001");
Dimension dim = new Dimension(45, 55);
System.out.println(parking.calcArea(dim));

  }


    

}