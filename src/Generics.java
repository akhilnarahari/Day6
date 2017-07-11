/**
 * Created by narahara on 7/11/2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by narahara on 7/8/2017.
 */
class vehicle{
    String regnum;
    vehicle(){

    }
    vehicle(String regnum){
        this.regnum=regnum;
        System.out.println(regnum);
    }
}
class insurance extends vehicle{
    int amount;
    insurance(int amount){
        this.amount=amount;
        System.out.println(amount);
    }

}
class gener<M,N>{
    M a;
    N b;
    gener(M a,N b){
        this.a=a;
        this.b=b;
    }
    void prin(){
        System.out.println("successfull");
    }
}
public class Generics {
    public static void main(String args[]) {
        vehicle v = new vehicle("762879");
        insurance i = new insurance(7627689);
        gener<vehicle, insurance> g=new gener<>(v,i);
        ArrayList<vehicle> al=new ArrayList();
        al.add(v);
        al.add(i);
        Iterator<vehicle> itr = al.iterator();
        //using Iterator, we can traverse only in forward direction
        for(;itr.hasNext();)
        {
            vehicle v1 = itr.next(); //returns Object
            System.out.println(v1+" ");
        }
        g.prin();
    }
}
