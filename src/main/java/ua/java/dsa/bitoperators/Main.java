package ua.java.dsa.bitoperators;

public class Main {
    public static void main(String[] args) {
//        int i = 0b00000100;
//        System.out.println(i);
//        System.out.println(Integer.toBinaryString(i));
//
//        System.out.println("побітовий здвиг вправо"); //еквіваленто діленню на 2
//        System.out.println("в десятковому виді: " + (i >> 1));
//        System.out.println("в двійковому виді: " + binaryStr(i >> 1));
//
//        System.out.println("побітовий здвиг ліворуч"); //еквіваленто множенню на 2
//        System.out.println("в десятковому виді: " + (i << 1));
//        System.out.println("в двійковому виді: " + binaryStr(i << 1));
//
//        System.out.println("ділення числа на 4: " + (i >> 2));
//        System.out.println("множення числа на 4: " + (i << 2));
//
        int b1 = 0b00001001;
        int b2 = 0b00001010;
//
//        System.out.println("побітова операція І (AND)");
//        printBinary(b1);
//        printBinary(b2);
//        printBinary(b1 & b2);
//
//        System.out.println("побітова операція АБО (OR)");
//        printBinary(b1);
//        printBinary(b2);
//        printBinary(b1 | b2);
//
        System.out.println("виключаюче АБО (XOR)");
        printBinary(b1);
        printBinary(b2);
        printBinary(b1 ^ b2);
        printBinary(b1 ^ b2);
        printBinary(5 ^ 3);
//
//        System.out.println("заперечення (NOT)");
//        printBinary(b1);
//        printBinary(~b1);

//        встановлення біта в 1
//        int b = 0b11011000;
//        printBinary(b);
//        printBinary(b | 0b00000010);
//
//        //зкид біта в 0
//        printBinary(b & 0b11110111);
//
//        //перевірка конкретного біта на 1 чи 0
//        System.out.println((b & 0b00001000) > 0 ? "1" : "0");

//        int r = 64;
//        int g = 128;
//        int b = 32;
//        int alpha = 255;
//        int color = alpha << 24 | r << 16 | g << 8 | b;
//        System.out.println(Integer.toBinaryString(color));
//        int b1 = color & 0b11111111;
////      int g1 = (color & 0xFF00) >> 8;
////      int g1 = (color & 0xFF << 8) >> 8;
//        int g1 = (color & 0b1111111100000000) >> 8;
//        int r1 = (color & 0b111111110000000000000000) >> 16;
//        int alpha1 = (color & 0b11111111000000000000000000000000) >>> 24;
//        System.out.println(b1);
//        System.out.println(g1);
//        System.out.println(r1);
//        System.out.println(alpha1);

        BitArray bitArray = new BitArray(15);
        bitArray.set(0, 1);
        bitArray.set(9, 1);
        bitArray.set(5, 1);
        bitArray.set(5, 0);
        System.out.println(bitArray);
    }

    public static class BitArray {
        public int size;
        public byte[] bytes;
        private byte[] mask = new byte[]{0b00000001, 0b00000010, 0b00000100, 0b00001000, 0b00010000, 0b00100000, 0b01000000, (byte) 0b10000000};

        public BitArray(int size) {
            this.size = size;
            int sizeInBytes = size / 8;
            if (size % 8 != 0) {
                sizeInBytes +=1;
            }

            bytes = new byte[sizeInBytes];
        }

        public int get(int index) {
            int byteIndex = index / 8;
            int bitIndex = index % 8;
            return (bytes[byteIndex] & mask[bitIndex]) > 0 ? 1 : 0;
        }

        public void set(int index, int value) {
            int byteIndex = index / 8;
            int bitIndex = index % 8;
            if (value > 0) {
                bytes[byteIndex] = (byte) (bytes[byteIndex] | mask[bitIndex]);
            } else {
                bytes[byteIndex] = (byte) (bytes[byteIndex] & ~mask[bitIndex]);
            }
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < size; i++) {
                stringBuilder.append(get(i) > 0 ? '1' : '0');
            }
            return stringBuilder.toString();
        }

        public int getSize() {
            return size;
        }

        public int getSizeInBytes() {
            return bytes.length;
        }

        public byte[] getBytes() {
            return bytes;
        }
    }

    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }

    public static String binaryStr(int b) {
        return "0b" + Integer.toBinaryString(0b100000000 | (b & 0xfff)).substring(1);
    }
}