import java.util.Scanner;

public class QRCardVerifier {

    public boolean verifyQRCard(String cardData) {
        if (cardData == null || cardData.isEmpty()) {
            System.out.println("Error: QR code data is missing!");
            return false;
        }

        if (cardData.startsWith("QR-")) {
            System.out.println("QR Card verified successfully: " + cardData);
            return true;
        } else {
            System.out.println("Invalid QR Card!");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QRCardVerifier qrVerifier = new QRCardVerifier();

        System.out.print("Enter QR Card Code: ");
        String userQRInput = scanner.nextLine();

        boolean isValid = qrVerifier.verifyQRCard(userQRInput);

        if (isValid) {
            System.out.println("Access granted! Welcome to the Amusement Park!");
        } else {
            System.out.println("Access denied! Please contact an administrator.");
        }

        scanner.close();
    }
}
