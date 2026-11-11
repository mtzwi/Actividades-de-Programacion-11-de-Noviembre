
public static void insertionSort(int [] array){
    int n = array.length;
    for(int i=0; i<n; i++){
        int llave = array[i];
        int j = i-1;
        
        while(j>=0 && array[j]> llave){
            array[j+1] = array[j];
            j = j-1;
        }
        array[j+1]=llave;
    }
}
public static void main(String[] args) {
    int [] array={9, 2, 63, 54, 165};
    for(int i=0; i<array.length; i++){
        System.out.print(", " + array[i]);
    }
    System.out.println();
    insertionSort(array);
    System.out.println("Array ordenado");
    for(int i=0; i<array.length; i++){
        System.out.print(", " + array[i]);
    }
}