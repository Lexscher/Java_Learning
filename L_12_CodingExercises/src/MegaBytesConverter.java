public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(-3);
        printMegaBytesAndKiloBytes(16384 - 4201);
    }

    // Write a method, printMegaBytesAndKiloBytes, which should not return anything.
    // This should have 1 parameter of type int with the name kiloBytes.
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // if the parameter kiloBytes is less than 0, print "Invalid Value".
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            // This should convert the given kilobytes into megabytes and hold the remainder.
            int remainder = kiloBytes % 1024;
            int megaBytes = (kiloBytes - remainder) / 1024;
            // This should print the given kilobytes, along with the megabytes and remainder in the format "XX KB = YY MB and ZZ KB".
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}
