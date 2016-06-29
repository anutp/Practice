package WildCard;


public class WildCard {

    public static void showXY(Coords<? super ThreeD> ob){
        for(int i = 0; i < ob.coords.length; i++){
            System.out.println("X = " +ob.coords[i].x +" Y = " +ob.coords[i].y);
        }
    }
    
    public static void main(String[] args) {
        
        TwoD[] twod = {new TwoD(1, 2), new TwoD(3, 4)};
        
        ThreeD[] threed = {new ThreeD(1, 2, 3), new ThreeD(1, 2, 4)};
        
        FourD[] fourd = {new FourD(1, 2, 3, 4), new FourD(1, 2, 4, 5)};
        
        Coords<TwoD> ob = new Coords<TwoD>(twod);
        Coords<ThreeD> ob1 = new Coords<ThreeD>(threed);
        Coords<FourD> ob2 = new Coords<FourD>(fourd);
        
        
        showXY(ob);
        showXY(ob1);
//        showXY(ob2);
        
    }

}
