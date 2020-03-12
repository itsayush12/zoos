import java.util.*;
class zoos{
    static Scanner scn = new Scanner(System.in);

    public static boolean check(int z, int o){
        int num = z;
        int mul = num * 2;
        if(mul==o){
            return true;
        }
        return false;
    }
    public static void main(String []args){
        String str = scn.next();
        int countoz=0;
        int countoo=0;
        int i=0;
        int length = str.length();
        while(length!=0){
            char ch = str.charAt(i);
            if(ch=='z'){
                countoz++;
            }else{
                countoo++;
            }
            i++;
            length--;
        }

        boolean ans = check(countoz, countoo);
        if(ans==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}