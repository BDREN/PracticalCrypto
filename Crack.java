/*
Kasun De Zoysa @ UCSC
*/
import java.security.*;
import java.io.*;

public class Crack{
public static void main(String args[]) {
  try {

   // Create a secure number generator
   SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

   int seedByteCount = 4;
   byte[] seed = sr.generateSeed(seedByteCount);

   // Get 32 random bits   
   byte[] key = new byte[5];
   sr.setSeed(seed);
   sr.nextBytes(key);

   // Print the key   
   System.out.print("Key   : ");
   for(byte b:key) System.out.format("%02x",b);
   System.out.println("");
 
   byte[] tmp=new byte[5];
   for(int i=0; i<256;i++){
     tmp[0]=(byte)i;
     for(int j=0; j<256;j++){
        tmp[1]=(byte)j;
        for(int k=0; k<256;k++){
          tmp[2]=(byte)k;
          for(int l=0; l<256;l++){
            tmp[3]=(byte)l;
             for(int m=0; m<256;m++){
                tmp[4]=(byte)m;
               if(Equal(key,tmp)){
                 System.out.print("Found : "); 
                 for(byte b:tmp) System.out.format("%02x",b);
                 System.out.println("");
                 return;
               }
             }
           }
         }
       }
    }

   } catch (Exception e) {
   System.out.println(e);
  }
 }

 private static boolean Equal(byte a[], byte b[]){
  int i;
  for(i=0;i<a.length;i++)
 if(a[i]!=b[i]) break;
  if(i==a.length) return true;
   else return false;
 }
 
}
