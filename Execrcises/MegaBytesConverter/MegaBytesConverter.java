package Execrcises.MegaBytesConverter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int remainingKilobytes = kiloBytes % 1024;
        int megaBytes = kiloBytes / 1024;

        System.out.printf("%s KB = %s MB and %s KB", kiloBytes, megaBytes, remainingKilobytes);
    }
}
