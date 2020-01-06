import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int l1Number = getNumberOfList(l1);
            int l2Number = getNumberOfList(l2);

            ListNode l1RevList = createReverseInt(String.valueOf(l1Number));
            ListNode l2RevList = createReverseInt(String.valueOf(l2Number));

            l1Number = getNumberOfList(l1RevList);
            l2Number = getNumberOfList(l2RevList);


            if(l1Number==0)
                return l2;
            else if(l2Number ==0)
                return l1;
            else{

            int sum = l1Number + l2Number;

            return createReverseInt((new Integer(sum)).toString());}
        }

        public int getNumberOfList(ListNode l) {
            assert (l != null);
            String numStr = new String((new Integer(l.val)).toString());
            while (l.next != null) {
                numStr += l.next.val;
                l = l.next;
            }
            return Integer.parseInt(numStr);
        }

        public ListNode createReverseInt(String str) {

            ArrayList<ListNode> strList = new ArrayList();

            for (int i = str.length() - 1; i >= 0; i--)
                strList.add(new ListNode((int) str.charAt(i)-'0'));

            return toListNode(strList);
        }

        public ListNode toListNode(ArrayList<ListNode> strList) {
            if (strList != null && strList.size() > 0) {
                ListNode strListNode = strList.get(0);
                ListNode firstOfList = strListNode;
                for (int i = 1; i < strList.size(); i++) {
                    strListNode.next = strList.get(i);
                    strListNode = strListNode.next;
                }
                return firstOfList;
            }
            return null;

        }
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

        String string = "test the example in the paper ";
        List<Character> textList = string.chars().mapToObj((i) -> Character.valueOf((char) i)).collect(Collectors.toList());

        (new Main()).testList();
        //(new Main()).paperExample(textList);

//        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0));

  //      (new Main()).paperExampleNum(numberList);

    }

    private void testList() {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode l3 = new Solution().addTwoNumbers(l1, l2);
        System.out.println("hi");
    }


    public int paperExampleNum(List<Integer> numList) {
        int wordCount = 0;
        boolean inWord;

        if (numList.size() > 0) { //would be nice if we have early return here.
            if (numList.get(0) == 0)
                inWord = false;
            else
                inWord = true;

            for (int i = 0; i < numList.size(); i++) {
                if (inWord) {
                    if (numList.get(i) == 0) { //0 means there is a whitespace
                        ++wordCount;
                        inWord = false;
                    }
                } else {
                    if (numList.get(i) != 0) { // non whitespace.
                        inWord = true;
                    }
                }
            }
        }
        System.out.println("Number of words is:" + wordCount);
        return wordCount;
    }


    public int paperExample(List<Character> textList) {
        boolean inWord = false;
        int wordCount = 0;

        for (int i = 0; i < textList.size(); i++) {
            if (inWord) {
                if (Character.isWhitespace(textList.get(i))) {
                    ++wordCount;
                    inWord = false;
                }
            } else {
                if (!Character.isWhitespace(textList.get(i))) {
                    inWord = true;
                }
            }
        }

        System.out.println("Number of words is:" + wordCount);

        return wordCount;
    }

    public int paperExampleNum(int x1, int x2, int x3, int x4, int x5, int x6) {

        ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(x1, x2, x3, x4, x5, x6));

        int wordCount = 0;
        boolean inWord;

        if (numberList.size() > 0) { //would be nice if we have early return here.
            int firstEement = numberList.get(0);
            if (x1 == 0)
                inWord = false;
            else
                inWord = true;

            Iterator<Integer> iter = numberList.iterator();

            while (iter.hasNext()) {
                Integer curr = iter.next();
                if (inWord) {
                    if (curr == 0) { //0 means there is a whitespace
                        ++wordCount;
                        inWord = false;
                    }
                } else {
                    if (curr != 0) { // non whitespace.
                        inWord = true;
                    }
                }
            }
            System.out.println("Number of words is:" + wordCount);
            return wordCount;
        }
        return 0;
    }
}