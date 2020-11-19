package javaSorulari;

public class Substring {
    public static void main(String[] args) {
        String str ="Tarik is perfect in java";
        String newArr="";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].substring(arr[i].length()-1)+
                    arr[i].substring(1,arr[i].length()-1)+arr[i].substring(0,1);
            newArr+=arr[i]+" ";
        }
        newArr.trim();
        System.out.println(newArr);

    }
}
