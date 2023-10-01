import java.util.ArrayList;
import java.util.List;

class Stack {
  private List <Character> list = new ArrayList <>(); 

  public void push(char val){
    list.add(val); 
  }

  public Character pop(){
    int last = list.size() - 1; 
    if(last >= 0){
      return list.remove(last); 
    }
    return null;
  }

  public Character peek(){
    if(list.size() > 0){
      return list.get(list.size() - 1);
    }
    return null;
  }

  public boolean isEmpty(){
    return list.size() == 0; 
  }
}