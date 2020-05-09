package leetcode;

import org.springframework.stereotype.Component;

@Component
public class HappyNm {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {

            slow = squSum(slow);
            System.out.println("slow:" + slow);
            fast = squSum(fast);
            System.out.println("fast1:" + fast);
            fast = squSum(fast);
            System.out.println("fast2:" + fast);
            System.out.println("===============================");
        } while (fast != slow);

        if (fast == 1) {
            return true;
        }

        return false;
    }

    private int squSum(int s) {
        int sum = 0;

        while (s != 0) {
            sum += (s % 10) * (s % 10);
            s/=10;
        }

        return sum;
    }
}
