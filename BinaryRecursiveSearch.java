public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "BinaryRecursiveSearch";
    }

    @Override
    public int search(int[] array, int key) {
        int start = 0;
        int end = array.length;
        int mid = (start + end)/2;
        if(array[mid]==key){
            return array[mid];
        }
        else if (array[mid]<key){
            start = mid +1;
            return search(array,key,start,end);

        }
        else if(array[mid]>key){
            end = mid -1;
            return search(array,key,start,end);
        }

        return -1;
    }
    public int search(int[]array, int target, int start, int end){
        int key = (start + end)/2;
        if(array[key]==target){
            return array[key];
        }
        else if(array[key] < target){
            start = key+1;
        }
        else if (array[key]>target){
            end = key-1;
        }
        return -1;
    }
}
