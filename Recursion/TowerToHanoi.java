/**
 * TowerToHanoi
 */
public class TowerToHanoi {

    public static void towerToHanoi(int n, String src, String helper, String desc) {
        if(n == 1){
            System.out.println("Transfer Desk "+ n +" from "+src+" to "+desc);
            return;
        }

        towerToHanoi(n - 1, src, desc, helper);
        System.out.println("Transfer Desk "+ n +" from "+src+" to "+desc);
        towerToHanoi(n - 1, helper, src, desc);
    }
    public static void main(String[] args) {
        int n = 4;
        towerToHanoi(n, "S", "H", "D");
    }
}