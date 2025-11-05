class palindromeCheck {
    public static boolean isPalindrome(int x) {
        int y = x, reverse = 0;
        while(x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }
        if(reverse == y) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = isPalindrome(-121);
        System.out.println(result);
    }
}