// class Computer {
//     public void playMusic()
//     {
//         System.out.println("Music Playing...");
//     }
//     public String getMeAPen(int cost)
//     {
//         if(cost >= 10)
//             return "Pen";
//         return "Nothing";
//     }
// }

class Calculator {
    public int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }
}
public class Methods{
    public static void main(String[] args) {
        // Computer obj = new Computer();
        // obj.playMusic();
        // String str = obj.getMeAPen(12);
        // System.out.println(str);
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}