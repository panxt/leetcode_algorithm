package com.panxt.leetcode;

import jdk.nashorn.internal.ir.CallNode;

import java.lang.reflect.Member;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s.substring(0, 1);
        } else if (len == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            }
            return s.substring(0, 1);
        }
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(dp[i], 0);
        }
        int end = 0;
        char[] charArray = s.toCharArray();
        int valueLen = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = charArray.length - 1; j >= 0; j--) {
                int j1 = charArray.length - 1 - j;
                if (charArray[i] == charArray[j]) {
                    if (i == 0 || j1 == 0) {
                        dp[i][j1] = 1;
                        continue;
                    }
                    dp[i][j1] = dp[i - 1][j1 - 1] + 1;
                    if (i != j1) {
                        valueLen = Math.max(valueLen, dp[i][j1]);
                        if (valueLen == dp[i][j1]) {
                            end = i;
                        }
                    } else {
                        if (len % 2 == 0) {
                            if (s.charAt(len / 2) == s.charAt(len / 2 - 1)) {
                                valueLen = Math.max(valueLen, dp[i][j1]);
                                if (valueLen == dp[i][j1]) {
                                    end = i;
                                }
                            }
                        } else {
                            if (s.charAt(len / 2 - 1) == s.charAt(len / 2 + 1)) {
                                valueLen = Math.max(valueLen, dp[i][j1]);
                                if (valueLen == dp[i][j1]) {
                                    end = i;
                                }
                            }
                        }
                    }

                }
            }
        }
        System.out.println(end);
        System.out.println(valueLen);
        return s.substring(end - valueLen + 1, end + 1);
    }

    public static void main(String[] args) {
        //String s = "xaabacxcabaaxcabaax";
//         String s = "babad";
//        String s = "aacabdkacaa";
/*        String s = "cbbd";
        Solution solution = new Solution();
        String longestPalindrome = solution.longestPalindrome(s);
        System.out.println(longestPalindrome);*/

//
//        String longestPalindromeM = solution.longestPalindromeM(s);
//        System.out.println(longestPalindromeM);
//
//        String longestPalindromeM2 = solution.longestPalindromeM2(s);
//        System.out.println(longestPalindromeM2);
//
//        String longestPalindromeM3 = solution.longestPalindromeM3(s);
//        System.out.println(longestPalindromeM3);
//
//        String longestPalindromeComp = solution.longestPalindromeComp(s);
//        System.out.println(longestPalindromeComp);
//
//        String longestPalindromeBing = solution.longestPalindromeBing(s);
//        System.out.println(longestPalindromeBing);

/*        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 1; i < 5; i++) {
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }

        printListNode(current.next);

        ListNode reverseList = reverseList(current.next);

        printListNode(reverseList);*/

/*        System.out.print("i % 4 => ");
        for (int i = 0; i < 16; i++) {
            int s = i % 4;
            System.out.print(s + "\t");
        }

        System.out.println();

        System.out.print("i / 4 => ");
        for (int i = 0; i < 16; i++) {
            int m = i / 4;
            System.out.print(m + "\t");
        }

        System.out.println(3 / 2);
        System.out.println(4 / 2);*/
/*
        System.out.println(Math.pow(-2, 31));
        int x = 123;
        System.out.println(reverse(x));*/

/*        String s = "words and 987";
//        String s = "   -42";
        System.out.println(myAtoi(s));*/

/*        System.out.println(12321 % 10);

        isPalindrome(12321);*/

        //int n = 2;
        // System.out.println(fib(2));

/*        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int minCostClimbingStairs1 = minCostClimbingStairs(cost1);
        int minCostClimbingStairs2 = minCostClimbingStairs(cost2);
        System.out.println(minCostClimbingStairs1);
        System.out.println(minCostClimbingStairs2);*/

        //int[] rob = {1, 2, 3, 1};
        //int rob1 = robp(rob);
        //System.out.println(rob1);

/*        int[] nums = {2, 7, 9, 3, 1};
        int rob2 = robp(nums);
        System.out.println(rob2);*/

        //int[] nums = {2, 3, 4};
/*        int[] nums = {2, 2, 3, 3, 3, 4};
        int deleteAndEarn = deleteAndEarn(nums);
        System.out.println(deleteAndEarn);*/

/*        int i = uniquePaths(3, 7);
        System.out.println(i);*/
/*        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int minPathSum = minPathSum(grid);
        System.out.println(minPathSum);*/

        // int[][] obstacles = {{1,0}};
        // int[][] obstacles = {{1}, {0}};
/*        int[][] obstacles = {{0, 1, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int uniquePathsWithObstacles = uniquePathsWithObstacles(obstacles);
        System.out.println(uniquePathsWithObstacles);*/

        // [[-1],[2,3],[1,-1,-3]]
        /*ArrayList<List<Integer>> allList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        l1.add(-1);
        l2.add(2);
        l2.add(3);
        l3.add(1);
        l3.add(-1);
        l3.add(-3);
        allList.add(l1);
        allList.add(l2);
        allList.add(l3);

        int minimumTotal = minimumTotal(allList);
        System.out.println(minimumTotal);*/
/*        int[] height = {2, 3, 4, 5, 18, 17, 6};
        int maxArea = maxArea(height);
        System.out.println(maxArea);*/

/*        int[] nums = {-2, 0, 1, 1, 2};

        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);*/
        String s = "ADOBECODEBANC", t = "ABC";
        String minWindow = minWindow(s, t);
        System.out.println(minWindow);
    }

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println();
    }


    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    public ListNode reverseList1(ListNode head) {
        ListNode tmpNode = null;
        while (head != null) {
            ListNode currNode = new ListNode(head.val);
            if (tmpNode == null) {
                tmpNode = currNode;
            } else {
                currNode.next = tmpNode;
                tmpNode = currNode;
            }
            head = head.next;
        }
        return tmpNode;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode node = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return node;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode first = head;
        ListNode tail = null;
        ListNode tmpNode = null;
        ListNode pre = null;
        ListNode end = null;
        for (int i = 1; head != null; head = head.next, i++) {
            if (i < left) {
                pre = head;
            }
            if (left <= i && i <= right) {
                ListNode currNode = new ListNode(head.val);
                if (tmpNode == null) {
                    tmpNode = currNode;
                    tail = currNode;
                } else {
                    currNode.next = tmpNode;
                    tmpNode = currNode;
                }
            }
            if (right == i) {
                end = head;
            }
        }
        if (tail != null && end != null) {
            tail.next = end.next;
        }
        if (pre != null) {
            pre.next = tmpNode;
        } else {
            return tmpNode;
        }
        return first;
    }

    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        ArrayList<List<Character>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Character> strList = new ArrayList<>();
            lists.add(strList);
        }

        int tmp = 0, len = -1;
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            lists.get(tmp).add(charAt);
            if (tmp == 0 || tmp == numRows - 1) {
                len = -len;
            }
            tmp += len;
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> list : lists) {
            for (Character o : list) {
                sb.append(o);
            }
        }
        return sb.toString();
    }


    public String convertLeetCode(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        // num = 4
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }

    public static int reverse(int x) {
        if (x < Math.pow(-2, 31) || x > Math.pow(2, 31) - 1) {
            return 0;
        }
        String intStr = String.valueOf(x);
        boolean isF = false;
        StringBuilder sb = new StringBuilder();
        for (char c : intStr.toCharArray()) {
            if (c == '-') {
                isF = true;
                continue;
            }
            sb.append(c);
        }
        sb = sb.reverse();
        for (int i = 0; i < sb.toString().toCharArray().length; i++) {
            if (sb.toString().charAt(i) != '0') {
                String substring = sb.substring(i);
                Long integer = Long.valueOf(substring);
                if (integer > Math.pow(2, 31) - 1) {
                    return 0;
                }
                if (isF) {
                    return -integer.intValue();
                }
                return integer.intValue();
            }
        }
        return 0;
    }

    public static int myAtoi(String s) {
        boolean isZ = true;
        boolean begin = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (begin) {
                boolean boo1 = s.charAt(i) != ' ' && !isNumber(s.charAt(i)) && s.charAt(i) != '-' && s.charAt(i) != '+';
                boolean boo2 = (s.charAt(i) == '-' && i + 1 < s.toCharArray().length && !isNumber(s.charAt(i + 1)));
                boolean boo3 = (s.charAt(i) == '+' && i + 1 < s.toCharArray().length && !isNumber(s.charAt(i + 1)));
                if (boo1 || boo2 || boo3) {
                    return 0;
                }
            }
            if (begin && s.charAt(i) == '-' && isNumber(s.charAt(i + 1))) {
                isZ = false;
                begin = false;
            } else if (begin && isNumber(s.charAt(i)) && s.charAt(i) != '0') {
                begin = false;
            }
            if (!begin && isNumber(s.charAt(i))) {
                sb.append(s.charAt(i));
                if (i + 1 < s.toCharArray().length && !isNumber(s.charAt(i + 1))) {
                    break;
                }
            }
        }
        for (int i = 0; i < sb.toString().toCharArray().length; i++) {
            if (sb.toString().charAt(i) != '0') {
                String substring = sb.substring(i);
                Long integer = Long.valueOf(substring);
                if (integer > Math.pow(2, 31) - 1) {
                    if (!isZ) {
                        return (int) (Math.pow(-2, 31));
                    }
                    return (int) (Math.pow(2, 31) - 1);
                }
                if (!isZ) {
                    return -integer.intValue();
                }
                return integer.intValue();
            }
        }
        return 0;
    }

    public static boolean isNumber(char c) {
        String dd = "0123456789";
        for (char c1 : dd.toCharArray()) {
            if (c1 == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
            System.out.println("=====");
            System.out.println("x: " + x);
            System.out.println("revertedNumber: " + revertedNumber);
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    // 状态和p扣除*和前一位相同，相当于?*匹配0个元素
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        // j从1开始，所以减去1
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int tribonacci(int n) {
        long[] dp = new long[n + 3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
            if (dp[i] > Math.pow(2, 31) - 1) {
                return (int) Math.pow(2, 31) - 1;
            }
        }
        return (int) dp[n];
    }

    public static int tribonacciP(int n) {
        if (n < 1) return 0;
        long a = 1, b = 1, c = 1, d = 0;
        for (int i = 3; i <= n; i++) {
            a = b + c + d;
            if (a > Math.pow(2, 31) - 1) {
                return (int) Math.pow(2, 31) - 1;
            }
            d = c;
            c = b;
            b = a;
        }
        return (int) a;
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n < 3) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public static int minCostClimbingStairsP(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        int c = 0;
        int n = cost.length;
        if (n < 3) {
            return Math.min(a, b);
        }
        for (int i = 2; i < n; i++) {
            c = Math.min(a, b) + cost[i];
            a = b;
            b = c;
        }
        return Math.min(b, a);
    }

    public static int rob(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = 0;
        int n = nums.length;
        if (n < 3) {
            return Math.max(a, b);
        }
        for (int i = 2; i < n; i++) {
            if (a > b) {
                c = a + nums[i];
                i++;
            } else {
                c = b + nums[i];
                i += 2;
            }
            a = b;
            b = c;
        }
        return Math.max(b, a);
    }

    public static int robp(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[n];
    }

    public static int deleteAndEarn(int[] nums) {
        int[] cnts = new int[10010];
        int max = 0;
        for (int x : nums) {
            cnts[x]++;
            max = Math.max(max, x);
        }
        int[] dp = new int[max + 1];
        dp[0] = 0;
        dp[1] = cnts[1];
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + (i * cnts[i]));
        }
        return dp[max];
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i < 1 || j < 1) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                } else if (i == 0) {
                    grid[0][j] = grid[0][j - 1] + grid[0][j];
                } else if (j == 0) {
                    grid[i][0] = grid[i - 1][0] + grid[i][0];
                } else {

                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[m - 1][n - 1];
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (obstacleGrid[0][0] != 1) {
                        obstacleGrid[0][0] = 1;
                    } else {
                        return 0;
                    }
                } else if (i == 0) {
                    if (obstacleGrid[0][j] != 1) {
                        obstacleGrid[0][j] = 1;
                    } else {
                        obstacleGrid[0][j] = 0;
                        if (j + 1 < n) obstacleGrid[0][j + 1] = 1;
                    }
                } else if (j == 0) {
                    if (obstacleGrid[i][0] != 1) {
                        obstacleGrid[i][0] = 1;
                    } else {
                        obstacleGrid[i][0] = 0;
                        if (i + 1 < m) obstacleGrid[i + 1][0] = 1;
                    }
                } else {
                    if (obstacleGrid[i][j] != 1) {
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                    } else {
                        obstacleGrid[i][j] = 0;
                    }
                }
            }
        }
        return obstacleGrid[m - 1][n - 1];
    }


    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] f = new int[n];
        f[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; ++i) {
            //最右侧
            f[i] = f[i - 1] + triangle.get(i).get(i);
            for (int j = i - 1; j > 0; --j) {
                // 其他
                f[j] = Math.min(f[j - 1], f[j]) + triangle.get(i).get(j);
            }
            //最左侧
            f[0] += triangle.get(i).get(0);
        }
        int minTotal = f[0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, f[i]);
        }
        return minTotal;
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int n1 = 0, n2 = height.length - 1;
        while (n1 < n2) {
            max = Math.max(max, (n2 - n1) * Math.min(height[n1], height[n2]));
            if (height[n1] < height[n2]) {
                n1++;
            } else {
                n2++;
            }
        }
        return max;
    }

    public String intToRoman(int num) {
        HashMap<Integer, String> map = new LinkedHashMap<Integer, String>() {{
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};
        StringBuilder sb = new StringBuilder();
        for (Integer curr : map.keySet()) {
            while (num >= curr) {
                num -= curr;
                sb.append(map.get(curr));
            }
            if (num == 0) {
                break;
            }
        }
        return sb.toString();
    }

    public int romanToInt(String s) {
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>() {{
            put("M", 1000);
            put("D", 500);
            put("C", 100);
            put("L", 50);
            put("X", 10);
            put("V", 5);
            put("I", 1);
        }};
        int sum = 0;
        int pre = map.get(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            Integer num = map.get(c);
            if (pre < num) {
                sum -= pre;
            } else {
                sum += pre;
            }
            pre = num;
        }
        sum += pre;
        return sum;
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        String s = strs[0];
        flag:
        for (int i = 0; i < s.toCharArray().length; i++) {
            for (int j = 1; j < strs.length; j++) {
                String currStr = strs[j];
                if (i >= currStr.length()) {
                    break flag;
                }
                if (s.charAt(i) != currStr.charAt(i)) {
                    break flag;
                }
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                    while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                    L++;
                    R--;
                } else if (sum < 0) L++;
                else R--;
            }
        }
        return ans;
    }

    public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    matrix[i][j] = Math.min(matrix[i - 1][j], matrix[i - 1][j + 1]) + matrix[i][j];
                } else if (j == n - 1) {
                    matrix[i][j] = Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]) + matrix[i][j];
                } else {
                    matrix[i][j] = Math.min(Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]), matrix[i - 1][j + 1]) + matrix[i][j];
                }
            }
        }
        int minValue = matrix[m - 1][0];
        for (int i : matrix[m - 1]) {
            minValue = Math.min(i, minValue);
        }
        return minValue;
    }

    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 0);
        }
        int len = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ('1' == matrix[i][j]) {
                    dp[i][j] = 1;
                    len = Math.max(len, dp[i][j]);
                    if (i == 0 || j == 0) {
                        continue;
                    }
                }
                if ('1' == matrix[i][j]
                        && '1' == matrix[i - 1][j]
                        && '1' == matrix[i][j - 1]
                        && '1' == matrix[i - 1][j - 1]
                ) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                    len = Math.max(len, dp[i][j]);
                }
            }
        }
        return (int) Math.pow(len, 2);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    int longestPalindromeSubseq(String s) {
        int n = s.length();
        // dp 数组全部初始化为 0
        int[][] dp = new int[n][n];
        // base case
        for (int i = 0; i < n; i++)
            dp[i][i] = 1;
        // 反着遍历保证正确的状态转移
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                // 状态转移方程
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        // 整个 s 的最长回文子串长度
        return dp[0][n - 1];
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i < coin) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }

