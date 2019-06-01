
public class Key_Value {
    private int currentSize;
    private int maxSize;
    private Key_Value_Array keyArray;

    public Key_Value(){
        this.maxSize = 10;
        this.currentSize = 0;
        this.keyArray = new Key_Value_Array(10);
    }

    //this is the method to hashing the number
    public void hashing(int value){
        int key = value % maxSize;
        int i = 0;
        int temp = key;
        while(true){
            if(keyArray.isEmpty(temp) != true){
                i++;
                temp = (int) Math.pow(i,2)+ key;
                temp = temp % maxSize;
            }
            else{
                break;
            }
        }
        key = temp;
        keyArray.add(key, value);
        currentSize ++;
        if((double) currentSize/maxSize >= 0.8){
            maxSize *= 2;
            keyArray.rehash();
        }
    }

    public void delete(int index){
        keyArray.deleteValue(index);
    }

    public void search(int index){
        keyArray.searchValue(index);
    }

    public void printTable(){
        keyArray.printTable();
    }

}

