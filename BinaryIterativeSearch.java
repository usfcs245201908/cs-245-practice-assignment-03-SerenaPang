public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "BinaryIterativeSearch";
    }

    @Override
    public int search(int[] array, int key) {
        int start;
        int end = array.length;
        int mid;
        for(start = 0; start < end ; start++, end --){
            mid =(start+end)/2;
            if(mid == key){
                return mid;
            }
            else if(mid < key){
                start = mid +1;
            }
            else if(mid > key){
                end = mid -1;
            }
        }
        return -1;
    }
}
