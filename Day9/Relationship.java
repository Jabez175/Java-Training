class Battery{
    void powersupply(){
        System.out.println("still have 40% power");
    }
    }
class Remote{
    Battery miniBattery = new Battery(); // has a relationship
    void changechannel(){
        miniBattery.powersupply();
        System.out.println("channel supply");
    }
    void changevolume(){
        System.out.println("Change volume");
    }
}
/*
Inheritance -> is a relationship
abstraction -> has a relationship

-> composition -> tightly coupled -> child object can not exists without parent object 
-> aggregation -> weakly coupled -> 
*/

//aggregation
class TV{
    Remote tvremote;
    TV(Remote tvremote)    {
        this.tvremote=tvremote;
    }
    void inc(){
        tvremote.changevolume();
    }
}
class Relationship{
    public static void main(String[] args) {
        /*composition
        Remote tv = new Remote();
        tv.changechannel();
        */
       Remote r = new Remote();
       TV sony = new TV(r);
       sony.inc();
    }
}