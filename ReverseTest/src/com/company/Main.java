package com.company;

public class Main {

    public static byte[] Reverse(byte [] byteArray){
        for (int i=0; i<byteArray.length; i++) {
            int element = byteArray[i];
            String toBinaryStr = Integer.toBinaryString(element);
            if(toBinaryStr.length()<8) {
                while (toBinaryStr.length()<8){
                    toBinaryStr="0"+toBinaryStr;
                }
            }
                int end = toBinaryStr.length();
                int start = end-8;
                char[] Chars=new char[8];
                toBinaryStr.getChars(start, end, Chars, 0);
                toBinaryStr=new String(Chars);

            String str2="";
            for (int j=7;j>=0;j--) {
                str2+=toBinaryStr.charAt(j);
            }
            if (str2.charAt(0)==1) {
                str2="11111111111111111111111"+str2;
            }
            byteArray[i]=(byte) Integer.parseUnsignedInt(str2,2);
        }
        return byteArray;
    }

    public static void main(String[] args) {
        byte[] arr = {-128,-127,-126,-1,0,1,127};
        byte[] a= Reverse(arr);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
