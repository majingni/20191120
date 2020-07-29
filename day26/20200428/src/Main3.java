/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-28   09:47
 */

import java.util.Scanner;

class Candidate {
    String name;
    int voteNumber;

    Candidate(String s) {
        this.name = s;
        this.voteNumber = 0;
    }

    void vote() {
        this.voteNumber++;
    }
}

public class Main3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String order;
        String temp;
        Candidate candidate[] = new Candidate[10];
        int i = 0;
        int wx = 0;
        do {
            order = in.nextLine();
            if (order.startsWith("addCandidate")) {
                temp = order.substring("addCandidate".length()).trim();
                if(temp.length()!=0)
                    candidate[i++] = new Candidate(temp);

            }
            else if (order.startsWith("vote")) {
                temp = order.substring("vote".length()).trim();
                try {
                    for (int j = 0; j < candidate.length; j++) {

                        if (candidate[j].name.equals(temp)) {// 产生空指针异常即产生无效选票
                            candidate[j].vote();
                            break;
                        }

                    }
                } catch (NullPointerException e) {
                    wx++;
                }
            }
            else if (order.equals("getVoteResult")) {
                for (int j = 0; j < candidate.length; j++) {
                    if (candidate[j] == null) {
                        System.out.println(wx);
                        System.exit(0);
                    }

                    else {
                        System.out.println(candidate[j].name + " "
                                + candidate[j].voteNumber);
                    }
                }

                break;
            }
        } while (true);

    }
}


