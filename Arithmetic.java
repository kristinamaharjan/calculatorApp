package Calculator;

public class Arithmetic{

  private int first;
  private int second;

  
public int getFirst(){
  return first;
}

public int getSecond(){
  return second;
}

public void setFirst(int first){
  this.first = first;
}

public void setSecond(int second){
  this.second = second;
}

public int addition() {
  return first + second;
}

public int subtraction() {
  return first - second;
}


}