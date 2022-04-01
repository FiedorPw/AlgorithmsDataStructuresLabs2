
    public class HeapSort {
        int compareCounter= 0;
        int replaceCounter = 0;
    public void sort(int arr[])
        {
            int n = arr.length;

            //wywoływanie hepify
            for (int i = n / 2 - 1; i >= 0; i--) {
                replaceCounter++;
                heapify(arr, n, i);
            }

            //usuwanie po jednym
            for (int i = n - 1; i > 0; i--) {
                // root leci na góre
                replaceCounter++;
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;


                heapify(arr, i, 0);
            }
        }


        void heapify(int arr[], int n, int i)
        {
            int largest = i; //root
            int l = 2 * i + 1; //lewe dziecko
            int r = 2 * i + 2; // prawe dziecko

            // zmiana dziecka jeżeli
            compareCounter++;
            if (l < n && arr[l] > arr[largest]) {
                largest = l;
            }

            // jezeli prawy jest większy niz te poprzednio

            compareCounter++;
            if (r < n && arr[r] > arr[largest]) {
                largest = r;
            }

            // jeżeli największy nie jest rootem
            compareCounter++;
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                compareCounter++;
                // heapifijeuje
                heapify(arr, n, largest);
            }
        }


         void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
            System.out.println("porównania " + compareCounter);
            System.out.println("zamiany " + replaceCounter);
            compareCounter =0;
            replaceCounter = 0;
        }


        public static void main(String args[])
        {

            int arr[] = { 12, 11, 13, 5, 6, 7 };
           // int n = arr.length;
            HeapSort ob = new HeapSort();
            ob.sort(arr);
            System.out.println("Sorted array is");
            ob.printArray(arr);


            int arr1[] = { 1,2,3,4,5,6,7};

            ob.sort(arr1);
            System.out.println("Sorted array is");
            ob.printArray(arr1);


            int arr2[] = { 1,2,3,4,8,7,6,5};


            ob.sort(arr2);
            System.out.println("Sorted array is");
            ob.printArray(arr2);


        }
    }

