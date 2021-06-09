package Task;

import java.util.Scanner;

class DataInput {
    private Scanner scan = new Scanner(System.in);

    public String dataInput() {
        System.out.println("Input: ");
        return scan.nextLine();
    }
    public void output(String out) {
        System.out.println("Output: ");
        System.out.println(out);
    }

}