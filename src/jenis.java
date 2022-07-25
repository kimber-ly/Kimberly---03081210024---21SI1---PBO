import java.util.Scanner;
public class jenis extends pembayaran{
    Scanner temp = new Scanner(System.in);

    public int hitung(int durasi)
    {
        System.out.println("Masukkan jenis kamar[Standard/Family/Superior] : ");
        String jenis = temp.next();
        if (jenis.equals("Standard"))
        {
            int tagihan=300000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Luxurious"))
        {
            int tagihan=800000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Superior"))
        {
            int tagihan=600000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        return durasi;
    }
    public void hitung (String jenis,int a)
    {
        
        if (jenis.equals("Ovo"))
        {
            double diskon = 0.88*a;
            System.out.println("Tagihan setelah diskon : "+diskon);
        }
        else if (jenis.equals("Credit"))
        {
            double diskon = 1.02*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        else if (jenis.equals("Dana"))
        {
            double diskon = 0.95*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        
    }
    void swap(int xp, int yp) 
{ 
    int temp = xp; 
    xp = yp; 
    yp = temp; 
} 
  
void selectionSort(int arr[], int n) 
{ 
    int i, j, min_idx; 
  
    // One by one move boundary of 
    // unsorted subarray 
    for (i = 0; i < n-1; i++) 
    { 
        
        // Find the minimum element in 
        // unsorted array 
        min_idx = i; 
        for (j = i+1; j < n; j++) 
        if (arr[j] < arr[min_idx]) 
            min_idx = j; 
  
        // Swap the found minimum element 
        // with the first element 
        swap(arr[min_idx], arr[i]); 
    } 
} 
  
    int x=0;
    
    public void simpandata()
    {
        for(int i=0;i<1;i++)
        {
            x++;
            
        }
        
        System.out.println("Apakah anda ingin menggunakan sort [y/n]? ");  
        String jwb = temp.next();
        if (jwb.equals("y"))
        {  
            System.out.println("Silahkan masukkan jumlah data yang akan disimpan : "); 
            int n= temp.nextInt(); 
            int[] array = new int[n];
            System.out.println("Silahkan masukkan total yang akan disimpan : ");  
            for(int i=0;i<n;i++)
        {
            array[i]=temp.nextInt();
        }
            System.out.println("Data yang sudah disimpan (Disusun dari nominal kecil)");
            selectionSort(array,array.length-1);
        for (int i=0;i<array.length;++i)
        {
            System.out.println(""+array[i]);
        } 
        }
        else
        {
            System.out.println("Terima Kasih ");  
        }
      
    }
    
    public  void jenispembayarn()
    {
     
        System.out.println("Masukkan durasi penginapan : ");
        int durasi = temp.nextInt();
        hitung(durasi);
        System.out.println("Masukkan jenis pembayaran[Ovo/Credit/Dana] : ");
        String jenis1 = temp.next();
        System.out.println("Tagihan anda : ");
        int tagihan = temp.nextInt();
        hitung(jenis1,tagihan);
        simpandata();
        
}
}
