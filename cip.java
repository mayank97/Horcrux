/*
 
	Dewansh Gautam 2015025
	Mayank Kumar   2015055
	
*/

package lab5;

import java.io.*;
import java.security.*;

import javax.crypto.*;


public class cip{
private static Cipher ecipher;
private static Cipher dcipher;
private static SecretKey key;


public static SealedObject encrypter(Media m)
{
	try{
		
	key=KeyGenerator.getInstance("DES").generateKey();
ecipher=Cipher.getInstance("DES");
ecipher.init(Cipher.ENCRYPT_MODE,key);
SealedObject sealed=new SealedObject((Serializable)m,ecipher);
return sealed;
	}
	catch(NoSuchAlgorithmException e){
	System.out.println("No sucha algo: "+e.getMessage());
	return null;
	}
	catch(NoSuchPaddingException e)
	{
	System.out.println("no such padding"+e.getMessage());
	return null;
	}
	catch(InvalidKeyException e){
	System.out.println("invalid key"+e.getMessage());
	return null;
	}
	catch(IllegalBlockSizeException e){
	System.out.println("illegal block size"+e.getMessage());
	return null;
	}
	catch(IOException e){
	System.out.println("io error"+e.getMessage());
	}
	return null;
	
}

public static Media decrypt(SealedObject sealed){
try{
	
	

	dcipher = Cipher.getInstance("DES");
	dcipher.init(Cipher.DECRYPT_MODE,key);
	Media o=(Media)sealed.getObject(dcipher);
	return o;
	}
	catch(NoSuchAlgorithmException e){
	System.out.println("No sucha algo: "+e.getMessage());
	return null;
	}
	catch(NoSuchPaddingException e)
	{
	System.out.println("no such padding"+e.getMessage());
	return null;
	}
	catch(InvalidKeyException e){
	System.out.println("invalid key"+e.getMessage());
	return null;
	}
	catch(IllegalBlockSizeException e){
	System.out.println("illegal block size"+e.getMessage());
	return null;
	}
	catch(IOException e){
	System.out.println("io error"+e.getMessage());
	}
	catch(ClassNotFoundException e){
	System.out.println("class not found"+e.getMessage());
	return null;
	}
	catch(BadPaddingException e){
	System.out.println(" bad padding" +e.getMessage());
	return null;
	}
return null;

}

}