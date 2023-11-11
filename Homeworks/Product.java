package Homeworks;
import java.util.Scanner;
public class Product {
    double price_ROL;
    String name;
    double price_RON;
    Product(double price, String name){
        this.price_ROL= price;
        this.name= name;
        this.price_RON= (price/10000);

    }
    public void displayProduct(){
        Scanner input= new Scanner(System.in);
        System.out.println("Alege moneda: ");
        String text = input.next();
        if(text.equals("ROL")){
            System.out.println("Produs: " + this.name);
            System.out.println("Pretul acestui produs: " + this.price_ROL);
        }
        else if(text.equals("RON")){
            System.out.println("Produs: " + this.name);
            System.out.println("Pretul acestui produs: " + this.price_RON);      
        }
    }
    public void getPrice(){
        System.out.println("Pret: " + price_ROL);

    }   
    public void setPrice( double new_price ){
        price_ROL= new_price;
        
    }
    public void getPriceInRON(){
        
        System.out.println("Pret in RON: " + price_RON);

    }     
    public void setPriceInRON( double new_price ){
         price_RON= new_price;
        

    }
    public static void main(String[] args) {
        Product prod1= new Product(1000000, "Produs1");
        Product prod2 = new Product(1500000, "Produs2");
        prod1.displayProduct();
        prod2.displayProduct();
        prod1.setPriceInRON(10.25);
        prod2.setPriceInRON(10.25);
        prod1.displayProduct();
        prod2.displayProduct();
        prod1.getPriceInRON();
        prod2.getPriceInRON();

    }
}
