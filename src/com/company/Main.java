package com.company;

public class Main {

    public static byte[] Reverse(byte [] byte_array){
        for (int i=0; i<byte_array.length; i++) {
            int n = byte_array[i];
            String str = Integer.toBinaryString(n);
            if(str.length()<8) {
                while (str.length()<8){
                    str="0"+str;
                }
            }
                int end = str.length();
                int start = end-8;
                char[] dst=new char[8];
                str.getChars(start, end, dst, 0);
                str=new String(dst);

            String str2="";
            for (int j=7;j>=0;j--) {
                str2+=str.charAt(j);
            }
            if (str2.charAt(0)==1) {
                str2="11111111111111111111111"+str2;
            }
            byte_array[i]=(byte) Integer.parseUnsignedInt(str2,2);
        }
        return byte_array;
    }

    public static void main(String[] args) {
        byte[] arr = {-128,-127,-126,-1,0,1,127};
        byte[] a= Reverse(arr);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
