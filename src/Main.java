public class Main {
    public static void main(String[] args) {



        //condition -- boolean
        //  < less than
        //  > greater than
        // <= less than or equal to
        // >= greater than or equal to
        // == equal to -- the same as
        // != not equal to

        double fuelLevel = .05;
        if(fuelLevel < .25)
            System.out.println("stop for gas");
        double walmartGasPrice=2.95, chevronGasPrice=3.15;

        if(walmartGasPrice<chevronGasPrice)
            System.out.println("stop at walmart");
        else
            System.out.println("stop at chevron");

        String craving = "";

        if(craving.equals("mcnuggets"))
            System.out.println("stop at McDonald's");
        else if(craving.equals("real chicken"))
            System.out.println("stop at Popeyes");
        else if(craving.equals("whopper"))
            System.out.println("stop at bk");
        else
            System.out.println("stop at in-and-out");




    }
}