/*    List<List<Integer>> res = new LinkedList();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, track, used);
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            track.add(nums[i]);
            used[i] = true;
            backtrack(nums, track, used);
            track.removeLast();
            used[i] = false;
        }
    }*/

    List<List<String>> res = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        LinkedList<char[]> board = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char[] arr = new char[n];
            Arrays.fill(arr, '.');
            board.add(arr);
        }
        backtrack(board, 0);
        return res;
    }

    private void backtrack(LinkedList<char[]> board, int row) {
        if (row == board.size()) {
            List<String> resBoard = board.stream().map(String::copyValueOf).collect(Collectors.toList());
            res.add(resBoard);
            return;
        }
        int n = board.get(row).length;
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board.get(row)[col] = 'Q';
            backtrack(board, row + 1);
            board.get(row)[col] = '.';
        }
    }

    private boolean isValid(LinkedList<char[]> board, int row, int col) {
        int n = board.size();
        // 当前列
        for (int i = 0; i <= row; i++) {
            if (board.get(i)[col] == 'Q') {
                return false;
            }
        }
        // 右上方
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i)[j] == 'Q') {
                return false;
            }
        }
        // 左下方
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i)[j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public int minDepth(TreeNode root) {
        if (Objects.isNull(root)) {
            return 0;
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                if (Objects.isNull(cur.left) && Objects.isNull(cur.right)) {
                    return depth;
                }
                if (Objects.nonNull(cur.left)) {
                    q.offer(cur.left);
                }
                if (Objects.nonNull(cur.right)) {
                    q.offer(cur.right);
                }
            }
            depth++;
        }
        return depth;
    }

    public int openLock(String[] deadends, String target) {
        HashSet<String> visited = new HashSet<>();
        HashSet<String> deads = new HashSet<>();
        for (String deadend : deadends) {
            deads.add(deadend);
        }
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        int step = 0;
        q1.add("0000");
        q2.add(target);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            Set<String> temp = new HashSet<>();
            for (String cur : q1) {
                if (deads.contains(cur)) {
                    continue;
                }
                if (q2.contains(cur)) {
                    return step;
                }
                visited.add(cur);
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        temp.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        temp.add(down);
                    }
                }
            }
            step++;
            q1 = q2;
            q2 = temp;
        }
        return -1;
    }

    String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (need.size() == valid) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return Integer.MAX_VALUE == len ? "" : s.substring(start, start + len);
    }

    public String minWindow1(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int start = 0, len = Integer.MAX_VALUE;
        int valid = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while (need.size() == valid) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (right - left == s1.length()) {
                if (valid == need.size()) {
                    return Boolean.TRUE;
                }
                char d = s2.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return Boolean.FALSE;
    }

    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    res.add(left);
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return res;
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int res = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);

            while (window.get(c) > 1) {
                char d = s.charAt(left);
                left++;
                window.put(d, window.get(d) - 1);

            }
            res = Math.max(res, right - left);
            // shift + f6
        }
        return res;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null){
            if (p1.val > p2.val){
                p.next = p2;
                p2 = p2.next;
            }else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1), p = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));
        for (ListNode listNode : lists) {
            if (listNode != null) {
                pq.add(listNode);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            p.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            p = p.next;
        }
        return dummy.next;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


