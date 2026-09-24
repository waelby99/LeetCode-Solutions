class Solution {
    public int addDigits(int num) {
        int somme=0;
        if( num<=9){
            return num;
        }
        while(num/10 !=0){
            somme=somme+(num%10);
            num=num/10;

            if(num<10){
                somme=somme+num;
            }
        }
        return addDigits(somme);
    }
    
}