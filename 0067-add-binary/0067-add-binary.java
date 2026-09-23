class Solution {
    public String addBinary(String a, String b) {
        //finalllllyyyyyyyyyyy 
        StringBuilder sb = new StringBuilder();
        int rest = 0;
        if (a.length() > b.length()) {
            while (a.length() > b.length()) {
                b = "0" + b;
            }
        }
        if (a.length() < b.length()) {
            while (a.length() < b.length()) {
                a = "0" + a;
            }
        }

        int index = a.length() - 1;

        while (index >= 0) {

            if (rest == 0) {
                if (a.charAt(index) == '0' && b.charAt(index) == '0') {
                    sb.insert(0, "0");
                } else if ((a.charAt(index) == '1' && b.charAt(index) == '0')
                        || (a.charAt(index) == '0' && b.charAt(index) == '1')) {
                    sb.insert(0, "1");
                } else if (a.charAt(index) == '1' && b.charAt(index) == '1') {
                    sb.insert(0, "0");
                    rest = 1;
                }
            } else if (rest == 1) {
                if (a.charAt(index) == '0' && b.charAt(index) == '0') {
                    sb.insert(0, "1");
                    rest = 0;
                } else if ((a.charAt(index) == '1' && b.charAt(index) == '0')
                        || (a.charAt(index) == '0' && b.charAt(index) == '1')) {
                    sb.insert(0, "0");
                    rest = 1;
                } else if (a.charAt(index) == '1' && b.charAt(index) == '1') {
                    sb.insert(0, "1");
                    rest = 1;
                }
            }

            index--;
        }
        if ( rest == 1){
            sb.insert(0, "1");
        }
        return sb.toString();
    }
}

// int n1 = 0;
// int n2 = 0;
// for (int i = 0; i < a.length(); i++) {
//     int n = a.charAt(i) - '0';
//     n1 = n1 + (n * (int) Math.pow(10, a.length() - 1 - i));
// }
// for (int i = 0; i < b.length(); i++) {
//     int n = b.charAt(i) - '0';
//     n2 = n2 + (n * (int) Math.pow(10, b.length() - 1 - i));
// }
// String s = Integer.toString(n1 + n2);
// String res = "";
// int rest = 0;
// for (int i = 0; i < s.length(); i++) {
//     if (s.charAt(i) == '2') {
//         s = s.substring(0, i) + '0' + s.substring(i + 1);
//         rest = 1;
//     }
//     if (s.charAt(i) == '1' && rest == 1) {
//         s = s.substring(0, i) + '0' + s.substring(i + 1);
//         rest = 1;
//     }

//     if (s.charAt(i) == '0' && rest == 1) {
//         s = s.substring(0, i) + '1' + s.substring(i + 1);

//     }

// }
// return s;