public class Main {
    static void towerOfHanoy(int disksCount, char initRod, char finalRod, char additionalRod)
    {
        if (disksCount == 1)
        {
            System.out.println("Move disk 1 from rod " + initRod + " to rod " + finalRod);
            return;
        }
        towerOfHanoy(disksCount-1, initRod, additionalRod, finalRod);
        System.out.println("Move disk " + disksCount + " from rod " + initRod + " to rod " + finalRod);
        towerOfHanoy(disksCount-1, additionalRod, finalRod, initRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoy(n, '1', '2', '3');  // A, B and C are names of rods
    }
}