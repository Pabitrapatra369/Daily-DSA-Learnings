import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger bigint=new BigInteger("0");
        if(digits[digits.length-1]==9){
            
            
            for(int i=0;i<digits.length;i++){
              bigint = bigint.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
            }
            bigint=bigint.add(BigInteger.ONE);
            int n= bigint.toString().length();
            int[] newArr=new int[n];
            String numberString=bigint.toString();
            int index=0;
            for(char num:numberString.toCharArray()){
                int  digit=Character.getNumericValue(num);
                newArr[index++]=digit;
            }
            return newArr;

        }else{
            int newNum=digits[digits.length-1]+1;
            digits[digits.length-1]=newNum;
            return digits;
        }
    }
}

//optimal
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; 

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            
            for (int i = 0; i < n; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }

        return digits;
    }
}
