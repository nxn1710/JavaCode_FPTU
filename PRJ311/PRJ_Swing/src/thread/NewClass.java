package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @date Jun 29, 2020
 * @author Nguyen Xuan Nghiep
 */
public class NewClass {

    int[] sortArray(int[] a, int k) {
        ArrayList<Integer> boy = new ArrayList<>();
        ArrayList<Integer> girl = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                girl.add(i);
                continue;
            }
            boy.add(i);
        }
        for (int i = 0; i < girl.size(); i++) {
            if (!checkGiamDan(girl)) {
                for (int j = girl.size() - 1; j > i; j--) {
                    if (a[girl.get(j)] > a[girl.get(j - 1)]) {
                        int temp = a[girl.get(j)];
                        a[girl.get(j)] = a[girl.get(j - 1)];
                        a[girl.get(j - 1)] = temp;
                        temp = girl.get(j);
                        girl.set(i, girl.get(j - 1));
                        girl.set(j - 1, temp);
                    }
                }
            }
        }
        for (int i = 0; i < boy.size(); i++) {
            if (!checkTangDan(boy)) {
                for (int j = boy.size() - 1; j > i; j--) {
                    if (a[boy.get(j)] < a[boy.get(j - 1)]) {
                        int temp = a[boy.get(j)];
                        a[boy.get(j)] = a[boy.get(j - 1)];
                        a[boy.get(j - 1)] = temp;
                        temp = boy.get(j);
                        boy.set(i, boy.get(j - 1));
                        boy.set(j - 1, temp);
                    }
                }
            }
        }
        return a;
    }

    boolean checkGiamDan(ArrayList<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) < a.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    boolean checkTangDan(ArrayList<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > a.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    int[] sortArray3(int[] a, int k) {
        ArrayList<Integer> boy = new ArrayList<>();
        ArrayList<Integer> girl = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                girl.add(i);
                continue;
            }
            boy.add(i);
        }
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = girl.size() - 1; j > i; j--) {
                if (a[girl.get(j)] > a[girl.get(j - 1)]) {
                    int temp = a[girl.get(j)];
                    a[girl.get(j)] = a[girl.get(j - 1)];
                    a[girl.get(j - 1)] = temp;
                }
            }
            for (int j = boy.size() - 1; j > i; j--) {
                if (a[boy.get(j)] < a[boy.get(j - 1)]) {
                    int temp = a[boy.get(j)];
                    a[boy.get(j)] = a[boy.get(j - 1)];
                    a[boy.get(j - 1)] = temp;
                }
            }
        }

        return a;
    }

    int[] sortArray2(int[] a, int k) {
        int[] boy = new int[200000];
        int[] girl = new int[200000];
        int countBoy = 0, countGirl = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                girl[countGirl++] = i;
            } else {
                boy[countBoy++] = i;
            }
        }

        for (int i = 0; i < countGirl; i++) {
            for (int j = countGirl - 1; j > i; j--) {
                if (a[girl[j]] > a[girl[j - 1]]) {
                    int temp = a[girl[j]];
                    a[girl[j]] = a[girl[j - 1]];
                    a[girl[j - 1]] = temp;
                }
            }
        }
        for (int i = 0; i < countBoy; i++) {
            for (int j = countBoy - 1; j > i; j--) {
                if (a[boy[j]] < a[boy[j - 1]]) {
                    int temp = a[boy[j]];
                    a[boy[j]] = a[boy[j - 1]];
                    a[boy[j - 1]] = temp;
                }
            }
        }
        return a;
    }

    int amountVaries(long n) {
        int count1 = 0, count2 = 1;
        long num1 = n;
        do {
            count1++;
            num1 = checkSpecificNumber(num1);
        } while (num1 >= 10);
        do {
            count2++;
            n = checkSpecificNumber2(n);
        } while (n >= 10);
        return count1 > count2 ? count1 : count2;
    }

    int checkSpecificNumber(long x) {
        int result = 0;
        while (x != 0) {
            result += x % 10;
            x /= 10;
        }
        return result;
    }

    int checkSpecificNumber2(long x) {
        int result = 1;
        while (x != 0) {
            result *= x % 10;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        NewClass s = new NewClass();
        int[] arr = {1,12,6,18,5};

        System.out.println(arr.length);
        arr = s.sortArray(arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println("1, 1, 10, 6, 14, 16");
    }
}
