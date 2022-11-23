//public class Equation {
//
//
//    public static boolean isBalanced(int id) {
//
//        String tmp = Integer.toString(id);
//
//        int evenCounter = 0, oddCounter = 0;
//
//        // 7 it's a char -> ascii code '7' -'0'
//
//        if (((tmp.charAt(0) - '0') % 2) == 0) {
//            evenCounter += tmp.charAt(0) - '0';
//        }
//        else {
//            oddCounter += tmp.charAt(0) - '0';
//        }
//
//        for (int i = 1; i < tmp.length(); i++) {
//            if (tmp.charAt(i) == tmp.charAt(i - 1)) {
//                return false;
//            }
//
//            if (((tmp.charAt(i) - '0') % 2) == 0) {
//                evenCounter += tmp.charAt(i) - '0';
//            }
//            else {
//                oddCounter += tmp.charAt(i) - '0';
//            }
//
//
//        }
//
//
//    }
