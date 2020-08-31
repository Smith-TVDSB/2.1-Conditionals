class Main {
  public static void main(String[] args) {
    String lastName="Stark";
    System.out.println ("Do you have a claim to the iron throne?");
    if (lastName=="Targaryen"){
      System.out.println("Yes you do Targaryen!"); 
    }
    else if (lastName=="Lannister") {
      System.out.println("Yes you do Lannister");
    }
    else if (lastName=="Baratheon"){
      System.out.println("Yes you do Baratheon");
    }
    else {
      System.out.println("Sorry you have no claim to the iron throne.");
    }// It checks each case and if none are true it does the else statement
  }
}