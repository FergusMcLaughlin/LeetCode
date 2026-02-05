class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().strip().replaceAll("[^a-z0-9]", "");
        List<Character> charList = new ArrayList();

        for(int i = 0; i < cleanString.length(); i++){
            charList.add(cleanString.charAt(i));
        }

        for(int x = 0, y = charList.size() - 1; x < y ;y--, x++){
                if(charList.get(x) == charList.get(y)){
                    continue;
                } else {
                    return false;
                }

        }
        return true;
    }
}