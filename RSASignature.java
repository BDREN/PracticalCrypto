/*
Kasun De Zoysa @ UCSC
*/
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Signature;


public class RSASignature {

  public static void main(String[] args)throws Exception {


     KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
     keyGen.initialize(1024,new SecureRandom());
     KeyPair keyPair = keyGen.generateKeyPair();

     Signature  signature = Signature.getInstance("SHA1withRSA");

     // generate a signature
     signature.initSign(keyPair.getPrivate());

     //Create a signature of command line message


     // verify a signature
     //You shoud implement verification steps
     //

  }

}
