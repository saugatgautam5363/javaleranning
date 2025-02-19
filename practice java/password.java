public class password {
    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMLOPQRSTUVWZYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";
        String allChars = uppercase + lowercase + numbers + specialChars;
        StringBuilder password = new StringBuilder();
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        System.out.println("Generated password: " + password.toString());
    }
}
