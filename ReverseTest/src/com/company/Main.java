package com.company;

public class Main {

    public static byte[] Reverse(byte [] ByteArray){
        for (int i=0; i<ByteArray.length; i++) {
            int Element = ByteArray[i];
            String toBinaryStr = Integer.toBinaryString(Element);
            if(toBinaryStr.length()<8) {
                while (toBinaryStr.length()<8){
                    toBinaryStr="0"+toBinaryStr;
                }
            }
                int End = toBinaryStr.length();
                int Start = End-8;
                char[] Chars=new char[8];
                toBinaryStr.getChars(Start, End, Chars, 0);
                toBinaryStr=new String(Chars);

            String Str2="";
            for (int j=7;j>=0;j--) {
                Str2+=toBinaryStr.charAt(j);
            }
            if (Str2.charAt(0)==1) {
                Str2="11111111111111111111111"+Str2;
            }
            ByteArray[i]=(byte) Integer.parseUnsignedInt(Str2,2);
        }
        return ByteArray;
    }

    public static void main(String[] args) {
        byte[] arr = {-128,-127,-126,-1,0,1,127};
        byte[] a= Reverse(arr);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
