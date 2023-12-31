public class CircularPattern4 {
    public static void main(String[] args) {
        String text = "CHRIST UNIVERSITY";
        int n = text.length();  // Number of characters in the text
        int radius = 10;  // Adjust the radius as needed

        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                double distance = Math.sqrt(i * i + j * j);
                if (distance <= radius && distance >= radius - 0.5) {
                    int index = (int) (Math.floor((Math.atan2(j, i) + Math.PI) / (2 * Math.PI) * n) % n);
                    System.out.print(text.charAt(index));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Expected output:CHRIST UNIVERSITY need to be display in circular shape