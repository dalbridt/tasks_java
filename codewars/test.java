
class test {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int k : array) {
            k = 0;
        }
        boolean stop = false; 

        while (stop == false) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] < array.length - 1) {
                    array[i]++;
                    for (int k : array) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                    break;
                } else if (array[i] == array.length - 1 && array[i - 1] < array.length - 1) {
                    array[i] = 0;
                    array[i - 1]++;
                     for (int k : array) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                    break;
                } else if (array[i] == array.length - 1 || array[i - 1] == array.length - 1) {
                    array[i] = 0;
                    continue; 
                } 
            }
            if(array[0] == array.length -1){
                int total = 0; 
                for (int k = 0; k < array.length; k++) {
                    total += array [k];  
                }
                if(total == (array.length -1) * array.length){
                    stop = true; 
                }
            }
        }
    }
}