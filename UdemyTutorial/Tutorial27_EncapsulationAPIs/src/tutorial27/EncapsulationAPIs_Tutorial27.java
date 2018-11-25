package tutorial27;

public class EncapsulationAPIs_Tutorial27 {
 public static void main (String[] args){
// Encapsulation --------------------       Hideaway implementation details within your class and just provide a public API programming interface and reduce two classes tightly coupled
     Plant plant1 = new Plant();
     plant1.setName("olive");
     System.out.println(plant1.getName());

     plant1.getData();
 }
}
class Plant{
    public static final int id =4;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        //now nobody can enter wrong values for name , that is called encapsulation, this can be done by setters and getters.
        if (Character.isUpperCase(name.charAt(0)) == true){
            this.name = name;
        }else{
            System.out.println(name + " is wrong");
        }
    }

    private int calculateGrowthForecast(){  //this method use only within the class
        return 9;
    }

    public void getData(){
        String data = "Results are : " + calculateGrowthForecast();
        System.out.println(data);
    }
}