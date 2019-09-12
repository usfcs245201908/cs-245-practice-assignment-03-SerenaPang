public class LinearSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "LinearSearch";
    }

    @Override
    public int search(int[] array, int key) {
        for(int i =0; i< array.length; i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
}
