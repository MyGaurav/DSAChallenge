class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                products[i + j + 1] += mul;
            }
        }

        for (int k = products.length - 1; k > 0; k--) {
            products[k - 1] += products[k] / 10;
            products[k] %= 10;
        }

        StringBuilder result = new StringBuilder();
        for (int digit : products) {
            if (result.length() == 0 && digit == 0) continue;
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}