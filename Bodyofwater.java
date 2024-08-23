public class Bodyofwater{
    private String name;
    private int largestdiameter;
    private int avgDepth;
    private boolean issaltwater;


public Bodyofwater(String n, int l, int a, boolean sw){
    name = n;
    largestdiameter = l;
    avgDepth = a;
    issaltwater = sw;
}

public Bodyofwater(String n, int l){
    name = n;
    largestdiameter = l;
}

public String getname(){
    return name;
}

public int getlargestdiameter(){
    return largestdiameter;
}

public int getaveragedepth(){
    return avgDepth;
}

public boolean getissaltwater(){
    return issaltwater;
}

public void Setname(String n){
    name = n;
}

public void Setlargestdiameter(int ld){
    largestdiameter = ld;
}
}