package dulich;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Spots extends HashSet<ScenicSpot> {

    public Spots() {
        
    }
    
    public void display(){
        System.out.println("                                                List of all tour                                                    ");
        System.out.println(" __________________________________________________________________________________________________________________ ");
        System.out.println("| Place name      | Provine    | Country      | Duration(days) | In Resort | In Hotel | Has Buffet | Fee           |");
        System.out.println("|-----------------|------------|--------------|----------------|-----------|----------|------------|---------------|");
        
    }
    
    public void addOne(ScenicSpot x){
        HashSet<ScenicSpot> list = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        boolean cont = false;
        boolean temp;
        do {
            System.out.println("Enter place name: ");
            x.setNameOfPlace(sc.nextLine());
            
            System.out.println("Enter province: ");
            x.setProvice(sc.nextLine());
            
            System.out.println("Enter country: ");
            x.setCountry(sc.nextLine());
            
            System.out.println("Enter duration: ");
            x.setDuration(sc.nextInt());
            
            System.out.println("Live in resort? (1-Yes : 0-No) ");
            x.setInResort(sc.nextLine().equals(1));
            
            System.out.println("Live in hotel? (1-Yes : 0-No) ");
            x.setInHotel(sc.nextLine().equals(1));
            
            System.out.println("Does it serve buffet? (1-Yes : 0-No) ");
            x.setHasBuffet(sc.nextLine().equals(1));
            
            System.out.println("Enter fee: ");
            x.setFee(sc.nextFloat());
            
            add(x);
            
            System.out.println("Do you want to add more? (1-Yes : 0-No) ");
            temp = sc.nextLine().equals(1);
            if(temp = true)
                cont = true;
        } while (cont);
        
    }
    
    public boolean isExist(ScenicSpot p){
        
    }
    
    public void remove(ScenicSpot p){
        
    }
    
    public float totalOfFee(){
        
    }
    
    public int totalOfDays(){
        
    }
}
