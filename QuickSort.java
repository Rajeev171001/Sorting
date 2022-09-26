public class Quick {

    static void swap(int a[], int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void random(int a[], int l, int h){
        int randomIndex=l + (int)(Math.random() * (h-l-1));
        swap(a,l,randomIndex);
    }

    static int partition(int a[], int l, int h){
        int i=1;
        int j=h;
        random(a, l, h);
        int pivot=a[l];
        while(i<j){
            while(i<j && a[i]<=pivot) i++;
            while(a[j]>pivot) j--;
            if(i<j){
                swap(a, i, j);
            }
        }
        swap(a, l, j);
        return j;
    }
    static void quicksort(int a[], int l, int h){
        if(l<h){
            int pivot=partition(a,l,h);
            quicksort(a,l,pivot-1);
            quicksort(a,pivot+1,h);
        }
    }
    public static void main(String[] args){
        int a[]={5,1,9,3,5,6,1,2};
        quicksort(a,0,a.length-1);

        for(int e:a){
            System.out.print(e+" ");
        }
    }
    
}
