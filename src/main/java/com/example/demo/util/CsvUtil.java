package com.example.demo.util;

import java.io.InputStream;

public class CsvUtil {


    /** <Description functions in a word>
     * Bytes to Hex String
     * 将字节数组转换成16进制字符串
     * <Detail description>
     * @author  lcl
     * @param src
     * @return [Parameters description]
     * @return String [Return type description]
     * @exception throws [Exception] [Exception description]
     * @see [Related classes#Related methods#Related properties]
     */
    public static String bytes2HexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        System.out.println(" bytes2HexString = "+stringBuilder.toString().toUpperCase());
        return stringBuilder.toString().toUpperCase();
    }

    /** <Description functions in a word>
     * Judge this FileInputStream is csv file
     * 判断该文件流头部是否包含有指定的信息，从而确认该文件是不是正确的文件类型
     * <Detail description>
     * @author  lcl
     * @param is
     * @return [Parameters description]
     * @return boolean [Return type description]
     * @exception throws [Exception] [Exception description]
     * @see [Related classes#Related methods#Related properties]
     */
    public static boolean judgeIsCSV(InputStream is){
        try {
            byte[] b = new byte[4];
            is.read(b, 0, b.length);
            //CSV文件的头部的前4个字节
            return bytes2HexString(b).contains("5B75726C");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
