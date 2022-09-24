public class Bubble{

    static void swap(int a[], int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void Bubblesort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a, j, j+1);
                }
            }
        }
    }
    public static void main(String[] args){
        int a[]={5,9,2,6,3,4};
        Bubblesort(a);

        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
