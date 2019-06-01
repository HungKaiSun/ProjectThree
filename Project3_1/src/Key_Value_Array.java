public class Key_Value_Array {

    Integer[] valueArray;
    int maxSize;

    public Key_Value_Array(int size){
        this.valueArray = new Integer [size];
        this.maxSize = size;
    }

    //check if the index is empty
    public boolean isEmpty(int index){
        if(valueArray[index] == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void add(int index, int value){
        this.valueArray[index] = value;
    }

    //if size is 80%, then rehash
    public void rehash(){
        Integer[] temper = valueArray.clone();
        maxSize *= 2;
        valueArray = new Integer[maxSize];
        int key;
        for (int i = 0; i < temper.length; i++){
            if(temper[i] != null){
                int value = temper[i];
                key = value % maxSize;
                int probe = 0;
                while(!isEmpty(key)){
                    probe++;
                    key = (int) Math.pow(probe, 2) + key;
                    key = key % maxSize;
                }
                valueArray[key] = value;
            }
            else{
                continue;
            }
        }
    }


    public void deleteValue(int index){
        System.out.println(valueArray[index]);
        valueArray[index] = null;
        System.out.println(valueArray[index]);
    }

    public void searchValue(int index){
        System.out.println("The value in index " + index + " is " + valueArray[index]);
    }

    public void printTable(){
        for(int i = 0; i < valueArray.length; i++){
            System.out.println("At index: " + i + " is the value: " + valueArray[i]);
        }
    }

}

