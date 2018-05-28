package com.nio.test;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Hello world!
 *
 */
public class Test1
{
    public static void main( String[] args )
    {
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile("C:\\Users\\Administrator\\Desktop\\github.txt","rw");
            FileChannel fileChannel=randomAccessFile.getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocate(48);

            int readSize=fileChannel.read(byteBuffer);
            while(readSize>0)
            {
                System.out.println(new String(byteBuffer.array()));
                byteBuffer.flip();
                readSize=fileChannel.read(byteBuffer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
