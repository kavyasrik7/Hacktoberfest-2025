class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> arr=new ArrayList<>();
        if(digits.length()==0)return arr;
        String digitLetter[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        arr.add("");
        for(int i=0;i<digits.length();i++){
            arr=(ArrayList<String>)combine(digitLetter[digits.charAt(i)-'0'],arr);

        }
        return arr;

    }
    public static List<String> combine(String digit,List<String> arr){
        List<String> result=new ArrayList<>();
        for(String x:arr){
            for(int i=0;i<digit.length();i++){
                result.add(x+digit.charAt(i));
            }
        }
        return result;
    }
}
