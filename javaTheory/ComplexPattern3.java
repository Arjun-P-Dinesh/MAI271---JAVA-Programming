public class ComplexPattern3 {
    public static void main(String[] args) {
        String text = "CHRIST UNIVERSITY";
        int n = text.length();  // Number of characters in the text

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
           
            for (int k = i; k < n; k++) {
                
                System.out.print(text.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}
