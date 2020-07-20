package integerlisttest;
// **************************************************************** 
// IntegerList.java 
// 
// Define an IntegerList class with methods to create & fill 
// a list of integers. 
// 
// **************************************************************** 

public class IntegerList {

    private int[] list; //values in the list 
    private int numberOfElements;

//------------------------------------------------------- 
//create a list of the given size  7 
//------------------------------------------------------- 
    public IntegerList(int size) {
        list = new int[size];
        numberOfElements = size;
    }

//------------------------------------------------------- 
//fill array with integers between 1 and 100, inclusive 
//------------------------------------------------------- 
    public void randomize() {
        for (int i = 0; i < numberOfElements; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
    }

//------------------------------------------------------- 
//print array elements with indices 
//------------------------------------------------------- 
    public void print() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(i + ":\t" + list[i]);
        }
    }

    private int searchElement(int val) {
        for (int i = 0; i < numberOfElements; i++) {
            if (list[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void removeFirst(int val) {
        int position = searchElement(val);

        if (position == -1) {
            return;
        }

        for (int i = position; i < numberOfElements - 1; i++) {
            list[i] = list[i + 1];
        }
        numberOfElements--;
    }

    public void removeAll(int val) {
        int count = 0;
        for (int i = 0; i < numberOfElements; i++) {
            if (list[i] == val) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            removeFirst(val);
        }

    }

    public void increaseSize() {
        int[] temp = new int[list.length * 2];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public void addElement(int newVal) {
        if (list.length == numberOfElements) {
            increaseSize();
        }
        list[numberOfElements] = newVal;
        numberOfElements++;
    }

}
