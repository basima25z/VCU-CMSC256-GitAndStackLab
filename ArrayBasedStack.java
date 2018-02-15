public class ArrayBasedStack <T> implements StackInterface <T>
{

//List elements = new ArrayList;
private T stackArray[];
private int topOfStack;
private final int INITIAL_CAPACITY =5;
private boolean initialized = true;

@SuppressWarnings("unchecked")
public ArrayBasedStack (int length) throws IllegalArgumentException
{

topOfStack =-1;
T[] arr = (T[]) new Object[length];

if (length<0)
{
throw new IllegalArgumentException("Argument is not greater than 0");
}

}


public ArrayBasedStack()
{



}

public doubleArray(T[] stackArray)
{

T[] data = new T[];


}