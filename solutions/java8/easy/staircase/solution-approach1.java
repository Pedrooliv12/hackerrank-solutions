// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
// Problem     Staircase
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-14, 10:45 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n+1; i++) {
            sb.append(String.join("", Collections.nCopies(n - i, " ")));
            sb.append(String.join("", Collections.nCopies(i, "#")));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
