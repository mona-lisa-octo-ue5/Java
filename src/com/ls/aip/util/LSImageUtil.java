package com.ls.aip.util;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class LSImageUtil {
    public LSImageUtil(){

    }
    public static String getImageFormatByFile(String filePath){
        ImageInputStream input=null;
        try{
            input = ImageIO.createImageInputStream(new File(filePath));
            String var2 = getImageFormatByFile(input);
            return var2;
        }catch (IOException var12) {
            var12.printStackTrace();
        }finally {
            if (input != null){
                try{
                    input.close();
                }catch (IOException var11){
                    var11.printStackTrace();
                }
            }
        }
        return "unknown";
    }

    public static String getImageFormatByBytes(byte[] content){
        MemoryCacheImageInputStream input=null;
        String var2;
        try{
            input=new MemoryCacheImageInputStream(new ByteArrayInputStream(content));
            var2=getImageFormat(input);
        }finally {
            if (input != null){
                try {
                    input.close();
                }catch (IOException var9){
                    var9.printStackTrace();
                }
            }
        }
        return var2;
    }

    public static String getImageFormat(ImageInputStream input){
        Iterator<ImageReader> readers = ImageIO.getImageReaders(input);
        String format="unknown";
        if (readers.hasNext()){
            ImageReader reader=(ImageReader) readers.next();
            try {
                format = reader.getFormatName();
            }catch (IOException var8){
                var8.printStackTrace();
            }finally {
                reader.dispose();
            }
        }
        return format;
    }

    public static HashMap<String, Integer> getImageInfoByFile(String filePath) {
        try{
            ImageInputStream input = ImageIO.createImageInputStream(new File(filePath));
            return getImageInfo(input);
        }catch (IOException var3){
            var3.printStackTrace();
            return null;
        }
    }

    public static HashMap<String, Integer> getImageInfoByBytes(byte[] content){
        ImageInputStream input = new MemoryCacheImageInputStream(new ByteArrayInputStream(content));
        return getImageInfo(input);
    }
    public static HashMap<String, Integer> getImageInfo(ImageInputStream input){
        HashMap<String, Integer> map = new HashMap(2);
        BufferedImage buff=null;
        try {
            buff=ImageIO.read(input);
            map.put("width",buff.getWidth());
            map.put("height",buff.getHeight());
            return map;
        }catch (IOException var4){
            var4.printStackTrace();
        }catch (Exception var5){
            var5.printStackTrace();
        }
        return null;
    }
}
