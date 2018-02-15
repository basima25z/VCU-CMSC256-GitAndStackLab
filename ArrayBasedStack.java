import java.util.Arrays;
import java.util.*;

public class ArrayBasedStack <T> implements StackInterface <T>
{

//List elements = new ArrayList;
private T stackArray[];
private int topOfStack;
public static final int INITIAL_CAPACITY =5;
private boolean initialized = true;

@SuppressWarnings("unchecked")
public ArrayBasedStack (int length)
{

topOfStack =-1;

if (length<0)
{
throw new IllegalArgumentException("Argument is not greater than 0");
}

stackArray = (T[]) new Object[length];
}


public ArrayBasedStack()
{

this(INITIAL_CAPACITY);

}

public int doubleArray(T[] stackArray)
{
T[] copy = Arrays.copyOf(stackArray, stackArray.length * 2);
return 1;
}

public void push(T newEntry)
{
if (topOfStack>=INITIAL_CAPACITY)
{
   doubleArray(stackArray);
   
}
else
{
   stackArray[topOfStack++] = newEntry;
   
}

}


public boolean isEmpty()
{
if(topOfStack<0)
{
return true;
}
else
{
return false;
}


}

public T pop()
{


if (topOfStack<0)
{
   throw new EmptyStackException();
   //stackArray[topOfStack] =null;
}

T result = stackArray[topOfStack];
stackArray[topOfStack]=null;
--topOfStack;

return result;

}

public void clear()
{
while(!isEmpty())
{
   pop();
}


}

public T peek()
{
   T result = stackArray[topOfStack];
   if(result ==null){
   return null;
   }
   else 
   return result;
  }









}//end of file