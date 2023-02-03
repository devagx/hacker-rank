import java.util.Collections;
import java.util.List;

public class Result {
    private Result() {

    }

    public static int sockMerchant(int arrSize, List<Integer> socks) {
        if (arrSize == 0 || socks.isEmpty()) {
            return 0;
        }

        Collections.sort(socks);

        double numOfoccurencesCurrNum = 0;
        int prevSock = 0;
        int currSock = 0;
        double pairs = 0.0;
        for (int i = 0; i < socks.size(); i++) {
            currSock = socks.get(i);

            if (currSock != prevSock && i != 0) {
                if (numOfoccurencesCurrNum > 1) {
                    pairs += Math.floor(numOfoccurencesCurrNum / 2.0);
                }
                numOfoccurencesCurrNum = 0;
            } else if (i == socks.size() - 1) {
                numOfoccurencesCurrNum++;
                pairs += Math.floor(numOfoccurencesCurrNum / 2.0);
            }

            numOfoccurencesCurrNum++;
            prevSock = socks.get(i);
        }
        return (int) pairs;
    }
}

/*
ALTERNATIVE SOLUTIONS

//    public static int sockMerchant(int arrSize, List<Integer> sockIds) {
//        Map<Integer, Integer> sockCounts = new HashMap<>();
//
//        for (int sockId : sockIds) {
//            int currentCount = sockCounts.getOrDefault(sockId, 0);
//            sockCounts.put(sockId, currentCount + 1);
//        }
//
//        int pairs = 0;
//        for (int count : sockCounts.values()) {
//            pairs += (count / 2);
//        }
//        return pairs;
//    }

//    public static int sockMerchant(int arrSize, List<Integer> sockIds) {
//        Set<Integer> unmatchedSocks = new HashSet<>();
//
//        int pairs = 0;
//        for (int sockId : sockIds) {
//            if (unmatchedSocks.contains(sockId)) {
//                unmatchedSocks.remove(sockId);
//                pairs++;
//            } else {
//                unmatchedSocks.add(sockId);
//            }
//        }
//        return pairs;
//    }
 */
