class Solution {
    public int reverse(int num) {
        boolean flag = false;
        if(num < 0){
            flag = true;
        } 
        int num2 = 0;
        String snum = (flag)? String.valueOf(num).substring(1):String.valueOf(num);
        System.out.println(snum);

        snum = new StringBuilder(snum).reverse().toString();

        try {
            num2 = Integer.parseInt(snum);
        } catch (NumberFormatException e) {
            return 0;
        }
        
        

        return (flag)? num2*(-1):num2;
    }
}