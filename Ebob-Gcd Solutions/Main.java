// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

                                                               // 170418039 Hasan Can Bağ
    public static long oklid(long a, long b){
        long temp;

        if(a<b){
            temp=a;              //Büyük olanı belirleme
            a=b;
            b=temp;
        }

        while(true){
            if(a%b==0)
                return b;
            else{                          //Öklid algoritması
                temp=a;
                a=b;
                b=temp%b;
            }
        }
    }

    public static long asal(long a, long b){
        long temp=0;
        long ebob=1;
        if(a<b){
            temp=a;              //Küçük olanı belirleme
            a=b;
            b=temp;
        }

        while(b>1){
            for(long i=2; i<=b; i++){
                if(b%i==0 && a%i==0){        //Her ikisini de bölüyor mu kontrolü
                    ebob=ebob*i;
                    b=b/i;
                    a=a/i;
                    break;

                } else if(b%i==0){
                    b=b/i;
                    break;
                }

            }
        }
        return ebob;
    }

    public static long mutlakDeger(long a, long b){
        if((a - b)>0)
            return a-b;
        else
            return b-a;
    }
    public static long ardisik( long a, long b){
        long temp=0;

        while(a-b!=0){
            if(a-b==0)
                break;
            else{
                temp =mutlakDeger(a,b);
                a=b;
                b=temp;

            }
        }
        return b;

    }
    public static void main(String[] args) {

        long a=oklid(39773,47471);
        long b=asal(24,12);
        long c=ardisik(100,1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
