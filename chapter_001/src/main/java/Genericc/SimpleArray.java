package Genericc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class SimpleArray <T> implements Iterable<Object>{
    private Object[] obj_array;
    public final int length;
    public SimpleArray(int length) {
        this.obj_array = new Object [length];
        this.length = length;
    }

    public void setMode(int i ,T mode ){
        obj_array[i] = mode;
  }
  public void add(T mode){
      for (int i = 0; i <length; i++) {
          if(obj_array[i]  == null) obj_array[i] = mode;
          else continue;

      }
  }

  public void delete(int i){
        Object[] result = new Object[length-1];
        System.arraycopy(obj_array,0,result,0,i);
        System.arraycopy(obj_array, i + 1, result, i, length - i - 1);
        obj_array = result;
  }
  public T get(int i){
      @SuppressWarnings("unchecked")
      final T t = (T)obj_array[i];
      return t;
  }

    @Override
    public Iterator<Object> iterator() {
        return Arrays.stream(obj_array).iterator();
    }
}
