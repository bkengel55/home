/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author brand
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ninety_nine_bottles_of_beer();
    }
    public static void ninety_nine_bottles_of_beer(){
        int i;
        for(i=99;i>=1;i--){
            int j=i-1;
            System.out.println(i+ " bottles of beer on the wall, "+ i+
                    " bottles of beer take one down, pass it around, " 
                    +j+ " bottles of beer on the wall.");
        }
        
        
    }
}
