package pe.edu.upeu.modulo;
import java.math.BigInteger;

public class Recursividad{

public long factorial(long n){
  if(n>1){
    return factorial(n-1)*n;
  }
  return 1;
}


public BigInteger factorialBig(long n){
  if(n>1){
    return factorialBig(n-1).multiply(new BigInteger(String.valueOf(n)));
  }
  return new BigInteger(String.valueOf(1));
}



}