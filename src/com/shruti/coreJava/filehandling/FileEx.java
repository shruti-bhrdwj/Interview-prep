package com.shruti.coreJava.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

    public static void main(String[] args) throws IOException {
        String s="hi how are u";
        //Byte
        FileOutputStream fos=new FileOutputStream("b.txt",true);
        byte b[]=s.getBytes();
        fos.write(b);
        System.out.println("data has been put into the file");
        FileInputStream fis=new FileInputStream("b.txt");
        int i=0;
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }

        fos.close();
    }

}
