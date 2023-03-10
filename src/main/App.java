package main;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab
        System.out.println(longestPalindrome("cbbd")); // bb
        long start = System.currentTimeMillis();
        System.out.println(longestPalindrome("twbiqwtafgjbtolwprpdnymaatlbuacrmzzwhkpvuwdtyfjsbsqxrlxxtqkjlpkvpxmlajdmnyepsmczmmfdtjfbyybotpoebilayqzvqztqgddpcgpelwmriwmoeeilpetbxoyktizwcqeeivzgxacuotnlzutdowiudwuqnghjgoeyojikjhlmcsrctvnahnoapmkcrqmwixpbtirkasbyajenknuccojooxfwdeflmxoueasvuovcayisflogtpxtbvcxfmydjupwihnxlpuxxcclbhvutvvshcaikuedhyuksbwwjsnssizoedjkbybwndxpkwcdxaexagazztuiuxphxcedqstahmevkwlayktrubjypzpaiwexkwbxcrqhkpqevhxbyipkmlqmmmogrnexsztsbkvebjgybrolttvnidnntpgvsawgaobycfaaviljsvyuaanguhohsepbthgjyqkicyaxkytshqmtxhilcjxdpcbmvnpippdrpggyohwyswuydyrhczlxyyzregpvxyfwpzvmjuukswcgpenygmnfwdlryobeginxwqjhxtmbpnccwdaylhvtkgjpeyydkxcqarkwvrmwbxeetmhyoudfuuwxcviabkqyhrvxbjmqcqgjjepmalyppymatylhdrazxytixtwwqqqlrcusxyxzymrnryyernrxbgrphsioxrxhmxwzsytmhnosnrpwtphaunprdtbpwapgjjqcnykgspjsxslxztfsuflijbeebwyyowjzpsbjcdabxmxhtweppffglvhfloprfavduzbgkw"));
        long finish = System.currentTimeMillis();
        System.out.println(finish-start + "ms");
    }

    public static String longestPalindrome(String s) {
        String result = s.substring(0,1);

        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length-1-i];
        }

        for (int i = 0; i < s.length(); i++) {
            if((s.length()-1)-i <= result.length()) break;
            for (int j = s.length() - 1; j > i; j--) {

                if(j-i <= result.length()) break;

                boolean eq = Arrays.equals(
                        Arrays.copyOfRange(a, i, j+1),
                        Arrays.copyOfRange(b, b.length-j-1, j-2)
                );

                if (eq) {
                    result = new String(Arrays.copyOfRange(a, i, j+1));
                }
            }
        }

        return result;
    }
}