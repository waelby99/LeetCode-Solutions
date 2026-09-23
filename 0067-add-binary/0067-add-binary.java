class Solution {
    public String addBinary(String a, String b) {
        
        /*Solution 2 (more optimized than solution 1) */
        StringBuilder sb = new StringBuilder();
        int rest = 0;

        while (a.length() > b.length()) {
            b = "0" + b;
        }

        while (a.length() < b.length()) {
            a = "0" + a;
        }

        int index = a.length() - 1;

        while (index >= 0) {

            char x = a.charAt(index);
            char y = b.charAt(index);

            if (rest == 0) {

                if (x == '0' && y == '0') {
                    sb.insert(0, '0');

                } else if (x != y) {
                    sb.insert(0, '1');

                } else {
                    sb.insert(0, '0');
                    rest = 1;
                }

            } else {

                if (x == '0' && y == '0') {
                    sb.insert(0, '1');
                    rest = 0;

                } else if (x != y) {
                    sb.insert(0, '0');

                } else {
                    sb.insert(0, '1');
                }
            }

            index--;
        }

        if (rest == 1) {
            sb.insert(0, '1');
        }

        return sb.toString();
    }
}

/* Solution 1 */
//finalllllyyyyyyyyyyy 
// StringBuilder sb = new StringBuilder();
// int rest = 0;
// if (a.length() > b.length()) {
//     while (a.length() > b.length()) {
//         b = "0" + b;
//     }
// }
// if (a.length() < b.length()) {
//     while (a.length() < b.length()) {
//         a = "0" + a;
//     }
// }

// int index = a.length() - 1;

// while (index >= 0) {

//     if (rest == 0) {
//         if (a.charAt(index) == '0' && b.charAt(index) == '0') {
//             sb.insert(0, "0");
//         } else if ((a.charAt(index) == '1' && b.charAt(index) == '0')
//                 || (a.charAt(index) == '0' && b.charAt(index) == '1')) {
//             sb.insert(0, "1");
//         } else if (a.charAt(index) == '1' && b.charAt(index) == '1') {
//             sb.insert(0, "0");
//             rest = 1;
//         }
//     } else if (rest == 1) {
//         if (a.charAt(index) == '0' && b.charAt(index) == '0') {
//             sb.insert(0, "1");
//             rest = 0;
//         } else if ((a.charAt(index) == '1' && b.charAt(index) == '0')
//                 || (a.charAt(index) == '0' && b.charAt(index) == '1')) {
//             sb.insert(0, "0");
//             rest = 1;
//         } else if (a.charAt(index) == '1' && b.charAt(index) == '1') {
//             sb.insert(0, "1");
//             rest = 1;
//         }
//     }

//     index--;
// }
// if ( rest == 1){
//     sb.insert(0, "1");
// }
// return sb.toString();