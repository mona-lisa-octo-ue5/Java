package com.ls.aip.util;

import com.ls.aip.exception.LSAipException;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

public class LSSignUtil {
    private static final char[] DIGITS = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public LSSignUtil(){

    }
    public static String hmacSha256(String key,String data) throws LSAipException{
        try{
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), mac.getAlgorithm());
            mac.init(signingKey);
            return encodeHex(mac.doFinal(data.getBytes()));
        }catch (Exception var4){
            var4.printStackTrace();
            throw new LSAipException(-1, "Fail to generate HMAC-SHA256 signature");
        }
    }

    public static String md5(String data, String charset) {
        try{
            byte[] msg = data.getBytes(charset);
            MessageDigest md = MessageDigest.getInstance("MD5");
            return encodeHex(md.digest(msg));
        }catch (UnsupportedEncodingException var4){
            var4.printStackTrace();
        }catch (NoSuchAlgorithmException var5) {
            var5.printStackTrace();
        }
        return null;
    }
    private static String encodeHex(byte[] data){
        int l=data.length;
        char[] out = new char[l << 1];
        int i=0;
        for (int var4 = 0; i<l; ++i){
            out[var4++] = DIGITS[(240 & data[i]) >>> 4];
            out[var4++] = DIGITS[15 & data[i]];
        }

        return new String(out);
    }
}
