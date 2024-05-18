class LeetCodeQ1{
    public static void main(String[] args) {
        int num1[] = {1,2,3,4};
        int num2[] = {5,6};

        int m = num1.length;
        int n = num2.length;
        int size = m + n;

        int i = 0;
        int num3[] = new int[size];
        for(int no1 : num1){
            System.out.println("Numbes in num1 array are : "+no1);
            num3[i] = no1;
            i++;
        }
        for(int no2 : num2){
            System.out.println("Numbes in num2 array are : "+ no2);
            num3[i] = no2;
            i++;
        }

        num1=num3;
        for(int no3 : num1){
            System.out.println("Numbes in num1 array are : "+no3);
        }

        }
}