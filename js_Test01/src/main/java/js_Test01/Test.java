package js_Test01;

public class Test {

	private static boolean exists(int n[], int index) {
        for (int i = 0; i < n.length; i++) {
            if(n[i] == index)
                return true;
        }
        return false;
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int n[] = new int[4];
        int index = 0;
        for(int i = 0; i<n.length;i++) {
            do {
                index = (int)(Math.random()*10);
            }while(exists(n,index));
            n[i] = index;
        }
        for(int i = 0; i<n.length; i++)
        System.out.print(n[i]+" ");
    }
}
