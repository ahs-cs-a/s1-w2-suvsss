public class BodyOfWaterMain {
    public static void main(String[] args) {
        Bodyofwater b1 = new Bodyofwater("Lake superior", 500, 450, false);
        Bodyofwater b2 = new Bodyofwater("Gulf of Mexico", 1050, 1000, true);
        Bodyofwater b3 = new Bodyofwater("Lake Michigan", 550);
        Bodyofwater b4 = new Bodyofwater("Lake Merrit", 700);

        System.out.println(b1.getname());
        System.out.println(b1.getlargestdiameter());
        System.out.println(b1.getaveragedepth());
        System.out.println(b1.getissaltwater());
        
        b1.Setname("Lake Kentucky");
        System.out.println(b1.getname());
        
    
    }
}
