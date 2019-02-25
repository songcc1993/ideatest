package com.aiwen.wfgwechat.publicmodules.util;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;


public class AesEbcUtil {

	/**验证
	 * @param source
	 * @param target
	 * @return
	 */
      public static boolean verification(String source,String target){
		  byte[] bytes = source.getBytes();
		  byte[] bytes1 = target.getBytes();
		  String str= null;
		  String str1=null;
		  try {
			  str = new String(bytes, "utf-8");
			  str1=new String(bytes1, "utf-8");
		  } catch (UnsupportedEncodingException e) {
			  e.printStackTrace();
		  }
		  str = str.trim();
		  str1 = str1.trim();
		  str = str.replaceAll("\r|\n", "");
		  str1 = str1.replaceAll("\r|\n", "");
		  /*char[] chars = str.toCharArray();
		  char[] chars1 = str1.toCharArray();
		  int length = str.length();
		  int length1 = str1.length();*/
		  boolean equals = str.equals(str1);
		  return equals;
	  }



	  /**
	   * 传输用加密
	   * @param content 需要加密的内容
	   * @param transferKey 加密的秘钥
	   * @return
	   * @throws Exception
	   */
	  public static String aesTransferEncrypt(String content,String  transferKey) throws Exception {
	    return base64Encode(aesEncryptToBytes(content, transferKey));
	  }

	  /**
	   * 传输用解密
	   * @param encryptStr 需要解密的内容
	   * @param transferKey 解密的秘钥
	   * @return
	   * @throws Exception
	   */
	  public static String aesTransferDncrypt(String encryptStr,String  transferKey) throws Exception {
	    return aesDecryptByBytes(base64Decode(encryptStr), transferKey);
	  }

	  /**
	   * base 64 encode
	   * @param bytes 待编码的byte[]
	   * @return 编码后的base 64 code
	   */
	  private static String base64Encode(byte[] bytes) {
	    return new BASE64Encoder().encode(bytes);
	  }

	  /**
	   * base 64 decode
	   * @param base64Code 待解码的base 64 code
	   * @return 解码后的byte[]
	   * @throws Exception
	   */
	  private static byte[] base64Decode(String base64Code) throws Exception {
	    return new BASE64Decoder().decodeBuffer(base64Code);
	  }

	  /**
	   * AES加密
	   * @param content 待加密的内容
	   * @param encryptKey 加密密钥
	   * @return 加密后的byte[]
	   * @throws Exception
	   */
	  private static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
	    KeyGenerator kgen = KeyGenerator.getInstance("AES");
	    SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
	    secureRandom.setSeed(encryptKey.getBytes());
	    kgen.init(128, secureRandom);
	    Cipher cipher = Cipher.getInstance("AES");
	    cipher.init(Cipher.ENCRYPT_MODE, kgen.generateKey());
	    return cipher.doFinal(content.getBytes("UTF-8"));
	  }

	  /**
	   * AES解密
	   * @param encryptBytes 待解密的byte[]
	   * @param decryptKey 解密密钥
	   * @return 解密后的String
	   * @throws Exception
	   */
	  private static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
	    KeyGenerator kgen = KeyGenerator.getInstance("AES");
	    SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
	    secureRandom.setSeed(decryptKey.getBytes());
	    kgen.init(128, secureRandom);
	    Cipher cipher = Cipher.getInstance("AES");
	    cipher.init(Cipher.DECRYPT_MODE,kgen.generateKey());
	    byte[] decryptBytes = cipher.doFinal(encryptBytes);
	    return new String(decryptBytes,"UTF-8");
	  }
	}

