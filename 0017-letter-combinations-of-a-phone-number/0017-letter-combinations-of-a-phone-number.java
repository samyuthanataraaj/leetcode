// class Solution {
//     public List<String> letterCombinations(String digits) {
//         Map<Character,String> m=new HashMap<>();
//         m.put('2',"abc");
//         m.put('3',"def");
//         m.put('4',"ghi");
//         m.put('5',"jkl");
//         m.put('6',"mno");
//         m.put('7',"pqrs");
//         m.put('8',"tuv");
//         m.put('9',"wxyz");
//         List<String> l=new ArrayList<>();
//         List<String> l1=new ArrayList<>();
//         for(int i=0;i<digits.length();i++){
//         for(Map.Entry<Character,String> e:m.entrySet()){
//             char c=e.getKey();
//             if(c==digits.charAt(i)){
//                 l1.add(e.getValue());
//             }
//         }
//         }
//         if(l1.size()==1){
//             char c3[]=l1.get(0).toCharArray();
//             for(int i=0;i<c3.length;i++){
//                 l.add(""+c3[i]);
//             }
//             return l;
//         }
   
//         for(int i=0;i<l1.size()-1;i++){
//             char c1[]=l1.get(i).toCharArray();
//             char c2[]=l1.get(i+1).toCharArray();
//             for(int j=0;j<c1.length;j++){
//                 for(int k=0;k<c2.length;k++){
//                     l.add(""+c1[j]+c2[k]);
//                 }
//             }
//         }
       
//         return l;   
//     }
// }

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}