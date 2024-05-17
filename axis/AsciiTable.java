public class AsciiTable {
    public static void main(String[] args) {
        System.out.println("SL-NO" + "\t" + "DECIMAL" + "\t" + "BINARY" + "\t" + "HEXA DECIMAL" + "\t" + "OCTAL");
        for (int i = 0; i < 256; i++) {
            System.out.println(i + "\t |" + i + "\t" + Integer.toBinaryString(i) + "\t |" + Integer.toHexString(i) + "\t |" + Integer.toOctalString(i));
        }
    }
}
