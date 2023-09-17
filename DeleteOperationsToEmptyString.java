package gfg;

public class DeleteOperationsToEmptyString {
    public static void main(String[] args) {
        String inputString = "geekforgeekforgeekgeek";

        int deleteCount = 0;
        while (inputString.contains("geek")) {
            inputString = inputString.replaceFirst("geek", "");
            deleteCount++;
        }

        System.out.println("Number of delete operations: " + deleteCount);
    }
}
